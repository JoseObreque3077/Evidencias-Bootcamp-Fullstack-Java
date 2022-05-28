package com.example.actividadfinalm6.restTemplate;

import com.example.actividadfinalm6.dto.AutorDto;
import com.example.actividadfinalm6.dto.LibroDto;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class RestTemplateProvider {
    //String con las credenciales de acceso
    private final String credentials = "admin:12345";
    //Se transforma el string de credenciales a bytes
    private final byte[] credentialsBytes = credentials.getBytes();
    //Se encriptan las credenciales usando Base64
    private final byte[] base64CredentialBytes = Base64.encodeBase64(credentialsBytes);
    //Se transforman las credenciales encriptadas a String nuevamente
    private final String base64Credentials = new String(base64CredentialBytes);

    public List<LibroDto> getLibrosFromApi() {
        //Se crea una instancia de RestTemplate para consumo de API
        RestTemplate rest = new RestTemplate();
        //Se crea un encabezado de una request HTTP
        HttpHeaders headers = new HttpHeaders();
        //Se añaden las credenciales para ingresar a la API (encriptadas)
        headers.add("Authorization", "Basic " + base64Credentials);
        //Se crea la request HTTP
        HttpEntity<String> request = new HttpEntity<>(headers);
        //Se define la url para obtener el listado de libros desde la API
        String url = "http://localhost:8080/libros/todos";
        //Se obtiene la lista de libros desde la API en una "response" por método GET
        ResponseEntity<List<LibroDto>> response = rest.exchange(
                url,
                HttpMethod.GET,
                request,
                new ParameterizedTypeReference<>() {});
        return response.getBody();
    }

    public List<AutorDto> getAutoresFromApi() {
        //Se crea una instancia de RestTemplate para consumo de API
        RestTemplate rest = new RestTemplate();
        //Se crea un encabezado de una request HTTP
        HttpHeaders headers = new HttpHeaders();
        //Se añaden las credenciales para ingresar a la API (encriptadas)
        headers.add("Authorization", "Basic " + base64Credentials);
        //Se crea la request HTTP
        HttpEntity<String> request = new HttpEntity<>(headers);
        //Se define la url para obtener el listado de libros desde la API
        String url = "http://localhost:8080/autores/todos";
        //Se obtiene la lista de libros desde la API en una "response" por método GET
        ResponseEntity<List<AutorDto>> response = rest.exchange(
                url,
                HttpMethod.GET,
                request,
                new ParameterizedTypeReference<>() {
                });
        return response.getBody();
    }
}

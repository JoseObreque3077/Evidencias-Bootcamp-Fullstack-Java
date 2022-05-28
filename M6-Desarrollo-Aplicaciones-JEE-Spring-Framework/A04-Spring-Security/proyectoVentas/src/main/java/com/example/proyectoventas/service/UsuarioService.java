package com.example.proyectoventas.service;

import com.example.proyectoventas.entities.Customer;
import com.example.proyectoventas.entities.Employee;
import com.example.proyectoventas.repositories.CustomerRepository;
import com.example.proyectoventas.repositories.EmployeeRepository;
import com.example.proyectoventas.userdetails.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService implements UserDetailsService {
    //Se traen los métodos de EmployeeRepository
    @Autowired
    private EmployeeRepository repo;
    @Autowired
    private CustomerRepository repo2;

    //Método que busca, le asigna propiedades y devuelve un objeto que corresponde a un registro completo asociado al nombre de usuario
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        /*
        Busca y retorna un registro completo, buscando por email en la tabla Employees
        NOTA: recordar que el username es un email (en este caso particular)
         */
        Optional<Employee> optional = repo.findByEmailIs(username);
        Optional<Customer> optional2 = repo2.findByUserIs(username);
        /*
        Como este método (por definición) siempre retorna un objeto o bien, retorna una
        excepción, entonces si repo.findByEmailIs(username) encuentra un registro asociado,
        se le agregan permisos al usuario y se devuelve un objeto de tipo User.
        En caso contrario, se levanta una excepción.
         */
        if (optional.isPresent()) {
            //Se extrae el objeto de tipo Employee
            Employee e = optional.get();
            //Se crea un ArrayList que contendrá los permisos asignados al usuario
            ArrayList<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
            //Se le asigna un permiso ADMIN
            roles.add(new SimpleGrantedAuthority("ADMIN"));
            //Se le asigna un permiso con el mismo nombre que su puesto de trabajo
            roles.add(new SimpleGrantedAuthority(e.getJobTitle()));
            /*
            Se crea un objeto de tipo UserDetails, este requiere:
            1) Nombre de Usuario (email, en este caso)
            2) Contraseña
            3) Permisos Asignados
             */
            UserDetails userDT = new User(e.getEmail(), e.getPassword(), roles);
            //Se crea un objeto de tipo Usuario (según lo definido en la clase Usuario)
            Usuario usuario = new Usuario((User) userDT, e.getFirstName(), e.getLastName());
            //Se devuelve un objeto de tipo UserDetails (como lo pide el método original)
            return usuario;
        } else if (optional2.isPresent()) {
            Customer c = optional2.get();
            ArrayList<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
            roles.add(new SimpleGrantedAuthority("CUSTOMER"));
            UserDetails userDT = new User(c.getUser(), c.getPassword(), roles);
            Usuario usuario = new Usuario((User) userDT, c.getContactFirstName(), c.getContactLastName());
            return usuario;
        } else {
            //Se arroja el tipo de excepción solicitado en el método (ver interfaz)
            throw new UsernameNotFoundException(username);
        }
    }
}

package cl.aiep.almacen.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Proveedor {
    @NotEmpty(message = "Este campo es obligatorio")
    @Pattern(regexp = "^(\\d{8}-\\d)$", message = "RUT debe seguir formato 98765432-1")
    @Id
    @Column(name = "rut", length = 10)
    private String rut;
    @NotEmpty(message = "Este campo es obligatorio")
    @Size(min = 3, max = 75, message = "Este campo admite entre 3 y 75 caracteres")
    @Column(name = "empresa", nullable = false, length = 75)
    private String empresa;
    @NotEmpty(message = "Este campo es obligatorio")
    @Size(min = 6, max = 75, message = "Este campo admite entre 6 y 75 caracteres")
    @Pattern(regexp = "^[a-zA-ZñáÁéÉíÍóÓúÚ ]+$", message = "Este campo solo admite letras")
    @Column(name="vendedor", nullable = false, length = 75)
    private String vendedor;
    @NotEmpty(message = "Este campo es obligatorio")
    @Size(min = 10, max = 75, message = "Este campo admite entre 10 y 75 caracteres")
    @Pattern(regexp = "^([a-zA-z\\d.]+@[a-z]+\\.[a-z]+)$", message = "Formato de email inválido")
    @Column(name = "email", nullable = false, length = 75)
    private String email;
    @NotEmpty(message = "Este campo es obligatorio")
    @Size(min = 9, max = 9, message = "El teléfono debe contener 9 dígitos")
    @Pattern(regexp = "^(\\d{9})$", message = "Este campo solo admite dígitos")
    @Column(name = "telefono", nullable = false, length = 9)
    private String telefono;
    @OneToMany(mappedBy = "proveedor")
    private List<Producto> productos;

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

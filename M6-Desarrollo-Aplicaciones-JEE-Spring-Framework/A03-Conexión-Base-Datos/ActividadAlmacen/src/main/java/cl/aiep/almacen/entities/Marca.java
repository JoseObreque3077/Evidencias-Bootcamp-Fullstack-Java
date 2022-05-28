package cl.aiep.almacen.entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Marca {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotEmpty(message = "Este campo es obligatorio")
    @Size(min = 3, max = 75, message = "Este campo admite entre 3 y 75 caracteres")
    @Column(name = "descripcion", nullable = false, length = 75)
    private String descripcion;
    @OneToMany(mappedBy = "marca")
    private List<Producto> productos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}

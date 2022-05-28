package cl.aiep.almacen.entities;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Producto {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "producto", nullable = false, length = 75)
    @NotEmpty(message = "Este campo es obligatorio")
    @Size(min = 3, max = 75, message = "Este campo admite entre 3 y 75 caracteres")
    private String producto;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "marca_fk", nullable = false)
    private Marca marca;
    @NotNull(message = "Este campo es obligatorio")
    @Min(value = 0, message = "Este campo no admite números negativos")
    @Column(name = "stock", nullable = false)
    private Integer stock;
    @NotNull(message = "Este campo es obligatorio")
    @Min(value = 0, message = "Este campo no admite números negativos")
    @Column(name = "precioVenta", nullable = false)
    private Integer precioVenta;
    @NotNull(message = "Este campo es obligatorio")
    @Min(value = 0, message = "Este campo no admite números negativos")
    @Column(name = "precioCompra", nullable = false)
    private Integer precioCompra;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "proveedor_fk", nullable = false)
    private Proveedor proveedor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Integer precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Integer precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
}

package cl.aiep.almacen.repositories;

import cl.aiep.almacen.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}

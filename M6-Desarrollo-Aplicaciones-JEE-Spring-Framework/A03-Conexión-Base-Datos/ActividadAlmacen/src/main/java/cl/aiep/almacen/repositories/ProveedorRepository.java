package cl.aiep.almacen.repositories;

import cl.aiep.almacen.entities.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProveedorRepository extends JpaRepository<Proveedor, String> {
}

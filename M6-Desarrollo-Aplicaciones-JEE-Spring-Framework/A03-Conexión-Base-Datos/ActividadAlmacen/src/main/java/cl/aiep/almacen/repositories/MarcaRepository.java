package cl.aiep.almacen.repositories;

import cl.aiep.almacen.entities.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Integer> {
}

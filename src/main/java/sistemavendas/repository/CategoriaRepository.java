
package sistemavendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistemavendas.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}

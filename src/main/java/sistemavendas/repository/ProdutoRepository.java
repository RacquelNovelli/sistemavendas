
package sistemavendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistemavendas.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}

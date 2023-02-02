package br.com.aluraflix.apialuraflix.repositories;

import br.com.aluraflix.apialuraflix.model.categoria.Categoria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Range;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    Page<Categoria> findAllByAtivoTrue(Pageable paginacao);
}

package br.com.aluraflix.apialuraflix.repositories;

import br.com.aluraflix.apialuraflix.model.video.Video;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface VideoRepository extends JpaRepository<Video, Long> {
    Page<Video> findAllByAtivoTrue(Pageable paginacao);

    Page<Video> findAllByIdCategoria(Long id, Pageable paginacao);

    @Query(value = "select v from Video v where v.titulo like %?1%")
    Page<Video> buscarPorTitulo(String titulo, Pageable paginacao);
}

package br.com.aluraflix.apialuraflix.repositories;

import br.com.aluraflix.apialuraflix.model.video.Video;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Range;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface VideoRepository extends JpaRepository<Video, Long> {
    Page<Video> findAllByAtivoTrue(Pageable paginacao);

    Page<Video> findAllByIdCategoria(Long id, Pageable paginacao);
}

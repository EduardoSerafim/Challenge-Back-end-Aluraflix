package br.com.aluraflix.apialuraflix.repositories;

import br.com.aluraflix.apialuraflix.model.video.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
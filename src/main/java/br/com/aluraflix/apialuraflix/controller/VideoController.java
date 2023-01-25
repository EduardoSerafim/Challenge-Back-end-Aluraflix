package br.com.aluraflix.apialuraflix.controller;

import br.com.aluraflix.apialuraflix.model.video.DTOListagemVideo;
import br.com.aluraflix.apialuraflix.model.video.Video;
import br.com.aluraflix.apialuraflix.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/videos")
public class VideoController {

    @Autowired
    private VideoRepository repository;

    @GetMapping
    public ResponseEntity<List<DTOListagemVideo>> listar(){
        var videos = repository.findAll().stream().map(DTOListagemVideo::new).toList();
        return ResponseEntity.ok(videos);
    }


}

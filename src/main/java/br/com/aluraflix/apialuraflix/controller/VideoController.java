package br.com.aluraflix.apialuraflix.controller;

import br.com.aluraflix.apialuraflix.model.video.DTOCadastroVideo;
import br.com.aluraflix.apialuraflix.model.video.DTOExibirVideo;
import br.com.aluraflix.apialuraflix.model.video.Video;
import br.com.aluraflix.apialuraflix.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping(path = "/videos")
public class VideoController {

    @Autowired
    private VideoRepository repository;

    @GetMapping
    public ResponseEntity<List<DTOExibirVideo>> listar(){
        List<DTOExibirVideo> videos = repository.findAll().stream().map(DTOExibirVideo::new).toList();
        return ResponseEntity.ok(videos);
    }

    @GetMapping("/{id}")
    public ResponseEntity pegarVideoPorId(@PathVariable Long id){
        var video = repository.getReferenceById(id);
        return ResponseEntity.ok(new DTOExibirVideo(video));
    }


    @PostMapping
    public ResponseEntity cadastrarVideo(@RequestBody DTOCadastroVideo dados, UriComponentsBuilder uriBuilder){
        Video video = new Video(dados);
        repository.save(video);

        var uri = uriBuilder.path("/videos/{id}").buildAndExpand(video.getId()).toUri();

        return ResponseEntity.created(uri).body(new DTOExibirVideo(video));
    }


}

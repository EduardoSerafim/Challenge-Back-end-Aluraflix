package br.com.aluraflix.apialuraflix.controller;

import br.com.aluraflix.apialuraflix.model.video.DTOAtualizarVideo;
import br.com.aluraflix.apialuraflix.model.video.DTOCadastroVideo;
import br.com.aluraflix.apialuraflix.model.video.DTOExibirVideo;
import br.com.aluraflix.apialuraflix.model.video.Video;
import br.com.aluraflix.apialuraflix.repositories.VideoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping(path = "/videos")
public class VideoController {

    @Autowired
    private VideoRepository repository;

    @GetMapping
    public ResponseEntity<Page<DTOExibirVideo>> listarVideos(@PageableDefault(size = 5) Pageable paginacao){
        var page = repository.findAllByAtivoTrue(paginacao).map(DTOExibirVideo::new);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity pegarVideoPorId(@PathVariable Long id){
        var video = repository.getReferenceById(id);
        return ResponseEntity.ok(new DTOExibirVideo(video));
    }

    @GetMapping("/")
    public ResponseEntity<Page<DTOExibirVideo>> buscarVideoPorTitulo(@RequestParam(name = "search") String titulo, Pageable paginacao){
        var page = repository.buscarPorTitulo(titulo, paginacao).map(DTOExibirVideo::new);
        return ResponseEntity.ok(page);

    }


    @PostMapping
    @Transactional
    public ResponseEntity cadastrarVideo(@RequestBody @Valid DTOCadastroVideo dados, UriComponentsBuilder uriBuilder){
        Video video = new Video(dados);
        repository.save(video);

        var uri = uriBuilder.path("/videos/{id}").buildAndExpand(video.getId()).toUri();

        return ResponseEntity.created(uri).body(new DTOExibirVideo(video));
    }

    @PutMapping
    @Transactional
    public ResponseEntity atualizarVideo(@RequestBody @Valid DTOAtualizarVideo dados){
        var videoAtualizado = repository.getReferenceById(dados.id());
        videoAtualizado.atualizarVideo(dados);
        return ResponseEntity.ok(new DTOExibirVideo(videoAtualizado));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity excluirVideo(@PathVariable Long id){
        Video video = repository.getReferenceById(id);
        video.excluirVideo();
        return ResponseEntity.noContent().build();
    }


}

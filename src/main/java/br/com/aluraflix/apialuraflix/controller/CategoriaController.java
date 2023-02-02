package br.com.aluraflix.apialuraflix.controller;

import br.com.aluraflix.apialuraflix.model.categoria.Categoria;
import br.com.aluraflix.apialuraflix.model.categoria.DTOCadastroCategoria;
import br.com.aluraflix.apialuraflix.model.categoria.DTOExibirCategoria;
import br.com.aluraflix.apialuraflix.model.video.DTOCadastroVideo;
import br.com.aluraflix.apialuraflix.repositories.CategoriaRepository;
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
@RequestMapping(path = "/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaRepository repository;

    @GetMapping
    public ResponseEntity<Page<DTOExibirCategoria>> listarCategorias(Pageable paginacao){
        var page = repository.findAllByAtivoTrue(paginacao).map(DTOExibirCategoria::new);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DTOExibirCategoria> pegarCategoriaPorId(@PathVariable Long id){
        Categoria categoria = repository.getReferenceById(id);
        return ResponseEntity.ok(new DTOExibirCategoria(categoria));
    }

    @PostMapping
    public ResponseEntity cadastrarCategoria(@RequestBody @Valid DTOCadastroCategoria dadosCategoria, UriComponentsBuilder uriBuilder){
        Categoria categoria = new Categoria(dadosCategoria);
        repository.save(categoria);

        var uri = uriBuilder.path("/categorias/{id}").buildAndExpand(categoria.getId()).toUri();

        return ResponseEntity.created(uri).body(new DTOExibirCategoria(categoria));



    }



    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity excluirCategoria(@PathVariable Long id){
        Categoria categoria = repository.getReferenceById(id);
        categoria.excluirCategoria();
        return ResponseEntity.noContent().build();
    }


}

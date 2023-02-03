package br.com.aluraflix.apialuraflix.model.video;

import br.com.aluraflix.apialuraflix.model.categoria.Categoria;

public record DTOExibirVideo(
        Long id,
        String titulo,
        Long idCategoria,
        String descricao,
        String url
) {
    public DTOExibirVideo(Video video){
        this(video.getId(), video.getTitulo(), video.getIdCategoria(), video.getDescricao(), video.getUrl());
    }
}

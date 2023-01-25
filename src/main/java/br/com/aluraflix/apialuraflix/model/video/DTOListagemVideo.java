package br.com.aluraflix.apialuraflix.model.video;

import java.util.List;

public record DTOListagemVideo(
        Long id,
        String titulo,
        String descricao,
        String url
) {
    public DTOListagemVideo(Video video){
        this(video.getId(), video.getTitulo(), video.getDescricao(), video.getUrl());
    }

}

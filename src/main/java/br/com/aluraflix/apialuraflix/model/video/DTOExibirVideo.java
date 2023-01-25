package br.com.aluraflix.apialuraflix.model.video;

public record DTOExibirVideo(
        Long id,
        String titulo,
        String descricao,
        String url
) {
    public DTOExibirVideo(Video video){
        this(video.getId(), video.getTitulo(), video.getDescricao(), video.getUrl());
    }
}

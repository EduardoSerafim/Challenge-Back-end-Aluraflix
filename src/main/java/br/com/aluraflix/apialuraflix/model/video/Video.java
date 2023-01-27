package br.com.aluraflix.apialuraflix.model.video;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Video")
@Table(name = "videos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Video {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;
    private String url;

    private boolean ativo;



    public Video(DTOCadastroVideo dados) {
        this.titulo = dados.titulo();
        this.descricao = dados.descricao();
        this. url = dados.url();
        this.ativo = true;
    }

    public void atualizarVideo(DTOAtualizarVideo novoVideo){
        if(novoVideo.titulo() != null){
            this.titulo = novoVideo.titulo();
        }
        if(novoVideo.descricao() != null){
            this.descricao = novoVideo.descricao();
        }
    }

    public void excluirVideo(){
        this.ativo = false;
    }

}

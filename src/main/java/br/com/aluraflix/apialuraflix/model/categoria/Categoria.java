package br.com.aluraflix.apialuraflix.model.categoria;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Categoria")
@Table(name = "categorias")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Categoria {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String cor;

    private boolean ativo;



    public void excluirCategoria(){
        this.ativo = false;
    }

}

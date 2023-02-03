package br.com.aluraflix.apialuraflix.model.video;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.URL;

public record DTOCadastroVideo(

        @NotBlank
        @Size(max = 30)
        String titulo,

        @NotBlank
        @Size(max = 100)
        String descricao,

        Long idCategoria,

        @NotBlank
        @Size(max = 100)
        @URL
        String url
) {

}

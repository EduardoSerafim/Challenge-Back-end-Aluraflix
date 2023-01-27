package br.com.aluraflix.apialuraflix.model.video;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record DTOAtualizarVideo(
        @NotNull
        Long id,

        @NotBlank
        @Size(max = 30)
        String titulo,

        @NotBlank
        @Size(max = 100)
        String descricao
) {
}

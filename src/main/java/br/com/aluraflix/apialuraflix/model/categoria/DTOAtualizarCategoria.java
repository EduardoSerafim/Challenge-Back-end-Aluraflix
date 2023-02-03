package br.com.aluraflix.apialuraflix.model.categoria;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record DTOAtualizarCategoria(
        @NotNull
        Long id,

        @Size(max = 30)
        String titulo,

        @Size(max = 7) //cores em HEXADECIMAL
        @Pattern(regexp ="^#[A-Fa-f0-9]{6}")
        String cor
) {
}

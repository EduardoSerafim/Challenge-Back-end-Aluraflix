package br.com.aluraflix.apialuraflix.model.categoria;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record DTOCadastroCategoria(

        @NotBlank
        @Size(max = 30)
        String titulo,

        @NotBlank
        @Size(max = 7) //cores em HEXADECIMAL
        @Pattern(regexp ="^#[A-Fa-f0-9]{6}")
        String cor

) {
}

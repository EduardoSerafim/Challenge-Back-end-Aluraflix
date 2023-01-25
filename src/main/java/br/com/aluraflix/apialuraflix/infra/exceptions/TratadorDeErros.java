package br.com.aluraflix.apialuraflix.infra.exceptions;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class TratadorDeErros {


    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity tratar404(){
        Map<String, String> mensagem = new HashMap<String, String>();
        mensagem.put("mensagem", "não encontrado");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(mensagem);
    }


}

package br.com.fiap.ms_produto.controller.handlers;

import br.com.fiap.ms_produto.controller.handlers.dto.CustomErrorDTO;
import br.com.fiap.ms_produto.service.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;

@RestControllerAdvice
public class ControllerExceptionHandler {


    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<CustomErrorDTO> handlerResourceNotFound(ResourceNotFoundException e,
                                                                  HttpServletRequest request) {

        HttpStatus status = HttpStatus.NOT_FOUND;
        CustomErrorDTO err = new CustomErrorDTO(Instant.now(), status.value(), e.getMessage(),
                                                request.getRequestURI());

        return ResponseEntity.status(status).body(err);
    }


}

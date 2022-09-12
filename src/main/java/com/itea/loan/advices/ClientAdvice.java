package com.itea.loan.advices;
import com.itea.loan.dto.ClientDto;
import com.itea.loan.exception.BusinessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import static org.springframework.http.HttpStatus.BAD_REQUEST;


@ControllerAdvice
public class ClientAdvice extends ResponseEntityExceptionHandler {
    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ClientDto> handException(BusinessException e){
        ClientDto clientDto = new ClientDto(e.getMessage());
        return new ResponseEntity<>(clientDto, HttpStatus.OK);
    }

    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable
            (HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request){
        ClientDto clientDto = new ClientDto("JSON isn't correct", ex.getMessage());
        return new ResponseEntity<>(clientDto, status);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid
            (MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request){
        ClientDto clientDto = new ClientDto("Variable isn't correct", ex.getMessage());
        return new ResponseEntity<>(clientDto, status);
    }


    @Override
    protected ResponseEntity<Object>handleNoHandlerFoundException(NoHandlerFoundException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        ClientDto clientDto = new ClientDto("dgjdgjdgj", ex.getMessage());
        return new ResponseEntity<>(clientDto, BAD_REQUEST);
    }

}
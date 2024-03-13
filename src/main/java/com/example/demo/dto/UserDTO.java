package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    @NotBlank(message="Nome é obrigatório")
    private	String	nome;
    @NotBlank(message="CPF é obrigatório")
    private	String	cpf;
    private	String	endereco;
    private	String	email;
    @NotBlank(message="E-mail é obrigatório")
    private	String	telefone;
    private LocalDateTime dataCadastro;
}

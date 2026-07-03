package spring.boot.desafio.nubank.dto;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientesDTO {

    private String nome;
    private List<ContatosDTO> contatos;

}

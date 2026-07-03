package spring.boot.desafio.nubank.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientesResponseDTO {

    private Long id;
    private String nome;
    private List<ContatosResponseDTO> contatos;

}

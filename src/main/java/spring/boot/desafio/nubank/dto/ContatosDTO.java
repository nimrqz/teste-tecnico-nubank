package spring.boot.desafio.nubank.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContatosDTO {

    private String telefone;
    private String email;
    private Long clienteId;

}

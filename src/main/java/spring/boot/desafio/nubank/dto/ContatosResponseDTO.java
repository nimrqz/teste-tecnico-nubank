package spring.boot.desafio.nubank.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContatosResponseDTO {

    private Long id;
    private String telefone;
    private String email;
    private Long clienteId;

}

package spring.boot.desafio.nubank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.desafio.nubank.dto.ContatosDTO;
import spring.boot.desafio.nubank.model.Clientes;
import spring.boot.desafio.nubank.model.Contatos;
import spring.boot.desafio.nubank.repository.ClientesRepository;
import spring.boot.desafio.nubank.repository.ContatosRepository;

import java.util.Optional;

@RestController
@RequestMapping("/contatos")
public class ContatoController {

    @Autowired
    private ClientesRepository clientesRepository;

    @Autowired
    private ContatosRepository contatosRepository;

    @PostMapping
    public ResponseEntity<?> criar(@RequestBody ContatosDTO dto) {

        Optional<Clientes> clientesOpt = clientesRepository.findById(dto.getClienteId());
        if (clientesOpt.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Cliente não encontrado");
        }

        Contatos contato = new Contatos();
        contato.setTelefone(dto.getTelefone());
        contato.setEmail(dto.getEmail());
        contato.setClientes(clientesOpt.get());
        contatosRepository.save(contato);

        return ResponseEntity.status(HttpStatus.CREATED).body(contato);
    }

}

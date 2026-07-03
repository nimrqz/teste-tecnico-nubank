package spring.boot.desafio.nubank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.boot.desafio.nubank.model.Contatos;

public interface ContatosRepository extends JpaRepository<Contatos, Long> {
}

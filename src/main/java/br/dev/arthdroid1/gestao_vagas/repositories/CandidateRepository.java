package br.dev.arthdroid1.gestao_vagas.repositories;

import br.dev.arthdroid1.gestao_vagas.models.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CandidateRepository extends JpaRepository<Candidate,UUID> {


}

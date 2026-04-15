package AjudAVC.infraestructure.repository;

import AjudAVC.domain.entity.RecoveryProgress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecoveryProgressRepository extends JpaRepository<RecoveryProgress, Long> {
    // Busca a evolução histórica de um paciente específico
    List<RecoveryProgress> findByPacienteIdOrderByDataAvaliacaoDesc(Long pacienteId);
}

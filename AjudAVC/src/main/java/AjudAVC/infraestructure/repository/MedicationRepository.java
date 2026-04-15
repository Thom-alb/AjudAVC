package AjudAVC.infraestructure.repository;

import AjudAVC.domain.entity.Medication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MedicationRepository extends JpaRepository<Medication, Long> {

    List<Medication> findByPacienteId(Long pacienteId);

    // Caso queira filtrar remédios ativos ou por categoria no futuro
    List<Medication> findByPacienteIdAndNomeContainingIgnoreCase(Long pacienteId, String nome);
}

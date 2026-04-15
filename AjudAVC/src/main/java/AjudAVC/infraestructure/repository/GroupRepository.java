package AjudAVC.infraestructure.repository;


import AjudAVC.domain.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {

    // Encontra o grupo pelo ID do paciente (um paciente pertence a um grupo)
    Optional<Group> findByPacienteId(Long pacienteId);

    // Verifica se um grupo existe pelo nome (útil para evitar nomes duplicados)
    boolean existsByNomeGrupo(String nomeGrupo);
}

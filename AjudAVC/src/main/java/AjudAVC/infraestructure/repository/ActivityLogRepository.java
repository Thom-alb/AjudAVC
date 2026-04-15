package AjudAVC.infraestructure.repository;

import AjudAVC.domain.entity.ActivityLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ActivityLogRepository extends JpaRepository<ActivityLog, Long> {

    // Para a visão de "Minhas Tarefas" do cuidador em um grupo específico
    List<ActivityLog> findByGrupoIdAndHorarioAgendadoBetween(
            Long grupoId,
            LocalDateTime inicio,
            LocalDateTime fim
    );

    // Para o cuidador saber o que ele assumiu ("Vou cuidar") em todos os seus grupos
    List<ActivityLog> findByNomeResponsavelAndRealizadoFalse(String nomeResponsavel);
}

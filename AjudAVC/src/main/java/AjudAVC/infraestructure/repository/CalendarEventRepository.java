package AjudAVC.infraestructure.repository;

import AjudAVC.domain.entity.CalendarEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface CalendarEventRepository extends JpaRepository<CalendarEvent, Long> {

    List<CalendarEvent> findByGrupoIdAndDataHoraInicioBetween(
            Long grupoId,
            LocalDateTime start,
            LocalDateTime end
    );


    List<CalendarEvent> findByGrupoIdAndDataHoraInicioAfterOrderByDataHoraInicioAsc(
            Long grupoId,
            LocalDateTime agora
    );
}
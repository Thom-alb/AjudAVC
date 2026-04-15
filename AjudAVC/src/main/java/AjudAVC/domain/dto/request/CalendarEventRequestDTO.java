package AjudAVC.domain.dto.request;

import java.time.LocalDateTime;

public record CalendarEventRequestDTO(
        String titulo,
        String descricao,
        LocalDateTime dataHoraInicio,
        LocalDateTime dataHoraFim,
        String local,
        Integer grupoId
) {}

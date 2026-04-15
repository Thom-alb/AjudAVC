package AjudAVC.domain.dto.response;

import java.time.LocalDateTime;

public record CalendarEventResponseDTO(
        Integer id,
        String titulo,
        String descricao,
        LocalDateTime dataHoraInicio,
        LocalDateTime dataHoraFim,
        String local,
        boolean isAcontecendoAgora
) {}

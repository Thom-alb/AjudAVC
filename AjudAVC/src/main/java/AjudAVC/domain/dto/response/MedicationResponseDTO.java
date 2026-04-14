package AjudAVC.domain.dto.response;

import java.time.LocalTime;

public record MedicationResponseDTO(
        String nome,
        String dosagem,
        LocalTime horarioInicial,
        Integer frequencia,
        String instrucoes,
        Integer pacienteID

) {}

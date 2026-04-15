package AjudAVC.domain.dto.request;

import java.time.LocalDate;

public record RecoveryProgressRequestDTO(
        LocalDate dataAvaliacao,
        String descricaoMelhora,
        Integer nivelMobilidade,
        Integer nivelHumor,
        String observacoes,
        Integer pacienteId,
        Integer profissionalId
) {}

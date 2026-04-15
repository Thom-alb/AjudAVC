package AjudAVC.domain.dto.response;

import java.time.LocalDate;

public record RecoveryProgressResponseDTO(
        Integer id,
        LocalDate dataAvaliacao,
        String descricaoMelhora,
        Integer nivelMobilidade,
        Integer nivelHumor,
        String nomeProfissional,
        Integer semanaDoAno,
        Integer mesDoAno
) {}

package AjudAVC.domain.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

public record ActivityRequestDTO(
        @NotBlank(message = "A descrição da tarefa é obrigatória")
        String descricaoTarefa,

        @NotBlank(message = "A categoria ajuda na organização (ex: HIGIENE, REMEDIO)")
        String categoria,

        boolean ehSemanal,

        @NotNull(message = "O horário da atividade deve ser definido")
        LocalDateTime horarioAgendado,

        @NotNull(message = "A tarefa precisa estar vinculada a um grupo")
        Integer grupoId
) {}

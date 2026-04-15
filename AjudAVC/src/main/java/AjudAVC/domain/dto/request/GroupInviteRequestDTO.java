package AjudAVC.domain.dto.request;
import jakarta.validation.constraints.NotNull;

public record GroupInviteRequestDTO(
        @NotNull(message = "O ID do grupo é obrigatório")
        Integer grupoId,

        @NotNull(message = "O ID de quem está convidando é obrigatório")
        Integer autorId
) {}

package AjudAVC.domain.dto.response;

import java.time.LocalDateTime;

public record ActivityResponseDTO(
        Integer id,
        String descricaoTarefa,
        String categoria,
        boolean ehSemanal,

        Boolean realizado,      // null = pendente, true = feito, false = não feito
        Boolean vouCuidar,      // null = livre, true = alguém assumiu

        String nomeResponsavel, // Nome de quem clicou em "Vou cuidar"
        LocalDateTime horarioAgendado,
        LocalDateTime dataCriacao
) {}

package AjudAVC.domain.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalTime;

public record MedicationRequestDTO(
        @NotBlank(message = "Nome do remédio é obrigatório")
        String nome,
        @NotBlank(message = "Quantidade de dosagem é obrigatório")
        String dosagem,
        @NotNull(message = "Informe o primeiro hórario que o remédio foi tomado")
        LocalTime horarioInicial,
        @NotNull(message = "Informe a fequência que o remédio é tomada")
        Integer frequencia,
        @NotBlank(message = "Informe as intruções do remédio")
        String instrucoes,
        @NotNull
        Integer pacienteID

) {}

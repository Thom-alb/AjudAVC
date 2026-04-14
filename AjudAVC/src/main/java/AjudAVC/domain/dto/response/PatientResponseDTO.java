package AjudAVC.domain.dto.response;

import AjudAVC.domain.enums.AVCTypes;

import java.time.LocalDate;
import java.time.Period;

public record PatientResponseDTO(
        Integer id,
        String nome,
        LocalDate dataNascimento,
        AVCTypes tipoAvc,
        Integer idade
) {

    public static PatientResponseDTO fromEntity(AjudAVC.domain.entity.Patient paciente) {
        Integer idadeCalculada = (paciente.getDataNascimento() != null)
                ? Period.between(paciente.getDataNascimento(), LocalDate.now()).getYears()
                : null;

        return new PatientResponseDTO(
                paciente.getId(),
                paciente.getNome(),
                paciente.getDataNascimento(),
                paciente.getTipoAVC(),
                idadeCalculada
        );
    }
}

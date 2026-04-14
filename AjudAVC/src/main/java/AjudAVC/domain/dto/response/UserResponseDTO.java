package AjudAVC.domain.dto.response;
public record UserResponseDTO(
        Integer id,
        String nome,
        String email,
        String tipoUsuario
) {}

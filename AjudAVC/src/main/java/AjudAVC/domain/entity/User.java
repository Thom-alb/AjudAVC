package AjudAVC.domain.entity;

import AjudAVC.domain.enums.UserTypes;
import jakarta.persistence.*;
import lombok.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "usuarios")
@EqualsAndHashCode(of = "id")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "O nome é obrigatório")
    @Column(name = "nome", nullable = false)
    private String nome;

    @Email(message = "E-mail inválido")
    @NotBlank(message = "O e-mail é obrigatório")
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @NotBlank(message = "A senha é obrigatória")
    @Column(name = "senha", nullable = false)
    private String senhaHash;

    private String fotoPerfilUrl;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_usuario", nullable = false)
    private UserTypes tipo = UserTypes.CUIDADOR;

    @Column(name = "data_cadastro", updatable = false)
    private LocalDateTime dataCadastro;
    @PrePersist
    protected void onCreate() {
        this.dataCadastro = LocalDateTime.now();
    }


}

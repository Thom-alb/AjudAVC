package AjudAVC.domain.entity;
import AjudAVC.domain.enums.GroupRoles;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "membros_grupo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class GroupMembers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id", nullable = false)
    private Group grupo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User usuario;

    @Enumerated(EnumType.STRING)
    private GroupRoles funcao;

    // permissões de Anfitrião, altera estes campos para dar ou tirar acesso

    @Column(nullable = false)
    private boolean podeVerMedicamentos = true;

    @Column(nullable = false)
    private boolean podeMarcarEventos = false;

    @Column(nullable = false)
    private boolean podeVerProgresso = true;

    @Column(nullable = false)
    private boolean podePostarAvisos = false;

    @Column(name = "data_adesao", updatable = false)
    private LocalDateTime dataAdesao = LocalDateTime.now();
}

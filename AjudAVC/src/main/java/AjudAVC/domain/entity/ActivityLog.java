package AjudAVC.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "activity_logs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class ActivityLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "task_description", nullable = false)
    private String descricaoTarefa;

    @Column(name = "category")
    private String categoria; // Ex: "REMEDIO", "HIGIENE", "ALIMENTACAO", "LAZER", "AVISO"

    @Column(name = "is_weekly")
    private boolean ehSemanal = false; // Define se é algo da rotina fixa ou um aviso único

    // --- Status de Execução (As reações assertivas) ---

    @Column(name = "is_done")
    private Boolean realizado; // NULL = pendente, TRUE = Jóia (feito), FALSE = X (não feito)

    @Column(name = "will_handle")
    private Boolean vouCuidar; // NULL = ninguém assumiu, TRUE = Vou cuidar, FALSE = Não posso

    @Column(name = "scheduled_time")
    private LocalDateTime horarioAgendado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id", nullable = false)
    private Group grupo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "responsible_user_id")
    private User usuarioResponsavel; // Quem marcou que "vai cuidar" ou "fez"

    @Column(name = "created_at")
    private LocalDateTime dataCriacao = LocalDateTime.now();
}
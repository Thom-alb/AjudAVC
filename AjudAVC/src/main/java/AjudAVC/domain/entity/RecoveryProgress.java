package AjudAVC.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Locale;

@Entity
@Table(name = "recovery_progress")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class RecoveryProgress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "evaluation_date", nullable = false)
    private LocalDate dataAvaliacao;

    @Column(name = "improvement_description", columnDefinition = "TEXT", nullable = false)
    private String descricaoMelhora;

    @Column(name = "mobility_score")
    private Integer nivelMobilidade;

    @Column(name = "mood_score")
    private Integer nivelHumor;

    // --- Campos de Apoio para Relatórios ---

    @Column(name = "evaluation_week")
    private Integer semanaDoAno; // Armazena de 1 a 52

    @Column(name = "evaluation_month")
    private Integer mesDoAno; // Armazena de 1 a 12

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient paciente;

    @PrePersist
    @PreUpdate
    public void calcularPeriodos() {
        if (this.dataAvaliacao != null) {
            this.mesDoAno = this.dataAvaliacao.getMonthValue();
            this.semanaDoAno = this.dataAvaliacao.get(WeekFields.of(Locale.getDefault()).weekOfYear());
        }
    }
}
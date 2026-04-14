package AjudAVC.domain.entity;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalTime;

    @Entity
    @Table(name = "medications")
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode(of = "id")
    public class Medication {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(nullable = false)
        private String nome;

        @Column(nullable = false)
        private String dosagem; // Ex: "50mg", "2 comprimidos"

        @Column(nullable = false)
        private String frequencia; // Ex: "A cada 8 horas", "Uma vez ao dia"

        @Column(name = "horario_inicial")
        private LocalTime horarioInicial; // O primeiro horário do dia para o alerta

        @Column(columnDefinition = "TEXT")
        private String instrucoes; // Ex: "Tomar em jejum", "Diluir em água"

        @Column(nullable = false)
        private boolean ativo = true; // Para o anfitrião poder desativar um remédio sem deletar o histórico

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "patient_id", nullable = false)
        private Patient paciente;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "register_by_id")
        private User cadastradoPor; // Quem inseriu o remédio (auditoria)

}

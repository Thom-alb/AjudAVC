package AjudAVC.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "notice_reactions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class NoticeReaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reaction_type", nullable = false)
    private String tipoReacao; // Ex: "HEART", "PRAY", "CLAP"

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "notice_id", nullable = false)
    private Notice aviso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User usuario;
}
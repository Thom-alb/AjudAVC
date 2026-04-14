package AjudAVC.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "educational_contents")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class EducationContent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String titulo;

    @Column(name = "content_body", columnDefinition = "TEXT", nullable = false)
    private String corpoConteudo;

    @Column(name = "category")
    private String categoria; // Ex: "Exercícios", "Alimentação", "Sinais de Alerta"

    @Column(name = "media_url")
    private String urlMidia; // Link para um vídeo no YouTube ou uma imagem explicativa

    @Column(name = "source_link")
    private String linkFonte; // Referência médica ou site oficial de saúde

    @Column(name = "created_at", updatable = false)
    private LocalDateTime dataCriacao;

    @PrePersist
    protected void onCreate() {
        this.dataCriacao = LocalDateTime.now();
    }
}




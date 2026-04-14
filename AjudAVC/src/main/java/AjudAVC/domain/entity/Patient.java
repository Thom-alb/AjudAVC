package AjudAVC.domain.entity;

import AjudAVC.domain.enums.AVCTypes;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "pacientes")
@EqualsAndHashCode(of = "id")

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome",nullable = false)
    private String nome;

    private LocalDate dataNascimento;

    @Enumerated(EnumType.STRING) // Salva o texto no banco em vez do número
    @Column(name = "tipo_avc")
    private AVCTypes TipoAVC;

    @Column(columnDefinition = "TEXT")
    private String observacoesMedicas;
}

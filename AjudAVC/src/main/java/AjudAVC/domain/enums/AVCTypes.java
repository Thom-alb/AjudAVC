package AjudAVC.domain.enums;

import lombok.Getter;

@Getter
public enum AVCTypes {
    ISQUEMICO("Isquêmico"),
    HEMORRAGICO("Hemorrágico"),
    AIT("Ataque Isquêmico Transitório"),
    NAO_ESPECIFICADO("Não Especificado");

    private final String descricao;

    AVCTypes(String descricao) {
        this.descricao = descricao;
    }
}

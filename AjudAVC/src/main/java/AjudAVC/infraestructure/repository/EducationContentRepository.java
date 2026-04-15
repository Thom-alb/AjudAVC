package AjudAVC.infraestructure.repository;

import AjudAVC.domain.entity.EducationContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EducationContentRepository extends JpaRepository<EducationContent, Long> {
    // Busca conteúdos por categoria (ex: FISIOTERAPIA, ALIMENTAÇÃO)
    List<EducationContent> findByCategoriaIgnoreCase(String categoria);

    // Prioriza conteúdos marcados como EMERGÊNCIA
    List<EducationContent> findByEhEmergenciaTrue();
}

package AjudAVC.infraestructure.repository;

import AjudAVC.domain.entity.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface NoticeRepository extends JpaRepository<Notice, Long> {

    // Busca avisos de um grupo específico, ordenados pelos mais recentes
    List<Notice> findByGrupoIdOrderByDataCriacaoDesc(Long grupoId);

    // Busca avisos por categoria dentro de um grupo (ex: ver apenas "URGENTE")
    List<Notice> findByGrupoIdAndCategoria(Long grupoId, String categoria);
}
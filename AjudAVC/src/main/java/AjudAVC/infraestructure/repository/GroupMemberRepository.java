package AjudAVC.infraestructure.repository;

import AjudAVC.domain.entity.GroupMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface GroupMemberRepository extends JpaRepository<GroupMember, Long> {

    List<GroupMember> findByUserId(Long userId);

    List<GroupMember> findByGrupoId(Long grupoId);

    // Verifica se um usuário específico pertence a um grupo (Segurança!)
    boolean existsByUserIdAndGrupoId(Long userId, Long grupoId);
}

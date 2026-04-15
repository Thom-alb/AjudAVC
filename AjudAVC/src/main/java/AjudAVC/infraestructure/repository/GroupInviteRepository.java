package AjudAVC.infraestructure.repository;

import AjudAVC.domain.entity.GroupInvite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GroupInviteRepository extends JpaRepository<GroupInvite, Long> {

    // Busca o convite pelo código que o cuidador colou no app
    Optional<GroupInvite> findByCodigoConvite(String codigoConvite);
}

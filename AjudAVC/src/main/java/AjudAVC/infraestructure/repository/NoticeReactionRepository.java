package AjudAVC.infraestructure.repository;

import AjudAVC.domain.entity.NoticeReaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface NoticeReactionRepository extends JpaRepository<NoticeReaction, Long> {

    List<NoticeReaction> findByNoticeId(Long noticeId);

    void deleteByNoticeIdAndUserId(Long noticeId, Long userId);
}
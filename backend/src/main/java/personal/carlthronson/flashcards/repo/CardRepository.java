package personal.carlthronson.flashcards.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import personal.carlthronson.flashcards.entity.CardEntity;

@Repository
@Transactional
public interface CardRepository extends JpaRepository<CardEntity, Long>, SimpleRepository<CardEntity> {
}

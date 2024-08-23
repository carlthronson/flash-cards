package personal.carlthronson.flashcards.svc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import personal.carlthronson.flashcards.entity.CardEntity;
import personal.carlthronson.flashcards.repo.CardRepository;
import personal.carlthronson.flashcards.repo.SimpleRepository;

@Service
@Transactional
public class CardService extends SimpleService<CardEntity> {

  @Autowired
  CardRepository repository;

  @Override
  public SimpleRepository<CardEntity> getSimpleRepository() {
    return this.repository;
  }

  @Override
  public JpaRepository<CardEntity, Long> getJpaRepository() {
    return this.repository;
  }
}

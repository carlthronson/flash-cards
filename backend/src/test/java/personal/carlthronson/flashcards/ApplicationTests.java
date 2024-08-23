package personal.carlthronson.flashcards;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import personal.carlthronson.flashcards.repo.CardRepository;

@SpringBootTest
class ApplicationTests {

  @Autowired
  CardRepository cardRepository;

  @Test
  void contextLoads() {
    assert 1 == cardRepository.count();
  }

}

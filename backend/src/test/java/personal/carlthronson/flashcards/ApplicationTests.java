package personal.carlthronson.flashcards;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import personal.carlthronson.flashcards.svc.CardService;

@SpringBootTest
class ApplicationTests {

  @Autowired
  CardService service;

  @Test
  void contextLoads() {
    assert 1 == service.findAll().size();
  }

}

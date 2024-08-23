package personal.carlthronson.flashcards.dto;

import lombok.Getter;
import lombok.Setter;
import personal.carlthronson.flashcards.entity.CardEntity;

public class Card {

  public Card() {
    // TODO Auto-generated constructor stub
  }

  public Card(CardEntity entity) {
    if (entity != null) {
      this.setId(entity.getId());
      this.setName(entity.getName());
      this.setLabel(entity.getLabel());
      this.setQuestion(entity.getQuestion());
    }
  }

  @Getter
  @Setter
  private Long id;

  @Getter
  @Setter
  String name;

  @Getter
  @Setter
  private String label;

  @Getter
  @Setter
  private String question;

  @Getter
  @Setter
  private String answer;
}

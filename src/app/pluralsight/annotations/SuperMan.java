package app.pluralsight.annotations;

import java.time.LocalDateTime;


@JsonName(value = "super_man")
public class SuperMan {
  @JsonName("ten")

  private String name;
  
  @JsonName("data_of_birth")
  private LocalDateTime dataOfBirth;

  public String getName() {
    return name;
  }
  @JsonName("hihi")

  public void setName(String name) {
    this.name = name;
  }
  @JsonName("tada")

  public LocalDateTime getDataOfBirth() {
    return dataOfBirth;
  }

  public void setDataOfBirth(LocalDateTime dataOfBirth) {
    this.dataOfBirth = dataOfBirth;
  }
  

  

}

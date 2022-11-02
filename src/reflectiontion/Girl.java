package reflectiontion;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.provider.NullAndEmptySource;

@SuppressWarnings("deprecation")
@Deprecated
public class Girl {

  private String name;
  int age;
  int atk;
  int agi;
  
  public Girl() {
    
  }
  
  public Girl(String name) {
    this.name = name ;
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public int getAtk() {
    return atk;
  }
  public void setAtk(int atk) {
    this.atk = atk;
  }
  public int getAgi() {
    return agi;
  }
  @NullAndEmptySource
  public void setAgi(int agi) {
    this.agi = agi;
  }
  
  @Override
  public String toString() {
    return "Girl{" +"name='" +name + ", tuoi="+age+'\'' + '}';
  
  }
  
}

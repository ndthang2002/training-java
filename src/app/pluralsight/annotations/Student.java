package app.pluralsight.annotations;

@JsonName(value = "thang")
public class Student {
@JsonName(value="conca")
  private String name;
  
  int tuoi;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getTuoi() {
    return tuoi;
  }
  public void setTuoi(int tuoi) {
    this.tuoi = tuoi;
  }
  public Student(String name, int tuoi) {
    super();
    this.name = name;
    this.tuoi = tuoi;
  }
  public Student() {

  }
  
  
}

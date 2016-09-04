import java.util.List;
import java.util.Map;

/**
 * Created by zqchen on 16/9/3.
 */
public class Tesy {
    public void main(String[] args) {
        Person p = new Person();
        p.setName("haha");
        p.setAge(10);
        System.out.println(p.getName());
    }

  class  Person{
      String name;
      Integer age;

      public String getName() {
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }

      public Integer getAge() {
          return age;
      }

      public void setAge(Integer age) {
          this.age = age;
      }

      public void getNames() {

      }
  }
}

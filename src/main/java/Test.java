import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by zqchen on 16/8/29.
 */
public class Test {
    public static void main(String[] args) {

        Person p = new Person("我", 10);
        System.out.println(p.getAge());
        System.out.println(p.getName());
        System.out.println("测试这个结果怎么样");
        mana m = new mana();
        List<String> list = new ArrayList<String>();
        list.add("haha");
        for (String value:list
             ) {
            System.out.println(value);
        }

    }

    static class mana {
        public mana() {
            System.out.println("Test.java 实例化mana类");
            System.out.println("测试开始");
        }

    }

    static class Person {
        String name;
        Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

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
    }
}

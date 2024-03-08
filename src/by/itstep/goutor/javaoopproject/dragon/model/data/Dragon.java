package by.itstep.goutor.javaoopproject.dragon.model.data;

public class Dragon {
    private String name;
    private int age;

    public Dragon(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dragon() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name = " + name + '\'' +
                ", age = " + age +
                '}';
    }
}

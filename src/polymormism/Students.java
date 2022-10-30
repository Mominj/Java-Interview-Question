package polymormism;

public class Students {

    private String name;
    private Integer age;

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

    public boolean isValidAge(int age) {
        return age >=18;
    }
    public boolean isValidAge() {
        return this.age >=18;
    }

}

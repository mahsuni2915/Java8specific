public class Dog {
    private String name;
    private int age;
    private String kind;
    private String birtHDay;

    public Dog(String name, Integer age, String kind, String birtHDay) {
        this.name = name;
        this.age = age;
        this.kind = kind;
        this.birtHDay = birtHDay;
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

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getBirtHDay() {
        return birtHDay;
    }

    public void setBirtHDay(String birtHDay) {
        this.birtHDay = birtHDay;
    }
}

package five;

public class Character {

    private String name;

    private int age;

    private boolean isBadGuy;

    public Character(String name, int age, boolean isBadGuy) {
        this.name = name;
        this.age = age;
        this.isBadGuy = isBadGuy;
    }

    public void sayHello() {
        System.out.print("Hello, I am " + name + ", I am " + age + " years old. I am character. I am ");
        System.out.println(isBadGuy ? "a bad guy." : "not a bad guy.");
    }

    public void birthday() {
        age++;
        System.out.println("I have a birthday today, and now I am " + age + " age old!!!");
    }

    public void damage() {
        double damageDouble = age * 0.5;
        System.out.println(name + " caused " + damageDouble + " damage");
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

    public boolean isBadGuy() {
        return isBadGuy;
    }

    public void setBadGuy(boolean badGuy) {
        isBadGuy = badGuy;
    }
}

package five;

public class Archer extends Character{
    private int shooting;

    public Archer(String name, int age, boolean isBadGuy, int shooting) {
        super(name, age, isBadGuy);
        this.shooting = shooting;
    }

    @Override
    public void sayHello() {
        System.out.print("Hello, I am " + getName() + ", I am " + getAge() + " years old. I am archer, who have " + shooting + " shooting. I am ");
        System.out.println(isBadGuy() ? "a bad guy." : "not a bad guy.");
    }

    @Override
    public void damage() {
        double damageDouble = shooting * 0.5;
        System.out.println(getName() + " caused " + damageDouble + " damage");
    }
}

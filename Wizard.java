package five;

public class Wizard extends Character {
    private int mana;

    public Wizard(String name, int age, boolean isBadGuy, int mana) {
        super(name, age, isBadGuy);
        this.mana = mana;
    }

    public void sayHello() {
        System.out.print("Hello, I am " + getName() + ", I am " + getAge() + " years old. I am wizard, who have " + mana + " mana. I am ");
        System.out.println(isBadGuy() ? "a bad guy." : "not a bad guy");
    }

    public void damage() {
        double damageDouble = mana * 0.5;
        System.out.println(getName() + " caused " + damageDouble + " damage");
    }
}

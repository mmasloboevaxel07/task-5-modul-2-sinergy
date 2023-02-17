package five;

public class Tester extends Character {
    public Tester(String name, int age, boolean isBadGuy) throws NewTesterException {
        super(name, age, isBadGuy);
        if (!name.equals("Test")) throw new NewTesterException();
    }
}

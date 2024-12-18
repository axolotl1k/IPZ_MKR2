package factory;

public abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;
    protected int x;
    protected int y;

    public Character(String name, int health, int attackPower, int x, int y) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
        System.out.println(name + " moves to (" + x + ", " + y + ")");
    }

    public void attack(Character target) {
        System.out.println(name + " attacks " + target.getName() + " for " + attackPower + " damage!");
        target.receiveDamage(attackPower);
    }

    public void receiveDamage(int dmg) {
        health -= dmg;
        System.out.println(name + " receives " + dmg + " damage! Health: " + health);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

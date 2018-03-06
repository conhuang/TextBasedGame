
/**
 * Write a description of class Mammal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public abstract class Person extends Entity
{
    private String description;
    int stamina;
    ArrayList<Item> inventory;
    public Person(String n, String d)
    {
        super(n);
        description = d;
        inventory = new ArrayList<Item>();
    }
    public int getStamina(){
        return stamina;
    }
    public void addWeapon(String s,int i){
        inventory.add(new Weapon(s,i));
    }
    public void addEdible(String name, int health, boolean poisonous)
    {
        inventory.add(new Edible(name, health, poisonous));
    }
}

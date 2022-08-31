package characters;

/**
 * An extraodinarily simple character class.
 * 
 * @author Willow Sapphire
 * @version 08/31/2022
 */
public class Character {

    /**
     * The character's name.
     */
    protected String name;

    /**
     * The character's level.
     */
    protected int level;

    /**
     * The character's class.
     */
    protected String charClass;

    /**
     * Creates a new character.
     * 
     * @param name the name of the character.
     */
    public Character(String name) {
        this.name = name;
        this.level = 1;
        this.charClass = "basic character";
    }
    
    /**
     * Moves the character forward by a step.
     * Prints a message about their movement.
     * 
     * @return the number of steps the character moved.
     */
    public int move() {
        System.out.printf("%s walked forward 1 step\n", name);
        return 1;
    }

    /**
     * Attacks for some amount of damage.
     * Prints a message about the attack.
     * 
     * @return the amount of damage dealt.
     */
    public int attack() {
        System.out.printf("%s attacked for %d damage\n", name, 10);
        return 10;
    }

    /**
     * Getter for the character's name.
     * 
     * @return the character's name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for the character's level.
     * 
     * @return the character's level.
     */
    public int getLevel() {
        return this.level;
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Interact here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Interact extends Actor
{
    private int speed; //-3
    private int scoreChange; //+ or -
    private int damage; //+ or includes damage and loos of life
    private int spawnRate;
    private boolean dead = false;
    public Interact(int sp, int sc, int dm, int sr)
    {
        speed=sp;
        scoreChange=sc;
        damage=dm;
        spawnRate=sr;
    }
    public int getSpawnRate()
    {
        return spawnRate;
    }
    /**
     * Act - do whatever the Interact wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-speed);
        if (isTouching(Player.class))
        {
            ((RunnerWorld)getWorld()).addScore(scoreChange);
            ((RunnerWorld)getWorld()).addDamage(damage);
            dead=true;
        }
        if (isAtEdge() || dead)
        {
            getWorld().removeObject(this);
        }
    }
}

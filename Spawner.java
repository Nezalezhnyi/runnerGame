import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spawner extends Actor
{
    /**
     * Act - do whatever the Spawner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int change = Greenfoot.getRandomNumber(5000);
        Interact thing = choose();
        if (change < thing.getSpawnRate())
        {
            getWorld().addObject(thing, 800, Greenfoot.getRandomNumber(500)+50);
        }
    }

    public Interact choose()
    {
        switch(Greenfoot.getRandomNumber(7))
        {
            case 0: return(new AddScore());
            case 1: return(new Bomb());
            case 2: return(new Damage());
            case 3: return(new Distractor());
            case 4: return(new Health());
            case 5: return(new Life());
            case 6: return(new SubScore());
        }
        return null;
    }
}

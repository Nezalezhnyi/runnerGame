import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int spd=5;
    public Player()
    {
        getImage().scale(60,50);
    }
    public void act()
    {
        checkKeys();
        
    }
    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("s"))
        setLocation(getX(), getY()+spd);
        if (Greenfoot.isKeyDown("w"))
        setLocation(getX(), getY()-spd);
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackDrop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackDrop extends Actor
{
    /**
     * Act - do whatever the BackDrop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int spd=5;
    public void act()
    {
        move(-5);
        if (isAtEdge())
        {
            setLocation(799, getY());
        }
    }
}

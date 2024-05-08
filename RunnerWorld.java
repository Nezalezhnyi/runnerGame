import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RunnerWorld extends World
{
    private Counter lives, health, time, score;
    public boolean alive = true;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public void act()
    {
        GameOver();
    }
    public RunnerWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
        
    }
     
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Building building = new Building();
        addObject(building,30,565);
        Building building2 = new Building();
        addObject(building2,99,564);
        Building building3 = new Building();
        addObject(building3,173,562);
        building3.setLocation(187,576);
        building3.setLocation(184,576);
        removeObject(building3);
        building2.setLocation(525,536);
        Tree tree = new Tree();
        addObject(tree,86,582);
        Tree tree2 = new Tree();
        addObject(tree2,126,582);
        Grass grass = new Grass();
        addObject(grass,171,574);
        grass.setLocation(167,594);
        grass.setLocation(168,594);
        Tree tree3 = new Tree();
        addObject(tree3,210,583);
        Tree tree4 = new Tree();
        addObject(tree4,242,582);
        building2.setLocation(304,560);
        building2.setLocation(314,568);
        Tree tree5 = new Tree();
        addObject(tree5,314,568);
        building2.setLocation(314,564);
        removeObject(tree5);
        building2.setLocation(318,566);

        addObject(building3,375,562);
        building3.setLocation(376,567);
        building2.setLocation(320,575);
        Building building4 = new Building();
        addObject(building4,448,567);
        Tree tree6 = new Tree();
        addObject(tree6,506,582);
        Grass grass2 = new Grass();
        addObject(grass2,550,574);
        grass2.setLocation(551,586);
        Building building5 = new Building();
        addObject(building5,609,565);
        Building building6 = new Building();
        addObject(building6,684,561);
        building6.setLocation(682,565);
        Tree tree7 = new Tree();
        addObject(tree7,741,581);
        Tree tree8 = new Tree();
        addObject(tree8,779,580);
        Player player = new Player();
        addObject(player,262,230);
        building2.setLocation(317,573);

        score = new Counter("Score: ");
        addObject(score,709,34);
        time = new Counter("Time: ");
        addObject(time,353,34);
        time.setValue(60);
        health = new Counter("Health: ");
        addObject(health,56,33);
        health.setValue(100);
        lives = new Counter("Lives: ");
        addObject(lives,55,83);
        lives.setValue(1);
        Spawner spawner = new Spawner();
        addObject(spawner,789,8);
    }

    public void addScore(int val) //value
    {
        score.add(val);
    }
    
    public void addDamage(int val) //value
    {
        health.setValue(health.getValue()-val);
        if (health.getValue() <= 0)
        {
            lives.add(-1);
            health.setValue(100);
            if (lives.getValue() == 0)
            {
                alive = false; //<------------CHANAGE
            }
        }
        if (health.getValue() > 100)
        {
            lives.add(1);
            health.setValue(health.getValue()-100);
        }
        }
    public void GameOver()
    {
        if (!alive)
        {
        addObject(new OhNo(), getWidth()/2, getHeight()/2);
        showText("Game Over", 14, 12);
        int size = score.getValue(); //<------------CHANAGE
        showText("Your score " + size, 14, 14);
        Greenfoot.stop();
        }
    }
    }


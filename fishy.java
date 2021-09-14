import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fishy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fishy extends Actor
{
    /**
     * Act - do whatever the fishy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(0);
        turnAtEdge();
        checkKeyPress();
        onCollision();
        getY();
        getX();
    }//This method repeats the following actions public void act()

    //moves the fishy

    //Turns the fishy at the edge

    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(Greenfoot.getRandomNumber(180));
        }
    }
    // Checks for user key presses so user can turn the fishy
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("D"))
        {
            setLocation(getX() +3,getY());
            
        }
        if(Greenfoot.isKeyDown("A"))
        {
            setLocation(getX() -3,getY());
            
        }
        if(Greenfoot.isKeyDown("W"))
        {
            setLocation(getX(),getY() - 3);
            
        }
        if(Greenfoot.isKeyDown("S"))
        {
            setLocation(getX(),getY() +3);
            
        }
    }
    //Checks for collisions with other objects
    private void onCollision()
    {
        if(isTouching(bee.class))
        {
            removeTouching(bee.class);
            Greenfoot.playSound("bubbles.wav");

            // *** Winning the game *******************
            if(getWorld().getObjects(bee.class).size()==0)
            {
                Greenfoot.setWorld(new winner());
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }

            // *****************************************
        }
        if(isTouching(snake.class))
        {
            removeTouching(snake.class);
            Greenfoot.setWorld(new loser());
            Greenfoot.playSound("loser.wav");
            Greenfoot.stop();
        }
    }

}

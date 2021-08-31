import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
        move(3);
         turnAtEdge();
         checkKeyPress();
         onCollision();
    }//This method repeats the following actions public void act()
    
    //moves the crab
    
    //Turns the crab at the edge
    
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(50);
        }
    }
    // Checks for user key presses so user can turn the crab
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            Greenfoot.delay(60);
        }
    }
    //Checks for collisions with other objects
    private void onCollision()
    {
         if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");
                   
            // *** Winning the game *******************
            if(getWorld().getObjects(Worm.class).size()==0)
            {
                Greenfoot.setWorld(new WinSplash());
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }
            // *****************************************
        }
        if(isTouching(lobbi.class))
        {
            removeTouching(lobbi.class);
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    }
}



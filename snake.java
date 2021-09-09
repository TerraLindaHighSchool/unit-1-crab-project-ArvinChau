import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/** snake is the enemy of the crab
 * 
 * @author Arvin Chaudhuri
 * @version 8/31/2021
 */
public class snake extends Actor
{
    // This method repeats the following actions
    
    public void act()
    {
        move(3);
        turnAtEdge();
    }
    //Turns the fishy at the edge
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(Greenfoot.getRandomNumber(180));
        }
    }
}

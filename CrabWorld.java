import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        lobbi lobbi = new lobbi();
        addObject(lobbi,185,260);
        Crab crab = new Crab();
        addObject(crab,206,115);
        Worm worm = new Worm();
        addObject(worm,386,379);
        Worm worm2 = new Worm();
        addObject(worm2,177,392);
        Worm worm3 = new Worm();
        addObject(worm3,344,177);
        Worm worm4 = new Worm();
        addObject(worm4,60,180);
        Worm worm5 = new Worm();
        addObject(worm5,262,508);
    }
}
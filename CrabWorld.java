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

        fishy fishy = new fishy();
        addObject(fishy,431,274);
        bee bee = new bee();
        addObject(bee,106,167);
        bee bee2 = new bee();
        addObject(bee2,403,106);
        bee bee3 = new bee();
        addObject(bee3,38,457);
        bee bee4 = new bee();
        addObject(bee4,423,483);
        snake snake = new snake();
        addObject(snake,128,322);
        bee bee5 = new bee();
        addObject(bee5,254,169);
        bee bee6 = new bee();
        addObject(bee6,364,164);
        bee bee7 = new bee();
        addObject(bee7,218,367);
        bee bee8 = new bee();
        addObject(bee8,181,67);
        bee bee9 = new bee();
        addObject(bee9,493,501);
        bee bee10 = new bee();
        addObject(bee10,187,518);
        bee bee11 = new bee();
        addObject(bee11,251,446);
        bee bee12 = new bee();
        addObject(bee12,304,534);
        bee bee13 = new bee();
        addObject(bee13,373,393);
    }
}
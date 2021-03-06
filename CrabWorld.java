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
        Crab crab = new Crab();
        addObject(crab,257,182);
        Worm worm = new Worm();
        addObject(worm,75,51);
        Worm worm2 = new Worm();
        addObject(worm2,266,56);
        Worm worm3 = new Worm();
        addObject(worm3,418,69);
        Worm worm4 = new Worm();
        addObject(worm4,444,196);
        Worm worm5 = new Worm();
        addObject(worm5,414,324);
        Worm worm6 = new Worm();
        addObject(worm6,82,181);
        Worm worm7 = new Worm();
        addObject(worm7,256,309);
        Worm worm8 = new Worm();
        addObject(worm8,101,314);
        Lobster lobster = new Lobster();
        addObject(lobster,212,425);
        Lobster lobster2 = new Lobster();
        addObject(lobster2,438,415);
        Worm worm9 = new Worm();
        addObject(worm9,64,426);
        Worm worm10 = new Worm();
        addObject(worm10,313,474);
        Worm worm11 = new Worm();
        addObject(worm11,135,497);
        Worm worm12 = new Worm();
        addObject(worm12,428,511);
    }
}
import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

/**
 * A world where wombats live.
 * 
 * @author Michael Kölling
 * @version 2.0
 */
public class WombatWorld extends World
{
    /**
     * Create a new world with 10x10 cells and
     * with a cell size of 60x60 pixels.
     */
    public WombatWorld() 
    {
        super(10, 10, 60);
        //populate(); 
        addObject(new Wombat(),0,0);
        addObject(new Leaf(),1,0);
        setBackground("cell.jpg");
        setPaintOrder(Wombat.class, Leaf.class);  // draw wombat on top of leaf
        prepare();
    }

    /**
     * Populate the world with a fixed scenario of wombats and leaves.
     */    
    public void populate()
    {
        addObject(new Wombat(), 7, 1);
        addObject(new Wombat(), 6, 6);
        addObject(new Wombat(), 1, 7);
        randomLeaves(100);
    }

    /**
     * Place a number of leaves into the world at random places.
     * The number of leaves can be specified.
     */
    public void randomLeaves(int howMany)
    {
        for (int i=0; i<howMany; i++) {
            Leaf leaf = new Leaf();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(leaf, x, y);
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wombat wombat = new Wombat();
        addObject(wombat,3,1);
        Leaf leaf = new Leaf();
        addObject(leaf,6,3);
        Leaf leaf2 = new Leaf();
        addObject(leaf2,6,2);
        Leaf leaf3 = new Leaf();
        addObject(leaf3,4,2);
        Leaf leaf4 = new Leaf();
        addObject(leaf4,5,1);
        leaf2.setLocation(6,2);
        leaf3.setLocation(4,3);
    }
}
import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 * @calvinbl
 * @version 8/26/21

 */
public class Crab extends Actor
{
    public void act()
    {
        turnAtEdge();
        checkKeyPress();
        onCollision();
    }


    // Moves the crab
    
    // Turns the crab at the edge
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(50);
        }
        
    }
    // Checks for user key presses so user can turn the Crab
    private void checkKeyPress () 
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+2, getY());
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-2, getY());
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-2);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+2);
        }

    }
    // Check for collisions with other objects
    private void onCollision ( )
    {
        if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("eatingeffect.wav");
            
            //Winning the game
        if(getWorld().getObjects(Worm.class).size() ==0)
        {
            Greenfoot.setWorld(new WinSplash());
            Greenfoot.playSound("fanfare.wav");
            Greenfoot.stop();
        }
    }
        if(isTouching(Lobster.class))
        {
            Greenfoot.playSound("punchsound.mp3");
            Greenfoot.stop();
        }
    
    }
}

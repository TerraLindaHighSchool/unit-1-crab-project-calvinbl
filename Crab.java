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
        move(0);
        turnatEdge();
        checkKeyPress();
        onCollision();
    }


    // Moves the crab
    
    // Turns the crab at the edge
    private void turnatEdge()
    {
        
    }
    // Checks for user key presses so user can turn the Crab
    private void checkKeyPress () 
    {
        if(Greenfoot.isKeyDown("right"))
        {
            turn(30);
            
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
    }
    // Check for collisions with other objects
    private void onCollision ( )
    {
        if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
        }
        
    }
}

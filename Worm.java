import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Worm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worm extends Actor
{

    public void act()
    {
        
    {
        move(1);
        turnAtEdge();
    }

}private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(Greenfoot.getRandomNumber (360));
        }
    }
}

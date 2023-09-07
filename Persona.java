import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase persona representa al depredador de frutillas.
 * 
 * @author Santiago Neira
 * @version 202308101955
 */
public class Persona extends Actor
{    
    private int velocidad   = 10;
    /**
     * Act - do whatever the Persona wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {        
        //turn(1);
        //move(5);
        if( Greenfoot.isKeyDown("left") )
        {
            move(velocidad*-1);
        }
        
        if( Greenfoot.isKeyDown("right") )
        {
            move(velocidad);
        }
        
        if( Greenfoot.isKeyDown("up") )
        {
            setLocation(getX(), getY()-velocidad);
        }
        
        if( Greenfoot.isKeyDown("down") )
        {
            setLocation(getX(), getY()+velocidad);
        }
        
        if( isTouching(Frutilla.class) ) 
        {
            removeTouching(Frutilla.class);
            MyWorld world = (MyWorld) getWorld();
            world.aumentarPuntaje();
        }
    }
    
}

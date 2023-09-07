import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frutilla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frutilla extends Actor
{
    /**
     * Act - do whatever the Frutilla wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int numeroAleatorio1 = Greenfoot.getRandomNumber(360);
        turn(numeroAleatorio1);
        int numeroAleatorio2 = Greenfoot.getRandomNumber(100);
        move(numeroAleatorio2);
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    private Puntaje puntaje;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    public void aumentarPuntaje() {
        puntaje.aumentarPuntaje();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        puntaje = new Puntaje();
        addObject(puntaje, 80, 20);
        
        Persona persona = new Persona();
        addObject(persona,99,92);
        Frutilla frutilla = new Frutilla();
        addObject(frutilla,337,92);
        Frutilla frutilla2 = new Frutilla();
        addObject(frutilla2,216,214);
        Frutilla frutilla3 = new Frutilla();
        addObject(frutilla3,87,206);
        Frutilla frutilla4 = new Frutilla();
        addObject(frutilla4,202,34);
        Frutilla frutilla5 = new Frutilla();
        addObject(frutilla5,37,36);
        Frutilla frutilla6 = new Frutilla();
        addObject(frutilla6,141,324);
        Frutilla frutilla7 = new Frutilla();
        addObject(frutilla7,333,274);
    }
}

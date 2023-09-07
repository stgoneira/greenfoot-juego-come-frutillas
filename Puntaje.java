import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Puntaje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puntaje extends Actor
{
    private int puntaje = 0;
    private GreenfootImage imagen = null;
    private Font fuente = new Font("Arial", true, false, 24);
    
    public Puntaje() {
                
    }
    
    private void setupImagen() {
        imagen = new GreenfootImage(textoPuntaje(), 24, Color.WHITE, null);
        imagen.setFont(fuente);
        setImage(imagen);
    }
    
    public String textoPuntaje() {
        if(puntaje >= 70) {
            return "GANASTE!!!!";
        }
        return "PUNTAJE: "+puntaje;
    }
    
    public int getPuntaje() {return puntaje;}
    
    public void aumentarPuntaje() {
        this.puntaje += 10;
    }
    
    /**
     * Act - do whatever the Puntaje wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {        
        setupImagen();
    }
}

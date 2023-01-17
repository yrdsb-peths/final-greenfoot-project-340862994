import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heal extends Actor
{
    GreenfootImage[] Heal = new GreenfootImage[3];
    SimpleTimer animationTimer = new SimpleTimer();
    
    /**
     * Act - do whatever the Heal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        int x = getX();
        int y = getY();
        setLocation(x, y);
    }
    
    public Heal()
    {
        for(int i = 0; i < Heal.length; i++)
        {
            Heal[i] = new GreenfootImage("images/Healthbottle/healthbottle" + i + ".png");
            Heal[i].scale(50, 50);
            setImage(Heal[i]);
        }
        
        animationTimer.mark();
    }
    
    int imageIndex = 0;
    public void animateCoin()
    {
        if(animationTimer.millisElapsed() < 50)
        {
            return;
        }
        animationTimer.mark();
        
        setImage(Heal[imageIndex]);
        imageIndex = (imageIndex + 1) % Heal.length;
    }
}

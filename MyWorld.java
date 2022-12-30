import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * world
 * 
 * @author (Martin) 
 * @version (2022/12/29)
 */
public class MyWorld extends World
{
    public int level = 0;
    Label levelLabel;
    int speed = 1;
    
    Health playerHealthBar = new Health();
    Health2 bossHealthBar = new Health2();
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 800x500 cells with a cell size of 1x1 pixels.
        super(800, 500, 1, false); 
        
        prepare();
    }
    
    public void prepare()
    {
        Person Person = new Person();
        addObject(Person, 100, 250);

        levelLabel = new Label(0, 50);
        addObject(levelLabel, 150, 470);
        
        addObject(playerHealthBar, 110, 20);
        
        createFireball();
        createBoss();
        names();
    }
    
    public void names()
    {
        Label bossName = new Label("Boss1", 30);
        addObject(bossName, 400, 450);
        Label health = new Label("HP", 20);
        addObject(health, 25, 20);
        Label level = new Label("Level", 50);
        addObject(level, 70, 470);
    }
    
    public void gameOverWin()
    {
        Label gameOverLabel = new Label("Game Over Win" , 100);
        addObject(gameOverLabel, 400, 250);
    }
    
    public void gameOverLose()
    {
        Label gameOverLabel = new Label("Game Over Lose" , 100);
        addObject(gameOverLabel, 400, 250);  
    }
    
    public void increaseLevel()
    {
        level++;
        levelLabel.setValue(level);
        
        if(level % 2 == 0)
        {
            speed += 1;
        }
    }
    
    public void createFireball()
    {
        Fireball Fireball = new Fireball();
        Fireball.setSpeed(speed);
        int x = 800;
        int y = Greenfoot.getRandomNumber(500);
        addObject(Fireball, x, y);
    }
    
    //may create more than 1 boss in future
    public void createBoss()
    {
        Boss1 Boss1 = new Boss1();
        addObject(Boss1, 650, 250);

        addObject(bossHealthBar, 400, 470);
    }
    
    public Health getPlayerHealthBar()
    {
        return playerHealthBar;
    }
    
    public Health2 getBossHealthBar()
    {
        return bossHealthBar;
    }
}

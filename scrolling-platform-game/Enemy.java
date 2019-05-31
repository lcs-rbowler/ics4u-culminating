import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    // Horizontal speed (change in horizontal position, or delta X)
    private int deltaX = 2;

    // Vertical speed (change in vertical position, or delta Y)
    private int deltaY = 2;
    
    // Track current theoretical position in wider "scrollable" world
    private int currentScrollableWorldXPosition;
    
    // Constants to track vertical direction
    private static final String FACING_UP = "up";
    private static final String FACING_DOWN = "down";
    private String verticalDirection;

    // Constants to track horizontal direction
    private static final String FACING_RIGHT = "right";
    private static final String FACING_LEFT = "left";
    private String horizontalDirection;
    
    /**
     * Constructor
     */
    Enemy()
    {
        
    }
    
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void run() 
    {
        // Facing left to start
        horizontalDirection = FACING_LEFT;
        if (horizontalDirection == FACING_RIGHT)
            {
                setImage("red-move-right.png");
            }
            else if (horizontalDirection == FACING_LEFT)
            {
                setImage("red-move-left.png");
            }
            else if (verticalDirection == FACING_UP)
            {
                setImage("red-move-up.png");
            }
            else if (verticalDirection == FACING_DOWN)
            {
                setImage("red-move-down.png");
            }
    }  
    
    public void movePattern1()
    {
        //This enemy is required to move on the first platfrom, it will loop through this code 150 times.
        
        // Loop through to make the ghost move back and forth on platform 1
        for (int p = 0; p < 150; p += 1)
        {   
            //Move left to end of platform 1
            for (int i = 4; i < 16; i += 1)
            {
                if (i == 16)
                {
                    //Move right to other end of platform 1 if he is at i = 16
                    for (int j = 16; i > 3; i -= 1)
                
                    {   
                    
                    }
                }
            }
        }       
    }
}

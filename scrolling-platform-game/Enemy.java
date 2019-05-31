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
}

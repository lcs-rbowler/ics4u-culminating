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

    // Add a variable to track time
    private int frames;

    // Add a variable to control turning around
    private int turnAroundAfterThreshold;
    
    // Track what ghost this is
    private int ghostNumber;

    /**
     * Constructor
     */
    Enemy(int turnAroundAfterThisManyFrames, int whichGhost)
    {
        horizontalDirection = FACING_RIGHT;

        // Set the turn around threshold
        turnAroundAfterThreshold = turnAroundAfterThisManyFrames;
     
        // Set which ghost this
        ghostNumber = whichGhost;

        // Start tracking time
        frames = 0;
    }

    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Track time
        frames += 1;

        // Facing left to start
        changeCostume();
        checkToTurnAround();
        moveAround();
        movementForThirdGhost();
    }  

    /**
     * Turn aroudn if it's time
     */
    private void checkToTurnAround()
    {
        if (frames == turnAroundAfterThreshold)
        {
            // Reset time tracker
            frames = 0;

            // Change direction
            if (horizontalDirection == FACING_LEFT)
            {
                horizontalDirection = FACING_RIGHT;
            }
            else 
            {
                horizontalDirection = FACING_LEFT;
            }
        }
    }

    /**
     * The movement pattern for the third ghost!
     */
    public void movementForThirdGhost()
    {
        //NOTE: The Ghost spawns 4th platform top right corner

        //Move end to end once
        if (frames == 180)
        {
            // Change direction
            horizontalDirection = FACING_RIGHT;
        }

        //Second Movement, turn around again, head to drop down to 3rd platform
        if (frames == 200)
        {
            verticalDirection = FACING_DOWN;
        }

        if (frames == 230)
        {
            horizontalDirection = FACING_LEFT;
        }

        if (frames == 250)
        {
            horizontalDirection = FACING_RIGHT;
        }

        if (frames == 270)
        {
            verticalDirection = FACING_UP;
        }

        if (frames == 300)
        {
            horizontalDirection = FACING_RIGHT;
        }

        if (frames == 450)
        {
            frames = 0;
            verticalDirection = FACING_LEFT;
        }

    }

    /**
     * Move around based on direction
     */
    private void moveAround()
    {
        if (horizontalDirection == FACING_RIGHT)
        {
            setLocation(getX() + deltaX, getY());
        }
        else if (horizontalDirection == FACING_LEFT)
        {
            setLocation(getX() - deltaX, getY());
        }
        else if (verticalDirection == FACING_UP)
        {
            setLocation(getY() - deltaY, getX());
        }
        else if (verticalDirection == FACING_DOWN)
        {
            setLocation(getY() + deltaY, getX());
        }
    }

    /**
     * Change image to reflect direction
     */
    private void changeCostume()
    {
        if (ghostNumber == 1)
        {
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
        else if (ghostNumber == 2)
        {
            if (horizontalDirection == FACING_RIGHT)
            {
                setImage("blue-move-right.png");
            }
            else if (horizontalDirection == FACING_LEFT)
            {
                setImage("blue-move-left.png");
            }
            else if (verticalDirection == FACING_UP)
            {
                setImage("blue-move-up.png");
            }
            else if (verticalDirection == FACING_DOWN)
            {
                setImage("blue-move-down.png");
            }
        }
        else if (ghostNumber == 3)
        {
            if (horizontalDirection == FACING_RIGHT)
            {
                setImage("orange-move-right.png");
            }
            else if (horizontalDirection == FACING_LEFT)
            {
                setImage("orange-move-left.png");
            }
            else if (verticalDirection == FACING_UP)
            {
                setImage("orange-move-up.png");
            }
            else if (verticalDirection == FACING_DOWN)
            {
                setImage("orange-move-down.png");
            }
        }
    }
}

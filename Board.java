import greenfoot.*; 

/**
 * The game board. The board had a paddle that can move.
 * 
 * @author mik
 * @version 1.0
 */
public class Board extends World
{
    private Paddle paddle;
    
    /**
     * Constructor for objects of class Board.
     * 
     */
    public Board()
    {    
        super(960, 620, 1);
        GreenfootImage img=new GreenfootImage("Space.png");
        img.scale(getWidth(),getHeight());
        setBackground(img);
        
        setPaintOrder ( Ball.class, Smoke.class );
        Score s=new Score();
        
        paddle = new Paddle(s);
        addObject ( paddle, getWidth() / 2, getHeight() - 40);
        addObject(s,58,56);
        addObject(new SimpleBrick(), 380, 260);
        addObject(new DoubleBrick(), 480, 260);
    };
    
    public void ballIsOut()
    {
        paddle.newBall();
    }
}


/**
 * Write a description of class Piece here.
 * 
 * @Ryan Chandra
 * @version (a version number or a date)
 */
public class Piece 
{
    public final static int H = 1; 
    public final static int D = 2; 
    public final static int C = 3; 
    public final static int S = 4; 
    public final static int Hin = -1; 
    public final static int Din = -2; 
    public final static int Cin = -3; 
    public final static int Sin = -4; 
    //H = 1; D = 2; C = 3; S = 4; 
    //H in = -1; D in = -2; C in = -3; S in = -4; 
    //ORIENTATION: 0 is starting, 1 is 90 degrees, 2 is 180 degrees, 3 is 270 degrees (flipped clockwise)
    private int[] sides; //array with the sides (as ints)
    private int orientation; //orientation as an int
    private String name; //ID
    public Piece(int[]newSides, int newOrientation, String newName) //constructor
    {
        sides = newSides; 
        orientation = newOrientation; 
        name = newName; 
    }
    
    public void flip() //flip clockwise
    {
        orientation = (++orientation)%4;  
        for(int i = 0; i<4; i++)
        {
            sides[i] = (++sides[i])%4; 
        }
    }
    
    //accessor methods to return the sides of the piece
    
    public int getTop()
    {
        return sides[0]; 
    }
    
    public int getRight()
    {
        return sides[1]; 
    }
    
    public int getBottom()
    {
        return sides[2]; 
    }
    
    public int getLeft()
    {
        return sides[3]; 
    }
}

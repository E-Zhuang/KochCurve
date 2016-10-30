
/**
 * Write a description of class KochCurve here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import apcslib.*;

class KochCurve extends DrawingTool
{
    
    /**
     * Constructor for object of class KochCurve. It uses the super constructor 
     * to relate the pen to a SketchPad.
     */
    public KochCurve(SketchPad paper)
    {
        super (paper);
    }

    /**
     * After being passed the number of levels and the length of each side, 
     * this method calls itself. 
     */
    public void drawKochCurve(int levels, int length)
    {
        int myLevels, myLength;
        
        myLevels = levels;
        myLength = length;
    
    
        if (myLevels == 1)
        {
            forward(myLength);
        }
        else
        {
            drawKochCurve(myLevels - 1, myLength / 3);
            turnLeft(60);
            drawKochCurve(myLevels - 1, myLength / 3);
            turnRight(120);
            drawKochCurve(myLevels - 1, myLength / 3);
            turnLeft(60);
            drawKochCurve(myLevels - 1, myLength / 3);
        }
    }

}

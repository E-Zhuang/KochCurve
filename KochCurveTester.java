
/**
 * Write a description of class KochCurveTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import apcslib.*;

public class KochCurveTester
{
    /**
     * This program draws a Koch snowflake by instantiates a SketchPad and KochCurve. 
     * By drawing koch lines and turning, you are able to create a snowflake like shape. 
     */
    public static void main(String[] args)
    {
        // Instantiates a SketchPad and a KochCurve object that draws on the SketchPad
        SketchPad paper = new SketchPad(500,500);
        KochCurve curvyPen = new KochCurve(paper);
        
        //moves the KochCurve to the lower left corner and orients it correctly
        curvyPen.up();
        curvyPen.move(-125, -50);
        curvyPen.down();
        curvyPen.setDirection(60);
        
        curvyPen.drawKochCurve(6,300); //to draw the left side of Koch Snowflake
        curvyPen.turnRight(120);
        curvyPen.drawKochCurve(6,300); //draws right side of Koch Snowflake 
        curvyPen.turnRight(120);
        curvyPen.drawKochCurve(6,300); //draws left side of Koch Snowflake
        curvyPen.turnRight(120);
    }
}

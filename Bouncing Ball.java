package bouncingball;

import java.applet.*;// for applet and runnable classes, basically for applets
import java.awt.*;// abstract window toolkit is an API for graphics[GUI]

public class BouncingBall extends Applet implements Runnable  // applet, runnable are inbuilt
{
    // x,y coordinates and radius of the circle.
    int x = 150, y = 50, r=20; // positioning the circle in the beginning and defining the radius
    int dx = 10, dy = 10; // for movement of circle, something like pixels

    // create thread.
    Thread t; // process in java
    boolean stopFlag; // defining boolean variable

    // Function to start thread.
    public void start()
    {
        t = new Thread(this);
        stopFlag=false; // assigning value to the boolean function as false
        t.start();
    }

    // Draw circle from its present position.
    public void paint(Graphics g)
    {
        g.setColor(Color.black); // colouring the circle
        g.fillOval(x-r, y-r, r*2, r*2); //giving dimensions for oval, defining the circle
    }

    // function to move the image.
    public void run()
    {
        while(true)
        {
            if(stopFlag)
                break;
            // Bounce if we've hit an edge.
            if ((x - r + dx < 0) || (x + r + dx > bounds().width)) dx = -dx; // to rebound while the ball hits an edge in X-axis direction
            if ((y - r + dy < 0) || (y + r + dy > bounds().height)) dy = -dy; // to rebound while the ball hits an edge in Y-axis direction
            // Move the circle.
            x += dx;  y += dy; // To move the circle forward

            try
            {
                Thread.sleep(10); // it's like speed of the circle
            }
            catch(Exception e)
            {
                System.out.println(e);
            };
            // print circle again n again.
            repaint();
        }
    }

    // function to stop printing.
    public void stop()
    {
        stopFlag=true;
        t=null;
    }
}

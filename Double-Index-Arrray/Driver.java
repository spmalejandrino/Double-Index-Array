import java.awt.event.*;
import java.awt.Point;

public class Driver implements KeyListener, MouseListener, MouseMotionListener {
    private static final int NUM_POINTS = 1000;

    private Point[] points; // Used to trace out the user's stroke
    private Canvas myCanvas; // The drawing surface
    private int pointsUsed;

    /**
    * Constructor for objects of class Driver
    */    
    public Driver()
    {
        myCanvas = new Canvas();
        points = new Point[NUM_POINTS];
    }
    

   /**
    * Makes the canvas visible and sets it to listen to mouse events
    */
    public void start()
    {
        myCanvas.setListener(this);
        myCanvas.setVisible(true);
        pointsUsed = 0;
    }

    
    /**
    * Replays the modified user stroke 
    */    
    public void replay()
    {
        myCanvas.eraseAll();
        for (int i = 0; i<pointsUsed; i++){
            Circle circle = new Circle(myCanvas); //display a circle with center at the location of the mouse event
            circle.moveTo(points[i].x,points[i].y);
            circle.makeVisible();
        }
    }

   /**
    * Invoked when a key has been pressed
    */    
    public void keyPressed(KeyEvent ke)
    {
        if (ke.getKeyChar() == 'e')
            System.exit(0);
    }

    /**
    * Invoked when a mouse has been pressed
    */    
    public void mousePressed(MouseEvent event)
    {
        myCanvas.eraseAll();
        pointsUsed = 0;
        points[pointsUsed] = event.getPoint(); //capture the mouse event location in the points array
        Circle circle = new Circle(myCanvas); //display a circle with center at the location of the mouse event
        circle.moveTo(event.getPoint().x,event.getPoint().y);
        circle.makeVisible();
    }

    /**
    * Invoked when the mouse has been dragged
    */    
    public void mouseDragged(MouseEvent event)
    {
        if (pointsUsed < NUM_POINTS-1) {
            pointsUsed+=1;
            points[pointsUsed] = event.getPoint(); //capture the mouse event location in the points array
            Circle circle = new Circle(myCanvas); //display a circle with center at the location of the mouse event
            circle.moveTo(event.getPoint().x,event.getPoint().y);
            circle.makeVisible();
        }
    }
    
    public int getMin(){
        int lowest = points[0].y;
        for (int i=1; i<pointsUsed; i++){
            if(lowest > points[i].y){
                lowest = points[i].y;
            }
        } return lowest;
    }
    
    public void displace(){
        int a = getMin();
        
        for (int i=0; i<=pointsUsed; i++){
            points[i].y -= a;
        }
    }

    /**
    * Invoked when the mouse has been released
    */    
    public void mouseReleased(MouseEvent event)
    {
    }

    /**
    * Invoked when the mouse has been clicked
    */    
    public void mouseClicked(MouseEvent event)
    {
    }

    /**
    * Invoked when the mouse enters the component
    */    
    public void mouseEntered(MouseEvent event)
    {
    }

    /**
    * Invoked when the mouse exits the component
    */    
    public void mouseExited(MouseEvent event)
    {
    }

    /**
    * Invoked when the mouse has moved
    */       
    public void mouseMoved(MouseEvent event)
    {
    }

    /**
    * Invoked when a key has been typed
    */    
    public void keyTyped(KeyEvent ke)
    {
    }

    /**
    * Invoked when a key has been released
    */    
    public void keyReleased(KeyEvent ke)
    {
    }
    
}

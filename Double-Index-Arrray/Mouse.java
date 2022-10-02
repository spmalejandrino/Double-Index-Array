import java.awt.event.*;

public class Mouse implements KeyListener, MouseListener, MouseMotionListener {
    private Canvas myCanvas; // The drawing surface
    private Circle myCircle;

    public Mouse()
    {
        myCanvas = new Canvas();
        myCanvas.setVisible(true);
        myCircle = new Circle(myCanvas);
        myCircle.changeSize(40);
        myCircle.makeVisible();
    }

    // Run the following function from the BlueJ environment to start things
    // off
    public void start()
    {
        myCanvas.setListener(this);
        myCanvas.setVisible(true);
    }

    // Keyboard listeners
    public void keyPressed(KeyEvent ke)
    {
        if (ke.getKeyChar() == 'e')
            System.exit(0);
    }

    public void mousePressed(MouseEvent event)
    {
        System.out.println(event);
    }

    public void mouseDragged(MouseEvent event)
    {
        // System.out.println(event);
    }

    public void mouseReleased(MouseEvent event)
    {
        System.out.println(event);
    }

    public void mouseClicked(MouseEvent event)
    {
        System.out.println(event);
    }

    public void mouseEntered(MouseEvent event)
    {
        System.out.println(event);
    }

    public void mouseExited(MouseEvent event)
    {
        System.out.println(event);
    }

    public void mouseMoved(MouseEvent event)
    {
       //  System.out.println(event);
    }

    public void keyTyped(KeyEvent ke)
    {
    }

    public void keyReleased(KeyEvent ke)
    {
    }

}

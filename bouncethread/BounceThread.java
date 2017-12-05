package bouncethread;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import static java.lang.Math.max;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BounceThread {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new BounceFrame();
                frame.setTitle("Bouncing balls");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });

    }

}

class BallRunnable implements Runnable {

    private Ball ball;
    private Component component;
    
    public static final int STEPS = 1000;
    public static final int DELAY = 7;

    public BallRunnable(Ball aBall, Component aComponent) {
        ball = aBall;
        component = aComponent;
    }

    public void run() {
        try {
            for (int i = 0; i < STEPS; i++) {
                ball.move(component.getBounds());
                component.repaint();
                Thread.sleep(DELAY);
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(BallRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        BallComponent.balls.remove(ball);
        component.repaint();
    }
}

class Ball {

    private static final int XSIZE = 15;
    private static final int YSIZE = 15;
    private double x = 0;
    private double y = 0;
    private double dx = 1;
    private double dy = 1;
    
    public Color col;
    
    public Ball()
    {
        dx =  ThreadLocalRandom.current().nextDouble(0, 2);
        dy =  ThreadLocalRandom.current().nextDouble(0, 2);
        
        int r,g,b;
        r = ThreadLocalRandom.current().nextInt(0, 255);
        g = ThreadLocalRandom.current().nextInt(0, 255);
        b = ThreadLocalRandom.current().nextInt(0, 255);
        
        col = new Color(r,g,b);
    }
    
    public void move(Rectangle2D bounds) {
        x += dx;
        y += dy;
        if (x < bounds.getMinX()) {
            x = bounds.getMinX();
            dx = -dx;
        }
        if (x + XSIZE > bounds.getMaxX()) {
            x = bounds.getMaxX() - XSIZE;
            dx = -dx;
        }

        if (y < bounds.getMinY()) {
            y = bounds.getMinY();
            dy = -dy;
        }
        if (y + YSIZE > bounds.getMaxY()) {
            y = bounds.getMaxY() - YSIZE;
            dy = -dy;
        }

    }

    public Ellipse2D getShape() {
        return new Ellipse2D.Double(x, y, XSIZE, YSIZE);
    }
}

class BallComponent extends JPanel {

    private final int DEFAULT_WIDTH = 450;
    private final int DEFAULT_HEIGHT = 350;

    public static   List<Ball> balls = new ArrayList<>();

    public synchronized void add(Ball b) {
        balls.add(b);
    }

    public  void  paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (Ball b : balls) {
            g2.setColor(b.col);
            g2.fill(b.getShape());
        }
        
    }

    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

}

class BounceFrame extends JFrame {

    private BallComponent comp;

    public BounceFrame() {
        comp = new BallComponent();
        add(comp, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        addButton(buttonPanel, "Start", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                addBall();
            }
        }
        );

        addButton(buttonPanel, "Close", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        }
        );

        add(buttonPanel, BorderLayout.SOUTH);
        pack();

    }

    public void addButton(Container c, String name, ActionListener listener) {
        JButton button = new JButton(name);
        c.add(button);
        button.addActionListener(listener);
    }

    public void addBall() {
        Ball b = new Ball();
        comp.add(b);
        Runnable r = new BallRunnable(b, comp);
        Thread t = new Thread(r);
        t.start();
    }
}

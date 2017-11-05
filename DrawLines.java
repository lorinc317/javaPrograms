package drawlines;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawLines {

    static DrawPanel panel = null;
    static JFrame application = null;
    static JButton again = null;
    static JButton close = null;       
    
    public static void initUI()
    {
         DrawLines.panel = new DrawPanel(Color.WHITE, 20);
         DrawLines.application = new JFrame("Random Vonalak");
         DrawLines.again = new JButton("Regenerate");
         DrawLines.close  = new JButton("Colose Application");
        
        close.addActionListener((ae) -> {
            System.exit(0);
        });
        
        again.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                DrawLines.panel = null;
               DrawLines.panel = new DrawPanel(Color.WHITE, 20);
                
                //DrawLines.application.add(DrawLines.panel);
                DrawLines.application.setContentPane(DrawLines.panel);
                DrawLines.panel.add(DrawLines.again);
                DrawLines.panel.add(DrawLines.close);
                DrawLines.panel.revalidate();
                DrawLines.application.revalidate();
            }       
        });
        panel.add(again);
        panel.add(close);
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400, 400);
        application.setVisible(true);
    }
               
    public static void main(String[] args) {
        initUI();
    }

}

class Point {

    private int x;
    private int y;

    public Point(Point p) {
        this(p.getX(), p.getY());
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        if (x >= 0 && y >= 0) {
            this.x = x;
            this.y = y;
        } else {
            throw new IllegalArgumentException("Coordinates must be positive integers");
        }
    }

    public void setX(int x) {
        if (x >= 0) {
            this.x = x;
        } else {
            throw new IllegalArgumentException("Coordinates must be positive integers");
        }
    }

    public void setY(int y) {
        if (y >= 0) {
            this.y = y;
        } else {
            throw new IllegalArgumentException("Coordinates must be positive integers");
        }
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return "x: " + this.getX() + "\n" + "y: " + this.getY() + "\n";
    }
}

class MyLine {

    private Point start;
    private Point end;
    private Color myColor;

    public MyLine(Point s, Point e, Color c) {
        this.start = s;
        this.end = e;
        this.myColor = c;
    }

    public MyLine() {

    }

    public void setColor(Color c) {
        myColor = c;
    }

    public void setStart(Point s) {
        this.start = s;
    }

    public void setEnd(Point e) {
        this.end = e;
    }

    public void drawMyLine(Graphics g) {
        g.setColor(myColor);
        g.drawLine(this.start.getX(), this.start.getY(), this.end.getX(), this.end.getY());
    }
}

class DrawPanel extends JPanel {

    private MyLine[] lines;
    private int numOfLines;
    private Color bgColor;
    private Random randNumers;

    public DrawPanel(Color bg, int num) {
        this.bgColor = bg;
        setBackground(bg);
        this.numOfLines = num;
        lines = new MyLine[num];
        randNumers = new Random();

        for (int i = 0; i < this.numOfLines; i++) {
            lines[i] = new MyLine();
            lines[i].setStart(new Point(randNumers.nextInt(300), randNumers.nextInt(300)));
            lines[i].setEnd(new Point(randNumers.nextInt(300), randNumers.nextInt(300)));
            lines[i].setColor(new Color(randNumers.nextInt(256),
                    randNumers.nextInt(256), randNumers.nextInt(256)));
        }

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (MyLine line : lines) {
            line.drawMyLine(g);
        }
    }
}

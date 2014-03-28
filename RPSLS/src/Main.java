import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Main extends JPanel implements KeyListener, MouseListener, MouseMotionListener
{
	private static final int screenHeight = 500;
	private static final int screenWidth = 1000;
	private static final String gameName = "";
	enum Page {HOME, GAME};
	Page page = Page.HOME;
	public static void main(String[]args)
	{
        JFrame frame = new JFrame();
        frame.setSize(screenWidth,screenHeight);
        frame.setTitle(gameName);
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Main drawer = new Main();
        frame.add(drawer);
        frame.setVisible(true);
        frame.addKeyListener(drawer);
        frame.addMouseListener(drawer);
        frame.addMouseMotionListener(drawer);
	}
	public void paint(Graphics screen)
	{
		if(page == Page.HOME)
		{
			drawHome(screen);
		}
		if(page == Page.GAME)
		{
			drawGame(screen);
		}
	}
	public void drawHome(Graphics screen)
	{
		
	}
	public void drawGame(Graphics screen)
	{
		
	}
	public void mouseDragged(MouseEvent e) 
	{
		
	}
	public void mouseMoved(MouseEvent e) 
	{
		
	}
	public void mouseClicked(MouseEvent e) 
	{
		
	}
	public void mouseEntered(MouseEvent e) 
	{
		
	}
	public void mouseExited(MouseEvent e) 
	{
		
	}
	public void mousePressed(MouseEvent e) 
	{
		
	}
	public void mouseReleased(MouseEvent e) 
	{
		
	}
	public void keyPressed(KeyEvent e) 
	{
		
	}
	public void keyReleased(KeyEvent e) 
	{
		
	}
	public void keyTyped(KeyEvent e) 
	{
		
	}
}

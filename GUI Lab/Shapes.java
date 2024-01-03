import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel
{
  private int choice;

  public Shapes(int userChoice)
  {
    choice = userChoice;
  }

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    for (int i = 0; i < 10; i+=2)
    {
      switch (choice)
      {
        case 1:
        g.drawRect(10 + i * 10, 10 + i * 10,50 + i * 10, 50 + i * 10);
        break;

        case 2:
        g.drawOval(10 + i * 10, 10 + i * 10,50 + i * 10, 50 + i * 10);
        break;

        //new shape
        case 3:
        int x[]= {11*i+i,8*i+i,14*i+i};
        int y[]= {10*i+20,13*i+20,13*i+20};
        g.drawPolygon(x, y, 3);
        break;

        case 4:
        int []v = {45*i, 55*i, 75*i, 55*i, 63*i, 43*i, 17*i, 31*i, 12*i, 35*i, 45*i};
        int []z = {41*i, 65*i, 71*i, 83*i, 108*i, 88*i, 105*i, 78*i, 61*i, 63*i,41*i};
        g.drawPolygon(v, z, 10);
        break;

        


      } 

    }
          
  }

}
import javax.swing.JFrame; 
import javax.swing.JOptionPane;

public class ShapesTest
{
   public static void main(String[] args)
   {
      String input = JOptionPane.showInputDialog("Enter 1 to draw rectangles\n" + "Enter 2 to draw ovals\n"); //+ "Enter 3 to draw triangle\n" + "Enter 4 to draw polygon");
              
      int choice = Integer.parseInt(input);
      Shapes panel = new Shapes(choice);
      JFrame application = new JFrame();

      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      application.add(panel);
      application.setSize(1000, 1000);
      application.setVisible(true);
   }

}       




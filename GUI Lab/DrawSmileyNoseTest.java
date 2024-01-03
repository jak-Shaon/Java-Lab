import javax.swing.JFrame;

public class DrawSmileyNoseTest 
{
    public static void main(String[] args)
    {
        DrawSmileyNose panel = new DrawSmileyNose();
            JFrame application = new JFrame();
                                      
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(250, 250);                                                                                        
        application.setVisible(true);

    }
     
}

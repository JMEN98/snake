import javax.swing.*;

public class GameFrame  extends JFrame {
    GameFrame(){
    this.add(new GamePanel());
    this.setTitle("jeffs snake game");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.pack();
    this.setVisible(true);
    }
}

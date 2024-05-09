import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class FlappyBird extends JPanel{
    int boardWidth = 360;
    int boardHeight = 640;

    FlappyBird() {
        setPreferredSize(new Dimension(boardWidth, boardHeight)); // for setting the size of the panel
        setBackground(Color.blue); // for setting the background color of the panel
    }
}

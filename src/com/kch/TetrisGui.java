package com.kch;
import javax.swing.JFrame;

public class TetrisGui extends JFrame {

    private int screenX = 600, screenY = 900;


    public TetrisGui() {
        super("tetris");
        setSize(screenX, screenY);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}

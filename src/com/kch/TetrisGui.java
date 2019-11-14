package com.kch;


import com.kch.Block.BlockFrame;
import com.kch.storage.FileStorage;
import jdk.nashorn.internal.ir.Block;

import javax.swing.*;
import java.awt.*;

public class TetrisGui extends JFrame {

    private int screenX = 330, screenY = 660;   // X : 0, 32, 64, 96, 128, 160, 192, 224, 256, 288  Y : ..
    // 160, 32에서 계속 생성되어야 함
    private Graphics2D graphic;

    public TetrisGui() {
        super("tetris");
        guiSetting();
    }

    public void guiSetting() {
        setSize(screenX, screenY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        graphic = (Graphics2D) getGraphics();
    }

    public void draw(int x, int y) {                                                    // 좌표값을 넘겨주면 그 위치에 그려줌
        graphic.drawImage(FileStorage.getImage(), x, y, null);
    }

    public void clear(int x, int y) {
        graphic.clearRect(x, y, 32,32);
    }



}

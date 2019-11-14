package com.kch;

import com.kch.Block.BlockFrame;




public class GameLoop extends TetrisGui {

    public void loop() {

        BlockFrame bf = new BlockFrame();
        int x = 132, y = 33;
        int rand = bf.randomValuePut();

        while(true) {
            if(y != 660) {

                bf.GenerateAndClearBlock(x, y, rand);
                y += 33;
            } else {
                y = 0;
                rand = bf.randomValuePut();
                continue;
            }

            try {
                Thread.sleep(80);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package com.kch.Block;

import com.kch.TetrisGui;
import com.kch.storage.FileStorage;

public class BlockFrame extends TetrisGui {

    private int space = 33;
    private int bN = 0;

    public int randomValuePut() {
        double random = Math.random();
        int randValue = (int)(random * 6) + 1;
        return randValue;
    }

    public int blockI(int x, int y) {
        x -= space;
        bN = 1;
        draw(x, y);
        draw(x + space, y);
        draw(x + space*2, y);
        draw(x + space*3, y);
        return bN;
    }

    public int blockJ(int x, int y) {
        bN = 2;

        draw(x, y);
        draw(x, y - space);
        draw(x - space, y);
        draw(x - space*2, y);
        return bN;
    }

    public int blockL(int x, int y) {
        bN = 3;
        draw(x, y);
        draw(x, y - space);
        draw(x + space, y);
        draw(x + space*2, y);
        return bN;
    }

    public int blockO(int x, int y) {
        bN = 4;
        draw(x, y);
        draw(x + space, y);
        draw(x, y - space);
        draw(x + space, y - space);
        return bN;
    }

    public int blockS(int x, int y) {
        bN = 5;
        draw(x, y - space);
        draw(x, y);
        draw(x + space, y - space);
        draw(x - space, y);
        return bN;
    }

    public int blockZ(int x, int y) {
        bN = 6;
        draw(x, y);
        draw(x, y - space);
        draw(x + space, y);
        draw(x - space, y - space);
        return bN;
    }

    public void clearBlock(int x, int y) {
        y -= 33;

        switch (bN)
        {
            case 1:
                clear(x, y);
                clear(x + space, y);
                clear(x + space*2, y);
                clear(x + space*3, y);
            case 2:
                clear(x, y);
                clear(x, y - space);
                clear(x - space, y);
                clear(x - space*2, y);
                break;
            case 3:
                clear(x, y);
                clear(x, y - space);
                clear(x + space, y);
                clear(x + space*2, y);
                break;
            case 4:
                clear(x, y);
                clear(x + space, y);
                clear(x, y - space);
                clear(x + space, y - space);
                break;
            case 5:
                clear(x, y - space);
                clear(x, y);
                clear(x + space, y - space);
                clear(x - space, y);
                break;
            case 6:
                clear(x, y);
                clear(x, y - space);
                clear(x + space, y);
                clear(x - space, y - space);
                break;
        }
    }

    public void GenerateAndClearBlock(int x, int y, int randValue) {
        clearBlock(x, y);

        switch (randValue)
        {
            case 1:
                blockI(x, y);
                break;
            case 2:
                blockJ(x, y);
                break;
            case 3:
                blockL(x, y);
                break;
            case 4:
                blockO(x, y);
                break;
            case 5:
                blockS(x, y);
                break;
            case 6:
                blockZ(x, y);
                break;
        }
    }

}
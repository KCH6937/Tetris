package com.kch;

import com.kch.Block.BlockFrame;
import com.kch.storage.FileStorage;


public class Main {
    public static void main(String[] args) {
        FileStorage.load();
        new GameLoop().loop();
    }
}

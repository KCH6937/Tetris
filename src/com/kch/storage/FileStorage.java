package com.kch.storage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileStorage {

    public static Map <String, BufferedImage> bufferImageMap;
    static {
        bufferImageMap = new HashMap<>();
    }

    public static void load() {
        File file = new File(System.getProperty("user.dir") + "/resource/block.png");

        try {
            BufferedImage block = ImageIO.read(file).getSubimage(0,0,32,32);
            bufferImageMap.put("block",block);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static BufferedImage getImage() {
        return bufferImageMap.get("block");
    }
}

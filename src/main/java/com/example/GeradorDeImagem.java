package com.example;

import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;

public class GeradorDeImagem {
    
    public void gerarImagem(Gato gato) throws Exception{
        URL url = new URL(gato.getUrl());
        BufferedImage image = ImageIO.read(url);

        ImageIO.write(image, "jpg", new File("fotos/" + gato.getId() + ".jpg"));
    }
}

package ru.spec.java1.lecFinal;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.sun.glass.events.KeyEvent;

public class UserTest {

	public static void main(String[] args) throws AWTException, IOException {
		Robot r = new Robot();
		r.mouseMove(0, 0);
		r.keyPress(KeyEvent.VK_Z);
		r.keyRelease(KeyEvent.VK_Z);//zz
		
		
		
		
		BufferedImage img = r.createScreenCapture(new Rectangle(0, 0, 500, 500));// не работает быстро
		int height = img.getHeight();
		int width = img.getWidth();

		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				int rgb = img.getRGB(x, y);
				img.setRGB(x, y, ~rgb);// инвертирование цвета
			}
		}
		ImageIO.write(img, "png", new File("c:/java/screen.png"));

	}

}

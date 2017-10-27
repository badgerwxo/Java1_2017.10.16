package ru.spec.java1.lecFinal;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Window;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import com.sun.glass.events.KeyEvent;

public class UserTest {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		Robot r = new Robot();
		//r.mouseMove(0, 0);
		//r.keyPress(KeyEvent.VK_Z);
		//r.keyRelease(KeyEvent.VK_Z);//zz
		
//		int dx=0, dy = 0;
//		for (int i=0;i<100;i++) {
//			Point p = MouseInfo.getPointerInfo().getLocation();
//			dx=(int)(Math.random()*7)-3;
//			dy=(int)(Math.random()*7)-3;
//			
//					r.mouseMove(p.x+dx, p.y+dy);
//					Thread.sleep(20);
//		}
//		
		
		JFrame frame = new JFrame("my app");
		frame.setBounds(300,300,500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Window w= new Window(null);
		w.setBounds(200, 200, 500, 500);
		w.setVisible(true);
		w.setAlwaysOnTop(true);
		Thread.sleep(1000);
		
		 Date date = new Date();
		 String d=date.toString();
		
		 String path = "c:/java/screen.png";
		w.getGraphics().drawImage(ImageIO.read(new File (path)), 0, 0, null);
		
		BufferedImage img = r.createScreenCapture(new Rectangle(0, 0, 2500, 1500));// не работает быстро
		int height = img.getHeight();
		int width = img.getWidth();

		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				int rgb = img.getRGB(x, y);
				img.setRGB(x, y, ~rgb);// инвертирование цвета
			}
		}
System.out.println(date);
		ImageIO.write(img, "png", new File(path));

	}



}

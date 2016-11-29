package com.cubic.training.graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

public class RandomTriangles extends JPanel{
	public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        Random random = new Random();
                        
        for(int i=0; i<500; i++){
        	GeneralPath triangle = new GeneralPath();
            triangle.moveTo(random.nextInt(500), random.nextInt(500));

            for(int j=0; j<2; j++){
                triangle.lineTo(random.nextInt(500), random.nextInt(500));
            }
            
            triangle.closePath();
            g2d.setColor(new Color(random.nextInt(256), random.nextInt(256),
                random.nextInt(256)));
            g2d.fill(triangle);
        }
    }
    public static void main(String[] args){
        JFrame frame = new JFrame("Random Triangles");
      //  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        RandomTriangles rtPanel = new RandomTriangles();
        rtPanel.setBackground(Color.WHITE);
        frame.add(rtPanel);
        frame.setVisible(true);
    }
}

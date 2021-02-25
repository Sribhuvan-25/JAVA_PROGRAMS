// Name: Sribhuvan Reddy Yellu
// Date: 02/15/2021
// Title: Drawing panel

// This program prints four figures on a drawing panel using the DrawingPanel class.

import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;

public class HW_03_02 {
    public static void main(String[] args) {
        DrawingPanel p = new DrawingPanel(400,400); // Creating a drawing panel object p using the
                                                                // DrawingPanel class
        Graphics g = p.getGraphics(); // Creating a graphic object g using DrawingPanel class
        p.setBackground(Color.CYAN); // Setting the background color of the panel
        concentric_circles(g,100,0,0,5); // Calling the concentric circles method to print the
                                                                // first figure

       for(int j=1;j<=5;j++){ // Using for loop to print a 5*5 figure
         for(int n=0;n<5;n++){
            concentric_circles(g,24,10+(n*24),120+((j-1)*24),4);
           }
        }
       for(int j=1;j<=6;j++){ // Using for loop a 6*6 figure
           for(int n=0;n<6;n++){
               concentric_circles(g,40,150+(n*40),20+((j-1)*40),5);
           }
       }
        for(int j=1;j<=3;j++) { // Using a for loop a 3*3 figure
            for (int n = 0; n < 3; n++) {
                concentric_circles(g, 36, 130 + (n * 36), 275 + ((j - 1) * 36), 3);
            }
        }
    } // Work on this method so that the number of lines can be cut
   // Method to print one unit of concentric circles
    public static void concentric_circles(Graphics g,int width,int x_cor, int y_cor,int circles ){
        g.setColor(Color.GREEN); // Setting the color of the square green
        g.fillRect(x_cor,y_cor,width,width); // Drawing the square
        g.setColor(Color.YELLOW); // Setting the color of the circle yellow
        g.fillOval(x_cor,y_cor,width,width);// Drawing the circle
        g.setColor(Color.BLACK); // Setting the color of the lines black
        g.drawRect(x_cor,y_cor,width,width); // Drawing the line
        for(int i=1; i<=circles;i++){  // This loop is to print the lines and concentric circles
            int x = x_cor+(width/2)-(i*width/circles/2);  // Initializing  a variable for the x-coordinate of the circle
                                                         //  that changes as the concentric circles are being printed
            int y = y_cor+(width/2)-(i*width/circles/2);// Initializing  a variable for the y-coordinate that changes
                                                       // as the concentric circles are being printed
            g.drawOval(x,y,width/circles*i,width/circles*i);// Printing the circle
            // Drawing the required lines through the figure
            g.drawLine(x_cor,y_cor,width+x_cor,width+y_cor);
            g.drawLine(x_cor,y_cor+width,x_cor+width,y_cor);
            g.drawLine(x_cor+width/2,y_cor,x_cor+width/2,y_cor+width);
            g.drawLine(x_cor,y_cor+width/2,x_cor+width,y_cor+width/2);
        }
    }
}

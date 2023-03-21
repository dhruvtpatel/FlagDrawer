import java.awt.Font;
import java.awt.Color;
import java.util.Scanner;

/**
 * When called, this function prints pictures of different flags
 *
 * @author Dhruv Patel
 * @version 10.6.2021
 */
public class FlagDraw
{
    private Scanner flag;
    public FlagDraw(){
        Scanner flag = new Scanner(System.in);
        System.out.println("Enter a flag: ");
        String f = flag.nextLine();
        System.out.println("Enter a width: ");
        int width = flag.nextInt();

        switch(f.toLowerCase()) {
            case "lux":
                drawLUX(width);
                break;
            case "lib":
                drawLIB(width);
                break;
            case "ukr":
                drawUKR(width);
                break;
            case "fr":
                drawFR(width);
                break;
            case "jp":
                drawJP(width);
                break;
            case "th":
                drawTH(width);
                break;
            case "cb":
                drawCB(width);
                break;
            case "uae":
                drawUAE(width);
                break;
            case "fi":
                drawFI(width);
                break;
            case "sy":
                drawSY(width);
                break;
            case "gd":
                drawGD(width);
                break;
            case "aj":
                drawAJ(width);
                break;
            case "ar":
                drawAR(width);
                break;
            default: 
                System.out.println("This is not a valid entry. Please enter a valid entry");
                break;
                
        }
    }
    
    /**
     * Prints the flag of Luxenbourg
     * 
     * @param width
     */
    public void drawLUX(int width) {
        
        int height = width * 3 / 5;
        SimpleCanvas c = new SimpleCanvas ("Luxenbourg", width, height);
        
        c.setForegroundColour(java.awt.Color.red);
        
        for (int i=0; i < height/3; i++) {
            c.drawLine(0, i, width, i);
        }
        
        c.setForegroundColour(java.awt.Color.cyan);
        for (int i=height * 2 / 3; i < height; i++) {
            c.drawLine(0, i, width, i);
        }
        
        Font fontLuxenbourg = new Font("Calibri", Font.PLAIN, 40);
        c.setFont(fontLuxenbourg);
        c.drawString("Luxenbourg", width/2, height/2);
    }
    
    /**
     * Prints the flag of Libya
     * 
     * @param width
     */
    public void drawLIB(int width) {
        
        int height = width * 1 / 2;
        SimpleCanvas c = new SimpleCanvas ("Libya", width, height);
        
        c.setForegroundColour(java.awt.Color.green);
        for (int i=0; i < height; i++) {
            c.drawLine(0, i, width, i);
        }
        
        c.setForegroundColour(java.awt.Color.black);
        Font fontLuxenbourg = new Font("Calibri", Font.PLAIN, 40);
        c.setFont(fontLuxenbourg);
        c.drawString("Libya", width/2, height/2);        
    }
    
    /**
     * Prints the flag of Ukraine
     * 
     * @param width
     */
    public void drawUKR(int width) {
        
        int height = width * 2 / 3;
        SimpleCanvas c = new SimpleCanvas ("Ukraine", width, height);
        
        c.setForegroundColour(java.awt.Color.blue);
        
        for (int i=0; i < height/2; i++) {
            c.drawLine(0, i, width, i);
        }
        
        c.setForegroundColour(java.awt.Color.yellow);
        for (int i=height * 1 / 2; i < height; i++) {
            c.drawLine(0, i, width, i);
        }
        
        Font fontUkraine = new Font("Calibri", Font.PLAIN, 40);
        c.setFont(fontUkraine);
        c.drawString("Ukraine", width/4, height/4);
    }
    
    /**
     * Prints the flag of France
     * 
     * @param width
     */
    public void drawFR(int width) {
        
        int height = width * 2 / 3;
        SimpleCanvas c = new SimpleCanvas ("France", width, height);
        
        c.setForegroundColour(java.awt.Color.blue);
        
        for (int i=0; i < height; i++) {
            c.drawLine(0, i, width/3, i);
        }
        
        c.setForegroundColour(java.awt.Color.red);
        for (int i=0; i < height; i++) {
            c.drawLine(2*width/3, i, width, i);
        }
        
        Font fontFrance = new Font("Calibri", Font.PLAIN, 40);
        c.setFont(fontFrance);
        c.drawString("France", width * 3/7, height/2);
    }
    
    /**
     * Prints the flag of Japan
     * 
     * @param width
     */
    public void drawJP(int width) {
        int height = width * 7/10;
        SimpleCanvas c = new SimpleCanvas ("Japan", width, height);
        
        c.setForegroundColour(java.awt.Color.red);
        int x = width/3;
        int y = height/4;
        int d = width/3;
        
        c.drawCircle(x,y,d);
        
        Font fontJapan = new Font("Calibri", Font.PLAIN, 40);
        c.setFont(fontJapan);
        c.drawString("Japan", width/4, height/4);
    }
    
    /**
     * Prints the flag of Thailand
     * 
     * @param width
     */
    public void drawTH(int width) {
        int height = width * 3/5;
        SimpleCanvas c = new SimpleCanvas ("Thailand", width, height);    
        
        c.setForegroundColour(java.awt.Color.red);
        for (int i=0; i < height/6; i++) {
                c.drawLine(0, i, width, i);
            }    
         
        c.setForegroundColour(java.awt.Color.blue);
        for (int i=height*2/6; i < 4*height/6; i++) {
                c.drawLine(0, i, width, i);
            } 
      
        c.setForegroundColour(java.awt.Color.red);
        for (int i=height*5/6; i < 6*height/6; i++) {
                c.drawLine(0, i, width, i);
            }  
        
        Font fontThailand = new Font("Calibri", Font.PLAIN, 40);
        c.setFont(fontThailand);
        c.drawString("Thailand", width/2, height/2);
    }
    
    /**
     * Prints the flag of Congo-BrazzaVille
     *
     * @param width
     */public void drawCB(int width) {        
        int height = width * 2/3;
        SimpleCanvas c = new SimpleCanvas ("Congo-BrazzaVille", width, height);    

        c.setForegroundColour(java.awt.Color.yellow);
        for (int i=0; i <height; i++) {
                c.drawLine(0, i, width, i);
            }        
        
        c.setForegroundColour(java.awt.Color.green);
        int[] xPoints = {0,width * 2/3,0};
        int[] yPoints = {0,0,height};
        int n=3;
        c.drawPolygon(xPoints,yPoints,n);
        
        
        c.setForegroundColour(java.awt.Color.red);
        int[] xPoints1 = {width,width,width * 1/3};
        int[] yPoints1 = {0,height,height};
        int n1=3;
        c.drawPolygon(xPoints1,yPoints1,n1);

    }
    
    /**
     * Prints the flag of UAE
     * 
     * @param width
     */public void drawUAE(int width) {
        int height = width * 1/2;
        SimpleCanvas c = new SimpleCanvas ("UAE", width, height);
        
        c.setForegroundColour(java.awt.Color.red);
        int[] xPoints = {0,0,width*1/4,width*1/4};
        int[] yPoints = {height,0,0,width};
        int n=4;
        c.drawPolygon(xPoints,yPoints,n);
       
        c.setForegroundColour(java.awt.Color.green);
        int[] xPoints1 = {width*1/4,width,width,width*1/4};
        int[] yPoints1 = {0,0,height * 1/3,height*1/3};
        int n1=4;
        c.drawPolygon(xPoints1,yPoints1,n1);
        
        c.setForegroundColour(java.awt.Color.black);
        int[] xPoints2 = {width*1/4,width,width,width*1/4};
        int[] yPoints2 = {height*2/3,height*2/3,height,height};
        int n2=4;
        c.drawPolygon(xPoints2,yPoints2,n2);        

        Font fontThailand = new Font("Calibri", Font.PLAIN, 40);
        c.setFont(fontThailand);
        c.drawString("UAE", width/2, height/2);
    }
    
    /**
     * Prints the flag of Finland
     * 
     * @param width
     */
    public void drawFI(int width) {
        int height = width * 11/18;
        SimpleCanvas c = new SimpleCanvas ("Finland", width, height);
        
        c.setForegroundColour(java.awt.Color.blue);
        c.drawPolygon(new int[] {width * 5/18, width *8/18,width*8/18, width*5/18},new int[] {0,0,height,height},4);
        
        c.setForegroundColour(java.awt.Color.blue);
        c.drawPolygon(new int[] {0, width, width, 0},new int[] {height * 4/11, height * 4/11,height * 7/11,height * 7/11},4);
        
        
        Font fontThailand = new Font("Calibri", Font.PLAIN, 15);
        c.setFont(fontThailand);
        c.drawString("Finland", width * 6/7, height * 1/4);        
        }
    
    /**
     * Print the flag of Seychelles
     * 
     * @param width
     */
    public void drawSY(int width) {
        int height = width * 1/2;
        SimpleCanvas c = new SimpleCanvas ("Seychelles", width, height);
        
        c.setForegroundColour(java.awt.Color.blue);
        int[] xPoints = {0,width * 1/3,0};
        int[] yPoints = {0,0,height};
        int n=3;
        c.drawPolygon(xPoints,yPoints,n);
        
        c.setForegroundColour(java.awt.Color.yellow);
        int[] xPoints1 = {0,width/3, width *2/3};
        int[] yPoints1 = {height,0,0};
        int n1=3;
        c.drawPolygon(xPoints1,yPoints1,n1); 
        
        c.setForegroundColour(java.awt.Color.red);
        int[] xPoints2 = {0,width*2/3,width,width};
        int[] yPoints2 = {height,0,0, height*1/3};
        int n2=4;
        c.drawPolygon(xPoints2,yPoints2,n2);
        
        c.setForegroundColour(java.awt.Color.green);
        int[] xPoints3 = {0,width,width};
        int[] yPoints3 = {height,height*2/3,height};
        int n3=3;
        c.drawPolygon(xPoints3,yPoints3,n3);
        
        Font fontThailand = new Font("Calibri", Font.PLAIN, 40);
        c.setFont(fontThailand);
        c.drawString("Seychelles", width/2, height/2);
        }
    
    /**
     * Prints the flag of Greenland
     * 
     * @param width
     */
    public void drawGD(int width) {
        int height = width * 2/3;
        SimpleCanvas c = new SimpleCanvas ("Greenland", width, height);
        
        c.setForegroundColour(java.awt.Color.red);
        for (int i=height/2; i<height; i++) {
            c.drawLine(0,i,width,i);
        }

        Font fontThailand = new Font("Calibri", Font.PLAIN, 20);
        c.setFont(fontThailand);
        c.drawString("Greenland", width * 6/7, height/2);
        
        c.setForegroundColour(java.awt.Color.white);
        c.drawArc((width * 4/10) - width*1/4, (height/2) - width*1/4, width/2, width/2, 180, 360);
        
        c.setForegroundColour(java.awt.Color.red);
        c.drawArc((width * 4/10) - width*1/4, (height/2) - width*1/4, width/2, width/2, 0, 180);
        }
        
    /**
     * Prints the flag of Ajman
     * This was a flag that I personally researched and created the code for (was not a part of the provided flags)
     * 
     * @param width
     */
    public void drawAJ(int width) {
        int height = width * 1/2;
        SimpleCanvas c = new SimpleCanvas ("Ajman", width, height);
        
        Font fontThailand = new Font("Calibri", Font.PLAIN, 20);
        c.setFont(fontThailand);
        c.drawString("Ajmun",width/9,height/2);
        
        c.setForegroundColour(java.awt.Color.red);
        int[] xPoints = {width/4,width,width,width/4};
        int[] yPoints = {0,0,height,height};
        int n=4;
        c.drawPolygon(xPoints,yPoints,n); 
        
    }
    
    /**
     * Prints the flag of Armenia
     * This was a flag that I personally researched and created the code for (was not a part of the provided flags)
     * 
     * @param width
     */
    public void drawAR(int width) {
        int height = width * 1/2;
        SimpleCanvas c = new SimpleCanvas ("Armenia", width, height);
        
        c.setForegroundColour(java.awt.Color.red);
        int[] xPoints = {0,width,width,0};
        int[] yPoints = {0,0,height/3,height/3};
        int n=4;
        c.drawPolygon(xPoints,yPoints,n); 
        
        c.setForegroundColour(java.awt.Color.blue);
        int[] xPoints1 = {0,width,width,0};
        int[] yPoints1 = {height *1/3,height * 1/3,height * 2/3, height*2/3};
        int n1=4;
        c.drawPolygon(xPoints1,yPoints1,n1); 

        c.setForegroundColour(java.awt.Color.orange);
        int[] xPoints2 = {0,width,width,0};
        int[] yPoints2 = {height *2/3,height * 2/3,height,height};
        int n2=4;  
        c.drawPolygon(xPoints2,yPoints2,n2);         
        
        Font fontThailand = new Font("Calibri", Font.PLAIN, 20);
        c.setFont(fontThailand);
        c.drawString("Armenia",width/9,height/2);
        
    }
}
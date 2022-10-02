import java.util.Random;
import java.awt.Point;

public class ArrayPractice {
    private int[] numbers;
    private Random r;
    private Point[] point;
    private int a;

    /**
     * Constructor for objects of class ArrayPractice
     */
    public ArrayPractice()
    {
        r = new Random();
        numbers = new int[20];
        point = new Point[100];
     
        
        for (int j=0; j<point.length; j++){
            point[j] = new Point();
            point[j].x = r.nextInt(250);
            point[j].y = r.nextInt(250);
        }
        
        for (int i = 0; i < 20; i++) {
            numbers[i] = r.nextInt(50)+1;
        }
    }

    /**
     * Resets the value of each element in the array to be a random number between 1 and 50.
     */
    public void reset()
    {
        for (int i = 0; i < 20; i++) {
            numbers[i] = r.nextInt(50)+1;
        }
    }
    
    public void display(){
        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
    
     public int getMax(){
        int a = numbers[0];
        
        for (int i=0; i<numbers.length; i++){
            if (numbers[i] > a) {
                a = numbers[i];
            }       
        } return a; 
    }   
    
    public int getMin(){
        int a = numbers[0];
        
        for (int i=0; i<numbers.length; i++){
            if (numbers[i] < a) {
                a = numbers[i];
            }       
        } return a; 
    }   
    
    public int getMaxIndex(){
        int a = numbers[0];
        int index = 0;
        
        for (int i=0; i<numbers.length; i++){
            if (numbers[i] > a) {
                a = numbers[i];
                index = i;
            }
        } return index;
    } 
    
    public void displace(){
        int a = getMaxIndex();
        
        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i] - a);
        }
    }
    
    public void rowSums(int[][] a, final int ROWS, final int COL){
        int sum = 0;
        
        for (int i=0; i<ROWS; i++){
            for (int c=0; c<COL; i++){
                sum += a[i][c];      
            }
            System.out.println("The sum for row " + i + " is: " + sum);
            sum = 0;
        }
    }
    
    public int sumX(){
        int sum = 0;
        
        for (int i=0; i<point.length; i++){
            point[i].x += sum;
        } return sum;
    }
    
}

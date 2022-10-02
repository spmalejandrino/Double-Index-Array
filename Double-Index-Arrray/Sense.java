public class Sense
{
    public void displayArrayList(ArrayList<Circle> c){
        for (int i = 0; i < c.size(); i++){
            System.out.println(c.get(i).getColor());
        }
    }
    
    public int sumArrayList(ArrayList<Point> point){
        int sum = 0;
        
        for (int i =0; i < point.size(); i++){
            sum += point.get(i).x;
        }
        return sum;
    }
    
     public double sumArrayList(ArrayList<Point> point){
        int sum = 0;
        
        for (int i =0; i < point.size(); i++){
            sum += point.get(i).x;
        }
        return (double)(sum/point.size());
    }
    
    
}

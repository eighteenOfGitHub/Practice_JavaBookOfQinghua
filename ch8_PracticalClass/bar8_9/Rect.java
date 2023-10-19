package bar8_9;

public class Rect {
    double width,height,area;
    public Rect(){}
    public Rect(double w,double h){
        height = h;
        width = w;
    }
    public double getArea(){
        area = height*width;
        return area;
    }
}

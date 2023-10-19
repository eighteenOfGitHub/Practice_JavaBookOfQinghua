package bar9_5;

public class Triangle {
    double sideA,sideB,sideC,area;
    boolean isTriangle;
    public double getArea(){
        if(isTriangle){
            double p = (sideA + sideB + sideC)/2.0;
            area = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
            return area;
        }else {
            area = Double.NaN;
            return area;
        }
    }
    public void setA(double a){
        sideA = a;
        if(sideA+sideB>sideC && sideA+sideC>sideB && sideB+sideC>sideA){
            isTriangle = true;
        }else{
            isTriangle = false;
        }
    }
    public void setB(double b){
        sideB = b;
        if(sideA+sideB>sideC && sideA+sideC>sideB && sideB+sideC>sideA){
            isTriangle = true;
        }else{
            isTriangle = false;
        }
    }
    public void setC(double c){
        sideC = c;
        if(sideA+sideB>sideC && sideA+sideC>sideB && sideB+sideC>sideA){
            isTriangle = true;
        }else{
            isTriangle = false;
        }
    }
}

package bar4_2;

//演示类的构成
public class Ladder {
    float above;    //梯形的上底面
    float bottom;   //梯形的下底面
    float height;   //梯形的高
    float area;     //梯形的面积
    float computerArea(){       //定义方法 computerArea
        area = (above + bottom) * height / 2.0f;
        return area;
    }
    void setHeight(float h){    //定义方法 setHeight
        height = h;
    }

}

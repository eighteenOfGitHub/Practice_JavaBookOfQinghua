package bar9_5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    WindowTriangleView view;
    public void setView(WindowTriangleView view){
        this.view = view;
    }
    public void actionPerformed(ActionEvent e){
        try{
            double a = Double.parseDouble(view.textA.getText().trim());
            double b = Double.parseDouble(view.textB.getText().trim());
            double c = Double.parseDouble(view.textC.getText().trim());
            //修改模型中的数据
            view.triangle.setA(a);
            view.triangle.setB(b);
            view.triangle.setC(c);
            double area = view.triangle.getArea();
            //让视图显示模型中的数据
            view.textA.setText(""+view.triangle.sideA);
            view.textB.setText(""+view.triangle.sideB);
            view.textC.setText(""+view.triangle.sideC);
            String strArea = String.format("%.3f",view.triangle.area);
            view.showArea.append("\n面积（保留3位小数）:"+strArea+"\n");
        }catch(Exception ex){
            view.showArea.append("\n"+ex+"\n");
        }
    }
}

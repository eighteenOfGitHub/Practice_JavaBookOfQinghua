package bar8_6;

import jdk.swing.interop.SwingInterOpUtils;

public class eg8_6_1 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        System.out.println("capacity: "+str.capacity());
        str.append("大家好");
        System.out.println("str:"+str);
        System.out.println("length:"+str.length());
        System.out.println("capacity:"+str.capacity());

        str.setCharAt(0,'w');
        str.setCharAt(1,'e');
        System.out.println(str);

        str.insert(2," are all");
        System.out.println(str);

        int index = str.indexOf("好");
        str.replace(index,str.length()," right");
        System.out.println(str);

        str.append("我们大家都很好.");
        System.out.println(str);
        System.out.println("capacity:"+str.capacity());

        str.delete(0,str.length());
        System.out.println(str); 
        System.out.println("capacity:"+str.capacity());
    }
}

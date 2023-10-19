//10.2 文件字节输入流

package bar10_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class eg10_2_1 {
    public static void main(String[] args) {
        int n = -1;
        byte[] a  = new byte[100];
        try{
            File f = new File("ch10_IOStream\\src\\bar10_2\\eg10_2_1.java");
            InputStream in = new FileInputStream(f);
            while((n = in.read(a,0,100))!=-1){
                String s = new String(a,0,n);
                System.out.print(s);
            }
            in.close();
        }catch(IOException e){
            System.out.println("File read Error:"+e);
        }
    }
}

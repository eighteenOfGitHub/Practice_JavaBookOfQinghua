package bar13_1;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Look implements Runnable{
    URL url;
    public void setURL(URL url){
        this.url = url;
    }
    public void run(){
        try{
            InputStream in  =url.openStream();
            byte[] b = new byte[1024];
            int n = -1;
            while((n=in.read(b)) != -1){
                String str = new String(b,0,n,"utf-8");
                System.out.print(str);
            }
        }
        catch(IOException exp){}
    }
}

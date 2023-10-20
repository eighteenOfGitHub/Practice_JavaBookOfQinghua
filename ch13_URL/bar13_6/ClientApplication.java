package bar13_6;

import java.rmi.Naming;
import java.rmi.Remote;

public class ClientApplication {
    public static void main(String args[]){
        try{
            Remote remoteObject = Naming.lookup("rmi://127.0.0.1/rect");
            RemoteSubject remoteSubject = (RemoteSubject) remoteObject;
            double area = remoteSubject.getArea();
            System.out.println("面积："+area);
        }
        catch(Exception exp){
            System.out.println(exp.toString());
        }
    }
}

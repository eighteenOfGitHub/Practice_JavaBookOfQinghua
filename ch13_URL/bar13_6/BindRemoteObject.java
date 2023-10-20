package bar13_6;

import java.rmi.Naming;

public class BindRemoteObject {
    public static void main(String[] args) {
        try{
            RemoteConcreteSubject remoteObject = new RemoteConcreteSubject(12,88);
            Naming.rebind("rmi://127.0.0.1/rect",remoteObject);
            System.out.println("be ready for client server...");
        }
        catch(Exception exp){
            System.out.println(exp);
        }
    }
}

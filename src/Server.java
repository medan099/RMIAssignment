import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.lang.String;

public class Server extends UnicastRemoteObject implements MyInterface {

    public Server() throws RemoteException{}

        public String reverse(String ch){
        String ch1="";
        for (int i=ch.length()-1;i>=0;i--){
            ch1+=ch.charAt(i);
        }
        return ch1;
        }

        public char minAsc(String ch){
        char min=ch.charAt(0);;
        for (int i=0;i<ch.length();i++)
            if (ch.charAt(i)<min)
                min=ch.charAt(i);
        return min;
        }
        public String UpperLower(String ch){
            String ch1="";
            for (int i=0;i<ch.length();i++){
                if (Character.isLowerCase(ch.charAt(i)))
                   ch1+= Character.toUpperCase(ch.charAt(i));
                else if (Character.isUpperCase(ch.charAt(i)))
                    ch1+=Character.toLowerCase(ch.charAt(i));
            }
            return ch1;
        }

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }
}

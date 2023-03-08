import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args){

        try{
            ServerSocket ss = new ServerSocket(6666);
Socket s=ss.accept(); //establish a connection
DataInputStream dis = new DataInputStream(s.getInputStream());
String str = (String)dis.readUTF();
System.out.println("waiting forconnections"+str);
ss.close();

        } catch(Exception e){System.out.println(e);}
    }
}

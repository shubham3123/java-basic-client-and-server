import java.io.*;
import java.net.*;

public class client
{
public static void main(String[] args)
{
    try{
        Socket s=new Socket("localhost", 6666);
        DataOutputStream Dout = new DataOutputStream(s.getOutputStream());
Dout.writeUTF("connection established");
Dout.flush();
Dout.close();
s.close();    
}
    catch(Exception e){System.out.println(e);}

}



}

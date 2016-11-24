
package clases;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.Socket;

public class Cliente {

	public static void main(String[] args) throws Exception {
		Socket cliente=new Socket("localhost",2531); 
		DataInputStream traedor=new DataInputStream(cliente.getInputStream()); 
        PrintStream enviador=new PrintStream(cliente.getOutputStream()); 
        DataInputStream in=new DataInputStream(System.in);
        while(true)
        {
        System.out.println("\nIngrese num1:\n"); 
        int num1=Integer.parseInt(in.readLine()); 
        enviador.println(num1);
        System.out.println("\nIngrese num2:\n"); 
        int num2=Integer.parseInt(in.readLine()); 
        enviador.println(num2);
        String sum=traedor.readLine(); 
        System.out.print("\nSum of Number is :"+sum+"\n"); 
        }
	}

}

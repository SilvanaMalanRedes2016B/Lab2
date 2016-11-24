package clases;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) throws Exception {
		ServerSocket servidor=new ServerSocket(2531);
		System.out.printf("\n El servidor ha iniciado correctamente");
		Socket cliente=servidor.accept();
		DataInputStream traedor=new DataInputStream(cliente.getInputStream()); 
        PrintStream enviador=new PrintStream(cliente.getOutputStream()); 
        while(true)
        {
        	int num1=Integer.parseInt(traedor.readLine()); 
            int num2=Integer.parseInt(traedor.readLine());
            int sum=0; 
            /*while(num1!=0) 
            { 
                sum=sum+(num1 % 10);num1=num1/10; 
            } */
            sum=sum+num1+num2;
            enviador.println(sum); 
           // System.out.printf("\nSuma de los numeros calculada y enviada al cliente...\n");
            if(sum==666)
            {
            	servidor.close();
            }
        }
	}

}

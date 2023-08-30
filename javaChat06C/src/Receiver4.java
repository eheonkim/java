import java.io.*;
import java.net.*;

public class Receiver4 extends Thread
{
	Socket socket;
	BufferedReader in = null;
	
	public Receiver4(Socket socket)
	{
		this.socket = socket;
		
		try
		{
			in = new BufferedReader(new InputStreamReader(
										this.socket.getInputStream() ));
		} catch (Exception e)
		{
			System.out.println("예외1:"+e);
		}
	}
	
	@Override
	public void run()
	{
		while (in!=null)
		{
			try {
				// 입력은 main 쓰레드에서 받기 때문에 다음 코드는 작동하지 않는다.
				/*
				 String s = in.readLine();
				 if( s.equals("q") || s. equals("Q")
				  {
				 	break;
			 	} else {
			 		System.out.println("Thread Receive : " + s);
		 		}
				 */
				System.out.println("Thread Receive : " + in.readLine());
			} catch (java.net.SocketException ne)
			{
				// 여기서 while 문을 멈춰 주어야 한다.
				break;
			} catch (Exception e) 
			{
				System.out.println("예외:"+e);
			}
		}
		
		try
		{
			in.close();
		} catch (Exception e)
		{
			System.out.println("예외3:"+e);
		}
	}
}

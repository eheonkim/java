import java.io.*;
import java.net.*;
import java.util.Scanner;



public class MultiClient2
{
	public static void main(String[] args) throws UnknownHostException, IOException
	{
		System.out.println("이름을 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		PrintWriter out = null;
		BufferedReader in = null;
		
		try
		{
			String ServerIp = "localhost";
			if (args.length > 0)
				ServerIp = args[0];
			Socket socket = new Socket(ServerIp, 9999); //소켓 객체 생성
			System.out.println("서버와 연결이 되었습니다.....");
			
			out = new PrintWriter(socket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(
											socket.getInputStream() ));
			
			out.println(name);
			
			while (out!=null)
			{
				try
				{
					if (in!=null)
					{
						System.out.println("Receive : " + in.readLine());
					}
					
					//출력
					String s = sc.nextLine();
					out.println(s);
					
					if ( s.equals("q") || s.equals("Q") )
					{
						break;
					}
				} catch (Exception e)
				{
					System.out.println("예외:"+e);
				}
			}
			
			in.close();
			out.close();
			
			socket.close();
			{
				
			}
		} catch (Exception e)
		{
			System.out.println("예외[MultiClient class]:"+e);
		}
	}
}

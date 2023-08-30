import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MultiClient5
{
	public static void main(String[] args) throws UnknownHostException, IOException
	{
		System.out.println("이름을 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		try
		{
			String ServerIp = "localhost";
			if (args.length > 0)
				ServerIp = args[0];
			Socket socket = new Socket(ServerIp, 9999); //소켓 객체 생성
			System.out.println("서버와 연결이 되었습니다.....");
			
			Thread receiver = new Receiver5(socket);
			receiver.start();
			
			// 사용자로부터 얻은 문자열을 서버로 전송해주는 역할을 하는 쓰레드
			Thread sender = new Sender5(socket, name);
			receiver.start();
			
		} catch (Exception e)
		{
			System.out.println("예외[MultiClient class]:"+e); 
		}
	}
}


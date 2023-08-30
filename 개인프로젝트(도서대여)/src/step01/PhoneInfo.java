package step01;

public class PhoneInfo   // 1.PhoneInfo 클래스 만들기
{
	String name;
	String phoneNumber;
	String email;
	
	public PhoneInfo(String name, String phoneNumber)  // 함수의 오버로딩
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public PhoneInfo(String name, String phoneNumber, String email)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public void showPhoneInfo()
	{
		System.out.println("Namw : " + name);
		System.out.println("PhoneNumber : " + phoneNumber);
		if (email != null && !email.equals(""))
			System.out.println("Email : " + email);
		System.out.println("------------------------");
		/*
		- 대기실 명령어
			public room 공개방
			Block contact 블랙리스트
			waiting room 대기실 
			whisper 귓속말
		- 룸나가기
		- 방장 승계
		- 방 폭파 가능
		- 관리용 
			관리자 로그인
			원하는 방 모니터링
			블랙리스트 처리
			방 폭파 처리(room blasting treatment)
			
			오라클 연겷 서버 만들기
		- 방 리스트보기
			전체보기
			비공개방(private room )
			공개방만 
			강퇴
			* 방장만 가능
			* 영구 강퇴
			* 
			
		
		 */
		
		
	}
}

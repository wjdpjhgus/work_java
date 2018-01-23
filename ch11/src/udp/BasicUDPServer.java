package udp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class BasicUDPServer {
DatagramSocket dsock;
DatagramPacket sPack, rPack;
InetAddress client;
int sport =7777,cport;

public BasicUDPServer(int sport) {
	try {
		//데어터 그램패킷을 스포츠로 지정하여 생성
		this.sport = sport;
		System.out.println(">>서버를 시작합니다.");
		System.out.println(">> 클라이언트가 접속하길 기다리고 있습니다." + '\n');
		this.dsock = new DatagramSocket(sport);
	}catch (Exception e) {
		System.out.println(e);
	}
}

public void communicate() {
	try {
		//키보드로부터 전송할 문자열을 입력 받기 위해 버퍼드리더 형태로 변환
										//2byte씩 읽음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			byte[] buffer = new byte[1024];//정보를 1kilo byte씩 보내겠다.
			//클라이언트에서 전송되는 데이터그램패킷을 받기 위해 rPack을 생성한 후 대기
			rPack = new DatagramPacket(buffer, buffer.length);
			dsock.receive(rPack);//클라이언트에서 메시지가 올때까지 대기
			
			//전송받은 결과를 문자열로 변환
			//String(byte[]bytes, int offset, int length);
			String strIn = new String(rPack.getData(),0,rPack.getData().length);
			//클라인트와 주소와 포트 번호를 반환
			client =rPack.getAddress();
			cport =rPack.getPort();
			//전송받은 결과를 출력하고quit이면 종료
			System.out.println("[클라이언트"+client+ ":" +cport+"]"+strIn	);
			if(strIn.trim().equals("quit"))break;
			//표준입력으로 입력된 정보를 데이터 그램패킷으로 만들어 클라이언트에 전송
			String strOut =br.readLine();
					sPack = new DatagramPacket(strOut.getBytes(), strOut.getBytes().length,client, cport);
			dsock.send(sPack);
		
		}
		System.out.println("UDP 서버를 종료합니다.");
	}catch(Exception e) {
		System.out.println(e);
	}
}
public static void main(String[] args) {
	BasicUDPServer client = new BasicUDPServer(7777);
	client.communicate();
}
}

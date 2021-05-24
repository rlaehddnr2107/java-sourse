package ex14_file;

import java.awt.image.BufferedImageFilter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class Server{
	private int port = 33333;
	void start() {
		ServerSocket sc = null;
		Socket socket =null;
		BufferedImageFilter br =null;
		try {
			sc = new ServerSocket(port);
			System.out.println("서버 시작");
			while(true) {
				socket = sc.accept();
				System.out.println("클라이언트 접속 성공");
				//데이터를 주고 받기 위한 스트림 생성
				socket.getInputStream()
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class J2021_02_Network {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server();
		server.start();
	}

}

package ch19.sec03.exam02;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
    public static void main(String[] args) {
        try {
            // Socket 생성과 동시에 localhost 50001 포트로 연결 요청
            Socket socket = new Socket("localhost", 50001);

            System.out.println("[클라이언트] 연결 성공");

            /*
            // 데이터 보내기
            String sendMessage = "나는 자바가 좋아~~";
            OutputStream os = socket.getOutputStream();
            byte[] bytes = new byte[1024];
            os.write(bytes);
            os.flush();
            System.out.println("[클라이언트] 데이터 보냄: " + sendMessage);

            // 데이터 받기
            InputStream is = socket.getInputStream();
            int readCount = is.read(bytes);
            String receiverMessge = new String(bytes, 0, readCount, "UTF-8");
            System.out.println("[클라이언트] 데이터 받음: " + receiverMessge);
            */

            // 데이터 보내기
            String sendMessage = "나는 자바가 좋아~~";
            OutputStream os = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(sendMessage);
            dos.flush();

            // 데이터 받기
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            String receiveMessage = dis.readUTF();
            System.out.println("[클라이언트] 데이터 받음: " + receiveMessage);

            // 연결 끊기
            socket.close();
            System.out.println("[클라이언트] 연결 끊음");


        } catch (UnknownHostException e) {

        } catch (IOException e) {

        }
    }
}

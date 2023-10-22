package ch18.exam01;

import java.io.*;
import java.nio.file.Files;

public class CopyImage {
    public static void main(String[] args) throws Exception{
        String original = "/Users/nimoh/Temp/dir1/photo1.jpg";
        String target = "/Users/nimoh/Temp/dir2/photo2.jpg";

        File file = new File(original);
        File targetFile = new File("/Users/nimoh/Temp/dir2");

        System.out.println("원본 파일 경로: " + original);
        System.out.println("복사 파일 경로: " + target);

        FileInputStream fis = new FileInputStream(original);
        BufferedInputStream bis = new BufferedInputStream(fis);

        if (!targetFile.exists()) { targetFile.mkdirs(); }

        FileOutputStream fos = new FileOutputStream(target);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //Reader br = new BufferedReader(new FileReader());
        if (!file.exists()) {
            System.out.println("원본 파일이 존재하지 않습니다.");
            return;
        }

        copy(bis, bos);
        bos.close();

        System.out.println("복사가 성공되었습니다.");
    }

    private static void copy(BufferedInputStream bis, BufferedOutputStream bos) throws Exception{
        while (true) {
            int data = bis.read();
            if(data == -1) break;
            bos.write(data);
        }
        bos.flush();
    }
}

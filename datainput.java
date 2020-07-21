package readFile;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class datainput {

	public static void main(String[] args) {
		 try {
			   //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
			   FileInputStream fis = new FileInputStream("/home/dinhmanh/sample.txt");
			   DataInputStream dis = new DataInputStream(fis);
			   //Bước 2: Đọc dữ liệu
			   int n = dis.readInt(); 
			  
			   //Bước 3: Đóng luồng
			   fis.close();
			   dis.close();
			   //Hiển thị nội dung đọc từ file
			   System.out.println("ngày tháng là :" + n);
//			   System.out.println("Số thực: " + m);
			  } catch (IOException ex) {
			    ex.printStackTrace();
			  } 
			 
	}

}

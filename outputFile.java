package readFile;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class outputFile {
public static void main(String[] args) {
	try {
//		//Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
		 FileOutputStream fos = new FileOutputStream("d:/read.txt");
		 ObjectOutputStream oos = new ObjectOutputStream(fos);
		//Khai báo mảng
		read R[]= {
		new read(1, "cd rom", 100,2)
		,new read(2,"CPU",500,2)
		,new read(3,"HP",75,1)
		};
		//Bước 2: Ghi mảng đối tượng vào file
		oos.writeObject(R);
		//Bước 3: Đóng luồng
		fos.close();
		oos.close();
	} catch (Exception ex) {
		System.out.println("Loi ghi file: "+ex);
	      }
     }
}

package chapter4;

import java.io.IOException;

public class IfExample1 {

	public static void main(String[] args) throws IOException {
		
		char gender = 'F';
		//char gender = 'M';
		
		if( gender == 'F' ){
			System.out.println("여성입니다.");
		}
		else{
			System.out.println("남성입니다.");
		}
	}
}

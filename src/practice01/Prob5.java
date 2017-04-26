package practice01;

import java.util.Scanner;

class Solv {
	Scanner scanner = new Scanner(System.in);
	
	public void solv() { //int
		int count = 0;
		
		for(int i = 1; i < 100; i++) {
			if(i < 10) {
				if(i % 3 == 0) {
					System.out.println(i + " Â¦");
				}
			} else {
				if((i/10) != 0 && (i/10) %3 == 0) {
					count++;
				}
				if((i%10) != 0 && (i%10) %3 == 0) {
					count++;
				}
				if(count != 0)
					System.out.print(i + " ");
				for(int j = 0; j < count; j++) {
					System.out.print("Â¦");
				}
				if(count != 0) {
					System.out.println();
					count = 0;
				}
			}
				
		}
	}
	
	public void other1() { //int
		for(int i = 1; i < 100; i++) {
			if(i < 10) {
				if(i % 3 == 0)
					System.out.println(i + " Â¦");
			} else {
				if((i/10 == 3) || (i/10 == 6) || (i/10 == 9)) {
					if((i%10 == 3) || (i%10 == 6) || (i%10 == 9))
						System.out.println(i + " Â¦Â¦");
					else
						System.out.println(i + " Â¦");
				} else {
					if((i%10 == 3) || (i%10 == 6) || (i%10 == 9))
						System.out.println(i + " Â¦");
				}
			}
		}
	}
	
	public void other2() { // scanner, new int[]
		System.out.print("¼ýÀÚ¸¦ ÀÔ·ÂÇÏ¼¼¿ä. : ");

		int number = scanner.nextInt();
		int temp = 0;
		int numcount = 0; //ÀÚ¸´¼ö
		int count = 0; //3,6,9 °³¼ö
		
		for(int i = 1; i <= number; i++) {
			temp = i;
			numcount = 0;
			
			while(temp > 0) {
				temp /= 10;
				numcount++;
			}
			
			temp = i;
			
			int pos = (int)Math.pow(10, numcount-1);
			int[] arr =  new int[numcount];
			
			if (temp >= 10) {
				arr[0] = temp/pos;
				for(int j = 1; j < numcount-1; j++) {
					pos /= 10;
					arr[j] = temp/pos%10;
				}
				
				arr[numcount-1] = temp%10;
			}
			else {
				arr[0] = temp;
			}
			
			for(int j = 0; j < numcount; j++) {
				if((arr[j] == 3) || (arr[j] == 6) || (arr[j] == 9))
					count++;
			}
			
			if(count != 0)
				System.out.print(temp + " ");
			for(int j = 0; j < count; j++) {
				System.out.print("Â¦");
			}
			if(count != 0) {
				System.out.println();
				count = 0;
			}
		}
	}
	
	public void other3() { // string
		int count = 0;
		String str_number = "";		
		
		for(int i = 1; i < 100; i++) {
			str_number = String.valueOf(i);
			
			if(str_number.length() == 1) {
				if((str_number.charAt(0) == '3') || (str_number.charAt(0) == '6') || (str_number.charAt(0) == '9')) {
					count = 1;
				}
			}
			else if(str_number.length() == 2){
				if((str_number.charAt(0) == '3') || (str_number.charAt(0) == '6') || (str_number.charAt(0) == '9')) { //30 60 90
					if((str_number.charAt(1) == '3') || (str_number.charAt(1) == '6') || (str_number.charAt(1) == '9')) {
						count = 2;
					} else {
						count = 1;
					}
				} else { // != 30 60 90
					if((str_number.charAt(1) == '3') || (str_number.charAt(1) == '6') || (str_number.charAt(1) == '9')) {
						count = 1;
					}
				}
			}
			
			if(count != 0) {
				System.out.print(i+" ");

				for(int j = 0; j < count; j++) {
					System.out.print("Â¦");
				}
				System.out.println();
				
				count = 0;

			} else {
				continue;
			}
		}
	}
		
	
	public void other4() { //[±èÇö¿ì] [¿ÀÈÄ 4:39] 
		int num = 99;
		
		for (int i = 1; i <= num; i++) {
			String s = String.valueOf(i);
			int cnt = 0;
		    
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '3' || s.charAt(j) == '6' || s.charAt(j) == '9') {
					cnt++;

					if (cnt == 1) {
							System.out.print(i + " Â¦");
					} else if (cnt == 2) {
							System.out.print("Â¦");
					}
					
				}
			}
		
			if(cnt != 0){
				System.out.println();
			}
			
		}
	}
	
	public void other5() { // scanner, string
		String number = scanner.next();
		//TODO
	}
}

public class Prob5 {
	public static void main(String[] args) {
		Solv s = new Solv();
		
		s.solv();
		//s.other1();	
		//s.other2();
		//s.other3();
		//s.other4(); //[±èÇö¿ì] [¿ÀÈÄ 4:39]
		//s.other5();
	}
}
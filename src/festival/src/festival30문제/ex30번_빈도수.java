package festival30문제;

import java.util.Scanner;

public class ex30번_빈도수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	      System.out.println("==== 알파벳 빈도수 구하기 ====");
	      System.out.print("입력 >> ");
	      String alpa = sc.nextLine();
	      String trans = alpa.toLowerCase();//소문자로 전환
	      String[] a = trans.split("");//리스트화한다
	      
	      
	      int[] array = new int[26];
	      
	      for(int i=0; i<a.length; i++) {
	    	  
	    	  switch(a[i]) {
	    	  
	    	  case "a":{
	    		  array[0] += 1;
	    		  break;
	    	  }
	    	  case "b":{
	    		  array[1] += 1;
	    		  break;
	    	  }
	    	  case "c":{
	    		  array[2] += 1;
	    		  break;
	    	  }
	    	  case "d":{
	    		  array[3] += 1;
	    		  break;
	    	  }
	    	  case "e":{
	    		  array[4] += 1;
	    		  break;
	    	  }
	    	  case "f":{
	    		  array[5] += 1;
	    		  break;
	    	  }
	    	  case "g":{
	    		  array[6] += 1;
	    		  break;
	    	  }
	    	  case "h":{
	    		  array[7] += 1;
	    		  break;
	    	  }
	    	  case "i":{
	    		  array[8] += 1;
	    		  break;
	    	  }
	    	  case "j":{
	    		  array[9] += 1;
	    		  break;
	    	  }
	    	  case "k":{
	    		  array[10] += 1;
	    		  break;
	    	  }
	    	  case "l":{
	    		  array[11] += 1;
	    		  break;
	    	  }
	    	  case "m":{
	    		  array[12] += 1;
	    		  break;
	    	  }
	    	  case "n":{
	    		  array[13] += 1;
	    		  break;
	    	  }
	    	  case "o":{
	    		  array[14] += 1;
	    		  break;
	    	  }
	    	  case "p":{
	    		  array[15] += 1;
	    		  break;
	    	  }
	    	  case "q":{
	    		  array[16] += 1;
	    		  break;
	    	  }
	    	  case "r":{
	    		  array[17] += 1;
	    		  break;
	    	  }
	    	  case "s":{
	    		  array[18] += 1;
	    		  break;
	    	  }
	    	  case "t":{
	    		  array[19] += 1;
	    		  break;
	    	  }
	    	  case "u":{
	    		  array[20] += 1;
	    		  break;
	    	  }
	    	  case "v":{
	    		  array[21] += 1;
	    		  break;
	    	  }
	    	  case "w":{
	    		  array[22] += 1;
	    		  break;
	    	  }
	    	  case "x":{
	    		  array[23] += 1;
	    		  break;
	    	  }
	    	  case "y":{
	    		  array[24] += 1;
	    		  break;
	    	  }
	    	  case "z":{
	    		  array[25] += 1;
	    		  break;
	    	  }
	    	  
	    	  }
	      }
		for(int i=0; i<array.length;i++) {
			System.out.println((char)(97+i) + " : " + array[i]);
		}
	}

}

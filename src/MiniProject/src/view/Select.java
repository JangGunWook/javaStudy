package view;

import java.util.ArrayList;
import java.util.Scanner;

public class Select {
	public static void main(String[] args) {
		
		
		
		Select sel = new Select();
		sel.score1 =1;
		sel.score2 =2;
		sel.score3 =3;
		sel.score4 =4;
	
		System.out.println(sel.maxScore(sel.score1, sel.score2, sel.score3, sel.score4));
		System.out.println(sel.max);
		//System.out.println(sel.maxColumn());
		
	}
	
	

	Scanner sc = new Scanner(System.in);

	public int score1 = 0;
	public int score2 = 0;
	public int score3 = 0;
	public int score4 = 0;
    public int max = 0;
	int answer;

	// 4지선다 문제
	public void select4(int input) {

		if (input == 1) {
			score1 += 8;
			score2 += 5;
			score3 += 3;
			score4 += 1;

		} else if (input == 2) {
			score1 += 5;
			score2 += 8;
			score3 += 1;
			score4 += 3;

		} else if (input == 3) {
			score1 += 3;
			score2 += 1;
			score3 += 8;
			score4 += 5;

		} else if (input == 4) {
			score1 += 1;
			score2 += 3;
			score3 += 5;
			score4 += 8;
		}

	}

	// 벨런스게임
	public void select2(int input) {
		 if (input == 1) {
			score1 += 5;
			score3 += 5;
		
			
		} else if (input == 2) {
			score2 += 5;
			score4 += 5;
			
		} 
	}
	
	// 영화,노래맞추기
	public void truefalse() {
		score1 += 5;
		score2 += 5;
		score3 += 5;
		score4 += 5;
		
	}
	
	// 최고점 찾기
	 public int maxScore(int score1,  int score2, int score3, int score4) {
	        max = score1;

	        if (score2 > max) {
	            max = score2;
	        }

	        if (score3 > max) {
	            max = score3;
	        }

	        if (score4 > max) {
	            max = score4;
	        }

	        return max;
	    }
	
	public String maxColumn() {
	 String column = null;
	 
		if (max == score1) {
			column = "GW";

		} else if (max == score2) {
			column = "SW";

		} else if (max == score3) {
			column = "JH";

		} else if (max == score4) {
			column = "JS";
		}
		return column;
	}
	 
	 
	 
	
}
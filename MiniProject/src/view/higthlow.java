package view;

public class higthlow {

	public static void main(String[] args) {

	        System.out.println("가장 높은 점수: " );
	    }

	    public int maxScore(int score1,  int score2, int score3, int score4) {
	        int max = score1;

	        if (score1 > max) {
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
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}



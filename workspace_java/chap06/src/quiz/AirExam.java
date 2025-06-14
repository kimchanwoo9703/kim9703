package quiz;

public class AirExam {

	public static void main(String[] args) {

		 Air a = new Air();

	        a.brand = "CoolWind";
	        a.di = "슬림";
	        a.dyd = 18;
	        a.ele = 3.5;
	        a.price = 1000000;
	        a.bo = 3;

	        a.control(); 
	        a.cool();      
	        a.filter();   
	        a.lower(); 
	        a.de();     

	        AirReview review = new AirReview();
	        review.user = "찬우";
	        review.comment = "시원해용!";
	        review.showReview();
	    }
	
		
		
		
	}



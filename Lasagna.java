package exercism;

/** In this exercise I practice creating methods and
 * calling methods.
 * In this exercise I write some code 
 * to help me cook a brilliant lasagna from 
 * my favorite cooking book.
 * 
 * I have four tasks, all related to the time spent cooking the lasagna.
 *
 * @author Sley
 */
    
/** Task 1
 * Define the expected oven time in minutes
 * @return 40
 */

public class Lasagna {
    

    int time  = 40;
    
    public int expectedMinutesInOven(){
            return time;
        }
  

	 /** Task 2
	 * Calculate the remaining oven time in minutes
	 * @param y
	 * @return 10
	 */   
    public int remainingMinutesInOven(int current_time){
            return time - current_time;
        }
   
        
	/** Task 3
	 * Calculate the preparation time in minutes
	 * @param z
	 * @return 4
	 */   
    public int preparationTimeInMinutes(int layers){
            return layers * 2;
        }    
   
	/** Task 4
	 * Calculate the total working time in minutes
	 * @param l, m
	 * @return 26
	 */   
    public int totalTimeInMinutes(int layers2, int oven_time){
            int total = layers2 * 2 + oven_time; 
                return total;
        }
   
    
    public static void main(String[] args) {
    	
    	  Lasagna lasagna = new Lasagna();
    	  
    	  System.out.println(lasagna.expectedMinutesInOven());
    	  System.out.println(lasagna.remainingMinutesInOven(30));
    	  System.out.println(lasagna.preparationTimeInMinutes(2));
    	  System.out.println(lasagna.totalTimeInMinutes(3, 20));   	    

    } // end of main
    
}  // end of Lasagna


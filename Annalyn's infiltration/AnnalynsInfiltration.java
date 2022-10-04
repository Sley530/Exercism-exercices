package exercism;

/* 10/03/2022 */


/** In this exercise, I'll be implementing the quest logic 
 * for a new RPG game a friend is developing. 
 * The game's main character is Annalyn, 
 * a brave girl with a fierce and loyal pet dog.
 * 
 * Unfortunately, disaster strikes, as her best friend was kidnapped 
 * while searching for berries in the forest. 
 * Annalyn will try to find and free her best friend, 
 * optionally taking her dog with her on this quest.
 * 
 * In this exercise I practice boolean types.
 * 
 */


/**
 * 
 * @author Sley
 *
 */


class AnnalynsInfiltration {
	
	
	/**
	 * 
	 * @param knightIsAwake knightIsAwake Which will show if the knight is awake or asleep.
	 * @return false
	 */
    public static boolean canFastAttack(boolean knightIsAwake) {
    	
    	boolean attack = true;
        
    	if (knightIsAwake){
        	attack = false;
        }
    	
    	return attack;
			 	
    }

    
    /**
     * 
     * @param knightIsAwake Do the same thing.
     * @param archerIsAwake The one that shows if the archer is awake or asleep.
     * @param prisonerIsAwake Do the same thing, it shows for the prisoner 
     * @return true
     */
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
    	
    	boolean spy = false;
    	
    	if (knightIsAwake || archerIsAwake || prisonerIsAwake) {
    		spy = true;
    	}
    
    	return spy;
       	
    }

    
    /**
     * This method do a Fast attack: a fast attack can be made if the knight is sleeping, as it takes time for him to get his armor on, so he will be vulnerable.
     * 
     * @param archerIsAwake Do the same thing.
     * @param prisonerIsAwake Do the same thing.
     * @return true
     */
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
    	
    	boolean signal = true;
    	
    	if (!archerIsAwake && prisonerIsAwake) {
    		return signal;
    	}

    	return !signal;
    	    
    }

    
    /**
     * 
     * @param knightIsAwake
     * @param archerIsAwake
     * @param prisonerIsAwake
     * @param petDogIsPresent Shows if the dog is present or not.
     * @return false
     */
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
    	
    	boolean freedom = true;
    	
    	if (petDogIsPresent) {
    		
    		if (!archerIsAwake) {
    		return freedom;
    		}
    	}
    	
    	else if (!knightIsAwake && !archerIsAwake && prisonerIsAwake) {
    		return freedom;
    	}
    	
    	return !freedom;     
    
    } 
    
}	// end of AnnalynsInfiltration



class Main{
	
	public static void main(String[] args) {	// main method for testing the AnnalynsInfiltration class.
		
		boolean knightIsAwake = true;
		System.out.println(AnnalynsInfiltration.canFastAttack(knightIsAwake));
		
		boolean knightIsAwake2 = false;
		boolean archerIsAwake = true;
		boolean prisonerIsAwake = false;
		System.out.println(AnnalynsInfiltration.canSpy(knightIsAwake2, archerIsAwake, prisonerIsAwake));
		
		boolean archerIsAwake2 = false;
		boolean prisonerIsAwake2 = true;
		System.out.println(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake2, prisonerIsAwake2));
		
		boolean knightIsAwake3 = false;
		boolean archerIsAwake3 = true;
		boolean prisonerIsAwake3 = false;
		boolean petDogIsPresent = false;
		System.out.println(AnnalynsInfiltration.canFreePrisoner(knightIsAwake3, archerIsAwake3, prisonerIsAwake3, petDogIsPresent));
		
	}	// end of main

}	// end of Main




package game.init;

import game_engine.frontend.graphics.main.Initializer;

public class Launcher {

	public static void main(String[] args) {
		
		System.out.println("[(game.init) Launcher.java] Starting Graphics Process");
		new Initializer().start(1000,1000); // Start Graphics Process
		
	}
	
	// --- TEST CASES --- //
	
	/** Used to test the Game Engine
	 * 
	 * @return boolean[x] true if successful, otherwise failed.
	 */
	public boolean[] tests() {
		
		boolean[] returnThis = new boolean[1];
		
		
		
		return returnThis;
	}

}

package game.init;

import java.util.ArrayList;

import game_engine.frontend.graphics.Graphics.*;
import game_engine.frontend.graphics.Graphics.GraphicalObject;
import game_engine.frontend.graphics.Graphics.Painter;
import game_engine.frontend.graphics.main.Initializer;

public class Launcher {

	public static void main(String[] args) {
		
		System.out.println("[(game.init) Launcher.java] Starting Graphics Process");
		new Initializer().start(1000,1000); // Start Graphics Process
		
		//new Launcher().tests();
		
	}
	
	// --- TEST CASES --- //
	
	/** Used to test the Game Engine
	 * 
	 * @return boolean[x] true if successful, otherwise failed.
	 */
	public boolean[] tests() {
		
		boolean[] returnThis = new boolean[1];
		
		// Start Graphics Test (Collections Sort)
		System.out.println("Starting Graphics Test...");
		
		Painter p = new Painter(); // Create new Painter instance
		ArrayList<GraphicalObject> g_obj = new ArrayList<GraphicalObject>();
		
		for(int i = 0; i < 100; i++) {
			GraphicalObject randomTest = new GraphicalObject();
			
			randomTest.setPriorityValue((int) (Math.random() * 100));
			
			g_obj.add(randomTest);
		}
		
		p.add(g_obj);
		p.sortPriority();
		
		System.out.println("Graphics Test Result: " + p.getObjectsToBePainted());
		
		
		return returnThis;
	}

}

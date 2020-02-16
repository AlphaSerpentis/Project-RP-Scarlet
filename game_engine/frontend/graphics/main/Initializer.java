package game_engine.frontend.graphics.main;

import game_engine.frontend.graphics.Graphics.GameFrame;

public class Initializer {

	public void start(int xSize, int ySize) {
		
		// Start Java Swing Process
		GameFrame g = new GameFrame(xSize, ySize);
		g.setVisible(true);
		
	}
	
}

package game_engine.frontend.graphics;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

/**
 * 
 * @author Amethyst C - 2020
 *
 */
public class Graphics {
	
	// Enum
	public enum graphicalObjectTypes {
		GUI, // Represent GUI objects that do not need to be repainted every time, unless an update occurs
		GAME, // Represent game objects that are very dynamic and require a lot of repainting
		CUSTOM
	}
	
	// -- Object Classes -- //
	
	/**
	 * Object that can be represented in various forms so it can be "painted" onto the screen
	 *
	 */
	public class GraphicalObject<T extends graphicalObjectTypes> {
		
		// Instance Variables
		
		private int priorityValue = 0; // The higher the value, the more important it is to be painted
		private boolean visible = false; // Determines if it is visible the next frame, or not
		
		// Constructor
		
		public GraphicalObject() {
			
		}
		
		// Methods
		
		public void setPriorityValue(int v) {
			priorityValue = v;
		}
		public void setVisible(boolean v) {
			visible = v;
		}
		
		public int getPriorityValue() {
			return priorityValue;
		}
		public boolean getVisible() {
			return visible;
		}
		
		public String toString() { //TODO: Finish this whenever this Object is finished.
			return "";
		}
		
	}
	
	// -- Graphics Classes -- //
	
	/**
	 * graphicalUserInterface class contains all the graphical functions IN RELATION TO GUIs only.
	 *
	 */
	public static class GraphicalUserInterface {
		
		public GraphicalUserInterface(int xSize, int ySize) {
			JFrame f = new JFrame();
			
			f.setSize(xSize, ySize);
			f.setLayout(null);
			f.setResizable(false); // Makes it so it's not resizable
			f.setVisible(true);
			
			f.setDefaultCloseOperation(2); // Disposes the frame
		}
		
		public GraphicalUserInterface(int xSize, int ySize, boolean resizable) {
			JFrame f = new JFrame();
			
			f.setSize(xSize, ySize);
			f.setLayout(null);
			f.setResizable(resizable);
			f.setVisible(true);
		
			f.setDefaultCloseOperation(2); // Disposes the frame	
		}
		
	}
	
	/**
	 * Painter class contains all the graphical functions, excluding GUI functions, in which they draw stuff onto the screen.
	 *
	 */
	public class Painter {
		
		// Instance Variables
		
		/**
		 * Contains the list of GraphicalObjects that will be painted
		 */
		private ArrayList<GraphicalObject<?>> objectsToBePainted = new ArrayList<GraphicalObject<?>>();
		
		
		// Constructors
		
		public Painter() {
			
		}
		
		public Painter(ArrayList<GraphicalObject<?>> array) {
			
		}
		
		// Methods 
		
		// -- Simple Setter & Getter Methods --
		public void setObjectsToBePainted(ArrayList<GraphicalObject<?>> array) {
			objectsToBePainted = array;
		}
		
		public ArrayList<GraphicalObject<?>> getObjectsToBePainted() {
			return objectsToBePainted;
		}
		
		// -- End Simple Setter & Getter Methods
		
		public void paint() {
			
		}
		
		public void add() {
			
		}
		
		public void remove() {
			
		}
		
	}
	
}

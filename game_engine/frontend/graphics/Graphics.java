package game_engine.frontend.graphics;

import java.util.ArrayList;

/**
 * 
 * @author Amethyst C - 2020
 *
 */
public class Graphics {
	
	// -- Object Classes -- //
	
	/**
	 * Object that can be represented in various forms so it can be "painted" onto the screen
	 *
	 */
	public static class GraphicalObject {
		
		// Enum
		public enum graphicalObjectTypes {
			GUI,
			GAME,
			CUSTOM
		}
		
		// Instance Variables
		
		private int priorityValue = 0;
		
		// Constructor
		
		public GraphicalObject() {
			
		}
		
		// Methods
		
		public void setPriorityValue(int v) {
			priorityValue = v;
		}
		
		public int getPriorityValue() {
			return priorityValue;
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
	public class GraphicalUserInterface {
		
		
		
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
		private ArrayList<GraphicalObject> objectsToBePainted = new ArrayList<GraphicalObject>();
		
		// Constructors
		
		public Painter() {
			
		}
		
		public Painter(ArrayList<GraphicalObject> array) {
			array.sort(null);
		}
		
		// Methods 
		
		// -- Simple Setter & Getter Methods --
		public void setObjectsToBePainted(ArrayList<GraphicalObject> array) {
			objectsToBePainted = array;
		}
		
		public ArrayList<GraphicalObject> getObjectsToBePainted() {
			return objectsToBePainted;
		}
		
		public void paint() {
			
		}
		
	}
	
}

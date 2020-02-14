package game_engine.frontend.graphics;

import java.util.ArrayList;

import javax.swing.JFrame;

/**
 * 
 * @author Amethyst C - 2020
 *
 */
public class Graphics {
	
	// Enum... Might be deprecated?
	/*
	public enum graphicalObjectTypes {
		GUI, // Represent GUI objects that do not need to be repainted every time, unless an update occurs
		GAME, // Represent game objects that are very dynamic and require a lot of repainting
		CUSTOM
	}
	*/
	
	// -- Object Classes -- //
	
	/**
	 * Object that can be represented in various forms so it can be "painted" onto the screen
	 *
	 */
	public static class GraphicalObject implements IGraphics {
		
		private int priorityValue = 0;
		private int x = 0, y = 0;
		private boolean visible = false;
		private boolean painted = false;
		
		// Constructor
		public GraphicalObject() {
			
		}
		public GraphicalObject(int pv, int x, int y, boolean v, boolean p) {
			setPriorityValue(pv);
			setX(x);
			setY(y);
			setVisible(v);
			setPainted(p);
		}
		
		// Methods
		public void setPriorityValue(int v) {
			priorityValue = v;
		}
		public void setX(int v) {
			x = v;
		}
		public void setY(int v) {
			y = v;
		}
		public void setVisible(boolean v) {
			visible = v;
		}
		public void setPainted(boolean v) {
			painted = v;
		}
		
		public int getPriorityValue() {
			return priorityValue;
		}
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
		public boolean getVisible() {
			return visible;
		}
		public boolean getPainted() {
			return painted;
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
	public static class GraphicalUserInterface extends GraphicalObject {
		
		/**
		 * <b>NOT RECOMMENDED</b>: Creates a GraphicalUserInterface instance using default values.
		 */
		public GraphicalUserInterface() {
			super(0, 0, 0, false, false);
		}
		/**
		 * <b>NOT RECOMMENDED</b>: Creates a GraphicalUserInterface instance using default values, except for the priority value.
		 * @param pv is an integer value for the "priority value" which is used to determine which gets painted first.
		 */
		public GraphicalUserInterface(int pv) {
			super(pv, 0, 0, false, false);
		}
		/**
		 * Creates a GraphicalUserInterface instance using priority value, and X/Y coordinates, but is NOT visible by default.
		 * @param pv is an integer value for the "priority value" which is used to determine which gets painted first.
		 * @param x is an integer value representing the position of the GraphicalUserInterface object along the x-axis.
		 * @param y is an integer value representing the position of the GraphicalUserInterface object along the y-axis.
		 */
		public GraphicalUserInterface(int pv, int x, int y) {
			super(pv, x, y, false, false);
		}
		/**
		 * Creates a GraphicalUserInterface instance using priority value, X/Y coordinates, and setting the instance visible on the frame.
		 * @param pv is an integer value for the "priority value" which is used to determine which gets painted first.
		 * @param x is an integer value representing the position of the GraphicalUserInterface object along the x-axis.
		 * @param y is an integer value representing the position of the GraphicalUserInterface object along the y-axis.
		 * @param v is a boolean value that determines if the instance is visible on the frame or not.
		 */
		public GraphicalUserInterface(int pv, int x, int y, boolean v) {
			super(pv, x, y, v, false);
		}
		/**
		 * Creates a GraphicalUserInterface instance using X/Y coordinates, but has a low priority value and is NOT visible by default.
		 * @param x is an integer value representing the position of the GraphicalUserInterface object along the x-axis.
		 * @param y is an integer value representing the position of the GraphicalUserInterface object along the y-axis.
		 */
		public GraphicalUserInterface(int x, int y) {
			super(0, x, y, false, false);
		}
		/**
		 * Creates a GraphicalUserInterface instance using X/Y coordinates and setting the instance visible on the frame, but has a low priority value.
		 * @param x is an integer value representing the position of the GraphicalUserInterface object along the x-axis.
		 * @param y is an integer value representing the position of the GraphicalUserInterface object along the y-axis.
		 * @param v is a boolean value that determines if the instance is visible on the frame or not.
		 */
		public GraphicalUserInterface(int x, int y, boolean v) {
			super(0, x, y, v, false);
		}
		
		/*
		private Painter p;
		
		
		public GraphicalUserInterface(int xSize, int ySize) {
			p = new Painter();
			
			JFrame f = new JFrame();
			
			f.setSize(xSize, ySize);
			f.setLayout(null);
			f.setResizable(false); // Makes it so it's not resizable
			f.setVisible(true);
			
			f.setDefaultCloseOperation(2); // Disposes the frame
		}
		
		public GraphicalUserInterface(int xSize, int ySize, boolean resizable) {
			p = new Painter();
			
			JFrame f = new JFrame();
			
			f.setSize(xSize, ySize);
			f.setLayout(null);
			f.setResizable(resizable);
			f.setVisible(true);
		
			f.setDefaultCloseOperation(2); // Disposes the frame	
		}
		*/
		
	}
	
	public static class GameFrame {
		
		private Painter p;
		private JFrame f;
		
		/**
		 * Defines the length and height of the JFrame. Does NOT set the frame visible to the user.
		 * @param xSize is an integer value that determines the size of the frame along the x-axis.
		 * @param ySize is an integer value that determines the size of the frame along the y-axis.
		 */
		public GameFrame(int xSize, int ySize) {
			f = new JFrame();
			
			setXSize(xSize);
			setYSize(ySize);
		}
		/**
		 * Defines the length and height, as well as the position of the JFrame. Does NOT set the frame visible to the user.
		 * @param xSize is an integer value that determines the size of the frame along the x-axis.
		 * @param ySize is an integer value that determines the size of the frame along the y-axis.
		 * @param xPos is an integer value that determines the position of the frame along the x-axis.
		 * @param yPos is an integer value that determines the position of the frame along the y-axis.
		 */
		public GameFrame(int xSize, int ySize, int xPos, int yPos) {
			f = new JFrame();
			
			setXSize(xSize);
			setYSize(ySize);
			setXPos(xPos);
			setYPos(yPos);
		}
		/**
		 * Defines the length and height, position of the JFrame, and the visibility to the user.
		 * @param xSize is an integer value that determines the size of the frame along the x-axis.
		 * @param ySize is an integer value that determines the size of the frame along the y-axis.
		 * @param xPos is an integer value that determines the position of the frame along the x-axis.
		 * @param yPos is an integer value that determines the position of the frame along the y-axis.
		 * @param visible is a boolean value that determines if the JFrame is visible to the user or not.
		 */
		public GameFrame(int xSize, int ySize, int xPos, int yPos, boolean visible) {
			f = new JFrame();
			
			setXSize(xSize);
			setYSize(ySize);
			setXPos(xPos);
			setYPos(yPos);
			setVisible(visible);
		}
		
		public void setXSize(int xSize) {
			f.setSize(xSize, f.getHeight());
		}
		public void setYSize(int ySize) {
			f.setSize(f.getWidth(), ySize);
		}
		public void setXPos(int xPos) {
			f.setLocation(xPos, f.getY());
		}
		public void setYPos(int yPos) {
			f.setLocation(f.getX(), yPos);
		}
		public void setVisible(boolean v) {
			f.setVisible(v);
		}
		public boolean getVisible() {
			return f.isVisible();
		}
		
		public Painter getPainter() {
			return p;
		}
		public JFrame getFrame() {
			return f;
		}
		
	}
	
	/**
	 * Painter class contains all the graphical functions, excluding GUI functions, in which they draw stuff onto the screen.
	 *
	 */
	public static class Painter implements Runnable {
		
		// Instance Variables
		
		/**
		 * Contains the list of GraphicalObjects that will be painted
		 */
		private ArrayList<GraphicalObject> objectsToBePainted = new ArrayList<GraphicalObject>();
		
		// Constructors
		
		public Painter() {
			
		}
		
		public Painter(ArrayList<GraphicalObject> array) {
			add(array);
		}
		
		// Methods 
		
		// -- Simple Setter & Getter Methods --
		public void setObjectsToBePainted(ArrayList<GraphicalObject> array) {
			objectsToBePainted = array;
		}
		
		public ArrayList<GraphicalObject> getObjectsToBePainted() {
			return objectsToBePainted;
		}
		
		// -- End Simple Setter & Getter Methods
		public void paint() {
			
			if(objectsToBePainted.isEmpty()) {
				
			}
			
		}
		public void paint(GraphicalObject go) {
			
			if(go == null) {
				
			}
			
		}
		public void paint(ArrayList<GraphicalObject> prevPainted) {
			
			if(prevPainted == null) {
				
			}
			
		}
		public void add(ArrayList<GraphicalObject> obj) {
			objectsToBePainted.addAll(obj);
		}
		public void add(GraphicalObject obj) {
			objectsToBePainted.add(obj);
		}
		public void remove(ArrayList<GraphicalObject> obj) {
			objectsToBePainted.removeAll(obj);
		}
		public void remove(GraphicalObject obj) {
			objectsToBePainted.remove(obj);
		}
		
		public void sortPriority() {
			
		}

		@Override
		public void run() {
			
			
		}
		
	}
	
}

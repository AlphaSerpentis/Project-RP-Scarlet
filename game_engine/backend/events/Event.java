package game_engine.backend.events;

/**
 * 
 * @author Amethyst C - 2020
 *
 */
public abstract class Event {

	// Instance Variables
	private String name;
	
	// Constructor(s)
	
	/**
	 * Sets default constructor (which will be null).
	 */
	public Event() {
		name = null;
	}
	
	/**
	 * Sets the Event a name
	 * @param n parameter is the name of the Event instance
	 */
	public Event(String n) {
		name = n;
	}
	
	// Getter Methods
	
	public String getName() {
		return name;
	}
	
	// Misc Methods
	
	// --- Abstract Methods ---
	/**
	 * An abstract method used when the event is triggered
	 * @return true or false, depending on the use.
	 */
	public abstract boolean onTrigger();
	/**
	 * An abstract method used to do something
	 */
	public abstract void action();
	public abstract String toString();
	
}

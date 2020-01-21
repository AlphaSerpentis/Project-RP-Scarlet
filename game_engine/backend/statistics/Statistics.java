package game_engine.backend.statistics;

/**
 * 
 * @author Amethyst C. - 2020
 *
 * @param <T> is a parameter type used for various data types.
 */
public abstract class Statistics<T> {

	private String name;
	private T data;
	
	public Statistics() {
		name = "undef";
		data = null;
	}
	public Statistics(String n) {
		name = n;
		data = null;
	}
	public Statistics(String n, T d) {
		name = n;
		data = d;
	}
	
	public String getName() {
		return name;
	}
	public T getData() {
		return data;
	}
	
	//Abstract Class
	public abstract class action {};
	
}

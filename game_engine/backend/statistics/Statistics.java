package game_engine.backend.statistics;

public abstract class Statistics<T> {

	private String name;
	private T data;
	
	public Statistics() {
		name = "undef";
		data = null;
	}
	public Statistics(String n) {
		name = n;
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

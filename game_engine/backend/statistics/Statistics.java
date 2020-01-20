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
	
}

package game_engine.frontend.graphics;

public interface IGraphics {
	public void setPriorityValue(int v);
	public void setVisible(boolean v);
	public void setPainted(boolean v);
	public int getPriorityValue();
	public boolean getVisible();
	public boolean getPainted();
}

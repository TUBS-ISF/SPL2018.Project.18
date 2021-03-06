package tools;
import commands.ICommand;
import gui.Workspace;
import rendering.Texture;

public abstract class ToolAdapter implements Tool
{
	private Workspace imagePanel;
	private String name;
	
	public ToolAdapter(String name) {
		this.name = name;
	}
	
	public void setImagePanel(Workspace panel) {
		imagePanel = panel;
	}
	
	protected Workspace getImagePanel() {
		return imagePanel;
	}
	
    public ICommand<Texture> use(Texture workpiece, int x, int y) { return null; }
    
    public void startUsage(Texture workpiece, int x, int y) {}
    
    public void updateUsage(Texture workpiece, int x, int y) {}
    
    public ICommand<Texture> finishUsage(Texture workpiece, int x, int y) { return null; }

    public void abortUsage() {}
    
    public String getName() {
    	return name;
    }
}

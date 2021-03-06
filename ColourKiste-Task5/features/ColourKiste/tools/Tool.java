package tools;
import commands.ICommand;
import gui.ImagePanel;
import rendering.Texture;

public interface Tool
{
	public void setImagePanel(ImagePanel panel);
	
    public ICommand<Texture> use(Texture workpiece, int x, int y);
    
    public void startUsage(Texture workpiece, int x, int y);
    
    public void updateUsage(Texture workpiece, int x, int y);
    
    public ICommand<Texture> finishUsage(Texture workpiece, int x, int y);
    
    public void abortUsage();
    
    public String getName();
}
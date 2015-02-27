import org.isis.gme.bon.*;
import org.isis.gme.mga.MgaModel;


public abstract class Process extends Artifact implements Visitable
{
	public Process(MgaModel iModel, JBuilderModel parent)
	{
		super(iModel,parent);
	}
	
	public abstract void getJSON();
}

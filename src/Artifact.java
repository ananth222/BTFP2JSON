import org.isis.gme.bon.*;
import org.isis.gme.mga.MgaModel;


public abstract class Artifact extends BTFPObject
{
	public Artifact(MgaModel iModel, JBuilderModel parent)
	{
		super(iModel,parent);
	}
	
	public abstract void getJSON();
}
 
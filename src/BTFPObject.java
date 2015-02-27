import org.isis.gme.bon.*;
import org.isis.gme.mga.MgaModel;


public abstract class BTFPObject extends JBuilderModel
{
	public BTFPObject(MgaModel iModel, JBuilderModel parent)
	{
		super(iModel,parent);
	}
	
	public abstract void getJSON();
}

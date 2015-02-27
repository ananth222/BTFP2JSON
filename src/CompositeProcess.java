import org.isis.gme.bon.*;
import org.isis.gme.mga.MgaModel;


public class CompositeProcess extends Process implements Visitable
{
	public CompositeProcess(MgaModel iModel, JBuilderModel parent)
	{
		super(iModel,parent);
	}
	
	public void getJSON()
	{
		
	}
	
	public void accept(BTFPVisitor visitor) {
		visitor.visit(this);
	}
}

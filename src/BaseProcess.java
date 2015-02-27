import org.isis.gme.bon.*;
import org.isis.gme.mga.MgaModel;


public class BaseProcess extends Process implements Visitable
{
	public BaseProcess(MgaModel iModel, JBuilderModel parent)
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

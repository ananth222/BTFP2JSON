
import java.util.*;
import javax.swing.JOptionPane;

import org.isis.gme.bon.*;

import org.json.simple.JSONObject;

public class BTFP2JSON implements BONComponent {

	/**
	 * 
	 */
	public BTFP2JSON() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.isis.gme.bon.BONComponent#invokeEx(org.isis.gme.bon.JBuilder, org.isis.gme.bon.JBuilderObject, java.util.Collection, int)
	 */
	public void invokeEx(
		JBuilder builder,
		JBuilderObject focus,
		Collection selected,
		int param) 
	{
		String msg = new String("Test Interpreter: Done!");
		
		//JSONObject obj = new JSONObject();
		JSONObject obj=new JSONObject();

		obj.put("name","foo");
		
		//msg = obj.toString() + focus.getMeta().getName();
		
		if(focus != null && focus.getMeta().getName() == "CompositeProcess")
		{
			CompositeProcess cp = (CompositeProcess)focus;
			//cp.getJSON();
		}
	
		JOptionPane.showMessageDialog(null,msg);

	}

	/* (non-Javadoc)
	 * @see org.isis.gme.bon.BONComponent#registerCustomClasses()
	 */
	public void registerCustomClasses() {
		//JBuilderFactory.addCustomModel("TestModel", "TestModel");
		JBuilderFactory.addCustomModel("CompositeProcess", "CompositeProcess");
		JBuilderFactory.addCustomModel("Process", "Process");
		JBuilderFactory.addCustomModel("KB", "KB");
	}
}

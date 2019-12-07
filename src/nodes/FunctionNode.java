package nodes;

import java.util.ArrayList;

public class FunctionNode extends BlockNode {
	
	private ArrayList<String> parIds = new ArrayList<>();
	private String functionId;
	
	public FunctionNode() {
		this.name = "Function Node";
	}

	public String getFunctionId() {
		return functionId;
	}

	public void setFunctionId(String functionId) {
		this.functionId = functionId;
	}

	public ArrayList<String> getParIds() {
		return parIds;
	}
	@Override
	public void print(String prefix) {
		System.out.println(prefix + name + " " + functionId + " with parameters: " + parIds);
		printChildren(prefix);
	}

	public void setParIds(ArrayList<String> parIds) {
		this.parIds = parIds;
	}

	@Override
	public Object execute(Context context) throws Exception {
		
		return super.execute((Context) context.clone());
	}	
	
	

}

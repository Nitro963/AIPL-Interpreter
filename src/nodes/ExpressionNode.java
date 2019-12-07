package nodes;

public class ExpressionNode extends AbstractTreeNode {

	public ExpressionNode() {
		name = "Expression Node";
	}
	protected String operation;
	
	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
			this.operation = operation;
	}

	@Override
	public Object execute(Context context) throws Exception {
		double d1 = (Double)children.get(0).execute(context);
		double d2 = (Double)children.get(1).execute(context);
		
		switch(this.operation)
		{
		case"+":
			return d1+d2;
		case"-":
			return d1-d2;
		case "*":
			return d1*d2;
		case "/":
			return d1/d2;
		case "%":
			return d1 % d2;
		
		}
	
		return null;
	}

	@Override
	public void print(String prefix) {
		// TODO Auto-generated method stub
		System.out.println(prefix + name + " operation " + operation);
		printChildren(prefix);
		
	}

	
	@Override
	public Object convert(Context context) {
		// TODO Auto-generated method stub
		return null;
	}

}

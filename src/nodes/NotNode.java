package nodes;

public class NotNode extends ConditionNode {

	@Override
	public Object execute(Context context) throws Exception {
		return !(boolean) children.get(0).execute(context);
	}
	public Object convert(Context context) {
		return "!" + children.get(0).convert(context);
	}

}

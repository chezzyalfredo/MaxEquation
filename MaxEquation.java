import java.util.ArrayList;




public class MaxEquation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run();
	}
	
	public static void run()
	{
		ArrayList<Node> array = new ArrayList<Node>();
		
		//System.out.print("| ");
		int i = 0;
		double x = 0.0750;
		while(x > 0.0)
		{
			double y = x-0.0001;
			while(y > 0.0)
			{
				double result = (40*(x))/(Math.PI*(Math.pow(x,4.0)-Math.pow(y,4.0)));
				Node node = new Node(y, x, result);
				array.add(node);
				//System.out.println(node.toString());
				y -= 0.0001;
			}
			x -= 0.0001;
		}
		
		Node result = new Node(0,0,0);
		double j = 0.0;
		double limit = 125*Math.pow(10,6);
		for(Node a : array)
		{
			if(limit >= a.getResult() && a.getResult() > j)
			{
				j = a.getResult();
				result = a;
			}
		}
		
		System.out.println(result.toString());
	}

}

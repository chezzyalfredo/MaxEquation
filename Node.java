
public class Node {

	double x = 0.0;
	double y = 0.0;
	double result = 0.0;
	
	public Node(double x, double y, double result)
	{
		this.x = x;
		this.y = y;
		this.result = result;
	}
	
	public double getX()
	{return x;}
	
	public double getY()
	{return y;}
	
	public double getResult()
	{return result;}
	
	public String toString()
	{
		return ("X: " + x + "     Y: " + y + "     Result: " + result + "");
	}
}

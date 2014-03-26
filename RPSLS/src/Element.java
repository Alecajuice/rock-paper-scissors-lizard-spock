
public class Element 
{
	private static String[] elements = {"Fire", "Water", "Grass", "Light", "Dark"};
	private String name;
	private int iD;
	public Element(int iD)
	{
		setID(iD);
		name = elements[iD];
	}
	public boolean compare(Element other)
	{
		int gap = Math.abs(this.iD - other.iD);
		if(gap % 2 == 0)
		{
			return Math.min(this.iD, other.iD) == this.iD;
		}
		else
		{
			return Math.max(this.iD, other.iD) == other.iD;
		}
	}
	public void setID(int iD)
	{
		this.iD = iD;
	}
}


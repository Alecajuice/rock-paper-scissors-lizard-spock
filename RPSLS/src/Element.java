public class Element 
{
	private static String[] elements = {"Fire", "Water", "Grass", "Air", "Earth"};
	private String name;
	private int iD;
	public Element(int iD)
	{
		setID(iD);
		name = elements[iD];
	}
	public Element()
	{
		iD = -1;
	}
	public boolean compare(Element other)
	{
		if(this.iD == -1 && other.iD != -1)
		{
			return false;
		}
		if(this.iD != -1 && other.iD == -1)
		{
			return true;
		}
		if(this.iD == -1 && other.iD == -1)
		{
			double i = Math.random();
			if(i < 0.5)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		int gap = Math.abs(this.iD - other.iD);
		if(gap == 0)
		{
			double i = Math.random();
			if(i < 0.5)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
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
	public int getID()
	{
		return iD;
	}
}


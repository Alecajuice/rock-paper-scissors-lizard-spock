
public class Team 
{
	private Element[] team = new Element[10];
	
	public Team()
	{
		
	}
	
	public void add(Element e, int index)
	{
		team[index] = e;
	}
	
	public void delete(int index)
	{
		team[index] = null;
	}
}

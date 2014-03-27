public class Team 
{
	private Element[] team = new Element[10];
	
	public Team()
	{
		
	}
	
	public boolean battle(Team other)
	{
		Element[] otherTeam = other.getTeam();
		for(int i = 0; i < Max(otherTeam.length, team.length)); i++)
		{
			
		}
	}
	
	public void add(Element e)
	{
		try
		{
			team[team.indexOf(null)] = e;
		}
		catch(Exception e)
		{
			//Team filled
		}
	}
	
	public void delete(int index)
	{
		team[index] = null;
	}
	
	public Element[] getTeam()
	{
		return team;
	}
}

public class Team 
{
	private Element[] team = new Element[10];
	
	public Team()
	{
		
	}
	
	public void battle(Team other)
	{
		for (int i = 0; i < Math.max(this.team.length, other.team.length); i++)
		{
			if (this.team[i] != null)
			{
				int j = (int)Math.round(((Math.random() + i - 1) * 3));
				while(j < 0 || j > team.length - 1)
				{
					j = (int)Math.round(((Math.random() + i - 1) * 3));
				}
				this.team[i].compare(other.team[j]);
			}
		}
	}
	
	public void add(Element e)
	{
		try
		{
			for (Element el : team)
			{
				if (el == null)
				{
					el = e;
					break;
				}
			}
		}
		catch(Exception e1)
		{
			//Team filled
		}
	}
	
	public void delete(int index)
	{
		team[index] = null;
	}
	
	public void replace(int index, Element e)
	{
		team[index] = e;
	}
	
	public Element[] getTeam()
	{
		return team;
	}
}

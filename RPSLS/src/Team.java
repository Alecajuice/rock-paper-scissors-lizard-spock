public class Team 
{
	private Element[] team = new Element[10];
	
	public Team()
	{
		
	}
	
	public boolean battle(Team other)
	{
		int score = 0;
		Element[] otherTeam = other.getTeam();
		for(int i = 0; i < Math.max(otherTeam.length, team.length); i++)
		{
			if(team[i].compare(otherTeam[i]))
			{
				score ++;
			}
			else if(otherTeam[i].compare(team[i]))
			{
				score --;
			}
		}
		if(score > 0)
		{
			return true;
		}
		else
		{
			return false;
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

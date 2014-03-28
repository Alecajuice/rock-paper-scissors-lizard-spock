
public class Player 
{
	private Team team = new Team();
	private String name;
	public Player(String name)
	{
		this.name = name;
	}
	public Element getElement(int index)
	{
		return team.getElement(index);
	}
}

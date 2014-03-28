import java.awt.Graphics;


public class Player 
{
	private Team team = new Team();
	private String name;
	public Player(String name)
	{
		this.name = name;
	}
	public void draw(Graphics screen)
	{
		
	}
	public Element getElement(int index)
	{
		return team.getElement(index);
	}
	public Team getTeam() 
	{
		return team;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
}

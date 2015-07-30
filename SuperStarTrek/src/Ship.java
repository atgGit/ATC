
public class Ship 
{
	int energyLevel = 1000000;
	private Shield shield = new Shield();
	
	public int getEneregyLevel() {
		
		return energyLevel;
	}

	public void transfer(String subSystem, int tranferAmount) 
	{		
		int tranfferedAmount = shield.addEnergy(tranferAmount);
		energyLevel = energyLevel - tranfferedAmount;
		
	}

	public Shield getShield() {
		return shield;
	}
	

}

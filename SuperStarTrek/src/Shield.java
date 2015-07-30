
public class Shield {

	private boolean status = false;
	private int energyLevel = 10000;
	
	public void raise() {
		
		status = true;
	}

	public boolean isUp() {
		
		return status;
	}

	public void lower() {
		status = false;
		
	}

	public int getEneregyLevel() {
		return energyLevel;
		
	}

	public int addEnergy(int tranferAmount)
	{
		if (energyLevel + tranferAmount < 10000)
		{
			energyLevel += tranferAmount;
			return tranferAmount;
		}
		else if (energyLevel == 10000)
			return 0;
		else // partial
			energyLevel = 10000;
			return 10000 - tranferAmount;			
	}

}

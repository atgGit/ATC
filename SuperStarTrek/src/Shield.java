
public class Shield extends SubSystem {

	
	
	int energyLevel = 10000;
	
	public void raise() {
		
		status = true;
	}

	public boolean isUp() {
		
		return status;
	}

	public void lower() {
		status = false;
		
	}

	@Override
	public int getEneregyLevel() {
		return energyLevel;
		
	}

	@Override
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

	public void damage(int i) {
		energyLevel -= i;
	}

}

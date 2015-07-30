import java.util.*;



// This is a test
public class Ship 
{
	int totalEnergyLevel;

	private HashMap<String, SubSystem> subSystems = new HashMap<String, SubSystem> (10);
	
	public Ship()
	{
		subSystems.put("Shield",new Shield());
	}
		
	public int getEneregyLevel() {
		
		Set set = subSystems.entrySet();
	    Iterator iterator = set.iterator();

	    int total = 0;
		 while(iterator.hasNext()) {
			 Map.Entry mentry = (Map.Entry)iterator.next();
			 SubSystem s = (SubSystem) mentry.getValue();
	         total += s.getEneregyLevel();
	      }

		return total;
	}
	
	

	public void transfer(String subSystemString, int tranferAmount) 
	{		
		if (subSystemString.equals("Shield")) { 
			int tranfferedAmount = getShield().addEnergy(tranferAmount);
			totalEnergyLevel = totalEnergyLevel - tranfferedAmount;
		}
	}

	public Shield getShield() {
		return (Shield) subSystems.get("Shield");
	}

	public void damage(int amount, String s) {
		if (getShield().isUp())
			getShield().damage(amount);
		else
		{
			// need random generator
			getShield().damage(amount);
		}
		
	}
	
	

}

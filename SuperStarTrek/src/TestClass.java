import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestClass 
{
	@Test
	public void testShieldUp()
	{
		Shield shield = new Shield();
		shield.raise();
		Assert.assertTrue(shield.isUp());
	}
	
	@Test
	public void testShieldDownByDefault()
	{
		Shield shield = new Shield();
		Assert.assertFalse(shield.isUp());
	}
	
	@Test
	public void testShieldDown()
	{
		Shield shield = new Shield();
		shield.raise();
		shield.lower();
		Assert.assertFalse(shield.isUp());
	}
	
	@Test
	public void testShieldEnergyLevelByDefault()
	{
		Shield shield = new Shield();
		Assert.assertEquals(10000, shield.getEneregyLevel());
	}
	
	@Test
	public void testShipEnergyByDefault()
	{
		Ship ship = new Ship();
		Assert.assertEquals(1000000, ship.getEneregyLevel());
	}
	
	@Test
	public void testTransferEnergyofShipafterTransfer ()
	{
		Ship ship = new Ship();
		int tranferAmount = 1000;
		ship.transfer("shield", tranferAmount);
		Assert.assertEquals(1000000, ship.getEneregyLevel());
		
	}
	
	@Test
	public void testTransferEnergyofShieldafterTransfer ()
	{
		Ship ship = new Ship();
		int tranferAmount = 1000;
		ship.transfer("shield", tranferAmount);
		Assert.assertEquals(10000, ship.getShield().getEneregyLevel());
	}
	
	

}


public class MainCar 
{

	public int legalCities(CameraInfo [] cameras)
	{
		int count = 0;
		for(int i = 0; i <cameras.length; i ++)
		{
			for(int j = 0; j < cameras[i].getCars().length; j++)
			{
				if(cameras[i].getSpeed() < cameras[i].getMaxSpeed()|| cameras[i].getCar != true)
					count++;
				for(int r= 0; r < cameras.length; r++)
				{
					if(cameras[i].getCity() == cameras[r].getCity())
					{
						if(cameras[r].allGood(cameras) == true)
						{
							count--;
						}
					}
				}
			}
		}
	}
}

package Factory;

import DataProvider.ConfigDataProvider;

public class DataProviderFactory
{
	public static ConfigDataProvider getConfig()
	{
		
		ConfigDataProvider config= new ConfigDataProvider();
		return config;
		
	}
	
	



}

interface DBDriver
{
	int MIN_CONNECTION_ALLOWED = 10;
	 
	void createConnection();
	void getConnection();
	void closeConnection();
}

class MySqlDriver implements DBDriver		//implementing class is MySqlDriver
{
	public void createConnection()
	{
		System.out.println("createConnection of MySql");
	}
	
	public void getConnection()
	{
		System.out.println("getConnection of MySql");
	}
	
	public void closeConnection()
	{
		System.out.println("closeConnection of MySql");
	}
}

class PostgresDriver implements DBDriver
{
	public void createConnection()
	{
		System.out.println("createConnection of Postgres");
	}
	
	public void getConnection()
	{
		System.out.println("getConnection of Postgres");
	}
	
	public void closeConnection()
	{
		System.out.println("closeConnection of Postgres");
	}
}

class OracleDriver implements DBDriver
{
	public void createConnection()
	{
		System.out.println("createConnection of Oracle");
	}
	
	public void getConnection()
	{
		System.out.println("getConnection of Oracle");
	}
	
	public void closeConnection()
	{
		System.out.println("closeConnection of Oracle");
	}
}


class InterfaceDemo
{
	public static void main(String args[])
	{
		//new DBDriver();		//ERROR, we can not create object of interface.
		//DBDriver driver;		//OK, we can take interface as reference variable
		
		DBDriver driver[] = new DBDriver[3];
		driver[0] = new MySqlDriver();
		driver[1] = new PostgresDriver();
		driver[2] = new OracleDriver();
		
		for(int i = 0; i < driver.length; i++)
		{
			driver[i].createConnection();	//Polymorphic behivour
		}
		
		System.out.println("Min Connection Allowed : " + DBDriver.MIN_CONNECTION_ALLOWED);	
	}
	
}
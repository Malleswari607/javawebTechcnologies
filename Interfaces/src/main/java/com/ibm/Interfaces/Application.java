package com.ibm.Interfaces;

public class Application
{
	public void permissionToLand(Flyer flyer)
	{
		flyer.land();
	}
	public void persmissionToDock(Sailer sailer) {
		sailer.dock();
	}
	public static void main( String[] args )
	{
		Application application=new Application();
		Airplane airplane=new Airplane();
		application.permissionToLand(airplane); 
		Sailing sailing=new Sailing();
		application.permissionToLand(sailing);
		application.persmissionToDock(sailing);
		
	}
}
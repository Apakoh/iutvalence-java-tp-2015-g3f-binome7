//TODO trouver comment supprimer des todo en masse.
package fr.iut.adaugustaperangusta;

/* TODO JAVADOC. */
public class Main
{
	/* TODO JAVADOC. */
	public static void main(String[] args)
	{
		// TODO Main
		Map map = new Map(10,20);
		
		CreateMap.importMap("Test.txt",map);
		System.out.println(map);
	}
	
}
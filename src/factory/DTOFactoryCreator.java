package factory;

public class DTOFactoryCreator {
	/**
	 * 
	 */
	private static final String PACKAGE = "dtofactory";
	/**
	 * 
	 */
	private static final String FACTORY = "Factory";
	
	
	/**
	 * 
	 */
	private DTOFactoryCreator() { } 
	/**
	 * 
	 * @param factoryName
	 * @return
	 */
	public static Factory<T> getFactory(String factoryName) {
		return null;
	}
	
	/**
	 * 
	 * @param type
	 * @return
	 */
	public static Factory createBuilder(Class<?> type) {
		return null;
		//TODO
	}
}

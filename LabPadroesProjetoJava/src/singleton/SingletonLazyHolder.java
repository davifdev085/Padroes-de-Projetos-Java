package singleton;

/*
 * Singleton ""
 * 
 * @see <a href=""></a>
 * 
 * @autor
 */
public class SingletonLazyHolder {
	
	private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}

}

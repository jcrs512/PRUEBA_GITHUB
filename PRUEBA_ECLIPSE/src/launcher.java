
public class launcher {
	private static String OPTION_NOTIME;
	
	static {
		OPTION_NOTIME=System.getProperty("NoTime");
		System.out.println("OPTIONS INITIALIZED");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HELLO WORLD!!!!");
		
		// NoTime
		if (OPTION_NOTIME == null) {
			System.out.println("NoTime: NO ACTIVE");
		}
		else {
			System.out.println("NoTime: ACTIVE");
		}
		
		// Args
		if (args.length > 0) {
			for (String value : args)
				System.out.println ("Argument Iterator: " + value);
			for (int index=0; index < args.length; index++) {
				System.out.println ("Argument Index " + index + ": " + args[index]);
			}
		}
	}

}


public class Fak {

	public Fak() {
	}

	static BigInteger fak(Integer n){
		
		try
		{
			Thread.sleep( 0 );
		}
		catch( InterruptedException pErr )
		{
					pErr.printStackTrace();
		}

		return (1..n).parallelStream().inject(1){BigInteger a,BigInteger b->a.multiply(b)}
	}
	public static void main(String[] args) {
		
		Long start = System.currentTimeMillis() ;
		
	
		
		Long stop = System.currentTimeMillis() ;
		Long dauer=stop-start;
		System.out.println ("Laufzeit: "+dauer+" ms");
	}

}


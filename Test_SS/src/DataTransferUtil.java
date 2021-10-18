public class DataTransferUtil {
	
	String s = "";
	static int count;
	DataTransferUtil (String s){
		count = 0;
		this.s = s;
	}

	public static void processData(String data) {
		System.out.println(Thread.currentThread().getName()+" " +Thread.holdsLock(data)+ " Arrived with Data "+data);
		synchronized (data) 
		{
			System.out.println(Thread.currentThread().getName()+" Holds Lock "+Thread.holdsLock(data)+" for "+data+" @ "+System.currentTimeMillis());
			try {
				if("5".equalsIgnoreCase(data))
					Thread.sleep(10000);
				if("15".equalsIgnoreCase(data))
					Thread.sleep(15000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" processed :: "+data+" @ "+System.currentTimeMillis());
			
//			System.out.println("Count :: "+(count++));
		}
	}

}

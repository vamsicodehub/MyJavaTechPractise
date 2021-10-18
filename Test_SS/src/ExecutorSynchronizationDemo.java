
public class ExecutorSynchronizationDemo {
	
	public static void main(String[] args) {
		for(int i=0;i<100000000;i++) {
			String s = new String("");
			DataTransferUtil dataTransferUtil = new DataTransferUtil(s);
		}
		long StartTime = System.currentTimeMillis();
//		System.out.println("StartTime :: "+StartTime);
		for(int i=0;i<5;i++) {
			TaskExecutor.putData(5+"");
			TaskExecutor.putData(5+"");
		}
		for(int i=0;i<5;i++) {
			TaskExecutor1.putData(5+"");
			TaskExecutor1.putData(5+"");
		}
		
//		System.out.println("EndTime :: "+(System.currentTimeMillis() - StartTime));
	}

}

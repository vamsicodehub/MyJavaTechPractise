
public class TaskWorker1 implements Runnable {

	@Override
	public void run() {
		while(true) {
			String data = TaskExecutor1.takeData();
			if(data != null) {
				DataTransferUtil.processData(data);
			}
		}

	}

}

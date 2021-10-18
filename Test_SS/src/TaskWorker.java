
public class TaskWorker implements Runnable {
	
	DataTransferUtil dataTransferUtil = new DataTransferUtil("");

	@Override
	public void run() {
		while(true) {
			String data = TaskExecutor.takeData();
			if(data != null) {
//				dataTransferUtil = new DataTransferUtil(data);
				DataTransferUtil.processData(data);
			}
		}
	}

}

import java.util.concurrent.Callable;

public class TaskWorker implements Callable<Integer> {
	
	DataTransferUtil dataTransferUtil = new DataTransferUtil("");

	@Override
	public Integer call() {
		while(true) {
			String data = TaskExecutor.takeData();
			if(data != null) {
//				dataTransferUtil = new DataTransferUtil(data);
				DataTransferUtil.processData(data);
			}
		}
	}

}

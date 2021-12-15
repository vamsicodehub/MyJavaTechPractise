import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class TaskExecutor {

	private static BlockingQueue<String> dataQueue = new LinkedBlockingQueue<>();
	private static ExecutorService executorService;

	static {

//		BasicThreadFactory factory = new BasicThreadFactory.Builder().namingPattern("PRPostingThread-%d")
//				.priority(Thread.MAX_PRIORITY).build();

		executorService = Executors.newFixedThreadPool(Integer.valueOf(5), null);

		TaskWorker accountPostingWorker = new TaskWorker();
		for (int i = 0; i < 5; i++)
			executorService.submit(accountPostingWorker);
	}

	public static void putData(String data) {
		try {
			dataQueue.put(data);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static String takeData() {
		try {
			return dataQueue.take();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}

}

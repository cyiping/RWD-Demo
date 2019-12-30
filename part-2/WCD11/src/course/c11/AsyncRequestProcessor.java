package course.c11;

import javax.servlet.AsyncContext;

public class AsyncRequestProcessor implements Runnable {
	private AsyncContext asyncContext;
	public AsyncRequestProcessor(AsyncContext asyncCtx) {
		this.asyncContext = asyncCtx;
	}
	@Override
	public void run() {
		System.out.println("Request Thread 2:");
		System.out.println("Name: " + Thread.currentThread().getName());
		System.out.println("Time: " + new java.util.Date());
		System.out.println("--------------------------");
		
		RunUtility.run(5);

		asyncContext.dispatch("/course/c11/result.jsp");
	}
}
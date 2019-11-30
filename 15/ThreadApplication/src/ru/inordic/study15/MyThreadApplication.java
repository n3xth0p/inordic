package ru.inordic.study15;
import ru.inordic.study15.ProductionStage;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class MyThreadApplication {

	public static void main(String[] args) throws InterruptedException {

		AtomicInteger stageCounter = new AtomicInteger();
		var stages  = new ArrayList<Thread>();
		
		for (int j = 1; j <= 20; j++) {
		
			System.out.println("!!!!! Процесс производства по детали номер №" + j + " начат !!!!!");

			var Thread1 = new Thread(new ProductionStage(stageCounter));
			stages.add(Thread1);
			Thread1.start();

			var Thread2 = new Thread(new ProductionStage(stageCounter));
			stages.add(Thread2);
			Thread2.start();
			
			Thread1.join();
			Thread2.join();

			var Thread3 = new Thread(new ProductionStage(stageCounter));
			Thread3.start();
			Thread3.join();

			
			var Thread4 = new Thread(new ProductionStage(stageCounter));
			stages.add(Thread4);
			Thread4.start();

			var Thread5 = new Thread(new ProductionStage(stageCounter));
			stages.add(Thread5);
			Thread5.start();
			
			Thread4.join();
			Thread5.join();
			
			System.out.println("===== Завершен процесс производства детали номер №" + j + " ====");
			stageCounter.set(0);
			
		}
	}
}                                                        
package ru.inordic.study15;
import ru.inordic.study15.ProductionStage;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class MyThreadApplication {

	static AtomicInteger stageCounter = new AtomicInteger();
	
	public static void main(String[] args) throws InterruptedException {

		
		for (int j = 1; j <= 20; j++) {
		
			System.out.println("!!!!! Процесс производства по детали номер №" + j + " начат !!!!!");

			var Thread1 = new Thread(new ProductionStage(stageCounter));
			var Thread2 = new Thread(new ProductionStage(stageCounter));

			Thread1.start();
			Thread2.start();
			
			Thread1.join();
			Thread2.join();

			var Thread3 = new Thread(new ProductionStage(stageCounter));
			Thread3.start();
			Thread3.join();

			
			var Thread4 = new Thread(new ProductionStage(stageCounter));
			var Thread5 = new Thread(new ProductionStage(stageCounter));

			Thread4.start();
			Thread5.start();
		
			Thread4.join();
			Thread5.join();
			
			
			var Thread6 = new Thread(new ProductionStage(stageCounter));
			Thread6.start();
			Thread6.join();
			
			System.out.println("===== Завершен процесс производства детали номер №" + j + " ====");
			stageCounter.set(0);
			
		}
	}
}                                                        
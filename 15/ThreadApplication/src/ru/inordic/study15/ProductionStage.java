package ru.inordic.study15;
import java.util.concurrent.atomic.AtomicInteger;


public class ProductionStage implements Runnable {
	
	AtomicInteger stageNum = new AtomicInteger();

	public ProductionStage(AtomicInteger stageNum) {
		super();
		this.stageNum = stageNum;
	}

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		stageNum.getAndIncrement();
		System.out.println("процесс обработки №" + stageNum);
		
	}
	
	
	

}

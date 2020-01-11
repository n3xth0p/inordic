package ru.inordic.study15;

import java.util.concurrent.atomic.AtomicInteger;


public class ProductionStage implements Runnable {

  private static AtomicInteger stageNum;

  public ProductionStage(AtomicInteger stageNum) {
    super();
    this.stageNum = stageNum;
  }


  @Override
  public void run() {
    // TODO Auto-generated method stub
    // stageNum.getAndIncrement();
    // System.out.println("процесс обработки №" + stageNum);
    if (stageNum.get() == 6) {
      System.out.println("процесс сборки выполняется");
    } else {
      var number = stageNum.getAndIncrement();
      System.out.println("процесс обработки №" + number);
    }
  }



}

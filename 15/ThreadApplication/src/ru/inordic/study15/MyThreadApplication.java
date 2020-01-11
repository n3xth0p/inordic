package ru.inordic.study15;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThreadApplication {

  // static AtomicInteger stageCounter = new AtomicInteger();

  public static void main(String[] args) throws InterruptedException {

    var stageCounter = new AtomicInteger();
    stageCounter.set(1);

    for (int j = 1; j <= 20; j++) {

      System.out.println("!!!!! Процесс производства по детали номер №" + j + " начат !!!!!");

      var thread1 = new Thread(new ProductionStage(stageCounter));
      var thread2 = new Thread(new ProductionStage(stageCounter));

      thread1.start();
      thread2.start();

      thread1.join();
      thread2.join();

      var thread3 = new Thread(new ProductionStage(stageCounter));
      thread3.start();
      thread3.join();


      var thread4 = new Thread(new ProductionStage(stageCounter));
      var thread5 = new Thread(new ProductionStage(stageCounter));

      thread4.start();
      thread5.start();

      thread4.join();
      thread5.join();


      System.out.println("===== Завершен процесс производства детали номер №" + j + " ====");
      stageCounter.set(1);
    }


    var thread6 = new Thread(new ProductionStage(stageCounter));

    System.out.println("===== Запущен финальный процесс сборки ====");

    stageCounter.set(6);
    thread6.start();
    thread6.join();

    System.out.println("===== Завершен финальный процесс сборки ====");
  }
}

package ru.inordic.study18;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

public class MoverCallable implements Callable<int[]> {

  private LinkedBlockingDeque<Integer> queue = new LinkedBlockingDeque<Integer>();
  private LinkedBlockingDeque<Integer> vector = new LinkedBlockingDeque<Integer>();

  public MoverCallable(LinkedBlockingDeque<Integer> queue, LinkedBlockingDeque<Integer> vector) {
    super();
    this.queue = queue;
    this.vector = vector;
  }

  @Override
  public int[] call() throws Exception {

    int result[] = new int[2];

    var resultMoney = 0;
    var countClients = 0;

    var currentClient = queue.poll();

    while (currentClient != null) {

      var currentPrice = vector.poll();
      resultMoney += currentPrice;
      countClients++;

      currentClient = queue.poll();
    }

    System.out.println("Hello thread!");

    result[0] = resultMoney;
    result[1] = countClients;

    return result;
  }
}


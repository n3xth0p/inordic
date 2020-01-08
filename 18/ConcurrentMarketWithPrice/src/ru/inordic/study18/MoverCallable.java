package ru.inordic.study18;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

public class MoverCallable implements Callable<Integer> {

  private LinkedBlockingDeque<Integer> queue = new LinkedBlockingDeque<Integer>();
  private LinkedBlockingDeque<Integer> vector = new LinkedBlockingDeque<Integer>();

  public MoverCallable(LinkedBlockingDeque<Integer> queue, LinkedBlockingDeque<Integer> vector) {
    super();
    this.queue = queue;
    this.vector = vector;
  }

  @Override
  public Integer call() throws Exception {

    var resultPrice = 0;
    var currentClient = queue.poll();

    while (currentClient != null) {
      var currentPrice = vector.poll();
      resultPrice += currentPrice;
      currentClient = queue.poll();
    }

    System.out.println("Hello thread!");

    return resultPrice;
  }
}


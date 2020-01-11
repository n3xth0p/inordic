package ru.inordic.study18;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class ConcurrentMarketwithPrice {

  public static void main(String[] args) throws InterruptedException, ExecutionException {

    var queue = new LinkedBlockingDeque<Integer>();
    var vector = new LinkedBlockingDeque<Integer>();
    var r = new Random();

    for (int i = 1; i <= 2000; i++) {
      queue.put(i);

      var randomNumber = r.ints(1, 1, 100).findFirst().getAsInt();
      vector.put(randomNumber);
    }

    System.out.println("=== INIT ====");
    System.out.println("queue size - " + queue.size());
    System.out.println("vector size - " + vector.size());


    var executorService = Executors.newFixedThreadPool(4);

    var counter1 = executorService.submit(new MoverCallable(queue, vector));
    var counter2 = executorService.submit(new MoverCallable(queue, vector));
    var counter3 = executorService.submit(new MoverCallable(queue, vector));
    var counter4 = executorService.submit(new MoverCallable(queue, vector));

    executorService.shutdown();

    System.out.println("=== RESULT ===");
    System.out.println("queue size - " + queue.size());
    System.out.println("vector size - " + vector.size());

    var count1 = counter1.get();
    System.out.println("Касса 1 - " + count1[0] + " рублей, клиентов обслужено - " + count1[1]);


    var count2 = counter2.get();
    System.out.println("Касса 2 - " + count2[0] + " рублей, клиентов обслужено - " + count2[1]);

    var count3 = counter3.get();
    System.out.println("Касса 3 - " + count3[0] + " рублей, клиентов обслужено - " + count3[1]);

    var count4 = counter4.get();
    System.out.println("Касса 4 - " + count4[0] + " рублей, клиентов обслужено - " + count4[1]);
  }

}

package ru.inordic.study17;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class ConcurrentMarket {

  private static LinkedBlockingDeque<Integer> clients = new LinkedBlockingDeque<Integer>();
  private static LinkedBlockingDeque<Integer> result = new LinkedBlockingDeque<Integer>();

  public static void main(String[] args) throws InterruptedException {


    for (int i = 1; i <= 2000; i++) {
      clients.add(i);
    }

    System.out.println(clients);
    System.out.println("size - " + clients.size());

    var executorService = Executors.newFixedThreadPool(4);

    for (int i = 0; i < 4; i++) {

      executorService.execute(new Runnable() {

        @Override
        public void run() {
          // TODO Auto-generated method stub
          Integer client;

          do {
            client = clients.pollFirst();
            if (client == null) {
              break;
            } else {
              result.add(client);
            }

          } while (client != null);
        }

      });
    }

    executorService.shutdown();

    System.out.println(result);
    System.out.println("size - " + result.size());

  }

}

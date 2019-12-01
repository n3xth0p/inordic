package ru.inordic.study16;

import java.util.ArrayList;
import java.util.Vector;

public class SimpleMarket {

	private static Vector<Integer> clients = new Vector<Integer>();
	private static Vector<Integer> result = new Vector<Integer>();

	private static Object object = new Object();

	public static void main(String[] args) throws InterruptedException {

		for (int i = 1; i <= 2000; i++) {
			clients.add(i);
		}

		var pool = new ArrayList<Thread>();

		System.out.println("Идентификаторы клиентов, size - " + clients.size());
		System.out.println(clients);

		for (int i = 0; i < 4; i++) {

			var kassa = new Thread(new Runnable() {

				private boolean moveElement() {
					Integer elem;

					synchronized (object) {
						if (clients.isEmpty()) {
							return false;
						} else {
							elem = clients.remove(0);
						}
					}
					result.add(elem);

					return true;
				}

				@Override
				public void run() {
					// TODO Auto-generated method stub
					while (moveElement()) {
						//
					}

				}

			});
			pool.add(kassa);
			kassa.start();
		}

		for (var thread : pool) {
			thread.join();
		}

		System.out.println("Обслуженные клиенты, size - " + result.size());
		System.out.println(result);

	}

}

package org.example;
import java.util.ArrayDeque;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

                List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");
                Queue<String>queue = new ArrayDeque<>(firstClients);

                while (!queue.isEmpty()){
                    String client = queue.poll();
                    System.out.println(client + " сделал(а) маникюр");
                    if (Math.random() < 0.5) { // проверка условия, которое срабатывает с 50% вероятностью
                        // друг записался
                        queue.offer("a friend of " + client);
                    }
                }
            }
        }
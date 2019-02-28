package heapsort;

import edu.princeton.cs.algs4.MinPQ;

public class DemoHeap {


    public static void main(String[] args) {
        MinPQ<Mail> heap = new MinPQ<>();
        for (int i = 0; i < 25; i++) {
            heap.insert(randomMail());
        }

        System.out.println("Elements in the Priorty Queue:");
        for (Mail m : heap) {
            System.out.println(m);
        }

        System.out.println("Remove elements one by one from the priority queue:");
        while (!heap.isEmpty()) {
            Mail highestPriortyMail = heap.delMin();
            System.out.println(highestPriortyMail);
        }

    }

    private static Mail randomMail() {
        return new Mail();
    }
}

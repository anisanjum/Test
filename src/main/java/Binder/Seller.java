package Binder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Seller {

    PriorityQueue<Integer> topSales;

    public Seller() {
        this.topSales = new PriorityQueue<>(3);
    }

    public void addSale(int sale) {
        if(topSales.size() < 3) {
            topSales.add(sale);
        }
        else {
            topSales.poll();
            topSales.add(sale);
        }
    }

    public double calculateBonus() {
        double sum = 0;
        for(int sale : topSales) {
            sum += sale;
        }
        return sum * 0.1;
    }

    public List<Integer> getBonusSales() {
        List<Integer> result = new ArrayList<>(topSales);
        result.sort(Collections.reverseOrder());  // Sort in descending order
        return result;
    }

    public static void main(String[] args) {
        Seller seller = new Seller();

        seller.addSale(100);
        seller.addSale(200);
        seller.addSale(300);
        seller.addSale(400);
        seller.addSale(500);

        System.out.println("Top 3 Sales: " + seller.getBonusSales());

        System.out.println("Bonus: " + seller.calculateBonus());
    }
}

package Practice2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        /*
         * DSHH
         */
        var dshh = new DSHHManagement(null);

        /*
         * List goods
         */
        List<Goods> list = new ArrayList<>();
        // Food
        String[] foodName = { "Mi tom", "Banh trang", "Hu tieu" };
        int[] foodQuantity = { 10, 20, 30 };
        double[] foodPrice = { 10000, 20000, 30000 };
        LocalDate[] manufactureDate = { LocalDate.of(2023, 1, 1), LocalDate.of(2023, 10, 1), LocalDate.of(2023, 4, 1) };
        for (int i = 0; i < 3; i++) {
            list.add(new Food(UUID.randomUUID().toString(), foodName[i], foodQuantity[i], foodPrice[i],
                    manufactureDate[i],
                    manufactureDate[i].plusMonths(6)));
        }

        // Crockery
        String[] crockeryName = { "Bat su", "Dia tron", "Dia vuong" };
        int[] crockeryQuantity = { 1, 2, 3 };
        double[] crockeryPrice = { 20000, 30000, 40000 };
        String[] crockeryInfo = { "Viet Nam", "Trung Quoc", "Nhat Ban" };
        LocalDate[] crockeryDate = { LocalDate.of(2023, 1, 1), LocalDate.of(2023, 10, 1), LocalDate.of(2023, 4, 1) };
        for (int i = 0; i < 3; i++) {
            list.add(new Crockery(UUID.randomUUID().toString(), crockeryName[i], crockeryQuantity[i], crockeryPrice[i],
                    crockeryInfo[i], crockeryDate[i]));
        }

        // Electronic
        String[] electronicName = { "Bat su", "Dia tron", "Dia vuong" };
        int[] electronicQuantity = { 1, 2, 3 };
        double[] electronicPrice = { 20000, 30000, 40000 };
        int[] electronicPeriod = { 6, 12, 24 };
        double[] electronicCapacityKw = { 12, 13, 14 };
        for (int i = 0; i < 3; i++) {
            list.add(new Electronics(UUID.randomUUID().toString(), electronicName[i], electronicQuantity[i],
                    electronicPrice[i], electronicPeriod[i], electronicCapacityKw[i]));
        }

        /*
         * Add goods to dshh
         */
        list.stream().forEach(dshh::addGoods);

        for (var item : dshh.getGoods()) {
            System.out.println(item.toString());
        }
    }
}
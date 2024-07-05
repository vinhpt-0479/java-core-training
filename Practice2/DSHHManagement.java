package Practice2;

import java.util.ArrayList;
import java.util.List;

public class DSHHManagement {
    private List<Goods> goodsList;

    public DSHHManagement(List<Goods> goods) {
        this.goodsList = goods == null ? new ArrayList<>() : goods;
    }

    public void addGoods(Goods goods) {
        if (goodsList.stream().anyMatch((e) -> e.code.equals(goods.code))) {
            throw new IllegalArgumentException("Duplicate goods's code");
        }
        this.goodsList.add(goods);
    }

    public void removeGoods(Goods goods) {
        this.goodsList.remove(goods);
    }

    public List<Goods> getGoods() {
        return goodsList;
    }

    public List<Goods> getGoodsByType(GoodsType type) {
        return switch (type) {
            case FOOD -> goodsList.stream().filter((e) -> e instanceof Food).toList();
            case ELECTRONICS -> goodsList.stream().filter((e) -> e instanceof Electronics).toList();
            case CROCKERY -> goodsList.stream().filter((e) -> e instanceof Crockery).toList();
        };
    }
}

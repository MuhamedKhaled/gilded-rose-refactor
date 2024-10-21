package com.gildedrose.strategies;

import com.gildedrose.Item;
import com.gildedrose.ItemStrategy;

public class ConjuredItemStrategy implements ItemStrategy {
    @Override
    public void updateItem(Item item) {
        if (item.quality > 0) {
            item.quality -= 2;
        }
        item.sellIn--;
        if (item.sellIn < 0 && item.quality > 0) {
            item.quality -= 2;
        }
        if (item.quality < 5) {
            item.quality = 5;
        }
    }
}

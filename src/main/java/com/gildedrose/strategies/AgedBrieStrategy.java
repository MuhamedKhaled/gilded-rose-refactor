package com.gildedrose.strategies;

import com.gildedrose.Item;
import com.gildedrose.ItemStrategy;

public class AgedBrieStrategy implements ItemStrategy {
    @Override
    public void updateItem(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
        item.sellIn--;
        if (item.sellIn < 0 && item.quality < 50) {
            item.quality++;
        }
    }
}
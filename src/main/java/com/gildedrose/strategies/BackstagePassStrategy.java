package com.gildedrose.strategies;

import com.gildedrose.Item;
import com.gildedrose.ItemStrategy;

public class BackstagePassStrategy implements ItemStrategy {

    @Override
    public void updateItem(Item item) {
        if (item.quality < 50) {
            item.quality++;
            if (item.sellIn < 11 && item.quality < 50) {
                item.quality++;
            }
            if (item.sellIn < 6 && item.quality < 50) {
                item.quality++;
            }
        }
        item.sellIn--;
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}

package com.gildedrose;

import com.gildedrose.strategies.AgedBrieStrategy;
import com.gildedrose.strategies.BackstagePassStrategy;
import com.gildedrose.strategies.NormalItemStrategy;
import com.gildedrose.strategies.SulfurasStrategy;

public class ItemStrategyFactory {
    public static ItemStrategy getStrategy(Item item) {
        switch (item.name) {
            case "Aged Brie":
                return new AgedBrieStrategy();
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasStrategy();
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePassStrategy();
            default:
                return new NormalItemStrategy();
        }
    }
}

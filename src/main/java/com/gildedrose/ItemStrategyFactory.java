package com.gildedrose;

import com.gildedrose.strategies.*;

public class ItemStrategyFactory {
    public static ItemStrategy getStrategy(Item item) {
        switch (item.name) {
            case "Aged Brie":
                return new AgedBrieStrategy();
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasStrategy();
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePassStrategy();
            case "Conjured Mana Cake":
                return new ConjuredItemStrategy();
            default:
                return new NormalItemStrategy();
        }
    }
}

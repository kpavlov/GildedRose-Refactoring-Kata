package com.gildedrose.rules;

public class SulfurasQualityRule implements QualityRule {

    @Override
    public boolean shouldApply(String itemName) {
        return "Sulfuras, Hand of Ragnaros".equals(itemName);
    }

    @Override
    public Result calculateQuality(int oldQuality, int sellIn) {
        return new Result(oldQuality, true);
    }
}
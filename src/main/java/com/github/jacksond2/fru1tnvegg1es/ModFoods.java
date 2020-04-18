package com.github.jacksond2.fru1tnvegg1es;
import net.minecraft.item.Food;

public class ModFoods {
    public static final Food PINEAPPLE;

    static{
        PINEAPPLE = new Food.Builder().hunger(3).saturation(7).build();
    }
}

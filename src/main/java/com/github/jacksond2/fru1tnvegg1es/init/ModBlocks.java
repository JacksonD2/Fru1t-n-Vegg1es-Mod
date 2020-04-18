package com.github.jacksond2.fru1tnvegg1es.init;

import com.github.jacksond2.fru1tnvegg1es.Fru1tnVegg1es;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Fru1tnVegg1es.MODID);

    public static final RegistryObject<Block> PINEAPPLE_BLOCK = BLOCKS.register("pineapple_block", () -> new Block(Block.Properties.create(Material.PLANTS)));
}

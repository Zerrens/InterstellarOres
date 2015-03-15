package com.zerren.interstellarores.registry;

import com.zerren.interstellarores.ModBlocks;
import com.zerren.interstellarores.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Zerren on 11/6/2014.
 */
public class InterstellarDictionary {

    public static void registerOreRecipes(){
        //blocks

        //moon
        OreDictionary.registerOre("oreIron", new ItemStack(ModBlocks.moonOre, 1, 0));
        OreDictionary.registerOre("oreGold", new ItemStack(ModBlocks.moonOre, 1, 1));
        OreDictionary.registerOre("oreCopper", new ItemStack(ModBlocks.moonOre, 1, 2));
        OreDictionary.registerOre("oreTin", new ItemStack(ModBlocks.moonOre, 1, 3));
        OreDictionary.registerOre("oreLead", new ItemStack(ModBlocks.moonOre, 1, 4));
        OreDictionary.registerOre("oreSilver", new ItemStack(ModBlocks.moonOre, 1, 5));
        OreDictionary.registerOre("oreNickel", new ItemStack(ModBlocks.moonOre, 1, 6));
        OreDictionary.registerOre("oreAluminum", new ItemStack(ModBlocks.moonOre, 1, 7));
        OreDictionary.registerOre("oreOsmium", new ItemStack(ModBlocks.moonOre, 1, 8));
        OreDictionary.registerOre("oreLunarium", new ItemStack(ModBlocks.moonOre, 1, 9));
        OreDictionary.registerOre("orePlatinum", new ItemStack(ModBlocks.moonOre, 1, 10));
        //mars
        OreDictionary.registerOre("oreIron", new ItemStack(ModBlocks.marsOre, 1, 0));
        OreDictionary.registerOre("oreGold", new ItemStack(ModBlocks.marsOre, 1, 1));
        OreDictionary.registerOre("oreCopper", new ItemStack(ModBlocks.marsOre, 1, 2));
        OreDictionary.registerOre("oreTin", new ItemStack(ModBlocks.marsOre, 1, 3));
        OreDictionary.registerOre("oreLead", new ItemStack(ModBlocks.marsOre, 1, 4));
        OreDictionary.registerOre("oreSilver", new ItemStack(ModBlocks.marsOre, 1, 5));
        OreDictionary.registerOre("oreNickel", new ItemStack(ModBlocks.marsOre, 1, 6));
        OreDictionary.registerOre("oreAluminum", new ItemStack(ModBlocks.marsOre, 1, 7));
        OreDictionary.registerOre("oreOsmium", new ItemStack(ModBlocks.marsOre, 1, 8));
        OreDictionary.registerOre("oreYellorium", new ItemStack(ModBlocks.marsOre, 1, 9));
        OreDictionary.registerOre("orePlatinum", new ItemStack(ModBlocks.marsOre, 1, 10));
        //asteroid
        OreDictionary.registerOre("oreDiamond", new ItemStack(ModBlocks.asteroidOre, 1, 0));
        OreDictionary.registerOre("orePlatinum", new ItemStack(ModBlocks.asteroidOre, 1, 1));
        OreDictionary.registerOre("oreCertusQuartz", new ItemStack(ModBlocks.asteroidOre, 1, 2));
        OreDictionary.registerOre("oreCertusQuartz", new ItemStack(ModBlocks.asteroidOre, 1, 3));
        //ice
        OreDictionary.registerOre("oreDiamond", new ItemStack(ModBlocks.iceOre, 1, 0));
        OreDictionary.registerOre("orePlatinum", new ItemStack(ModBlocks.iceOre, 1, 1));
        OreDictionary.registerOre("oreCertusQuartz", new ItemStack(ModBlocks.iceOre, 1, 2));
        OreDictionary.registerOre("oreCertusQuartz", new ItemStack(ModBlocks.iceOre, 1, 3));
        //metals
        OreDictionary.registerOre("blockLunarium", new ItemStack(ModBlocks.interstellarMetal, 1, 0));

        //items

        //Lunarium Chunk
        OreDictionary.registerOre("materialLunarium", new ItemStack(ModItems.lunariumMaterial, 1, 0));
        //Lunarium Plate
        OreDictionary.registerOre("plateLunarium", new ItemStack(ModItems.lunariumMaterial, 1, 1));
        OreDictionary.registerOre("compressedLunarium", new ItemStack(ModItems.lunariumMaterial, 1, 1));
    }
}

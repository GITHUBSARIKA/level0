package com.camp.main;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionHelper;

import com.camp.block.BlockMaker;
import com.camp.block.BlockRegistry;
import com.camp.block.CustomBlock;
import com.camp.item.ItemMaker;

import cpw.mods.fml.common.registry.GameRegistry;

public class PlayGround {
	static CustomBlock test;

	public static void init() {

		// creating swords and chaining
		ItemMaker.newSword("Fire").setName("Fire Sword")
				.setTexture("fire_sword");

BlockMaker.addBlock("grassblock");
ItemMaker.newSword("redsword");
BlockMaker.addBlock("creativeblock").setRecipe("ggg","aaa","bbb",'a',Items.arrow,'g',Blocks.glowstone,'b',Items.bed);
	}

}

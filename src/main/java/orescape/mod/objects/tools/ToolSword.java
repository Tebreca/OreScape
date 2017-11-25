package orescape.mod.objects.tools;

import net.minecraft.item.Item.ToolMaterial;

import java.util.Random;
import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import orescape.mod.OSMain;
import orescape.mod.init.ItemInit;
import orescape.mod.util.IHasModel;


public class ToolSword extends ItemTool implements IHasModel
{
	private static final Set<Block> EFFECTIVE_ON = null;
	public static Random gen = new Random();
	
	public static float dragonLong = (gen.nextInt(20)+1);
	public static float attackDamageIn = dragonLong;
	public ToolMaterial materialIn;
	
	
	public ToolSword(String name, ToolMaterial material)
	{
		super(material, EFFECTIVE_ON);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		attackSpeed = 5.0F;
		damageVsEntity = attackDamageIn;
		
		
		ItemInit.ITEMS.add(this);
	}
	@Override
	public void registerModels()
	{
		OSMain.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
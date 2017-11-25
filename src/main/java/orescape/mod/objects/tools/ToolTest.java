package orescape.mod.objects.tools;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.item.ItemTool;

public class ToolTest extends ItemTool
{
	protected ToolTest(float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn,
			Set<Block> effectiveBlocksIn) {
		super(attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn);
}
	{
	this.attackSpeed = 5.0F;
	}
}
package orescape.mod.objects.tools;
 
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import orescape.mod.init.*;
 
import java.util.Random;
import java.util.Set;
 
import com.google.common.collect.Sets;
 
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import orescape.mod.OSMain;
import orescape.mod.init.ItemInit;
import orescape.mod.init.ItemInit.ToolTypes;
import orescape.mod.util.IHasModel;
 
 
public class ToolSword extends ItemSword implements IHasModel
{
    private static final Set<Block> EFFECTIVE_ON = null;
    private ToolTypes typeIn;
	private float attackDamage;
	public static final ToolMaterial BRONZE = EnumHelper.addToolMaterial("tool_bronze", 0, -1, 0.0F, 0.0F, 0);
	public static final ToolMaterial IRON = EnumHelper.addToolMaterial("tool_iron", 0, -1, 0.0F, 0.0F, 0);
	public static final ToolMaterial STEEL = EnumHelper.addToolMaterial("tool_steel", 0, -1, 0.0F, 0.0F, 0);
	public static final ToolMaterial MITHRIL = EnumHelper.addToolMaterial("tool_mithril", 0, -1, 0.0F, 0.0F, 0);
	public static final ToolMaterial ADDY = EnumHelper.addToolMaterial("tool_addy", 0, -1, 0.0F, 0.0F, 0);
	public static final ToolMaterial RUNE = EnumHelper.addToolMaterial("tool_rune", 0, -1, 0.0F, 0.0F, 0);
	public static final ToolMaterial DRAGON = EnumHelper.addToolMaterial("tool_dragon", 0, -1, 0.0F, 0.0F, 0);
 
   
    public ToolSword(String name, ToolMaterial material, ToolTypes typeIn)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);
        this.typeIn=typeIn;
       
        ItemInit.ITEMS.add(this);
    }
    // Removed this method for now
    
    //@Override
   //public void onCreated(ItemStack stack, World worldIn, EntityPlayer player)
   // {
  // stack.addAttributeModifier("generic.attackDamage", new AttributeModifier("Weapon modifier", 1.2, 1), EntityEquipmentSlot.MAINHAND);
  //  }    if(this == ItemInit.SWORD_BRONZE && ItemInit.SWORD_IRON ){
               
     //   stack.addAttributeModifier("generic.attackSpeed", new AttributeModifier("Weapon modifier", 0, 1), EntityEquipmentSlot.MAINHAND);
        
    @Override
    public float getDamageVsEntity(){
    	switch(typeIn){
		case ADDY: return 3.0F;
			break;
		case BRONZE:
			break;
		case DRAGON:
			break;
		case IRON:
			break;
		case MITHRIL:
			break;
		case RUNE:
			break;
		case STEEL:
			break;
		default:
			break;
    	
    	}
    }
    private void initItem(){


    }

   
    public void registerModels()
    {
        OSMain.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
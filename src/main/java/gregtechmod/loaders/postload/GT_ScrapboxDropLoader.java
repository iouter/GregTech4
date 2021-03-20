package gregtechmod.loaders.postload;

import gregtechmod.api.enums.Materials;
import gregtechmod.api.enums.OrePrefixes;
import gregtechmod.api.util.GT_Log;
import gregtechmod.api.util.GT_ModHandler;
import gregtechmod.api.util.GT_OreDictUnificator;
import gregtechmod.common.items.GT_MetaItem_Component;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class GT_ScrapboxDropLoader implements Runnable {
	@Override
	public void run() {
        GT_Log.log.info("GT_Mod: (re-)adding Scrapbox Drops.");
        
        GT_ModHandler.addScrapboxDrop(9.50F, new ItemStack(Items.wooden_hoe));
        GT_ModHandler.addScrapboxDrop(2.00F, new ItemStack(Items.wooden_axe));
        GT_ModHandler.addScrapboxDrop(2.00F, new ItemStack(Items.wooden_sword));
        GT_ModHandler.addScrapboxDrop(2.00F, new ItemStack(Items.wooden_shovel));
        GT_ModHandler.addScrapboxDrop(2.00F, new ItemStack(Items.wooden_pickaxe));
        GT_ModHandler.addScrapboxDrop(2.00F, new ItemStack(Items.sign));
        GT_ModHandler.addScrapboxDrop(9.50F, new ItemStack(Items.stick));
        GT_ModHandler.addScrapboxDrop(5.00F, new ItemStack(Blocks.dirt));
        GT_ModHandler.addScrapboxDrop(3.00F, new ItemStack(Blocks.grass));
        GT_ModHandler.addScrapboxDrop(3.00F, new ItemStack(Blocks.gravel));
        GT_ModHandler.addScrapboxDrop(0.50F, new ItemStack(Blocks.pumpkin));
        GT_ModHandler.addScrapboxDrop(1.00F, new ItemStack(Blocks.soul_sand));
        GT_ModHandler.addScrapboxDrop(2.00F, new ItemStack(Blocks.netherrack));
        GT_ModHandler.addScrapboxDrop(1.00F, new ItemStack(Items.bone));
        GT_ModHandler.addScrapboxDrop(9.00F, new ItemStack(Items.rotten_flesh));
        GT_ModHandler.addScrapboxDrop(0.40F, new ItemStack(Items.cooked_porkchop));
        GT_ModHandler.addScrapboxDrop(0.40F, new ItemStack(Items.cooked_beef));
        GT_ModHandler.addScrapboxDrop(0.40F, new ItemStack(Items.cooked_chicken));
        GT_ModHandler.addScrapboxDrop(0.50F, new ItemStack(Items.apple));
        GT_ModHandler.addScrapboxDrop(0.50F, new ItemStack(Items.bread));
        GT_ModHandler.addScrapboxDrop(0.10F, new ItemStack(Items.cake));
        GT_ModHandler.addScrapboxDrop(1.00F, GT_ModHandler.getIC2Item("filledTinCan", 1, 0));
        GT_ModHandler.addScrapboxDrop(2.00F, GT_ModHandler.getIC2Item("filledTinCan", 1, 1));
		GT_ModHandler.addScrapboxDrop(0.20F, GT_OreDictUnificator.get(OrePrefixes.cell, Materials.Tungsten));
		GT_ModHandler.addScrapboxDrop(1.00F, GT_ModHandler.getWaterCell(1));
		GT_ModHandler.addScrapboxDrop(2.00F, GT_ModHandler.getEmptyCell(1));
        GT_ModHandler.addScrapboxDrop(5.00F, new ItemStack(Items.paper));
        GT_ModHandler.addScrapboxDrop(1.00F, new ItemStack(Items.leather));
        GT_ModHandler.addScrapboxDrop(1.00F, new ItemStack(Items.feather));
        GT_ModHandler.addScrapboxDrop(0.70F, GT_ModHandler.getIC2Item("plantBall", 1));
        GT_ModHandler.addScrapboxDrop(3.80F, GT_OreDictUnificator.get("dustWood", 1));
        GT_ModHandler.addScrapboxDrop(0.60F, new ItemStack(Items.slime_ball));
        GT_ModHandler.addScrapboxDrop(0.80F, GT_OreDictUnificator.get("itemRubber", 1));
        GT_ModHandler.addScrapboxDrop(2.70F, GT_ModHandler.getIC2Item("suBattery", 1));
		GT_ModHandler.addScrapboxDrop(0.80F, GT_MetaItem_Component.instance.getStack(22,1));
		GT_ModHandler.addScrapboxDrop(1.20F, GT_MetaItem_Component.instance.getStack(24,1));
		GT_ModHandler.addScrapboxDrop(1.80F, GT_MetaItem_Component.instance.getStack(48,1));
		GT_ModHandler.addScrapboxDrop(0.40F, GT_MetaItem_Component.instance.getStack(49,1));
		GT_ModHandler.addScrapboxDrop(0.20F, GT_MetaItem_Component.instance.getStack(50,1));
		GT_ModHandler.addScrapboxDrop(2.00F, GT_ModHandler.getIC2Item("insulatedCopperCableItem", 1));
		GT_ModHandler.addScrapboxDrop(0.40F, GT_ModHandler.getIC2Item("doubleInsulatedGoldCableItem", 1));
        GT_ModHandler.addScrapboxDrop(0.90F, new ItemStack(Items.redstone));
        GT_ModHandler.addScrapboxDrop(0.80F, new ItemStack(Items.glowstone_dust));
        GT_ModHandler.addScrapboxDrop(0.80F, GT_OreDictUnificator.get("dustCoal"		, 1));
		GT_ModHandler.addScrapboxDrop(2.50F, GT_OreDictUnificator.get("dustCharcoal"	, 1));
        GT_ModHandler.addScrapboxDrop(1.00F, GT_OreDictUnificator.get("dustIron"		, 1));
        GT_ModHandler.addScrapboxDrop(1.00F, GT_OreDictUnificator.get("dustGold"		, 1));
		GT_ModHandler.addScrapboxDrop(0.50F, GT_OreDictUnificator.get("dustSilver"		, 1));
		GT_ModHandler.addScrapboxDrop(0.50F, GT_OreDictUnificator.get("dustElectrum"	, 1));
        GT_ModHandler.addScrapboxDrop(1.20F, GT_OreDictUnificator.get("dustTin"			, 1));
        GT_ModHandler.addScrapboxDrop(1.20F, GT_OreDictUnificator.get("dustCopper"		, 1));
		GT_ModHandler.addScrapboxDrop(0.50F, GT_OreDictUnificator.get("dustBauxite"		, 1));
		GT_ModHandler.addScrapboxDrop(0.50F, GT_OreDictUnificator.get("dustAluminium"	, 1));
		GT_ModHandler.addScrapboxDrop(0.50F, GT_OreDictUnificator.get("dustLead"		, 1));
		GT_ModHandler.addScrapboxDrop(0.50F, GT_OreDictUnificator.get("dustNickel"		, 1));
		GT_ModHandler.addScrapboxDrop(0.50F, GT_OreDictUnificator.get("dustZinc"		, 1));
		GT_ModHandler.addScrapboxDrop(0.50F, GT_OreDictUnificator.get("dustBrass"		, 1));
		GT_ModHandler.addScrapboxDrop(0.50F, GT_OreDictUnificator.get("dustSteel"		, 1));
		GT_ModHandler.addScrapboxDrop(1.50F, GT_OreDictUnificator.get("dustObsidian"	, 1));
		GT_ModHandler.addScrapboxDrop(1.50F, GT_OreDictUnificator.get("dustSulfur"		, 1));
		GT_ModHandler.addScrapboxDrop(2.00F, GT_OreDictUnificator.get("dustSaltpeter"	, 1));
		GT_ModHandler.addScrapboxDrop(2.00F, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Lazurite));
		GT_ModHandler.addScrapboxDrop(2.00F, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Pyrite));
		GT_ModHandler.addScrapboxDrop(2.00F, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Calcite));
		GT_ModHandler.addScrapboxDrop(2.00F, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Sodalite));
		GT_ModHandler.addScrapboxDrop(4.00F, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Netherrack));
		GT_ModHandler.addScrapboxDrop(4.00F, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Flint));
		GT_ModHandler.addScrapboxDrop(0.03F, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Platinum));
		GT_ModHandler.addScrapboxDrop(0.03F, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Tungsten));
		GT_ModHandler.addScrapboxDrop(0.03F, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Chrome));
		GT_ModHandler.addScrapboxDrop(0.03F, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Titanium));
		GT_ModHandler.addScrapboxDrop(0.03F, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Magnesium));
		GT_ModHandler.addScrapboxDrop(0.03F, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Endstone));
		GT_ModHandler.addScrapboxDrop(0.50F, GT_OreDictUnificator.get(OrePrefixes.gem, Materials.GarnetRed));
		GT_ModHandler.addScrapboxDrop(0.50F, GT_OreDictUnificator.get(OrePrefixes.gem, Materials.GarnetYellow));
		GT_ModHandler.addScrapboxDrop(0.05F, GT_OreDictUnificator.get("gemOlivine"		, 1));
		GT_ModHandler.addScrapboxDrop(0.05F, GT_OreDictUnificator.get("gemRuby"			, 1));
		GT_ModHandler.addScrapboxDrop(0.05F, GT_OreDictUnificator.get("gemSapphire"		, 1));
		GT_ModHandler.addScrapboxDrop(0.05F, GT_OreDictUnificator.get("gemGreenSapphire", 1));
		GT_ModHandler.addScrapboxDrop(0.05F, GT_OreDictUnificator.get("gemEmerald"		, 1));
		GT_ModHandler.addScrapboxDrop(0.05F, GT_OreDictUnificator.get("gemDiamond"		, 1));
	}
}
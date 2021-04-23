package gregtechmod.common;

import java.io.File;
import java.util.Collections;
import java.util.List;

import gregtechmod.api.GregTech_API;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.profiler.Profiler;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.MinecraftException;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.EmptyChunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.chunk.storage.IChunkLoader;
import net.minecraft.world.storage.IPlayerFileData;
import net.minecraft.world.storage.ISaveHandler;
import net.minecraft.world.storage.WorldInfo;

public class GT_DummyWorld extends World {
	
	public GT_IteratorRandom mRandom = new GT_IteratorRandom();
	public ItemStack mLastSetBlock = null;
	
	public GT_DummyWorld(ISaveHandler par1iSaveHandler, String par2Str, WorldProvider par3WorldProvider, WorldSettings par4WorldSettings, Profiler par5Profiler) {
		super(par1iSaveHandler, par2Str, par4WorldSettings, par3WorldProvider, par5Profiler);
		rand = mRandom;
	}
	
	public GT_DummyWorld() {
		this(
		new ISaveHandler() {
			@Override public void saveWorldInfoWithPlayer(WorldInfo var1, NBTTagCompound var2) {}
			@Override public void saveWorldInfo(WorldInfo var1) {}
			@Override public WorldInfo loadWorldInfo() {return null;}
			@Override public IPlayerFileData getSaveHandler() {return null;}
			@Override public File getMapFileFromName(String var1) {return null;}
			@Override public IChunkLoader getChunkLoader(WorldProvider var1) {return null;}
			@Override public void flush() {}
			@Override public void checkSessionLock() throws MinecraftException {}
			@Override public String getWorldDirectoryName() {return null;}
			@Override public File getWorldDirectory() {return null;}
		},
		"DUMMY_DIMENSION",
		new WorldProvider() {
			@Override public String getDimensionName() {return "DUMMY_DIMENSION";}
		},
		new WorldSettings(new WorldInfo(new NBTTagCompound())),
		new Profiler()
		);
	}
	
	@Override
	protected IChunkProvider createChunkProvider() {
		return new GT_DummyChunkProvider();
	}
	
	@Override
	public Entity getEntityByID(int aEntityID) {
		return null;
	}
	
	@Override
	public boolean setBlock(int aX, int aY, int aZ, Block block, int aMeta, int aFlags) {
		mLastSetBlock = new ItemStack(block, 1, aMeta);
		return true;
	}
	
	@Override
    public BiomeGenBase getBiomeGenForCoords(int aX, int aZ) {
		if (aX >= 16 && aZ >= 16 && aX < 32 && aZ < 32) return BiomeGenBase.plains;
        return BiomeGenBase.ocean;
    }
    
	@Override
	public int getFullBlockLightValue(int aX, int aY, int aZ) {
		return 10;
	}
	
	@Override
	public Block getBlock(int aX, int aY, int aZ) {
		if (aX >= 16 && aZ >= 16 && aX < 32 && aZ < 32) return aY == 64 ? Blocks.grass : Blocks.air;
		return Blocks.air;
	}
	
	@Override
	public int getBlockMetadata(int aX, int aY, int aZ) {
		return 0;
	}
	
	@Override
	public boolean canBlockSeeTheSky(int aX, int aY, int aZ) {
		if (aX >= 16 && aZ >= 16 && aX < 32 && aZ < 32) return aY > 64;
		return true;
	}

	@Override
	protected int func_152379_p() {
		/* Looks like, this is neede to get render distance
		 * 
		 * Next implementation on WorldServer
		 * protected int func_152379_p() 
		 * { 
		 *    return this.mcServer.getConfigurationManager().getViewDistance();
		 * }
		 */
		
		return 0;
	}
	
	private static class GT_DummyChunkProvider implements IChunkProvider {
		@Override
		public Chunk provideChunk(int x, int z) {
			return new EmptyChunk(GregTech_API.sDummyWorld, x, z);
		}

		@Override
		public Chunk loadChunk(int x, int z) {
			return new EmptyChunk(GregTech_API.sDummyWorld, x, z);
		}

		@Override
		public List<?> getPossibleCreatures(EnumCreatureType p_73155_1_, int p_73155_2_, int p_73155_3_, int p_73155_4_) {
			return Collections.emptyList();
		}

		@Override
		public ChunkPosition func_147416_a(World p_147416_1_, String p_147416_2_, int p_147416_3_, int p_147416_4_, int p_147416_5_) {
			return null;
		}
		
		@Override public void saveExtraData() 			{}
		@Override public int getLoadedChunkCount() 		{return 0;}
		@Override public boolean unloadQueuedChunks() 	{return false;}
		@Override public boolean canSave() 				{return false;}
		@Override public void recreateStructures(int p_82695_1_, int p_82695_2_) {}
		@Override public String makeString() 			{return "GT_DummyChunkProvider";}
		@Override public boolean chunkExists(int p_73149_1_, int p_73149_2_) 				{return false;}
		@Override public boolean saveChunks(boolean p_73151_1_, IProgressUpdate p_73151_2_) {return false;}
		@Override public void populate(IChunkProvider p_73153_1_, int p_73153_2_, int p_73153_3_) {}
	}
}

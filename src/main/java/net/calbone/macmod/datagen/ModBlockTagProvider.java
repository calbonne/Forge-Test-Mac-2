package net.calbone.macmod.datagen;

import net.calbone.macmod.MacMod;
import net.calbone.macmod.block.ModBlocks;
import net.calbone.macmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProviderex extends BlockTagsProvider {
    public ModBlockTagProviderex(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MacMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.RAW_RUBY_BLOCK.get()).addTags(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                ModBlocks.SAPPHIRE_BLOCK.get(),
                ModBlocks.RAW_RUBY_BLOCK.get(),
                ModBlocks.RAW_SAPPHIRE_BLOCK.get(),
                ModBlocks.SOUND_BLOCK.get()
                );

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RAW_SAPPHIRE_BLOCK.get(),
                        ModBlocks.RAW_RUBY_BLOCK.get(),
                        ModBlocks.SOUND_BLOCK.get());
    }
}

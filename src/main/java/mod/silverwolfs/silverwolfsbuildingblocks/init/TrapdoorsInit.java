package mod.silverwolfs.silverwolfsbuildingblocks.init;

import mod.silverwolfs.silverwolfsbuildingblocks.SilverwolfsBuildingBlocks;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TrapdoorsInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SilverwolfsBuildingBlocks.MOD_ID);

    public static final RegistryObject<Block> BAMBOO_TRAPDOOR = BLOCKS.register("bamboo_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.BAMBOO).sound(SoundType.BAMBOO_SAPLING).hardnessAndResistance(0.5F,0.5F).notSolid()));
    public static final RegistryObject<Block> THATCH_TRAPDOOR = BLOCKS.register("thatch_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.PLANTS).sound(SoundType.PLANT).hardnessAndResistance(0.5F,0.5F).notSolid()));

    public static final RegistryObject<Block> BLACK_ACACIA_TRAPDOOR = BLOCKS.register("black_acacia_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> BLUE_ACACIA_TRAPDOOR = BLOCKS.register("blue_acacia_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> BROWN_ACACIA_TRAPDOOR = BLOCKS.register("brown_acacia_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> CYAN_ACACIA_TRAPDOOR = BLOCKS.register("cyan_acacia_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> GRAY_ACACIA_TRAPDOOR = BLOCKS.register("gray_acacia_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> GREEN_ACACIA_TRAPDOOR = BLOCKS.register("green_acacia_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> LIGHT_BLUE_ACACIA_TRAPDOOR = BLOCKS.register("light_blue_acacia_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> LIGHT_GRAY_ACACIA_TRAPDOOR = BLOCKS.register("light_gray_acacia_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> LIGHT_GREEN_ACACIA_TRAPDOOR = BLOCKS.register("light_green_acacia_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> MAGENTA_ACACIA_TRAPDOOR = BLOCKS.register("magenta_acacia_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> ORANGE_ACACIA_TRAPDOOR = BLOCKS.register("orange_acacia_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> PINK_ACACIA_TRAPDOOR = BLOCKS.register("pink_acacia_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> PURPLE_ACACIA_TRAPDOOR = BLOCKS.register("purple_acacia_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> RED_ACACIA_TRAPDOOR = BLOCKS.register("red_acacia_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> WHITE_ACACIA_TRAPDOOR = BLOCKS.register("white_acacia_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> YELLOW_ACACIA_TRAPDOOR = BLOCKS.register("yellow_acacia_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));

    public static final RegistryObject<Block> BLACK_BIRCH_TRAPDOOR = BLOCKS.register("black_birch_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> BLUE_BIRCH_TRAPDOOR = BLOCKS.register("blue_birch_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> BROWN_BIRCH_TRAPDOOR = BLOCKS.register("brown_birch_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> CYAN_BIRCH_TRAPDOOR = BLOCKS.register("cyan_birch_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> GRAY_BIRCH_TRAPDOOR = BLOCKS.register("gray_birch_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> GREEN_BIRCH_TRAPDOOR = BLOCKS.register("green_birch_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> LIGHT_BLUE_BIRCH_TRAPDOOR = BLOCKS.register("light_blue_birch_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> LIGHT_GRAY_BIRCH_TRAPDOOR = BLOCKS.register("light_gray_birch_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> LIGHT_GREEN_BIRCH_TRAPDOOR = BLOCKS.register("light_green_birch_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> MAGENTA_BIRCH_TRAPDOOR = BLOCKS.register("magenta_birch_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> ORANGE_BIRCH_TRAPDOOR = BLOCKS.register("orange_birch_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> PINK_BIRCH_TRAPDOOR = BLOCKS.register("pink_birch_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> PURPLE_BIRCH_TRAPDOOR = BLOCKS.register("purple_birch_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> RED_BIRCH_TRAPDOOR = BLOCKS.register("red_birch_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> WHITE_BIRCH_TRAPDOOR = BLOCKS.register("white_birch_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> YELLOW_BIRCH_TRAPDOOR = BLOCKS.register("yellow_birch_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));

    public static final RegistryObject<Block> BLACK_DARK_OAK_TRAPDOOR = BLOCKS.register("black_dark_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> BLUE_DARK_OAK_TRAPDOOR = BLOCKS.register("blue_dark_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> BROWN_DARK_OAK_TRAPDOOR = BLOCKS.register("brown_dark_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> CYAN_DARK_OAK_TRAPDOOR = BLOCKS.register("cyan_dark_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> GRAY_DARK_OAK_TRAPDOOR = BLOCKS.register("gray_dark_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> GREEN_DARK_OAK_TRAPDOOR = BLOCKS.register("green_dark_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> LIGHT_BLUE_DARK_OAK_TRAPDOOR = BLOCKS.register("light_blue_dark_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> LIGHT_GRAY_DARK_OAK_TRAPDOOR = BLOCKS.register("light_gray_dark_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> LIGHT_GREEN_DARK_OAK_TRAPDOOR = BLOCKS.register("light_green_dark_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> MAGENTA_DARK_OAK_TRAPDOOR = BLOCKS.register("magenta_dark_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> ORANGE_DARK_OAK_TRAPDOOR = BLOCKS.register("orange_dark_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> PINK_DARK_OAK_TRAPDOOR = BLOCKS.register("pink_dark_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> PURPLE_DARK_OAK_TRAPDOOR = BLOCKS.register("purple_dark_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> RED_DARK_OAK_TRAPDOOR = BLOCKS.register("red_dark_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> WHITE_DARK_OAK_TRAPDOOR = BLOCKS.register("white_dark_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> YELLOW_DARK_OAK_TRAPDOOR = BLOCKS.register("yellow_dark_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));

    public static final RegistryObject<Block> BLACK_JUNGLE_TRAPDOOR = BLOCKS.register("black_jungle_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> BLUE_JUNGLE_TRAPDOOR = BLOCKS.register("blue_jungle_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> BROWN_JUNGLE_TRAPDOOR = BLOCKS.register("brown_jungle_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> CYAN_JUNGLE_TRAPDOOR = BLOCKS.register("cyan_jungle_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> GRAY_JUNGLE_TRAPDOOR = BLOCKS.register("gray_jungle_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> GREEN_JUNGLE_TRAPDOOR = BLOCKS.register("green_jungle_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> LIGHT_BLUE_JUNGLE_TRAPDOOR = BLOCKS.register("light_blue_jungle_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> LIGHT_GRAY_JUNGLE_TRAPDOOR = BLOCKS.register("light_gray_jungle_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> LIGHT_GREEN_JUNGLE_TRAPDOOR = BLOCKS.register("light_green_jungle_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> MAGENTA_JUNGLE_TRAPDOOR = BLOCKS.register("magenta_jungle_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> ORANGE_JUNGLE_TRAPDOOR = BLOCKS.register("orange_jungle_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> PINK_JUNGLE_TRAPDOOR = BLOCKS.register("pink_jungle_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> PURPLE_JUNGLE_TRAPDOOR = BLOCKS.register("purple_jungle_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> RED_JUNGLE_TRAPDOOR = BLOCKS.register("red_jungle_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> WHITE_JUNGLE_TRAPDOOR = BLOCKS.register("white_jungle_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> YELLOW_JUNGLE_TRAPDOOR = BLOCKS.register("yellow_jungle_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));

    public static final RegistryObject<Block> BLACK_OAK_TRAPDOOR = BLOCKS.register("black_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> BLUE_OAK_TRAPDOOR = BLOCKS.register("blue_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> BROWN_OAK_TRAPDOOR = BLOCKS.register("brown_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> CYAN_OAK_TRAPDOOR = BLOCKS.register("cyan_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> GRAY_OAK_TRAPDOOR = BLOCKS.register("gray_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> GREEN_OAK_TRAPDOOR = BLOCKS.register("green_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> LIGHT_BLUE_OAK_TRAPDOOR = BLOCKS.register("light_blue_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> LIGHT_GRAY_OAK_TRAPDOOR = BLOCKS.register("light_gray_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> LIGHT_GREEN_OAK_TRAPDOOR = BLOCKS.register("light_green_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> MAGENTA_OAK_TRAPDOOR = BLOCKS.register("magenta_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> ORANGE_OAK_TRAPDOOR = BLOCKS.register("orange_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> PINK_OAK_TRAPDOOR = BLOCKS.register("pink_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> PURPLE_OAK_TRAPDOOR = BLOCKS.register("purple_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> RED_OAK_TRAPDOOR = BLOCKS.register("red_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> WHITE_OAK_TRAPDOOR = BLOCKS.register("white_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> YELLOW_OAK_TRAPDOOR = BLOCKS.register("yellow_oak_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));

    public static final RegistryObject<Block> BLACK_SPRUCE_TRAPDOOR = BLOCKS.register("black_spruce_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> BLUE_SPRUCE_TRAPDOOR = BLOCKS.register("blue_spruce_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> BROWN_SPRUCE_TRAPDOOR = BLOCKS.register("brown_spruce_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> CYAN_SPRUCE_TRAPDOOR = BLOCKS.register("cyan_spruce_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> GRAY_SPRUCE_TRAPDOOR = BLOCKS.register("gray_spruce_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> GREEN_SPRUCE_TRAPDOOR = BLOCKS.register("green_spruce_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> LIGHT_BLUE_SPRUCE_TRAPDOOR = BLOCKS.register("light_blue_spruce_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> LIGHT_GRAY_SPRUCE_TRAPDOOR = BLOCKS.register("light_gray_spruce_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> LIGHT_GREEN_SPRUCE_TRAPDOOR = BLOCKS.register("light_green_spruce_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> MAGENTA_SPRUCE_TRAPDOOR = BLOCKS.register("magenta_spruce_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> ORANGE_SPRUCE_TRAPDOOR = BLOCKS.register("orange_spruce_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> PINK_SPRUCE_TRAPDOOR = BLOCKS.register("pink_spruce_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> PURPLE_SPRUCE_TRAPDOOR = BLOCKS.register("purple_spruce_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> RED_SPRUCE_TRAPDOOR = BLOCKS.register("red_spruce_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> WHITE_SPRUCE_TRAPDOOR = BLOCKS.register("white_spruce_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));
    public static final RegistryObject<Block> YELLOW_SPRUCE_TRAPDOOR = BLOCKS.register("yellow_spruce_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F,3.0F).harvestTool(ToolType.AXE).notSolid()));

}

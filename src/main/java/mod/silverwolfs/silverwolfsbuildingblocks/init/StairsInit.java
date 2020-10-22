package mod.silverwolfs.silverwolfsbuildingblocks.init;

import mod.silverwolfs.silverwolfsbuildingblocks.SilverwolfsBuildingBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class StairsInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SilverwolfsBuildingBlocks.MOD_ID);

    //Stairs
    public static final RegistryObject<Block> THATCH_STAIRS = BLOCKS.register("thatch_stairs", () -> new StairsBlock(() -> BlockInit.THATCH_BLOCK.get().getDefaultState() , Block.Properties.from(BlockInit.THATCH_BLOCK.get())));
    public static final RegistryObject<Block> BAMBOO_STAIRS = BLOCKS.register("bamboo_stairs", () -> new StairsBlock(() -> BlockInit.BAMBOO_BLOCK.get().getDefaultState() , Block.Properties.from(BlockInit.BAMBOO_BLOCK.get())));

    public static final RegistryObject<Block> MOSSY_STONE_STAIRS = BLOCKS.register("mossy_stone_stairs", () -> new StairsBlock(() -> BlockInit.MOSSY_STONE.get().getDefaultState() , Block.Properties.from(BlockInit.MOSSY_STONE.get())));
    public static final RegistryObject<Block> MORE_MOSSY_STONE_STAIRS = BLOCKS.register("more_mossy_stone_stairs", () -> new StairsBlock(() -> BlockInit.MORE_MOSSY_STONE.get().getDefaultState() , Block.Properties.from(BlockInit.MORE_MOSSY_STONE.get())));
    public static final RegistryObject<Block> MOSSY_ANDESITE_STAIRS = BLOCKS.register("mossy_andesite_stairs", () -> new StairsBlock(() -> BlockInit.MOSSY_ANDESITE.get().getDefaultState() , Block.Properties.from(BlockInit.MOSSY_ANDESITE.get())));
    public static final RegistryObject<Block> MORE_MOSSY_ANDESITE_STAIRS = BLOCKS.register("more_mossy_andesite_stairs", () -> new StairsBlock(() -> BlockInit.MORE_MOSSY_ANDESITE.get().getDefaultState() , Block.Properties.from(BlockInit.MORE_MOSSY_ANDESITE.get())));

    public static final RegistryObject<Block> BLACK_BRICKS_STAIRS = BLOCKS.register("black_bricks_stairs", () -> new StairsBlock(() -> BlockInit.BLACK_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.BLACK_BRICKS.get())));
    public static final RegistryObject<Block> BLUE_BRICKS_STAIRS = BLOCKS.register("blue_bricks_stairs", () -> new StairsBlock(() -> BlockInit.BLUE_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.BLUE_BRICKS.get())));
    public static final RegistryObject<Block> BROWN_BRICKS_STAIRS = BLOCKS.register("brown_bricks_stairs", () -> new StairsBlock(() -> BlockInit.BROWN_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.BROWN_BRICKS.get())));
    public static final RegistryObject<Block> CYAN_BRICKS_STAIRS = BLOCKS.register("cyan_bricks_stairs", () -> new StairsBlock(() -> BlockInit.CYAN_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.CYAN_BRICKS.get())));
    public static final RegistryObject<Block> GRAY_BRICKS_STAIRS = BLOCKS.register("gray_bricks_stairs", () -> new StairsBlock(() -> BlockInit.GRAY_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.GRAY_BRICKS.get())));
    public static final RegistryObject<Block> GREEN_BRICKS_STAIRS = BLOCKS.register("green_bricks_stairs", () -> new StairsBlock(() -> BlockInit.GREEN_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.GREEN_BRICKS.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_BRICKS_STAIRS = BLOCKS.register("light_blue_bricks_stairs", () -> new StairsBlock(() -> BlockInit.LIGHT_BLUE_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.LIGHT_BLUE_BRICKS.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_BRICKS_STAIRS = BLOCKS.register("light_gray_bricks_stairs", () -> new StairsBlock(() -> BlockInit.LIGHT_GRAY_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.LIGHT_GRAY_BRICKS.get())));
    public static final RegistryObject<Block> LIGHT_GREEN_BRICKS_STAIRS = BLOCKS.register("light_green_bricks_stairs", () -> new StairsBlock(() -> BlockInit.LIGHT_GREEN_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.LIGHT_GREEN_BRICKS.get())));
    public static final RegistryObject<Block> MAGENTA_BRICKS_STAIRS = BLOCKS.register("magenta_bricks_stairs", () -> new StairsBlock(() -> BlockInit.MAGENTA_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.MAGENTA_BRICKS.get())));
    public static final RegistryObject<Block> ORANGE_BRICKS_STAIRS = BLOCKS.register("orange_bricks_stairs", () -> new StairsBlock(() -> BlockInit.ORANGE_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.ORANGE_BRICKS.get())));
    public static final RegistryObject<Block> PINK_BRICKS_STAIRS = BLOCKS.register("pink_bricks_stairs", () -> new StairsBlock(() -> BlockInit.PINK_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.PINK_BRICKS.get())));
    public static final RegistryObject<Block> PURPLE_BRICKS_STAIRS = BLOCKS.register("purple_bricks_stairs", () -> new StairsBlock(() -> BlockInit.PURPLE_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.PURPLE_BRICKS.get())));
    public static final RegistryObject<Block> RED_BRICKS_STAIRS = BLOCKS.register("red_bricks_stairs", () -> new StairsBlock(() -> BlockInit.RED_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.RED_BRICKS.get())));
    public static final RegistryObject<Block> WHITE_BRICKS_STAIRS = BLOCKS.register("white_bricks_stairs", () -> new StairsBlock(() -> BlockInit.WHITE_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.WHITE_BRICKS.get())));
    public static final RegistryObject<Block> YELLOW_BRICKS_STAIRS = BLOCKS.register("yellow_bricks_stairs", () -> new StairsBlock(() -> BlockInit.YELLOW_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.YELLOW_BRICKS.get())));

    public static final RegistryObject<Block> BLACK_STONE_BRICK_STAIRS = BLOCKS.register("black_stone_brick_stairs", () -> new StairsBlock(() -> BlockInit.BLACK_STONE_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.BLACK_STONE_BRICKS.get())));
    public static final RegistryObject<Block> BLUE_STONE_BRICK_STAIRS = BLOCKS.register("blue_stone_brick_stairs", () -> new StairsBlock(() -> BlockInit.BLUE_STONE_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.BLUE_STONE_BRICKS.get())));
    public static final RegistryObject<Block> BROWN_STONE_BRICK_STAIRS = BLOCKS.register("brown_stone_brick_stairs", () -> new StairsBlock(() -> BlockInit.BROWN_STONE_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.BROWN_STONE_BRICKS.get())));
    public static final RegistryObject<Block> CYAN_STONE_BRICK_STAIRS = BLOCKS.register("cyan_stone_brick_stairs", () -> new StairsBlock(() -> BlockInit.CYAN_STONE_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.CYAN_STONE_BRICKS.get())));
    public static final RegistryObject<Block> GRAY_STONE_BRICK_STAIRS = BLOCKS.register("gray_stone_brick_stairs", () -> new StairsBlock(() -> BlockInit.GRAY_STONE_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.GRAY_STONE_BRICKS.get())));
    public static final RegistryObject<Block> GREEN_STONE_BRICK_STAIRS = BLOCKS.register("green_stone_brick_stairs", () -> new StairsBlock(() -> BlockInit.GREEN_STONE_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.GREEN_STONE_BRICKS.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_STONE_BRICK_STAIRS = BLOCKS.register("light_blue_stone_brick_stairs", () -> new StairsBlock(() -> BlockInit.LIGHT_BLUE_STONE_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.LIGHT_BLUE_STONE_BRICKS.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_STONE_BRICK_STAIRS = BLOCKS.register("light_gray_stone_brick_stairs", () -> new StairsBlock(() -> BlockInit.LIGHT_GRAY_STONE_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.LIGHT_GRAY_STONE_BRICKS.get())));
    public static final RegistryObject<Block> LIGHT_GREEN_STONE_BRICK_STAIRS = BLOCKS.register("light_green_stone_brick_stairs", () -> new StairsBlock(() -> BlockInit.LIGHT_GREEN_STONE_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.LIGHT_GREEN_STONE_BRICKS.get())));
    public static final RegistryObject<Block> MAGENTA_STONE_BRICK_STAIRS = BLOCKS.register("magenta_stone_brick_stairs", () -> new StairsBlock(() -> BlockInit.MAGENTA_STONE_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.MAGENTA_STONE_BRICKS.get())));
    public static final RegistryObject<Block> ORANGE_STONE_BRICK_STAIRS = BLOCKS.register("orange_stone_brick_stairs", () -> new StairsBlock(() -> BlockInit.ORANGE_STONE_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.ORANGE_STONE_BRICKS.get())));
    public static final RegistryObject<Block> PINK_STONE_BRICK_STAIRS = BLOCKS.register("pink_stone_brick_stairs", () -> new StairsBlock(() -> BlockInit.PINK_STONE_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.PINK_STONE_BRICKS.get())));
    public static final RegistryObject<Block> PURPLE_STONE_BRICK_STAIRS = BLOCKS.register("purple_stone_brick_stairs", () -> new StairsBlock(() -> BlockInit.PURPLE_STONE_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.PURPLE_STONE_BRICKS.get())));
    public static final RegistryObject<Block> RED_STONE_BRICK_STAIRS = BLOCKS.register("red_stone_brick_stairs", () -> new StairsBlock(() -> BlockInit.RED_STONE_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.RED_STONE_BRICKS.get())));
    public static final RegistryObject<Block> WHITE_STONE_BRICK_STAIRS = BLOCKS.register("white_stone_brick_stairs", () -> new StairsBlock(() -> BlockInit.WHITE_STONE_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.WHITE_STONE_BRICKS.get())));
    public static final RegistryObject<Block> YELLOW_STONE_BRICK_STAIRS = BLOCKS.register("yellow_stone_brick_stairs", () -> new StairsBlock(() -> BlockInit.YELLOW_STONE_BRICKS.get().getDefaultState() , Block.Properties.from(BlockInit.YELLOW_STONE_BRICKS.get())));

    public static final RegistryObject<Block> BLACK_STAINED_ACACIA_STAIRS = BLOCKS.register("black_stained_acacia_stairs", () -> new StairsBlock(() -> BlockInit.BLACK_STAINED_ACACIA_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.BLACK_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> BLUE_STAINED_ACACIA_STAIRS = BLOCKS.register("blue_stained_acacia_stairs", () -> new StairsBlock(() -> BlockInit.BLUE_STAINED_ACACIA_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.BLUE_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> BROWN_STAINED_ACACIA_STAIRS = BLOCKS.register("brown_stained_acacia_stairs", () -> new StairsBlock(() -> BlockInit.BROWN_STAINED_ACACIA_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.BROWN_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> CYAN_STAINED_ACACIA_STAIRS = BLOCKS.register("cyan_stained_acacia_stairs", () -> new StairsBlock(() -> BlockInit.CYAN_STAINED_ACACIA_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.CYAN_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> GRAY_STAINED_ACACIA_STAIRS = BLOCKS.register("gray_stained_acacia_stairs", () -> new StairsBlock(() -> BlockInit.GRAY_STAINED_ACACIA_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.GRAY_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> GREEN_STAINED_ACACIA_STAIRS = BLOCKS.register("green_stained_acacia_stairs", () -> new StairsBlock(() -> BlockInit.GREEN_STAINED_ACACIA_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.GREEN_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_ACACIA_STAIRS = BLOCKS.register("light_blue_stained_acacia_stairs", () -> new StairsBlock(() -> BlockInit.LIGHT_BLUE_STAINED_ACACIA_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.LIGHT_BLUE_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_ACACIA_STAIRS = BLOCKS.register("light_gray_stained_acacia_stairs", () -> new StairsBlock(() -> BlockInit.LIGHT_GRAY_STAINED_ACACIA_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.LIGHT_GRAY_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GREEN_STAINED_ACACIA_STAIRS = BLOCKS.register("light_green_stained_acacia_stairs", () -> new StairsBlock(() -> BlockInit.LIGHT_GREEN_STAINED_ACACIA_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.LIGHT_GREEN_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> MAGENTA_STAINED_ACACIA_STAIRS = BLOCKS.register("magenta_stained_acacia_stairs", () -> new StairsBlock(() -> BlockInit.MAGENTA_STAINED_ACACIA_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.MAGENTA_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> ORANGE_STAINED_ACACIA_STAIRS = BLOCKS.register("orange_stained_acacia_stairs", () -> new StairsBlock(() -> BlockInit.ORANGE_STAINED_ACACIA_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.ORANGE_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> PINK_STAINED_ACACIA_STAIRS = BLOCKS.register("pink_stained_acacia_stairs", () -> new StairsBlock(() -> BlockInit.PINK_STAINED_ACACIA_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.PINK_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> PURPLE_STAINED_ACACIA_STAIRS = BLOCKS.register("purple_stained_acacia_stairs", () -> new StairsBlock(() -> BlockInit.PURPLE_STAINED_ACACIA_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.PURPLE_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> RED_STAINED_ACACIA_STAIRS = BLOCKS.register("red_stained_acacia_stairs", () -> new StairsBlock(() -> BlockInit.RED_STAINED_ACACIA_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.RED_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> WHITE_STAINED_ACACIA_STAIRS = BLOCKS.register("white_stained_acacia_stairs", () -> new StairsBlock(() -> BlockInit.WHITE_STAINED_ACACIA_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.WHITE_STAINED_ACACIA_PLANKS.get())));
    public static final RegistryObject<Block> YELLOW_STAINED_ACACIA_STAIRS = BLOCKS.register("yellow_stained_acacia_stairs", () -> new StairsBlock(() -> BlockInit.YELLOW_STAINED_ACACIA_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.YELLOW_STAINED_ACACIA_PLANKS.get())));

    public static final RegistryObject<Block> BLACK_STAINED_BIRCH_STAIRS = BLOCKS.register("black_stained_birch_stairs", () -> new StairsBlock(() -> BlockInit.BLACK_STAINED_BIRCH_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.BLACK_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> BLUE_STAINED_BIRCH_STAIRS = BLOCKS.register("blue_stained_birch_stairs", () -> new StairsBlock(() -> BlockInit.BLUE_STAINED_BIRCH_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.BLUE_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> BROWN_STAINED_BIRCH_STAIRS = BLOCKS.register("brown_stained_birch_stairs", () -> new StairsBlock(() -> BlockInit.BROWN_STAINED_BIRCH_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.BROWN_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> CYAN_STAINED_BIRCH_STAIRS = BLOCKS.register("cyan_stained_birch_stairs", () -> new StairsBlock(() -> BlockInit.CYAN_STAINED_BIRCH_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.CYAN_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> GRAY_STAINED_BIRCH_STAIRS = BLOCKS.register("gray_stained_birch_stairs", () -> new StairsBlock(() -> BlockInit.GRAY_STAINED_BIRCH_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.GRAY_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> GREEN_STAINED_BIRCH_STAIRS = BLOCKS.register("green_stained_birch_stairs", () -> new StairsBlock(() -> BlockInit.GREEN_STAINED_BIRCH_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.GREEN_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_BIRCH_STAIRS = BLOCKS.register("light_blue_stained_birch_stairs", () -> new StairsBlock(() -> BlockInit.LIGHT_BLUE_STAINED_BIRCH_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.LIGHT_BLUE_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_BIRCH_STAIRS = BLOCKS.register("light_gray_stained_birch_stairs", () -> new StairsBlock(() -> BlockInit.LIGHT_GRAY_STAINED_BIRCH_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.LIGHT_GRAY_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GREEN_STAINED_BIRCH_STAIRS = BLOCKS.register("light_green_stained_birch_stairs", () -> new StairsBlock(() -> BlockInit.LIGHT_GREEN_STAINED_BIRCH_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.LIGHT_GREEN_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> MAGENTA_STAINED_BIRCH_STAIRS = BLOCKS.register("magenta_stained_birch_stairs", () -> new StairsBlock(() -> BlockInit.MAGENTA_STAINED_BIRCH_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.MAGENTA_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> ORANGE_STAINED_BIRCH_STAIRS = BLOCKS.register("orange_stained_birch_stairs", () -> new StairsBlock(() -> BlockInit.ORANGE_STAINED_BIRCH_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.ORANGE_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> PINK_STAINED_BIRCH_STAIRS = BLOCKS.register("pink_stained_birch_stairs", () -> new StairsBlock(() -> BlockInit.PINK_STAINED_BIRCH_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.PINK_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> PURPLE_STAINED_BIRCH_STAIRS = BLOCKS.register("purple_stained_birch_stairs", () -> new StairsBlock(() -> BlockInit.PURPLE_STAINED_BIRCH_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.PURPLE_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> RED_STAINED_BIRCH_STAIRS = BLOCKS.register("red_stained_birch_stairs", () -> new StairsBlock(() -> BlockInit.RED_STAINED_BIRCH_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.RED_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> WHITE_STAINED_BIRCH_STAIRS = BLOCKS.register("white_stained_birch_stairs", () -> new StairsBlock(() -> BlockInit.WHITE_STAINED_BIRCH_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.WHITE_STAINED_BIRCH_PLANKS.get())));
    public static final RegistryObject<Block> YELLOW_STAINED_BIRCH_STAIRS = BLOCKS.register("yellow_stained_birch_stairs", () -> new StairsBlock(() -> BlockInit.YELLOW_STAINED_BIRCH_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.YELLOW_STAINED_BIRCH_PLANKS.get())));

    public static final RegistryObject<Block> BLACK_STAINED_DARK_OAK_STAIRS = BLOCKS.register("black_stained_dark_oak_stairs", () -> new StairsBlock(() -> BlockInit.BLACK_STAINED_DARK_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.BLACK_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> BLUE_STAINED_DARK_OAK_STAIRS = BLOCKS.register("blue_stained_dark_oak_stairs", () -> new StairsBlock(() -> BlockInit.BLUE_STAINED_DARK_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.BLUE_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> BROWN_STAINED_DARK_OAK_STAIRS = BLOCKS.register("brown_stained_dark_oak_stairs", () -> new StairsBlock(() -> BlockInit.BROWN_STAINED_DARK_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.BROWN_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> CYAN_STAINED_DARK_OAK_STAIRS = BLOCKS.register("cyan_stained_dark_oak_stairs", () -> new StairsBlock(() -> BlockInit.CYAN_STAINED_DARK_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.CYAN_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> GRAY_STAINED_DARK_OAK_STAIRS = BLOCKS.register("gray_stained_dark_oak_stairs", () -> new StairsBlock(() -> BlockInit.GRAY_STAINED_DARK_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.GRAY_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> GREEN_STAINED_DARK_OAK_STAIRS = BLOCKS.register("green_stained_dark_oak_stairs", () -> new StairsBlock(() -> BlockInit.GREEN_STAINED_DARK_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.GREEN_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_DARK_OAK_STAIRS = BLOCKS.register("light_blue_stained_dark_oak_stairs", () -> new StairsBlock(() -> BlockInit.LIGHT_BLUE_STAINED_DARK_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.LIGHT_BLUE_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_DARK_OAK_STAIRS = BLOCKS.register("light_gray_stained_dark_oak_stairs", () -> new StairsBlock(() -> BlockInit.LIGHT_GRAY_STAINED_DARK_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.LIGHT_GRAY_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GREEN_STAINED_DARK_OAK_STAIRS = BLOCKS.register("light_green_stained_dark_oak_stairs", () -> new StairsBlock(() -> BlockInit.LIGHT_GREEN_STAINED_DARK_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.LIGHT_GREEN_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> MAGENTA_STAINED_DARK_OAK_STAIRS = BLOCKS.register("magenta_stained_dark_oak_stairs", () -> new StairsBlock(() -> BlockInit.MAGENTA_STAINED_DARK_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.MAGENTA_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> ORANGE_STAINED_DARK_OAK_STAIRS = BLOCKS.register("orange_stained_dark_oak_stairs", () -> new StairsBlock(() -> BlockInit.ORANGE_STAINED_DARK_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.ORANGE_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> PINK_STAINED_DARK_OAK_STAIRS = BLOCKS.register("pink_stained_dark_oak_stairs", () -> new StairsBlock(() -> BlockInit.PINK_STAINED_DARK_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.PINK_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> PURPLE_STAINED_DARK_OAK_STAIRS = BLOCKS.register("purple_stained_dark_oak_stairs", () -> new StairsBlock(() -> BlockInit.PURPLE_STAINED_DARK_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.PURPLE_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> RED_STAINED_DARK_OAK_STAIRS = BLOCKS.register("red_stained_dark_oak_stairs", () -> new StairsBlock(() -> BlockInit.RED_STAINED_DARK_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.RED_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> WHITE_STAINED_DARK_OAK_STAIRS = BLOCKS.register("white_stained_dark_oak_stairs", () -> new StairsBlock(() -> BlockInit.WHITE_STAINED_DARK_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.WHITE_STAINED_DARK_OAK_PLANKS.get())));
    public static final RegistryObject<Block> YELLOW_STAINED_DARK_OAK_STAIRS = BLOCKS.register("yellow_stained_dark_oak_stairs", () -> new StairsBlock(() -> BlockInit.YELLOW_STAINED_DARK_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.YELLOW_STAINED_DARK_OAK_PLANKS.get())));

    public static final RegistryObject<Block> BLACK_STAINED_JUNGLE_STAIRS = BLOCKS.register("black_stained_jungle_stairs", () -> new StairsBlock(() -> BlockInit.BLACK_STAINED_JUNGLE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.BLACK_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> BLUE_STAINED_JUNGLE_STAIRS = BLOCKS.register("blue_stained_jungle_stairs", () -> new StairsBlock(() -> BlockInit.BLUE_STAINED_JUNGLE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.BLUE_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> BROWN_STAINED_JUNGLE_STAIRS = BLOCKS.register("brown_stained_jungle_stairs", () -> new StairsBlock(() -> BlockInit.BROWN_STAINED_JUNGLE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.BROWN_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> CYAN_STAINED_JUNGLE_STAIRS = BLOCKS.register("cyan_stained_jungle_stairs", () -> new StairsBlock(() -> BlockInit.CYAN_STAINED_JUNGLE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.CYAN_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> GRAY_STAINED_JUNGLE_STAIRS = BLOCKS.register("gray_stained_jungle_stairs", () -> new StairsBlock(() -> BlockInit.GRAY_STAINED_JUNGLE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.GRAY_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> GREEN_STAINED_JUNGLE_STAIRS = BLOCKS.register("green_stained_jungle_stairs", () -> new StairsBlock(() -> BlockInit.GREEN_STAINED_JUNGLE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.GREEN_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_JUNGLE_STAIRS = BLOCKS.register("light_blue_stained_jungle_stairs", () -> new StairsBlock(() -> BlockInit.LIGHT_BLUE_STAINED_JUNGLE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.LIGHT_BLUE_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_JUNGLE_STAIRS = BLOCKS.register("light_gray_stained_jungle_stairs", () -> new StairsBlock(() -> BlockInit.LIGHT_GRAY_STAINED_JUNGLE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.LIGHT_GRAY_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GREEN_STAINED_JUNGLE_STAIRS = BLOCKS.register("light_green_stained_jungle_stairs", () -> new StairsBlock(() -> BlockInit.LIGHT_GREEN_STAINED_JUNGLE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.LIGHT_GREEN_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> MAGENTA_STAINED_JUNGLE_STAIRS = BLOCKS.register("magenta_stained_jungle_stairs", () -> new StairsBlock(() -> BlockInit.MAGENTA_STAINED_JUNGLE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.MAGENTA_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> ORANGE_STAINED_JUNGLE_STAIRS = BLOCKS.register("orange_stained_jungle_stairs", () -> new StairsBlock(() -> BlockInit.ORANGE_STAINED_JUNGLE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.ORANGE_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> PINK_STAINED_JUNGLE_STAIRS = BLOCKS.register("pink_stained_jungle_stairs", () -> new StairsBlock(() -> BlockInit.PINK_STAINED_JUNGLE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.PINK_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> PURPLE_STAINED_JUNGLE_STAIRS = BLOCKS.register("purple_stained_jungle_stairs", () -> new StairsBlock(() -> BlockInit.PURPLE_STAINED_JUNGLE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.PURPLE_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> RED_STAINED_JUNGLE_STAIRS = BLOCKS.register("red_stained_jungle_stairs", () -> new StairsBlock(() -> BlockInit.RED_STAINED_JUNGLE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.RED_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> WHITE_STAINED_JUNGLE_STAIRS = BLOCKS.register("white_stained_jungle_stairs", () -> new StairsBlock(() -> BlockInit.WHITE_STAINED_JUNGLE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.WHITE_STAINED_JUNGLE_PLANKS.get())));
    public static final RegistryObject<Block> YELLOW_STAINED_JUNGLE_STAIRS = BLOCKS.register("yellow_stained_jungle_stairs", () -> new StairsBlock(() -> BlockInit.YELLOW_STAINED_JUNGLE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.YELLOW_STAINED_JUNGLE_PLANKS.get())));

    public static final RegistryObject<Block> BLACK_STAINED_OAK_STAIRS = BLOCKS.register("black_stained_oak_stairs", () -> new StairsBlock(() -> BlockInit.BLACK_STAINED_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.BLACK_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> BLUE_STAINED_OAK_STAIRS = BLOCKS.register("blue_stained_oak_stairs", () -> new StairsBlock(() -> BlockInit.BLUE_STAINED_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.BLUE_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> BROWN_STAINED_OAK_STAIRS = BLOCKS.register("brown_stained_oak_stairs", () -> new StairsBlock(() -> BlockInit.BROWN_STAINED_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.BROWN_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> CYAN_STAINED_OAK_STAIRS = BLOCKS.register("cyan_stained_oak_stairs", () -> new StairsBlock(() -> BlockInit.CYAN_STAINED_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.CYAN_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> GRAY_STAINED_OAK_STAIRS = BLOCKS.register("gray_stained_oak_stairs", () -> new StairsBlock(() -> BlockInit.GRAY_STAINED_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.GRAY_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> GREEN_STAINED_OAK_STAIRS = BLOCKS.register("green_stained_oak_stairs", () -> new StairsBlock(() -> BlockInit.GREEN_STAINED_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.GREEN_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_OAK_STAIRS = BLOCKS.register("light_blue_stained_oak_stairs", () -> new StairsBlock(() -> BlockInit.LIGHT_BLUE_STAINED_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.LIGHT_BLUE_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_OAK_STAIRS = BLOCKS.register("light_gray_stained_oak_stairs", () -> new StairsBlock(() -> BlockInit.LIGHT_GRAY_STAINED_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.LIGHT_GRAY_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GREEN_STAINED_OAK_STAIRS = BLOCKS.register("light_green_stained_oak_stairs", () -> new StairsBlock(() -> BlockInit.LIGHT_GREEN_STAINED_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.LIGHT_GREEN_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> MAGENTA_STAINED_OAK_STAIRS = BLOCKS.register("magenta_stained_oak_stairs", () -> new StairsBlock(() -> BlockInit.MAGENTA_STAINED_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.MAGENTA_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> ORANGE_STAINED_OAK_STAIRS = BLOCKS.register("orange_stained_oak_stairs", () -> new StairsBlock(() -> BlockInit.ORANGE_STAINED_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.ORANGE_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> PINK_STAINED_OAK_STAIRS = BLOCKS.register("pink_stained_oak_stairs", () -> new StairsBlock(() -> BlockInit.PINK_STAINED_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.PINK_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> PURPLE_STAINED_OAK_STAIRS = BLOCKS.register("purple_stained_oak_stairs", () -> new StairsBlock(() -> BlockInit.PURPLE_STAINED_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.PURPLE_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> RED_STAINED_OAK_STAIRS = BLOCKS.register("red_stained_oak_stairs", () -> new StairsBlock(() -> BlockInit.RED_STAINED_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.RED_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> WHITE_STAINED_OAK_STAIRS = BLOCKS.register("white_stained_oak_stairs", () -> new StairsBlock(() -> BlockInit.WHITE_STAINED_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.WHITE_STAINED_OAK_PLANKS.get())));
    public static final RegistryObject<Block> YELLOW_STAINED_OAK_STAIRS = BLOCKS.register("yellow_stained_oak_stairs", () -> new StairsBlock(() -> BlockInit.YELLOW_STAINED_OAK_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.YELLOW_STAINED_OAK_PLANKS.get())));

    public static final RegistryObject<Block> BLACK_STAINED_SPRUCE_STAIRS = BLOCKS.register("black_stained_spruce_stairs", () -> new StairsBlock(() -> BlockInit.BLACK_STAINED_SPRUCE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.BLACK_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> BLUE_STAINED_SPRUCE_STAIRS = BLOCKS.register("blue_stained_spruce_stairs", () -> new StairsBlock(() -> BlockInit.BLUE_STAINED_SPRUCE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.BLUE_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> BROWN_STAINED_SPRUCE_STAIRS = BLOCKS.register("brown_stained_spruce_stairs", () -> new StairsBlock(() -> BlockInit.BROWN_STAINED_SPRUCE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.BROWN_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> CYAN_STAINED_SPRUCE_STAIRS = BLOCKS.register("cyan_stained_spruce_stairs", () -> new StairsBlock(() -> BlockInit.CYAN_STAINED_SPRUCE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.CYAN_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> GRAY_STAINED_SPRUCE_STAIRS = BLOCKS.register("gray_stained_spruce_stairs", () -> new StairsBlock(() -> BlockInit.GRAY_STAINED_SPRUCE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.GRAY_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> GREEN_STAINED_SPRUCE_STAIRS = BLOCKS.register("green_stained_spruce_stairs", () -> new StairsBlock(() -> BlockInit.GREEN_STAINED_SPRUCE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.GREEN_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_SPRUCE_STAIRS = BLOCKS.register("light_blue_stained_spruce_stairs", () -> new StairsBlock(() -> BlockInit.LIGHT_BLUE_STAINED_SPRUCE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.LIGHT_BLUE_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_SPRUCE_STAIRS = BLOCKS.register("light_gray_stained_spruce_stairs", () -> new StairsBlock(() -> BlockInit.LIGHT_GRAY_STAINED_SPRUCE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.LIGHT_GRAY_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> LIGHT_GREEN_STAINED_SPRUCE_STAIRS = BLOCKS.register("light_green_stained_spruce_stairs", () -> new StairsBlock(() -> BlockInit.LIGHT_GREEN_STAINED_SPRUCE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.LIGHT_GREEN_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> MAGENTA_STAINED_SPRUCE_STAIRS = BLOCKS.register("magenta_stained_spruce_stairs", () -> new StairsBlock(() -> BlockInit.MAGENTA_STAINED_SPRUCE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.MAGENTA_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> ORANGE_STAINED_SPRUCE_STAIRS = BLOCKS.register("orange_stained_spruce_stairs", () -> new StairsBlock(() -> BlockInit.ORANGE_STAINED_SPRUCE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.ORANGE_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> PINK_STAINED_SPRUCE_STAIRS = BLOCKS.register("pink_stained_spruce_stairs", () -> new StairsBlock(() -> BlockInit.PINK_STAINED_SPRUCE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.PINK_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> PURPLE_STAINED_SPRUCE_STAIRS = BLOCKS.register("purple_stained_spruce_stairs", () -> new StairsBlock(() -> BlockInit.PURPLE_STAINED_SPRUCE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.PURPLE_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> RED_STAINED_SPRUCE_STAIRS = BLOCKS.register("red_stained_spruce_stairs", () -> new StairsBlock(() -> BlockInit.RED_STAINED_SPRUCE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.RED_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> WHITE_STAINED_SPRUCE_STAIRS = BLOCKS.register("white_stained_spruce_stairs", () -> new StairsBlock(() -> BlockInit.WHITE_STAINED_SPRUCE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.WHITE_STAINED_SPRUCE_PLANKS.get())));
    public static final RegistryObject<Block> YELLOW_STAINED_SPRUCE_STAIRS = BLOCKS.register("yellow_stained_spruce_stairs", () -> new StairsBlock(() -> BlockInit.YELLOW_STAINED_SPRUCE_PLANKS.get().getDefaultState() , Block.Properties.from(BlockInit.YELLOW_STAINED_SPRUCE_PLANKS.get())));

}

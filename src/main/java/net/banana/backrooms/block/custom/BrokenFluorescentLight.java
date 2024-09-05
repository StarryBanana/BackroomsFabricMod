package net.banana.backrooms.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class BrokenFluorescentLight extends Block {
    public static final BooleanProperty LIT = BooleanProperty.of("lit");

    public BrokenFluorescentLight(Settings settings) {
        super(settings);
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }
    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if(random.nextDouble() < 0.9D) {
            world.setBlockState(pos, state.cycle(LIT), 1, 0);
            final BlockState newState = world.getBlockState(pos);
            for (Direction dir : Direction.values()) {
                final BlockPos currentDirectionBlock = pos.offset(dir);
                if (world.getBlockState(currentDirectionBlock).isOf(this)) {
                    world.setBlockState(currentDirectionBlock, newState, 1, 0);
                }
            }
        }
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if(random.nextDouble() < 0.5D) {
            world.setBlockState(pos, state.cycle(LIT), 2);
            BlockState newState = world.getBlockState(pos);

            for (Direction dir : Direction.values()) {
                BlockPos neighborPos = pos.offset(dir);
                BlockState neighborState = world.getBlockState(neighborPos);
                if (neighborState.isOf(this)) {
                    world.setBlockState(neighborPos, neighborState.cycle(LIT), 2);
                }
            }
        }
    }
}

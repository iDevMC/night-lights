package com.samgj15.nightlights.block;

import java.util.Map;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CeilingBlock extends Block {

	public CeilingBlock(Properties properties) {
		super(properties);
	}

	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;
	private static final Map<Direction, VoxelShape> AABBS = Maps.newEnumMap(ImmutableMap.of(Direction.NORTH,
			Block.box(0, 5, 15, 16, 16, 16), Direction.SOUTH, Block.box(0, 5, 0, 16, 16, 1), Direction.WEST,
			Block.box(15, 5, 0, 16, 16, 16), Direction.EAST, Block.box(0, 5, 0, 1, 16, 16)));

	public VoxelShape getShape(BlockState pState, BlockGetter pGetter, BlockPos pPos, CollisionContext pContext) {
		return getShape(pState);
	}

	public static VoxelShape getShape(BlockState pState) {
		return AABBS.get(pState.getValue(FACING));
	}

	public boolean canSurvive(BlockState pState, LevelReader pReader, BlockPos pPos) {
		BlockPos blockpos = pPos.above();
		return canSupportRigidBlock(pReader, blockpos)
				|| canSupportCenter(pReader, blockpos, Direction.DOWN) && !pReader.isEmptyBlock(pPos.above());
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	/**
	 * final BlockState state,
		final LevelReader level,
		final ScheduledTickAccess ticks,
		final BlockPos pos,
		final Direction directionToNeighbour,
		final BlockPos neighbourPos,
		final BlockState neighbourState,
		final RandomSource random
	 * @param p_152926_
	 * @param p_152927_
	 * @param p_152928_
	 * @param p_152929_
	 * @param p_152930_
	 * @param p_152931_
	 * @return
	 */
	
//	public BlockState updateShape(BlockState p_152926_, Direction p_152927_, BlockState p_152928_,
//			LevelAccessor p_152929_, BlockPos p_152930_, BlockPos p_152931_) {
//		return !p_152926_.canSurvive(p_152929_, p_152930_) ? Blocks.AIR.defaultBlockState()
//				: super.updateShape(p_152926_, p_152927_, p_152928_, p_152929_, p_152930_, p_152931_);
//	}
	
	@Override
	protected BlockState updateShape(BlockState state, LevelReader level, ScheduledTickAccess ticks, BlockPos pos, Direction directionToNeighbour, BlockPos neighbourPos, BlockState neighbourState, RandomSource random) {
		return
			(!state.canSurvive(level, neighbourPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(state, level, ticks, pos, directionToNeighbour, neighbourPos, neighbourState, random));
	}

	public BlockState rotate(BlockState p_58140_, Rotation p_58141_) {
		return p_58140_.setValue(FACING, p_58141_.rotate(p_58140_.getValue(FACING)));
	}

	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_58150_) {
		p_58150_.add(FACING);
	}
}

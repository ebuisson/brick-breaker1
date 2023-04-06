package breakout;


import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import breakout.BlockState;
import breakout.BreakoutState;
import breakout.GameMap;
import breakout.PaddleState;
import breakout.utils.*;

/**
 * Those tests should fail on the provided bad implementaiton, succeed on the model solution.
 */
class TaskBTestSuite {
	

	private Point BR;
	private BlockState ablock;
	private BlockState[] someblocks;
	private Ball aball;
	private Ball bball;
	private Ball[] someballs;
	private PaddleState apad;
	private BreakoutState state;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	/**
	 * some basic values to help us write tests
	 */
	void setUp() {
		BR = new Point(Constants.WIDTH, Constants.HEIGHT);
		
		ablock = new BlockState(
				new Rect( Constants.ORIGIN, new Point(Constants.BLOCK_WIDTH,Constants.BLOCK_HEIGHT)) );
		someblocks = new BlockState[] { ablock };
		
		apad = new PaddleState(
				new Point( Constants.WIDTH / 2, (3 * Constants.HEIGHT) / 4),
				Constants.TYPICAL_PADDLE_COLORS());
		
		aball =
				new Ball(
					new Circle(
						new Point(BR.getX() / 2 , Constants.HEIGHT / 2)
						, Constants.INIT_BALL_DIAMETER)
					, Constants.INIT_BALL_VELOCITY);
		bball = new Ball(
					new Circle(
						new Point(0 , Constants.HEIGHT / 2)
						, Constants.INIT_BALL_DIAMETER)
					, Constants.INIT_BALL_VELOCITY);
		someballs = new Ball[] { aball };
		state = new BreakoutState(someballs, someblocks, BR, apad);
		
	}

//	@Test
//	void exampleTest1() {
//		assertThrows( IllegalArgumentException.class,
//				() -> insertcodehere );
//      assertTrue ( 1 == 1 );
//      assertEquals( expected, actual );
//      assertNotEquals( unexpected, actual );
//      assertNotSame( unexpected, actual );
//      abreakoutState.tickDuring( 200 );
//	}
	
//	@Test moveTest() {
//		
//	}
	
//	@Test remove (both tasks pass)
//	void testGetBalls() {
//		assertNotSame(someballs, state.getBalls());
//	}
	
	@Test
	void testGetBlocks() {
		assertNotSame(someblocks, state.getBlocks());
	}
	
	@Test
	void testPaddleColor() {
		assertEquals(Constants.TYPICAL_PADDLE_COLORS()[0],apad.getPossibleColors()[0]);
		assertFalse(state.getCurPaddleColor() == Color.pink);
	}
	
//	@Test
//	void testTossPaddleColor() {
//		
//	}
	
//	@Test
//	void testBounceWalls() {
//		assertEquals(state.bounceWalls(bball)
//		
//	}
//	
//	@Test
//	void testCollideBallPadde() {
//		
//	}
	
	@Test
	void dummyTest() {
		assertEquals( 35, aball.dummy() );
	}
	


	
}


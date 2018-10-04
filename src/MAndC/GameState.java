package MAndC;

import java.util.ArrayList;

public class GameState {

	GameState parent = null;
	private int missionariesLeft = 3;
	private int missionariesRight = 0;
	private int cannibalsLeft = 3;
	private int cannibalsRight = 3;
	private boolean boatOnLeft = true;
	
	public GameState(int misLef, int misRig, int canLeft, int canRig, boolean left,GameState parent) {
		missionariesLeft = misLef;
		missionariesRight = misRig;
		cannibalsLeft = canLeft;
		cannibalsRight = canRig;
		boatOnLeft = left;
		this.parent = parent;
		
	}
	
	ArrayList<GameState> generateChildStates() {
		ArrayList<GameState> gameStates = new ArrayList<GameState>();
		
		int[] missionaries = {missionariesLeft,missionariesRight};
		int[] cannibals = {cannibalsLeft,cannibalsRight};
		boolean nowBoatOnLeft = false;
				
		int fromInd = 0, toInd = 1;
		
		if (!boatOnLeft) {
			fromInd = 1;
			toInd = 0;
			nowBoatOnLeft = true;
		}
		
		//1 transferred
		if (missionaries[fromInd] >= 1) {
			
			int[] missionariesCopy = {missionaries[0],missionaries[1]};
			missionariesCopy[fromInd] -= 1;
			missionariesCopy[toInd] += 1;
			
 			gameStates.add(new GameState(missionariesCopy[0], missionariesCopy[1], cannibals[0], cannibals[1], nowBoatOnLeft,this));
 			
		}
		if (cannibals[fromInd] >= 1) {
			
			int[] cannibalsCopy = {cannibals[0],cannibals[1]};
			cannibalsCopy[fromInd] -= 1;
			cannibalsCopy[toInd] += 1;
			
 			gameStates.add(new GameState(missionaries[0], missionaries[1], cannibalsCopy[0], cannibalsCopy[1], nowBoatOnLeft,this));
 			
		}
		//2 of same transfered
		if (missionaries[fromInd] >= 2) {
			
			int[] missionariesCopy = {missionaries[0],missionaries[1]};
			missionariesCopy[fromInd] -= 2;
			missionariesCopy[toInd] += 2;
			
 			gameStates.add(new GameState(missionariesCopy[0], missionariesCopy[1], cannibals[0], cannibals[1], nowBoatOnLeft,this));
 			
		}
		if (cannibals[fromInd] >= 2) {
			
			int[] cannibalsCopy = {cannibals[0],cannibals[1]};
			cannibalsCopy[fromInd] -= 2;
			cannibalsCopy[toInd] += 2;
			
 			gameStates.add(new GameState(missionaries[0], missionaries[1], cannibalsCopy[0], cannibalsCopy[1], nowBoatOnLeft,this));
 			
		}
		
		if (missionaries[fromInd] >= 1 && cannibals[fromInd] >= 1) {
			
			int[] missionariesCopy = {missionaries[0],missionaries[1]};
			int[] cannibalsCopy = {cannibals[0],cannibals[1]};
			missionariesCopy[fromInd] -= 1;
			missionariesCopy[toInd] += 1;
			cannibalsCopy[fromInd] -= 1;
			cannibalsCopy[toInd] += 1;
			
 			gameStates.add(new GameState(missionariesCopy[0], missionariesCopy[1], cannibalsCopy[0], cannibalsCopy[1], nowBoatOnLeft,this));

		}
		
		return gameStates;
	}
	
	void printCurrentState() {
		String boatOP = " BOAT___ ";
		
		if (!boatOnLeft) {
			boatOP = " ___BOAT ";
		} 
		System.out.println("(M"+missionariesLeft+",C"+cannibalsLeft+")"+boatOP+"(M"+missionariesRight+",C"+cannibalsRight+")");
	}
	
	void printState() {
		
		String boatOP = " ⛵🌊🌊 ";
		
		if (!boatOnLeft) {
			boatOP = " 🌊🌊⛵ ";
		} 

		if (parent != null) {
			parent.printState();
			System.out.print("↳ ");

		}
		printMissionaries(missionariesLeft);
		printCannibals(cannibalsLeft);
		System.out.print(boatOP);
		printMissionaries(missionariesRight);
		printCannibals(cannibalsRight);
		System.out.println("\n");
	}
	
	private void printMissionaries(int count) {
		for (int i = 1; i <= count; i += 1) {
			System.out.print("👶");
		}
	}
	
	private void printCannibals(int count) {
		for (int i = 1; i <= count; i += 1) {
			System.out.print("👺");
		}
	}
	
	boolean isEndState() {
		if ( missionariesLeft == 0 && missionariesRight == 3 && cannibalsLeft == 0 && cannibalsRight == 3 && !boatOnLeft ) {
			return true;
		}
		return false;
	}
	
	boolean isInvalidState( ) {
		if (( missionariesLeft < cannibalsLeft && !boatOnLeft ) || ( missionariesRight < cannibalsRight ) && boatOnLeft ) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj == this ) {
			return true;
		}
		
		if (! (obj instanceof GameState)) {
			return false;
		}
		
		GameState newState = (GameState)obj;
		
		if (missionariesLeft != newState.missionariesLeft ) {
			return false;
		}
		if (missionariesRight != newState.missionariesRight) {
			return false;
		}
		if (cannibalsLeft != newState.cannibalsLeft) {
			return false;
		}
		if (cannibalsRight != newState.cannibalsRight) {
			return false;
		}
		if (boatOnLeft != newState.boatOnLeft) {
			return false;
		}
		
		return true;
	}
}



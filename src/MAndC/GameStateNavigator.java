package MAndC;

import java.util.ArrayList;

public class GameStateNavigator {

	public static void main(String [] args) {
		
		GameState finalState = null;
		
		ArrayList<GameState> open = new ArrayList<GameState>();
		ArrayList<GameState> closed = new ArrayList<GameState>();
		
		GameState initialGameState = new GameState(3, 0, 3, 0, true,null);
		open.add(initialGameState);
		
		while(open.size() != 0) {
			GameState stateToExplore = open.remove(0);
			closed.add(stateToExplore);
			
			System.out.print("\n \033[1;32m OPENING: ");
			stateToExplore.printCurrentState();
			
			ArrayList<GameState> openedStates = stateToExplore.generateChildStates();
			
			for (GameState state: openedStates) {
				if (state.isEndState()) {
					finalState = state;
					break;
				}
			}
			
			for (GameState state: openedStates) {
				boolean notSameState = true;
				for(GameState closedState: closed) {
					if(closedState.equals(state)) {
						notSameState = false;
						System.out.print("\033[1;36m ↳ VISITED: ");
						state.printCurrentState();
						break;
					}
				}
				if (notSameState && !state.isInvalidState()) {
					System.out.print("\033[0;97m ↳ NEW VALID: ");
					state.printCurrentState();
					
					open.add(state);
				}
				
				if (state.isInvalidState()) {
					System.out.print("\033[0;91m ↳ INVALID: ");
					state.printCurrentState();
				}
				
			}
		}
		System.out.print("\033[0m");
		
		System.out.println("\nGoal Steps\n");
		if (finalState != null) {
			finalState.printState();
		} else {
			System.out.println("Could not reach end state!");
		}
	}
}

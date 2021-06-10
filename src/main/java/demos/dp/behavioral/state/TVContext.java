package demos.dp.behavioral.state;

public class TVContext {

	public State currentState;

	public TVContext() {
		currentState = State.STOP;
	}

	public void clickButton() {

		switch (currentState) {
		case START:
			new TVStopState().doAction();
			currentState = State.STOP;
			break;
		case STOP:
			new TVStartState().doAction();
			currentState = State.START;
			break;
		}
	}
}

enum State {
	START, STOP;
}

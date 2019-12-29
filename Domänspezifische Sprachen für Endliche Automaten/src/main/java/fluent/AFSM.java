package fluent;

import objectmodell.State;
import objectmodell.Transition;

public interface AFSM {

    AFSM addState(State state);
    AFSM addTransition(Transition transition);
    State getInitialState();
    ActionStatePair makeTransition(State state, String event);

}
import fluent.AFSMImpl;
import fluent.ActionStatePair;
import objectmodell.State;

import java.util.ArrayList;
import java.util.List;

class AFSMInterpreter {

    State state;

    List<String> run(AFSMImpl afsm, List<String> input) {

        ArrayList<String> output = new ArrayList<>();
        state = afsm.getInitialState();

        for (String s : input) {
            ActionStatePair pair = afsm.makeTransition(state, s);
            if (pair != null) {
                output.add(pair.event);
                state = pair.target;
            }
        }

        return output;
    }

}
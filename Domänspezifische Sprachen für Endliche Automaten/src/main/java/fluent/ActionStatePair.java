package fluent;

import objectmodell.State;

public class ActionStatePair {

    public String event;
    public State target;

    public ActionStatePair(String action, State target){
        this.event = action;
        this.target = target;
    }

}
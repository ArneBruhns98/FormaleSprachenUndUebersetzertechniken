import fluent.AFSMImpl;
import objectmodell.State;
import objectmodell.Transition;

class AFSMCreator {

    AFSMImpl creator;

    AFSMCreator(){
        creator = new AFSMImpl();
    }

    void createFirstAFSM(){
        State q0;
        State q1;

        q0 = new State("q0", true, false);
        q1 = new State("q1", false, true);

        creator.addState(q0).addState(q1)
                .addTransition(new Transition(q0, "b", q0))
                .addTransition(new Transition(q0,"a" , q1))
                .addTransition(new Transition(q1, "a", q1))
                .addTransition(new Transition(q1, "b", q1));
    }

    void createSecondAFSM(){
        State q0;

        q0 = new State("q0", true, true);
        creator.addState(q0).addTransition(new Transition(q0,"a", q0));
    }

    void createThirdAFSM(){
        State q0;
        State q1;
        State q2;

        q0 = new State("q0", true, false);
        q1 = new State("q1", false, false);
        q2 = new State("q2", false, true);

        creator.addState(q0).addState(q1).addState(q2)
                .addTransition(new Transition(q0, "a", q1))
                .addTransition(new Transition(q0, "b", q1))
                .addTransition(new Transition(q1, "a", q2))
                .addTransition(new Transition(q1, "b", q2))
                .addTransition(new Transition(q2, "a", q2))
                .addTransition(new Transition(q2, "b", q2));
    }
}

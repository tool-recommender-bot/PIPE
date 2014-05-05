package pipe.reachability.io;

import pipe.reachability.state.ExplorerState;

/**
 * Private inner class representing a state transition.
 */
public class StateTransition {
    public final ExplorerState state;

    public final ExplorerState successor;

    public StateTransition(ExplorerState state, ExplorerState successor) {
        this.state = state;
        this.successor = successor;
    }

    @Override
    public int hashCode() {
        int result = state.hashCode();
        result = 31 * result + successor.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StateTransition)) {
            return false;
        }

        StateTransition that = (StateTransition) o;

        if (!state.equals(that.state)) {
            return false;
        }
        if (!successor.equals(that.successor)) {
            return false;
        }

        return true;
    }

}

package edu.htc.blitstein.caih313.tddstack.engine;

import edu.htc.blitstein.caih313.tddstack.IStackable;

public class TddStack {
    static final long DEFAULT_DEPTH = 100;

    long stackDepth;

    TddStack(long stackDepth) {
        this.stackDepth = stackDepth;
    }

    public TddStack() {
        this(DEFAULT_DEPTH);
    }

    boolean isEmpty(){
        return false;
    }

    boolean isFull() { return false;}

    IStackable pop() {
        //any object can be null; again, just to get it to compile
        return null;
    }

    void push(IStackable iStackable) {
        //doesn't need to return anything
    }


}

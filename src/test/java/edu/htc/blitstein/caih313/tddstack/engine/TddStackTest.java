package edu.htc.blitstein.caih313.tddstack.engine;

import edu.htc.blitstein.caih313.tddstack.IStackable;
import edu.htc.blitstein.caih313.tddstack.resource.campus.Faculty;
import edu.htc.blitstein.caih313.tddstack.resource.campus.Student;
import edu.htc.blitstein.caih313.tddstack.resource.room.ComputerLab;
import edu.htc.blitstein.caih313.tddstack.resource.room.LectureRoom;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TddStackTest {
    @Test
    public void testNewStackIsEmpty() {
        TddStack tddStack = new TddStack();
        assertTrue(tddStack.isEmpty());
    }

    @Test
    public void testNewStackIsNotFull() {
        TddStack tddStack = new TddStack();
        assertFalse(tddStack.isEmpty());
    }

    @Test
    public void testNewStackHasDefaultDepth() {
        TddStack tddStack = new TddStack();
        assertEquals(TddStack.DEFAULT_DEPTH, tddStack.stackDepth);
    }

    @Test
    public void testFullStackIsFull() {
        TddStack tddStack =  new TddStack(3);
        Student student = new Student();
        tddStack.push(student);
        tddStack.push(student);
        tddStack.push(student);
        assertTrue(tddStack.isFull());
    }

    //some extras
    @Test
    public void testAddOneIsNotEmptyAndIsNotFull() {
        TddStack tddStack =  new TddStack(3);
        Student student = new Student();
        tddStack.push(student);
        assertFalse(tddStack.isEmpty());
        assertFalse(tddStack.isFull());
    }

    @Test
    public void testPopIsPush() {
        TddStack tddStack = new TddStack();
        //Faculty implements IStackable
        IStackable iStackableOrig = new Faculty();
        tddStack.push(iStackableOrig);
        IStackable iStackablePopped = tddStack.pop();
        assertEquals(iStackableOrig, iStackablePopped);
    }
}
package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _232_ImplementQueueUsingStacksTest {

    _232_ImplementQueueUsingStacks implementQueueUsingStacks;

    @BeforeEach
    public void setUp() {
        implementQueueUsingStacks = new _232_ImplementQueueUsingStacks();
    }

    @Test
    public void testQueue()
    {
        _232_ImplementQueueUsingStacks.MyQueue myQueue = new _232_ImplementQueueUsingStacks.MyQueue();
        myQueue.push(1);;
        assertEquals(1, myQueue.peek());
        assertFalse(myQueue.empty());

        myQueue.push(2);;
        assertEquals(1, myQueue.peek());
        assertFalse(myQueue.empty());

        assertEquals(1, myQueue.pop());
        assertEquals(2, myQueue.peek());
        assertFalse(myQueue.empty());
    }
}
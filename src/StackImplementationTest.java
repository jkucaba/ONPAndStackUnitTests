import org.junit.Test;
import static org.junit.Assert.*;

public class StackImplementationTest {

    @Test
    public void testIsEmpty() {
        StackImplementation stack = new StackImplementation();
        assertTrue("isEmpty() should return true",stack.isEmpty());

        try{
            stack.top();
            throw new AssertionError("top() method should throw an exception when stack is empty");
        } catch(Exception e){
            System.out.println(e);
        }
        try{
            stack.top();
            throw new AssertionError("top() method should throw an exception when stack is empty");
        } catch(Exception e){
            System.out.println(e);
        }

    }

    @Test
    public void secondTest() throws Exception {
        StackImplementation stack = new StackImplementation();
        String input = "6 + 3 + 2 * 5 ^ 3 =";

        stack.push(input);
        String top = stack.top();

        assertSame("top() should return the top element of the stack", input, top);
        assertSame("top() should return the top element of the stack", input, stack.top());
        assertSame("top() should return the top element of the stack", input, stack.top());

        assertFalse("isEmpty() should return false", stack.isEmpty());
    }

    @Test
    public void thirdTest() throws Exception {
        StackImplementation stack = new StackImplementation();
        String input = "6 + 3 + 2 * 5 ^ 3 =";

        stack.push(input);

        assertSame("pop() should return the top element of the stack", input, stack.pop());
        assertTrue("isEmpty() should return true", stack.isEmpty());

        try{
            stack.pop();
            throw new AssertionError("pop() method should throw an exception when stack is empty");
        } catch(Exception e){
            System.out.println(e);
        }
    }

    @Test
    public void fourthTest() throws Exception {
        StackImplementation stack = new StackImplementation();
        String input1 = "6 + 3 + 2 * 5 ^ 3 =";
        String input2 = "10 - 1 * (5 + 2) * 2 ^ 12 =";
        String input3 = "2 * 8 + (10 - 4) / 2 + 2 ^ 4 =";

        stack.push(input1);
        stack.push(input2);
        stack.push(input3);

        assertSame("pop() should return the top element of the stack", input3, stack.pop());
        assertSame("pop() should return the top element of the stack", input2, stack.pop());
        assertSame("pop() should return the top element of the stack", input1, stack.pop());

        assertTrue("isEmpty() should return true", stack.isEmpty());

        try{
            stack.pop();
            throw new AssertionError("pop() method should throw an exception when stack is empty");
        } catch(Exception e){
            System.out.println(e);
        }
    }
    @Test
    public void fifthTest() throws Exception{
        StackImplementation stack = new StackImplementation();
        stack.push(null);
        assertNull("top() should return null", stack.top());
    }

    @Test
    public void sixthTest() throws Exception{
        StackImplementation stack = new StackImplementation();
        try{
            stack.pop();
            throw new AssertionError("pop() method should throw an exception when stack is empty");
        } catch (Exception e){
            System.out.println(e);
        }

        String input1 = "6 + 3 + 2 * 5 ^ 3 =";
        String input2 = "10 - 1 * (5 + 2) * 2 ^ 12 =";
        String input3 = "2 * 8 + (10 - 4) / 2 + 2 ^ 4 =";

        stack.push(input1);
        stack.push(input2);
        stack.push(input3);

        assertSame("pop() should return the top element of the stack", input3, stack.pop());
        assertSame("pop() should return the top element of the stack", input2, stack.pop());
        assertSame("pop() should return the top element of the stack", input1, stack.pop());

        assertTrue("isEmpty() should return true", stack.isEmpty());
    }

}
package org.tasks.kyu7;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

/**
 * Created by vboliuk on 30.12.2016.
 */
public class TestMakeAFunctionThatDoesArithmetic {

    @Test
    public void testBasic() {
        assertEquals("'add' should return the two numbers added together!", 3, MakeAFunctionThatDoesArithmetic.arithmetic(1, 2, "add"));
        assertEquals("'subtract' should return a mimus b!", 6, MakeAFunctionThatDoesArithmetic.arithmetic(8, 2, "subtract"));
        assertEquals("'multiply' should return a multiplied by b!", 10, MakeAFunctionThatDoesArithmetic.arithmetic(5, 2, "multiply"));
        assertEquals("'divide' should return a divided by b!", 4, MakeAFunctionThatDoesArithmetic.arithmetic(8, 2, "divide"));
        assertEquals("'divide' should return a divided by b!", 4, MakeAFunctionThatDoesArithmetic.arithmetic(9, 2, "divide"));
    }
}

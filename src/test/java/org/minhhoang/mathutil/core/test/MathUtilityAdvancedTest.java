/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.minhhoang.mathutil.core.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.minhhoang.mathutil.core.MathUtility;

/**
 *
 * @author hoangvmdeptrai
 */
public class MathUtilityAdvancedTest {
    
    public static Object[][] initTestData(){
        Object[][] testData = {{0,1}, {1,1}, {2,2}, {5,120}, {6,720}};
        
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource(value = "initTestData")
    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
    
}

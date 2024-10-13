/*
 * MIT License
 *
 * Copyright (c) 2017-2022 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Tests for 30 Seconds of Java code library.
 */

public class LinearSearchIn2dArraySnippetTest {
  /**
  * Test for {@link LinearSearchIn2dArraySnippet #LinearSearchIn2dArraySnippet(int[][],int)}.
  */
  @Test
    void testLinearSearchIn2dArraySnippetTest() {
    int[][] arr1 = {{3, 4, 7, 9}, {12, 24, 26, 29}, {34, 55, 88, 99}, {100, 189, 232, 234}};
    int[] ans1 = {1, 2};
    Assertions assertions  = null;
    assertArrayEquals(ans1, LinearSearchIn2dArraySnippet.linearSearch2dArray(arr1, 26));
    int[][] arr2 = {{3, 4, 7, 9}, {12, 24, 26, 29}, {34, 55, 88, 99}, {100, 189, 232, 234}};
    int[] ans2 = {-1, -1};
    assertArrayEquals(ans2, LinearSearchIn2dArraySnippet.linearSearch2dArray(arr2, 69));

    // Test case: Empty array
    int[][] arr6 = {};
    int[] ans6 = {-1, -1}; // Expected indices for any search in an empty array
    assertArrayEquals(ans6, LinearSearchIn2dArraySnippet.linearSearch2dArray(arr6, 5));

    // Test case: Search for a negative number
    int[][] arr7 = {
            {-3, -2, -1},
            {0, 1, 2}
    };
    int[] ans7 = {0, 1}; // Expected indices for -2
    assertArrayEquals(ans7, LinearSearchIn2dArraySnippet.linearSearch2dArray(arr7, -2));
  }


}

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

public class BinarySearchIn2dArraySnippetTest {
  /**
  * Test for {@link BinarySearchIn2dArraySnippet #BinarySearchIn2dArraySnippet(int[][],int)}.
  */
  @Test
    void testBinarySearchIn2dArraySnippetTest() {
    int[][] arr1 = {{3, 4, 7, 9}, {12, 24, 26, 29}, {34, 55, 88, 99}, {100, 189, 232, 234}};
    int[] ans1 = {1, 2};
    Assertions assertions  = null;
    assertArrayEquals(ans1, BinarySearchIn2dArraySnippet.binarySearchIn2darr(arr1, 26));

    int[][] arr2 = {{3, 4, 7, 9}, {12, 24, 26, 29}, {34, 55, 88, 99}, {100, 189, 232, 234}};
    int[] ans2 = {-1, -1};
    assertArrayEquals(ans2, BinarySearchIn2dArraySnippet.binarySearchIn2darr(arr2, 69));
    // Test first element
    int[] ans3 = {0, 0};
    assertArrayEquals(ans3, BinarySearchIn2dArraySnippet.binarySearchIn2darr(arr1, 3),
            "Should return the indices of the found element 3.");

    // Test last element
    int[] ans4 = {3, 3};
    assertArrayEquals(ans4, BinarySearchIn2dArraySnippet.binarySearchIn2darr(arr1, 234),
            "Should return the indices of the found element 234.");

    // Test empty array
    int[][] arr3 = {};
    int[] ans6 = {-1, -1};
    assertArrayEquals(ans6, BinarySearchIn2dArraySnippet.binarySearchIn2darr(arr3, 1),
            "Should return {-1, -1} for element 1 in an empty array.");


    // Test single row array
    int[][] arr4 = {{1, 2, 3, 4}};
    int[] ans7 = {0, 3};
    assertArrayEquals(ans7, BinarySearchIn2dArraySnippet.binarySearchIn2darr(arr4, 4),
            "Should return the indices of the found element 4 in a single row.");

    // Test single column array
    int[][] arr5 = {{1}, {2}, {3}, {4}};
    int[] ans8 = {3, 0};
    assertArrayEquals(ans8, BinarySearchIn2dArraySnippet.binarySearchIn2darr(arr5, 4),
            "Should return the indices of the found element 4 in a single column.");
  }
}

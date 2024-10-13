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

package array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Tests for 30 Seconds of Java code library.
 */
public class ArrayMeanSnippetTest {

  /**
   * Tests for {@link ArrayMeanSnippet#arrayMean(int[])}.
   */
  @Test
  void testArrayMean() {
    assertEquals(4.7, ArrayMeanSnippet.arrayMean(new int[]{10, 9, 4, 1, 3, -11, 20, 6, 2, 3}));
    assertEquals(-62.75, ArrayMeanSnippet.arrayMean(new int[]{-30, -31, -63, -127}));
    assertThrows(ArithmeticException.class, () -> ArrayMeanSnippet.arrayMean(new int[]{}));
    // Test with a single element
    assertEquals(5.0, ArrayMeanSnippet.arrayMean(new int[]{5}), "Mean of single element array should equal the element itself.");

    // Test with an array of the same element
    assertEquals(5.0, ArrayMeanSnippet.arrayMean(new int[]{5, 5, 5, 5}), "Mean of identical elements should equal the element.");

    // Test with an array containing negative and positive values
    assertEquals(0.0, ArrayMeanSnippet.arrayMean(new int[]{-10, 10}), "Mean of -10 and 10 should be 0.");
    assertEquals(2.0, ArrayMeanSnippet.arrayMean(new int[]{1, 2, 3}), "Mean of 1, 2, and 3 should be 2.0.");
    assertEquals(-1.0, ArrayMeanSnippet.arrayMean(new int[]{-1, -1, -1}), "Mean of -1, -1, -1 should be -1.");


  }
}

package heima.ch1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static heima.ch1.BinarySearch.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    @Test
    @DisplayName("binarySearchBasic 找到")
     void binarySearchBasicTest1() {
        int[] a = {7, 13, 21, 30, 38, 44, 52, 53};
        assertEquals(1, binarySearchBasic(a, 13));
        assertEquals(6, binarySearchBasic(a, 52));
        assertEquals(7, binarySearchBasic(a, 53));
        assertEquals(0, binarySearchBasic(a, 7));
    }

    @Test
    @DisplayName("binarySearchBasic 没找到")
    void binarySearchBasicTest2() {
        int[] a = {7, 13, 21, 30, 38, 44, 52, 53};
        assertEquals(-1, binarySearchBasic(a, 60));
    }

    @Test
    void binarySearchPlus() {
        int[] a = {7, 13, 21, 30, 38, 44, 52, 53};
        assertEquals(2, binarySearchBasic(a, 21));
        assertEquals(0, binarySearchBasic(a, 7));
        assertEquals(7, binarySearchBasic(a, 53));
        assertEquals(-1, binarySearchBasic(a, 60));
    }

    @Test
    @DisplayName("binarySearchAlternativeTest")
    void binarySearchAlternativeTest() {
        int[] a = {7, 13, 21, 30, 38, 44, 52, 53};
        assertEquals(2, binarySearchAlternative(a, 21));
        assertEquals(0, binarySearchAlternative(a, 7));
        assertEquals(7, binarySearchAlternative(a, 53));
        assertEquals(-1, binarySearchAlternative(a, 60));
    }

    @Test
    void binarySearchLeftMostTest() {
        int[] a = {1, 2, 4, 4, 5, 6, 7};
        assertEquals(0, binarySearchLeftMost(a, 1));
        assertEquals(2, binarySearchLeftMost(a, 4));
        assertEquals(-1, binarySearchLeftMost(a, 0));
    }

    @Test
    void binarySearchRightMostTest() {
        int[] a = {1, 2, 4, 4, 5, 6, 7};
        assertEquals(0, binarySearchRightMost(a, 1));
        assertEquals(3, binarySearchRightMost(a, 4));
        assertEquals(-1, binarySearchRightMost(a, 0));
    }

    @Test
    void binarySearchLeftMostTest2() {
        int[] a = {1, 2, 4, 4, 5, 6, 7};
        assertEquals(0, binarySearchRightMost(a, 1));
        assertEquals(3, binarySearchRightMost(a, 4));
        assertEquals(-1, binarySearchRightMost(a, 0));
    }

    @Test
    void binarySearchRightMostTest2() {
        int[] a = {1, 2, 4, 4, 5, 6, 7};
        assertEquals(0, binarySearchRightMost(a, 1));
        assertEquals(3, binarySearchRightMost(a, 4));
        assertEquals(-1, binarySearchRightMost(a, 0));
    }

    @Test
    void binarySearchTest() {
        int[] a = {1, 2, 4, 4, 5, 6, 7};
        assertEquals(0, binarySearchRightMost(a, 1));
        assertEquals(3, binarySearchRightMost(a, 4));
        assertEquals(-1, binarySearchRightMost(a, 0));
    }
}
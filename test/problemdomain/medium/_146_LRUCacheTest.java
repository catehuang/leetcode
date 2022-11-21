package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _146_LRUCacheTest {

    _146_LRUCache lruCache;

    @BeforeEach
    public void setUp() {
    }

    @Test
    public void get() throws Exception {
    }

    @Test
    public void put() throws Exception {
    }

    @Test
    public void test_case() throws Exception {
        String[] actions = new String[] {
                "put", "put", "get", "put", "get", "put", "get", "get", "get"
        };

        int[][] params = new int[][] {
                {1, 1}, {2, 2}, {1}, {3, 3}, {2}, {4, 4}, {1}, {3}, {4}
        };

        int capacity = 2;

        lruCache = new _146_LRUCache(capacity);


    }
}
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class ListManagerTest {

    private List<Integer> list;

    @BeforeEach
    void setUp() {
        list = new ArrayList<>();
    }

    @Test
    public void testAddElement() {
        ListManager.addElement(list, 5);
        Assertions.assertEquals(1, list.size(), "Size should be 1 after adding one element.");
        Assertions.assertTrue(list.contains(5), "List should contain the added element.");
    }

    @Test
    public void testRemoveElement() {
        ListManager.addElement(list, 10);
        ListManager.addElement(list, 20);
        ListManager.removeElement(list, 10);
        Assertions.assertEquals(1, list.size(), "Size should decrease after removing an element.");
        Assertions.assertFalse(list.contains(10), "List should not contain the removed element.");
    }

    @Test
    public void testGetSize() {
        Assertions.assertEquals(0, ListManager.getSize(list), "Initial size should be 0.");
        ListManager.addElement(list, 1);
        ListManager.addElement(list, 2);
        Assertions.assertEquals(2, ListManager.getSize(list), "Size should be 2 after adding two elements.");
        ListManager.removeElement(list, 1);
        Assertions.assertEquals(1, ListManager.getSize(list), "Size should be 1 after removing one element.");
    }
}
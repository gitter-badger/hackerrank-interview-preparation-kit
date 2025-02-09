package interviews.glovo.questions;

import org.junit.Assert;
import org.junit.Test;

public class Question2Test {
    @Test
    public void success_containingAnyCombination_test_0() {
        Assert.assertEquals(Question2.containingAnyCombination("()"),true);
    }

    @Test
    public void success_containingAnyCombination_test_1() {
        Assert.assertEquals(Question2.containingAnyCombination("()[]{}"),true);
    }

    @Test
    public void success_containingAnyCombination_test_2() {
        Assert.assertEquals(Question2.containingAnyCombination("(]"),false);
    }
}

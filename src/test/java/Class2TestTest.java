import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Mockito.*;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ClassWithStatic.class)
public class Class2TestTest {
    @Test
    public void test() {
        mockStatic(ClassWithStatic.class);
        when(ClassWithStatic.someString()).thenReturn("asdf");
        Assert.assertEquals("asdf!", new Class2Test().evolveString());
    }
}
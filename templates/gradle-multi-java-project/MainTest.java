package $project_package_name;

import $project_package_name.application.Main;
import org.junit.*;

import static org.junit.Assert.fail;

@TestFor(Main)
public class MainTest {
    @Test
    void testIWillAllwaysFail() {
        fail('Not yet implemented!');
    }
}
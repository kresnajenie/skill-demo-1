// javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar SkillDemoTester.java
// java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore SkillDemoTester

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SkillDemoTester {
    @Test
    public void testCube() {
        assertEquals(64, SkillDemo.cube(4));
    }
}
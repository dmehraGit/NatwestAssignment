package Natwest.SeleniumAssignment;

import io.cucumber.java.Before;
import io.cucumber.java.After;
 

public class Hooks extends TestBase {
    @Before
    public void UISetup(){
        new TestBase().TestSetup();
    }

    @After
    public void UITeardown(){
        new TestBase().TestTearDown();
    }
}


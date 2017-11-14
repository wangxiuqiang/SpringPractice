package cn.ssm.po;

import javax.validation.constraints.Size;

public class validationTest {

    @Size(min=3,max = 10,message="{a.length.error}")
    private String testName;

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }
}

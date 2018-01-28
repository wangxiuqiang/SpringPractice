package cn.ssm.po;

import cn.ssm.validationInterface.test1;
import cn.ssm.validationInterface.test2;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class validationTest {

    @Size(min=3,max = 10,groups = {test1.class},message = "{a.length.error}")
    private String testName;

    @NotNull( message="{a.context.NotNull}",groups = {test2.class})
    private String testId;

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }
}

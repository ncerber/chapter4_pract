import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestCalcExpression {
    private String testString;
    private boolean testResult;

    public TestCalcExpression(String testString) {
        this.testString = testString;
        this.testResult = false;
    }

    public boolean isTestResult() {
        return testResult;
    }

    public void setTestString(String testString) {
        this.testString = testString;
        this.testResult = false;
    }

    public void execTest() {
        Pattern p = Pattern.compile("^\\d+([\\+\\-\\*\\/]\\d+)+"); // что ищем
        Matcher m = p.matcher(testString); // где ищем
        if (m.find()) {
            if (m.end() == testString.length()) {
                testResult = true;
            }
        }
    }
    //

}

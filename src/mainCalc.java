public class mainCalc {
    public static void main(String[] args) {
        String testString = "23+456-84444563/28*2q";
        TestCalcExpression testCalcExpression = new TestCalcExpression(testString);
        testCalcExpression.execTest();
        System.out.println(testString + " : " +testCalcExpression.isTestResult());

        testString = "23+456-84444563/28*2";
        testCalcExpression.setTestString(testString);
        testCalcExpression.execTest();
        System.out.println(testString + " : " +testCalcExpression.isTestResult());

        testString = "23+456-84444563/28*2-";
        testCalcExpression.setTestString(testString);
        testCalcExpression.execTest();
        System.out.println(testString + " : " +testCalcExpression.isTestResult());
    }
}

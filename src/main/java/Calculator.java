public class Calculator {

    String mainNumber;
    String previousNumber;
    String ArithmeticOperations;
    String MemoryNumber="0";

    public Calculator() {
        this("");
    }

    public Calculator(String mainNumber) {
        this.mainNumber = mainNumber;
    }

    public String appendToMainNumber(String toAppend) {
        mainNumber += toAppend;
        return mainNumber;
    }

    public void resetMainNumber() {
        mainNumber = "";
    }

    public void resetPreviousNumber() {
        previousNumber="";
    }

    public String getMainNumber() {
        return mainNumber;
    }

    public String getArithmeticOperations() {
        return ArithmeticOperations;
    }

    public String getPreviousNumber() {
        return previousNumber;
    }

    public void setArithmeticOperations(String arithmeticOperations) {
        ArithmeticOperations = arithmeticOperations;
    }

    public String getMemoryNumber() {
        return MemoryNumber;
    }

    public void setMemoryNumber(String memoryNumber) {
        MemoryNumber = memoryNumber;
    }

    public String add(String toAdd) {
        var mainNumberInteger = Integer.parseInt(previousNumber);
        var newNumberInteger = Integer.parseInt(toAdd);
        var result = mainNumberInteger + newNumberInteger;
        mainNumber = Integer.toString(result);
        return mainNumber;
    }

    public String minus(String toMinus){
        var mainNumberInteger = Integer.parseInt(previousNumber);
        var newNumberInteger = Integer.parseInt(toMinus);
        var result = mainNumberInteger - newNumberInteger;
        mainNumber = Integer.toString(result);
        return mainNumber;
    }

    public String divide(String toDivide){
        var mainNumberInteger = Integer.parseInt(previousNumber);
        var newNumberInteger = Integer.parseInt(toDivide);
        var result = mainNumberInteger / newNumberInteger;
        mainNumber = Integer.toString(result);
        return mainNumber;
    }

    public String multiply(String toMultiply){
        var mainNumberInteger = Integer.parseInt(previousNumber);
        var newNumberInteger = Integer.parseInt(toMultiply);
        var result = mainNumberInteger * newNumberInteger;
        mainNumber = Integer.toString(result);
        return mainNumber;
    }

    public void storeAndResetMainNumber() {
        previousNumber = mainNumber;
        resetMainNumber();
    }

}
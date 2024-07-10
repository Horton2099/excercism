class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        } else if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        } else if (!operation.equals("+") && !operation.equals("*") && !operation.equals("/")) {
            throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        } else if (operation.equals("/") && operand2 == 0) {
            throw new IllegalOperationException("Division by zero is not allowed", new ArithmeticException())
                    ;
        }
        int result = switch (operation) {
            case "+" -> operand1 + operand2;
            case "*" -> operand1 * operand2;
            case "/" -> operand1 / operand2;
            default -> 0;
        };
        return operand1 + " " + operation + " " + operand2 + " = " + result;
    }
}

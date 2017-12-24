package ProgBranches;

public class Calculator implements CalcOperations{

    private float operand1;
    private float operand2;

    public Calculator() {
    }

    public Calculator(float operand1, float operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public float getOperand1() {
        return operand1;
    }

    public void setOperand1(float operand1) {
        this.operand1 = operand1;
    }

    public float getOperand2() {
        return operand2;
    }

    public void setOperand2(float operand2) {
        this.operand2 = operand2;
    }

    public float calculateSum () {
        System.out.printf("%.4f + %.4f = %.4f", operand1, operand2, operand1 + operand2);
        return operand1 + operand2;
    }

    public float calculateSubtraction() {
        System.out.printf("%.4f - %.4f = %.4f", operand1, operand2, operand1 - operand2);
        return (operand1 - operand2);
    }

    public float calculateMultiplication () {
        System.out.printf("%.4f * %.4f = %.4f", operand1, operand2, operand1 * operand2);
        return (operand1 * operand2);
    }

    public float calculateDivision () throws IllegalArgumentException
        {
        System.out.printf("%.4f / %.4f = %.4f\n", operand1, operand2, operand1 / operand2);

        if (operand2 == 0)
            {
            throw new IllegalArgumentException("Низзя делить на 0!");
            }
            return (operand1 / operand2);
        }

}

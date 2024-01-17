/**
 * The Calculator class performs basic arithmetic operations such as addition, subtraction,
 * multiplication, and division on two float operands.
 */
class Calculator{
    /**
     * The function "addition" takes two float operands and returns their sum.
     * 
     * @param operand_1 The first operand for addition. It is a float data type.
     * @param operand_2 The second operand in the addition operation.
     * @return The sum of operand_1 and operand_2 is being returned.
     */
    float addition(float operand_1,float operand_2){
        return(operand_1 + operand_2);
    }
    /**
     * The function performs subtraction between two float operands and returns the result.
     * 
     * @param operand_1 The first operand for the subtraction operation.
     * @param operand_2 The second operand in the subtraction operation.
     * @return the result of subtracting operand_2 from operand_1.
     */
    float substraction(float operand_1,float operand_2){
        return(operand_1 - operand_2);
    }
    /**
     * The function "Multiplication" takes two float operands and returns their product.
     * 
     * @param operand_1 The first operand of the multiplication operation.
     * @param operand_2 The second operand in the multiplication operation.
     * @return the product of the two operands, which is the result of the multiplication.
     */
    float Multiplication(float operand_1,float operand_2){
        return(operand_1 * operand_2);
    }
    /**
     * The function division takes two float operands and returns their division result.
     * 
     * @param operand_1 The first operand of the division operation.
     * @param operand_2 The second operand in the division operation.
     * @return the result of dividing operand_1 by operand_2.
     */
    float division(float operand_1,float operand_2){
        return(operand_1/operand_2);
    }

    /**
     * The main function creates an instance of the Calculator class, performs addition, subtraction,
     * multiplication, and division operations on two operands, and prints the results.
     */
    public static void main(String[] args){
        Calculator calc=new Calculator();
        float operand_1=10;
        float operand_2=5;
        float add_result=calc.addition(operand_1,operand_2);
        System.out.println("Result is:"+add_result);
        float sub_result=calc.substraction(operand_1,operand_2);
        System.out.println("Result is:"+sub_result);
        float mult_result=calc.Multiplication(operand_1,operand_2);
        System.out.println("Result is:"+mult_result);
        float div_result=calc.division(operand_1,operand_2);
        System.out.println("Result is:"+div_result);
    }
}
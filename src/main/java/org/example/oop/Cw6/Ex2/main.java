package org.example.oop.Cw6.Ex2;

public class main {
    public static void main(String[] args) {
        Addition add = new Addition(1.0, 1.0);
        Calculator calc = new Calculator();
        calc.calculateSwitch(add);
        System.out.println(add.getResult());
    }
}

//    public interface CalculatorOperation {}
//
//    public class Addition implements CalculatorOperation { private double left;
//
//        private double right; private double result = 0.0;
//
//        public Addition (double left, double right) {
//
//            this.left = left;
//
//            this.right = right;
//
//        }
//
//        public class Subtraction implements CalculatorOperation {
//
//            private double left;
//
//            private double right;
//
//            private double result = 0.0;
//
//            public Subtraction(double left, double right) {
//
//                this.left = left;
//
//                this.right = right;
//
//            }
//            public class Calculator {
//
//                public void calculate (CalculatorOperation operation) {
//
//                    if (operation == null) {
//
//                        throw new Invalid ParameterException("Can not perform operation");
//
//                    }
//
//                    if (operation instanceof Addition) {
//
//                        Addition addition = (Addition) operation; addition.setResult(addition.getLeft() + addition.getRight());
//
//                    }else if (operation instanceof Subtraction) {
//
//                        Subtraction subtraction = (Subtraction) operation; subtraction.setResult(subtraction.getLeft() - subtraction.getRight());


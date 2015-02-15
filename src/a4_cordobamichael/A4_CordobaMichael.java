//Created February 15th, 2015

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a4_cordobamichael;


/**
 *
 * @author Michael
 */
public class A4_CordobaMichael {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Random rnd = new java.util.Random( );
        int classSize = 11;
        double[] examGrades = new double[classSize];
        double[] hwGrades = new double[classSize];
        double[] studentTotal = new double[classSize];
        String[] letterGrade = new String[classSize];
        double maxHW;
        double maxExam;
        double maxTotal;
                
        System.out.println("Exam \t HW\t\tTotal\t\tGrade");
        
        for(int i = 0; i < classSize; i++){
            examGrades[i] = rnd.nextInt(201);
            hwGrades[i] = rnd.nextInt(101);
            
            studentTotal[i] = computeGrade(examGrades[i], hwGrades[i]);
            
            letterGrade[i] = computeLetter(studentTotal[i]);
                            
            System.out.printf("%.0f \t %.0f\t\t%.2f\t\t%5s\n", examGrades[i], hwGrades[i], studentTotal[i], letterGrade[i]);
                        
        }
        
        maxExam = computeMax(examGrades);
        maxHW = computeMax(hwGrades);
        maxTotal = computeMax(studentTotal);
               
        System.out.println();
              
        System.out.printf("Exam max: %.0f\n", maxExam);
        System.out.printf("HW max: %.0f\n", maxHW);
        System.out.printf("Total max: %.2f\n", maxTotal);
  
    }
    
    
    public static double computeGrade(double exam, double hw){
        double grade;
        
        grade = (75 * exam/200) + (25 * hw/100);
        
        return grade;        
    }
    
        public static double computeMax(double[] list){
        double max = 0;
        
        for(int i = 0; i < list.length; i++){
            if (list[i] > max){
                max = list[i];
            }
        }
        return max;
    }
        
    public static String computeLetter(double total){
        String letter;
        
        if (total < 80){
               if (total >= 60){
                   letter = "B";
               }
               else{
                   letter = "C";
               }
            }
            else{
                letter = "A";
        }
        
        return letter;
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a4_cordobamichael;

import java.util.Random;

/**
 *
 * @author Michael
 */
public class A4_CordobaMichael {
    static Random rnd = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int classSize = 11;
        double[] examGrades = new double[classSize];
        double[] hwGrades = new double[classSize];
        double[] studentTotal = new double[classSize];
        String[] letterGrade = new String[classSize];
                
        System.out.println("Exam \t HW\t\tTotal\t\tGrade");
        
        for(int i = 0; i < classSize; i++){
            examGrades[i] = computeGrade(200);
            hwGrades[i] = computeGrade(100);
            
            studentTotal[i] = (75 * (examGrades[i]/200) + (25 * (hwGrades[i]/100)));
            
            if (studentTotal[i] < 80){
               if (studentTotal[i] > 60){
                   letterGrade[i] = "B";
               }
               else{
                   letterGrade[i] = "C";
               }
            }
            else{
                letterGrade[i] = "A";
            }
            
            System.out.printf("%.0f \t %.0f\t\t%.2f\t\t%5s\n", examGrades[i], hwGrades[i], studentTotal[i], letterGrade[i]);
                        
        }
        System.out.println();
        
        System.out.printf("Exam max: %.0f\n", computeMax(examGrades));
        System.out.printf("HW max: %.0f\n", computeMax(hwGrades));
        System.out.printf("Total max: %.2f\n", computeMax(studentTotal));
  
    }
    
    
    public static double computeGrade(int range){
        int grade;
        
        grade = rnd.nextInt(range);
        
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
}

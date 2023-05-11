//Doğa Kayra Yılmazarslan

import java.util.Scanner;

public class TriangleChecker {

    private static boolean CheckEdges(int edge1, int edge2, int edge3) {
        return (edge1 + edge2 > edge3) && (edge1 + edge3 > edge2) && (edge2 + edge3 > edge1);
    }

    private static void DecideTypeOfTriangle(int edge1, int edge2, int edge3){
        if((edge1 == edge2) && (edge2 == edge3)){
            System.out.println(" an equilateral triangle");
        }
        else if((edge1 == edge2) || (edge2 == edge3) || (edge1 == edge3)){
            System.out.println(" an isosceles triangle");
        }
        else{
            System.out.println(" an scalene triangle");
        }
    }

    public static void main(String[] args){
        int edge1, edge2, edge3;
        boolean is_it_triangle;


        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter edge lengths");
        System.out.println("First");
        edge1 = myObj.nextInt();
        System.out.println("Second");
        edge2 = myObj.nextInt();
        System.out.println("Third:");
        edge3 = myObj.nextInt();
        is_it_triangle = CheckEdges(edge1,edge2,edge3);
        if(is_it_triangle){
            System.out.print("These edges form");
            DecideTypeOfTriangle(edge1,edge2,edge3);
        }
        else{
            System.out.println("These edges do not form a triangle. Perimeter of this triangle is " + (edge1+edge2+edge3));
        }

    }
}

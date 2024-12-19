/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runquad2;

/**
 *
 * @author renzj
 */
import java.util.Scanner;

public class RunQuad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select from the following:\n" +
                         "R - Rectangle\n" +
                         "S - Square\n" +
                         "P - Parallelogram\n" +
                         "H - Rhombus\n" +
                         "T - Trapezoid\n");
                         
        String choice = scanner.nextLine().toUpperCase();

        switch (choice) {
            case "R":
                Rectangle rectangle = new Rectangle();
                System.out.println("A rectangle:");
                rectangle.showDescription();
                break;
            case "S":
                Square square = new Square();
                System.out.println("A square:");
                square.showDescription();
                break;
            case "P":
                Parallelogram parallelogram = new Parallelogram();
                System.out.println("A parallelogram:");
                parallelogram.showDescription();
                break;
            case "H":
                Rhombus rhombus = new Rhombus();
                System.out.println("A rhombus:");
                rhombus.showDescription();
                break;
            case "T":
                Trapezoid trapezoid = new Trapezoid();
                System.out.println("A trapezoid:");
                trapezoid.showDescription();
                break;
            default:
                System.out.println("Invalid choice. Please select R, S, P, H, or T.");
                break;
        }
    }
}

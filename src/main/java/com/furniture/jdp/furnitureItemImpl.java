/*
 * Author Name: Mohit Saini
 * Date: 25-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.furniture.jdp;

public class furnitureItemImpl {
    // The main method which is used to run the program.
    public static void main ( String[] args ) {
        furnitureItem input = new furnitureItem ( );
        input.setFurnitureCode ( 66732 );
        System.out.println ( "Furniture Code = " + input.getFurnitureCode ( ) );
        input.setFurnitureType ( "Chair" );
        System.out.println ( "Furniture Type = " + input.getFurnitureType ( ) );
        input.setFurnitureGrade ( "Grade1" );
        System.out.println ( "Furniture Grade = " + input.getFurnitureGrade ( ) );
        input.setFurnitureColor ( "Red" );
        System.out.println ( "Furniture Color = " + input.getFurnitureColor ( ) );
        input.setFurnitureUsage ( "OutDoor" );
        System.out.println ( "FurnitureUsage = " + input.getFurnitureUsage ( ) );
        input.setFurniturePrice ( 1500.00f );
        System.out.println ( "Furniture Price = " + input.getFurniturePrice ( ) );
        input.calculateDiscount ( );
    }
}

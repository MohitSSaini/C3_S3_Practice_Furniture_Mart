/*
 * Author Name: Mohit Saini
 * Date: 25-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.furniture.jdp;

public class furnitureItem {
    static final int DISCOUNT = 5;
    private int furnitureCode;
    private String furnitureType;
    private String furnitureGrade;
    private String furnitureColor;
    private String furnitureUsage;
    private float furniturePrice;
    
    // A constructor.
    public furnitureItem ( ) {
    }
    
    // This is a getter method.
    public int getFurnitureCode ( ) {
        return furnitureCode;
    }
    
    public String getFurnitureType ( ) {
        return furnitureType;
    }
    
    // A setter method.
    public void setFurnitureCode ( int furnitureCode ) {
        this.furnitureCode = furnitureCode;
    }
    
    public String getFurnitureColor ( ) {
        return furnitureColor;
    }
    
    public String getFurnitureUsage ( ) {
        return furnitureUsage;
    }
    
    public float getFurniturePrice ( ) {
        return furniturePrice;
    }
    
    public String getFurnitureGrade ( ) {
        return furnitureGrade;
    }
    
    public void setFurnitureType ( String furnitureType ) {
        this.furnitureType = furnitureType;
    }
    
    public void setFurnitureGrade ( String furnitureGrade ) {
        this.furnitureGrade = furnitureGrade;
    }
    
    public void setFurnitureColor ( String furnitureColor ) {
        this.furnitureColor = furnitureColor;
    }
    
    public void setFurnitureUsage ( String furnitureUsage ) {
        this.furnitureUsage = furnitureUsage;
    }
    
    public void setFurniturePrice ( float furniturePrice ) {
        this.furniturePrice = furniturePrice;
    }
    
    /**
     * > The function calculates the discount on the furniture price based on the furniture grade and the type of usage
     *
     * @return The discount amount is being returned.
     */
    public void calculateDiscount ( ) {
        String furnitureGrade = getFurnitureGrade ( );
        String type = getFurnitureUsage ( );
        if ( furnitureGrade == "Grade1" && furnitureUsage == "OutDoor" ) {
            float discountedPrice = furniturePrice - ( ( DISCOUNT * furniturePrice ) / 100 );
            System.out.println ( "Discounted Price is $" + discountedPrice );
        }
    
    }
}

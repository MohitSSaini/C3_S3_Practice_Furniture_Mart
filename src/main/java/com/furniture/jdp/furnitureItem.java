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
    private char furnitureGrade;
    private String furnitureColor;
    private String furnitureUsage;
    private float furniturePrice;
    
    public furnitureItem ( ) {
    }
    
    public int getFurnitureCode ( ) {
        return furnitureCode;
    }
    
    public String getFurnitureType ( ) {
        return furnitureType;
    }
    
    public char getFurnitureGrade ( ) {
        return furnitureGrade;
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
    
    public void setFurnitureCode ( int furnitureCode ) {
        this.furnitureCode = furnitureCode;
    }
    
    public void setFurnitureType ( String furnitureType ) {
        this.furnitureType = furnitureType;
    }
    
    public void setFurnitureGrade ( char furnitureGrade ) {
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
}

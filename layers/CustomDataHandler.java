package layers;

import java.util.List;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ShoppingCart;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class CustomDataHandler {
    
    private static final CustomDataHandler singelton = new CustomDataHandler();
    private final IMatDataHandler dataHandler;
    
    private CustomDataHandler(){
        dataHandler = IMatDataHandler.getInstance();
    }
    
    public static CustomDataHandler getInstance(){
        return singelton;
    }
    
    public void addFavorite(Product p){
        this.dataHandler.addFavorite(p);
    }
    
    public List<Product> favorites(){
        return dataHandler.favorites();
    }
    
    public List<Product> findProducts(String s){
        return dataHandler.findProducts(s);
    }
    
    protected ShoppingCart getCart(){
        return this.dataHandler.getShoppingCart();
    }
}

package IMat;


import java.util.List;
import layers.CustomCart;
import layers.CustomDataHandler;
import layers.CustomProduct;
import se.chalmers.ait.dat215.project.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class IMatModel {
    
    private CustomCart cart = CustomCart.getCart();
    private CreditCard card = CustomDataHandler.getInstance().getCard();
    
    public IMatModel(){
        
    }
    
    public void addItem(ShoppingItem sci){
        cart.addItem(sci);
    }
    
    public void addProduct(CustomProduct p){
        cart.addProduct(p);
    }
    
    public String getCardNumber(){
        return card.getCardNumber();
    }    

    public void clearCart(){
        cart.clear();
    }
    
    // This should return a list of created visual items instead when they are made
    public List<ShoppingItem> getItems(){
        return cart.getItems();
    }
    
    public double getTotalCost(){
        return cart.getTotal();
    }
    
    public void removeItemFromCart(int index){
        cart.removeItem(index);
    }
    
    public void removeItemFromCart(ShoppingItem sci){
        cart.removeItem(sci);

    }
    
}
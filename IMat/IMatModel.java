package IMat;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import layers.CustomCart;
import layers.CustomDataHandler;
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

    private final CustomDataHandler handler = CustomDataHandler.getInstance();
    private final CustomCart cart = CustomCart.getCart();
    private final CreditCard card = handler.getCard();
    private final Customer customer = handler.getCustomer();

    public IMatModel() {

    }

    //cart methods
    public void addItem(ShoppingItem sci) {
        cart.addItem(sci);
    }

    public void addProduct(Product p) {
        cart.addProduct(p);
    }

    public void addProduct(Product p, double d) {
        cart.addProduct(p, d);
    }

    public void clearCart() {
        cart.clear();
    }

    // This should return a list of created visual items instead when they are made
    public List<ShoppingItem> getItems() {
        return cart.getItems();
    }

    public double getTotalCost() {
        return cart.getTotal();
    }

    public void removeItemFromCart(int index) {
        cart.removeItem(index);
    }

    public void removeItemFromCart(ShoppingItem sci) {
        cart.removeItem(sci);

    }

    // Order and history
    public Order placeOrder() {
        return this.handler.placeOrder();
    }

    public Order placeOrder(boolean clearShoppingCart) {
        return this.handler.placeOrder(clearShoppingCart);
    }

    public List<Order> getOrders() {
        return this.handler.getOrders();
    }

    //card methods
    public String getCardNumber() {
        return card.getCardNumber();
    }

    public void setCardNumber(String cardNumber) {
        card.setCardNumber(cardNumber);
    }

    public String getCardType() {
        return card.getCardType();
    }

    public void setCardType(String cardType) {
        card.setCardType(cardType);
    }

    public String getHoldersName() {
        return card.getHoldersName();
    }

    public void setHoldersName(String holdersName) {
        card.setHoldersName(holdersName);
    }

    public int getValidMonth() {
        return card.getValidMonth();
    }

    public void setValidMonth(int validMonth) {
        card.setValidMonth(validMonth);
    }

    public int getValidYear() {
        return card.getValidYear();
    }

    public void setValidYear(int validYear) {
        card.setValidYear(validYear);
    }

    public int getVerificationCode() {
        return card.getVerificationCode();
    }

    public void setVerificationCode(int verificationCode) {
        card.setVerificationCode(verificationCode);
    }

     //end of card methods
    //customer methods
    public String getAdress() {
        return customer.getAddress();
    }

    public String getEmail() {
        return customer.getEmail();
    }

    public String getFirstName() {
        return customer.getFirstName();
    }

    public String getLastName() {
        return customer.getLastName();
    }

    public String getMobilePhoneNumber() {
        return customer.getMobilePhoneNumber();
    }

    public String getPhoneNumber() {
        return customer.getPhoneNumber();
    }

    public String getPostAdress() {
        return customer.getPostAddress();
    }

    public String getPostCode() {
        return customer.getPostAddress();
    }

    public void setAddress(String adress) {
        customer.setAddress(adress);
    }

    public void setEmail(String email) {
        customer.setEmail(email);
    }

    public void setFirstName(String fn) {
        customer.setFirstName(fn);
    }

    public void setLastName(String ln) {
        customer.setLastName(ln);
    }

    public void setPhoneNumber(String phonenmr) {
        customer.setPhoneNumber(phonenmr);
    }

    public void setMobilePhoneNumber(String mphonenmr) {
        customer.setMobilePhoneNumber(mphonenmr);
    }

    public void setPostAddress(String postaddress) {
        customer.setPostAddress(postaddress);
    }

    public void setPostCode(String postcode) {
        customer.setPostCode(postcode);
    }

     //end of customer methods
    public boolean isFavorite(Product p) {
        return this.handler.isFavorite(p);
    }

    public boolean changeFavoriteStatus(Product p) {
        boolean becomeFavorite = !isFavorite(p);
        if (becomeFavorite) {
            handler.addFavorite(p);
        } else {
            handler.removeFavorite(p);
        }
        return becomeFavorite;
    }

    public List<Product> getProducts(ProductCategory pc) {
        return handler.getProducts(pc);
    }

    public List<Product> findProducts(String s) {
        return handler.findProducts(s);
    }

    public List<ProductPanel> getProductPanels(ProductCategory pc) {
        List<Product> products = handler.getProducts(pc);
        ArrayList<ProductPanel> panels = new ArrayList(products.size());
        Iterator<Product> it = products.iterator();
        while (it.hasNext()) {
            panels.add(new ProductPanel(it.next(), this));
        }
        return panels;
    }
    
    public List<ProductPanel> getProductPanels(String s) {
        List<Product> products = handler.findProducts(s);
        ArrayList<ProductPanel> panels = new ArrayList(products.size());
        Iterator<Product> it = products.iterator();
        while (it.hasNext()) {
            panels.add(new ProductPanel(it.next(), this));
        }
        return panels;
    }

    public List<ProductPanel> getFavoritePanels() {
        List<Product> favorites = handler.favorites();
        ArrayList<ProductPanel> panels = new ArrayList(favorites.size());
        Iterator<Product> it = favorites.iterator();
        while (it.hasNext()) {
            panels.add(new ProductPanel(it.next(), this));
        }
        return panels;
    }

    public ImageIcon getImageIcon(Product p, int width, int height) {
        return this.handler.getImageIcon(p, width, height);
    }

    public void makeCategoryPanel(JPanel panel, String string, MouseListener categoryListener) {
        panel.removeAll();
        if (string.equals("Frukt & Grönt")) {
            panel.setLayout(new GridLayout(19, 0));
            panel.add(new CategoryPanel("Bakvaror", ProductCategory.FLOUR_SUGAR_SALT, categoryListener));
            panel.add(new CategoryPanel("Bröd", ProductCategory.BREAD, categoryListener));
            panel.add(new CategoryPanel("Drycker", categoryListener));
            panel.add(new CategoryPanel("Fisk", ProductCategory.FISH, categoryListener));
            panel.add(new CategoryPanel("Frukt & Grönt", categoryListener));
            panel.add(new CategoryPanel("    Bär", ProductCategory.BERRY, categoryListener, true));
            panel.add(new CategoryPanel("    Baljväxter", ProductCategory.POD, categoryListener, true));
            panel.add(new CategoryPanel("    Citrusfrukter", ProductCategory.CITRUS_FRUIT, categoryListener, true));
            panel.add(new CategoryPanel("    Exotiska frukter", ProductCategory.EXOTIC_FRUIT, categoryListener, true));
            panel.add(new CategoryPanel("    Grönsaker", ProductCategory.VEGETABLE_FRUIT, categoryListener, true));
            panel.add(new CategoryPanel("    Kål", ProductCategory.CABBAGE, categoryListener, true));
            panel.add(new CategoryPanel("    Meloner", ProductCategory.MELONS, categoryListener, true));
            panel.add(new CategoryPanel("    Stenfrukter", ProductCategory.FRUIT, categoryListener, true));
            panel.add(new CategoryPanel("Kolhydrater", categoryListener));
            panel.add(new CategoryPanel("Kött", ProductCategory.MEAT, categoryListener));
            panel.add(new CategoryPanel("Mejeriprodukter", ProductCategory.DAIRIES, categoryListener));
            panel.add(new CategoryPanel("Nötter & Frön", ProductCategory.NUTS_AND_SEEDS, categoryListener));
            panel.add(new CategoryPanel("Sötsaker", ProductCategory.SWEET, categoryListener));
            panel.add(new CategoryPanel("Örtkryddor", ProductCategory.HERB, categoryListener));
        } else if (string.equals("Drycker")) {
            panel.setLayout(new GridLayout(13, 0));
            panel.add(new CategoryPanel("Bakvaror", ProductCategory.FLOUR_SUGAR_SALT, categoryListener));
            panel.add(new CategoryPanel("Bröd", ProductCategory.BREAD, categoryListener));
            panel.add(new CategoryPanel("Drycker", categoryListener));
            panel.add(new CategoryPanel("    Drycker Kalla", ProductCategory.COLD_DRINKS, categoryListener, true));
            panel.add(new CategoryPanel("    Drycker Varma", ProductCategory.HOT_DRINKS, categoryListener, true));
            panel.add(new CategoryPanel("Fisk", ProductCategory.FISH, categoryListener));
            panel.add(new CategoryPanel("Frukt & Grönt", categoryListener));
            panel.add(new CategoryPanel("Kolhydrater", categoryListener));
            panel.add(new CategoryPanel("Kött", ProductCategory.MEAT, categoryListener));
            panel.add(new CategoryPanel("Mejeriprodukter", ProductCategory.DAIRIES, categoryListener));
            panel.add(new CategoryPanel("Nötter & Frön", ProductCategory.NUTS_AND_SEEDS, categoryListener));
            panel.add(new CategoryPanel("Sötsaker", ProductCategory.SWEET, categoryListener));
            panel.add(new CategoryPanel("Örtkryddor", ProductCategory.HERB, categoryListener));
        } else if (string.equals("Kolhydrater")) {
            panel.setLayout(new GridLayout(13, 0));
            panel.add(new CategoryPanel("Bakvaror", ProductCategory.FLOUR_SUGAR_SALT, categoryListener));
            panel.add(new CategoryPanel("Bröd", ProductCategory.BREAD, categoryListener));
            panel.add(new CategoryPanel("Drycker", categoryListener));
            panel.add(new CategoryPanel("Fisk", ProductCategory.FISH, categoryListener));
            panel.add(new CategoryPanel("Frukt & Grönt", categoryListener));
            panel.add(new CategoryPanel("Kolhydrater", categoryListener));
            panel.add(new CategoryPanel("    Pasta", ProductCategory.PASTA, categoryListener, true));
            panel.add(new CategoryPanel("    Potatis, ris", ProductCategory.POTATO_RICE, categoryListener, true));
            panel.add(new CategoryPanel("Kött", ProductCategory.MEAT, categoryListener));
            panel.add(new CategoryPanel("Mejeriprodukter", ProductCategory.DAIRIES, categoryListener));
            panel.add(new CategoryPanel("Nötter & Frön", ProductCategory.NUTS_AND_SEEDS, categoryListener));
            panel.add(new CategoryPanel("Sötsaker", ProductCategory.SWEET, categoryListener));
            panel.add(new CategoryPanel("Örtkryddor", ProductCategory.HERB, categoryListener));
        } else {
            panel.add(new CategoryPanel("Bakvaror", ProductCategory.FLOUR_SUGAR_SALT, categoryListener));
            panel.add(new CategoryPanel("Bröd", ProductCategory.BREAD, categoryListener));
            panel.add(new CategoryPanel("Drycker", categoryListener));
            panel.add(new CategoryPanel("Fisk", ProductCategory.FISH, categoryListener));
            panel.add(new CategoryPanel("Frukt & Grönt", categoryListener));
            panel.add(new CategoryPanel("Kolhydrater", categoryListener));
            panel.add(new CategoryPanel("Kött", ProductCategory.MEAT, categoryListener));
            panel.add(new CategoryPanel("Mejeriprodukter", ProductCategory.DAIRIES, categoryListener));
            panel.add(new CategoryPanel("Nötter & Frön", ProductCategory.NUTS_AND_SEEDS, categoryListener));
            panel.add(new CategoryPanel("Sötsaker", ProductCategory.SWEET, categoryListener));
            panel.add(new CategoryPanel("Örtkryddor", ProductCategory.HERB, categoryListener));
        }
    }
    
    public ProductCategory getCategory(String name){
        String trim = name.trim();
        String lowerCase = trim.toLowerCase();
        switch (lowerCase){
            case "bär":
                return ProductCategory.BERRY;
            case "bröd":
                return ProductCategory.BREAD;
            case "kål":
                return ProductCategory.CABBAGE;
            case "citrus":
            case "citrusfrukt":
            case "citrus frukt":
                return ProductCategory.CITRUS_FRUIT;
            case "kalla drycker":
                return ProductCategory.COLD_DRINKS;
            case "mejeri":
            case "mejeriprodukter":
                return ProductCategory.DAIRIES;
            case "pasta":
                return ProductCategory.PASTA;
        }
        return null;
    }

    public void shutDown() {
        this.handler.shutDown();
    }
}

package IMat;

import Utility.PopularCounter;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
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
    private final User user = handler.getUser();
    private final PopularCounter popCounter;
    private boolean loggedIn;
    private String lastCategory;

    public IMatModel() {
        this.popCounter = new PopularCounter(this);
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
    
    public void setItemAmount(ShoppingItem sci, double newAmount){
        cart.setItemAmount(sci, newAmount);
    }
    
    public void addOrderToCart(Order order){
        cart.addOrderToCart(order);
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
    
    public void removeProductFromCart(Product p){
        cart.removeProduct(p);
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
    
    // user methods
    public String getUserName(){
        return this.user.getUserName();
    }
    
    private String getUserPassword(){
        return this.user.getPassword();
    }
    
    private void setUserName(String name){
        this.user.setUserName(name);
    }
    
    private void setUserPassword(String password){
        this.user.setPassword(password);
    }
    
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

    public List<Product> getProducts() {
        return handler.getProducts();
    }
    
    public List<Product> getProducts(ProductCategory pc) {
        return handler.getProducts(pc);
    }

    public List<Product> findProducts(String s) {
        if (!s.equals(""))
            return handler.findProducts(s);
        else
            return this.getProducts();
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
    
    public List<StartProductPanel> getWeeklyProducts() {
        ArrayList<StartProductPanel> panels = new ArrayList(3);
        
        panels.add(new StartProductPanel(findCorespondingProduct("lasagne"), this));
        panels.add(new StartProductPanel(findCorespondingProduct("köttfärs"), this));
        panels.add(new StartProductPanel(findCorespondingProduct("vete"), this));
        
        return panels;
    }
    
    public Product findCorespondingProduct(String name){
        if(!handler.findProducts(name).isEmpty())
            return handler.findProducts(name).get(0);
        else 
            return null;
    }
    
    public List<ProductPanel> getProductPanels(String s) {
        List<Product> products = null;
        if (s == null){
            
        } else if(s.equals("Frukt & Grönt")){
            products = this.getProducts(ProductCategory.BERRY);
            products.addAll(this.getProducts(ProductCategory.POD));
            products.addAll(this.getProducts(ProductCategory.CITRUS_FRUIT));
            products.addAll(this.getProducts(ProductCategory.EXOTIC_FRUIT));
            products.addAll(this.getProducts(ProductCategory.VEGETABLE_FRUIT));
            products.addAll(this.getProducts(ProductCategory.CABBAGE));
            products.addAll(this.getProducts(ProductCategory.MELONS));
            products.addAll(this.getProducts(ProductCategory.FRUIT));
        } else if(s.equals("Drycker")){
            products = this.getProducts(ProductCategory.HOT_DRINKS);
            products.addAll(this.getProducts(ProductCategory.COLD_DRINKS));
        } else if (s.equals("Kolhydrater")){
            products = this.getProducts(ProductCategory.PASTA);
            products.addAll(this.getProducts(ProductCategory.POTATO_RICE));
        } else
            products= handler.findProducts(s);
            ArrayList<ProductPanel> panels = new ArrayList(products.size());
            Iterator<Product> it = products.iterator();
        while (it.hasNext()) {
            panels.add(new ProductPanel(it.next(), this));
        }
        lastCategory = s;
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
    
    public List<ProductPanel> getOfthenBought(int leastTimesBought, int amountOfProducts){
        List<Product> mostBought = popCounter.getMostBought(leastTimesBought, amountOfProducts);
        LinkedList<ProductPanel> panels = new LinkedList();
        Iterator<Product> it = mostBought.iterator();

        while (it.hasNext()){
            Product tempProd = it.next();
            panels.add(new ProductPanel(tempProd, this));
        }
        return panels;
    }
    
    public List<StartProductPanel> getOfthenBoughtStart(int leastTimesBought, int amountOfProducts){
        List<Product> mostBought = popCounter.getMostBought(leastTimesBought, amountOfProducts);
        LinkedList<StartProductPanel> panels = new LinkedList();
        Iterator<Product> it = mostBought.iterator();

        while (it.hasNext()){
            Product tempProd = it.next();
            panels.add(new StartProductPanel(tempProd, this));
        }
        return panels;
    }
    
    
    public List<CategoryPreviewPanel> getCategoryPreviewPanels(String name, 
            IMatModel m, MouseListener listener){
        ArrayList<CategoryPreviewPanel> list = new ArrayList();
        switch (name){
            case ("Frukt & Grönt"):
                list.add(new CategoryPreviewPanel("Frukt & Grönt", m, listener));
                list.add(new CategoryPreviewPanel("Bär", ProductCategory.BERRY, 
                        m, listener));
                list.add(new CategoryPreviewPanel("Baljväxter", ProductCategory.POD, 
                        m, listener));
                list.add(new CategoryPreviewPanel("CitrusFrukter", ProductCategory.CITRUS_FRUIT, 
                        m, listener));
                list.add(new CategoryPreviewPanel("Exotiska Frukter", ProductCategory.EXOTIC_FRUIT, 
                        m, listener));
                list.add(new CategoryPreviewPanel("Grönsaker", ProductCategory.VEGETABLE_FRUIT, 
                        m, listener));
                list.add(new CategoryPreviewPanel("Kål", ProductCategory.CABBAGE, 
                        m, listener));
                list.add(new CategoryPreviewPanel("Meloner", ProductCategory.MELONS, 
                        m, listener));
                list.add(new CategoryPreviewPanel("Stenfrukter", ProductCategory.FRUIT, 
                        m, listener));
                break;
            case ("Kolhydrater"):
                list.add(new CategoryPreviewPanel("Kolhydrater", m, listener));
                list.add(new CategoryPreviewPanel("Pasta", ProductCategory.PASTA, 
                        m, listener));
                list.add(new CategoryPreviewPanel("Potatis, ris", ProductCategory.POTATO_RICE, 
                        m, listener));
                break;
            case ("Drycker"):
                list.add(new CategoryPreviewPanel("Drycker", m, listener));
                list.add(new CategoryPreviewPanel("Drycker Kalla", ProductCategory.COLD_DRINKS, 
                        m, listener));
                list.add(new CategoryPreviewPanel("Drycker Varma", ProductCategory.HOT_DRINKS, 
                        m, listener));
                break;
        }
        return list;
    }
    
    public List<StartProductPanel> getStartProductPanels(ProductCategory pc) {
          List<Product> products = handler.getProducts(pc);
          ArrayList<StartProductPanel> panels = new ArrayList(products.size());
          Iterator<Product> it = products.iterator();
          while (it.hasNext()) {
              panels.add(new StartProductPanel(it.next(), this));
          }
          return panels;
      }

    public ImageIcon getImageIcon(Product p, int width, int height) {
        return this.handler.getImageIcon(p, width, height);
    }
    
    public void addCartListener(ShoppingCartListener scl){
        this.cart.addCartListener(scl);
    }
    
    public void removeCartListener(ShoppingCartListener scl){
        this.cart.removeCartListener(scl);
    }
    
    public boolean isLoggedIn(){
        return loggedIn;
    }
    
    public void logOut(){
        loggedIn = false;
    }
    
    public boolean logIn(String userName, char[] password){
        loggedIn = (this.getUserName()).equals(userName) &&
                (this.getUserPassword()).equals(constructPassword(password));
        return loggedIn;
    }
    
    public void register(String userName, char[] password){
        this.setUserName(userName);
        this.setUserPassword(constructPassword(password));
        loggedIn = true;
    }
    
    public String constructPassword(char[] pw){
        StringBuilder sb = new StringBuilder();
        for (char c : pw)
            sb.append(c);
        return sb.toString();
    }

    public void makeCategoryPanel(JPanel panel, String s, MouseListener categoryListener) {
        panel.removeAll();
        if (s.equals("Frukt & Grönt") && !lastCategory.equals(s)) {
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
            lastCategory = s;
        } else if (s.equals("Drycker") && !lastCategory.equals(s)) {
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
            lastCategory = s;
        } else if (s.equals("Kolhydrater") && !lastCategory.equals(s)) {
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
            lastCategory = s;
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
            lastCategory = "";
        }
    }
    
    public void setLastCategory(String s){
        lastCategory = s;
    }
    
    public void reSetLastCategory(){
        lastCategory = "";
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
            case "exotisk":
            case "exotisk frukt":
                return ProductCategory.EXOTIC_FRUIT;
            case "fisk":
               return ProductCategory.FISH;
            case "bak":
            case "bakvaror":
                return ProductCategory.FLOUR_SUGAR_SALT;
            case "frukt":
                return ProductCategory.FRUIT;
            case "ört":
            case "örter":
            case "örtkryddor":
                return ProductCategory.HERB;
            case "varma drycker":
                return ProductCategory.HOT_DRINKS;
            case "kött":
            case "mord":
                return ProductCategory.MEAT;
            case "melon":
            case "meloner":
                return ProductCategory.MELONS;
            case "frön":
            case "nötter":
            case "frön och nötter":
            case "nötter och frön":
                return ProductCategory.NUTS_AND_SEEDS;
            case "pasta":
                return ProductCategory.PASTA;
            case "baljväxter":
            case "balj":
            case "bönor":
                return ProductCategory.POD;
            case "potatis":
            case "ris":
                return ProductCategory.POTATO_RICE;
            case "rot":
            case "rotgrönsak":
            case "rotgrönsaker":
                return ProductCategory.ROOT_VEGETABLE;
            case "söt":
            case "sötsaker":
                return ProductCategory.SWEET;
            case "grönsak":
            case "grön":
            case "grönsaker":
            case "grönsaksfrukt":
            case "grönsaksfrukter":
                return ProductCategory.VEGETABLE_FRUIT;
        }
        return null;
    }

    public void shutDown() {
        this.handler.shutDown();
    }
}

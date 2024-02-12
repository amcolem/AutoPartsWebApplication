package BusinessObjects;

import java.util.ArrayList;

public class Cart {
    ArrayList<CartProducts> cartProductList = new ArrayList<>();

    public ArrayList<CartProducts> getProductList() {
        return cartProductList;
    }

    public void setCartProductList(ArrayList<CartProducts> cartProductList) {
        this.cartProductList = cartProductList;
    }

    public void addCartProduct(CartProducts product) {
        cartProductList.add(product);
    }

    public void removeCartProduct(CartProducts product) {
        cartProductList.remove(product);
    }

    public double getTotalPrice() {
        double sum = 0;

        for (CartProducts product : cartProductList) {
            sum = sum + product.getTotalPrice();
        }
        return sum;
    }
}

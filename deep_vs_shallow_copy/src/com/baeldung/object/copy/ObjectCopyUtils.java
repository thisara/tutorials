package com.baeldung.object.copy;

import java.util.ArrayList;
import java.util.List;

public class ObjectCopyUtils {

    public ShoppingCart shallowCopy(ShoppingCart shoppingCart) {

        ShoppingCart shallowCopyOfObject = shoppingCart;

        shallowCopyOfObject.setCartName("ShallowCopyCart");

        return shallowCopyOfObject;
    }

    public ShoppingCart deepCopy(ShoppingCart shoppingCart) {

        ShoppingCart deepCopyOfObject = new ShoppingCart();

        List<String> itemList = new ArrayList<String>();

        shoppingCart.getItems()
            .stream()
            .forEach(t -> itemList.add(t));

        deepCopyOfObject.setCartName("DeepCopyCart");
        deepCopyOfObject.setItems(itemList);

        return deepCopyOfObject;
    }

    public ShoppingCart deepCopyByClone(ShoppingCart shoppingCart) throws CloneNotSupportedException {

        ShoppingCart deepCopyOfObject = (ShoppingCart) shoppingCart.clone();

        List<String> itemList = new ArrayList<String>();

        shoppingCart.getItems()
            .stream()
            .forEach(item -> itemList.add(item));

        deepCopyOfObject.setCartName("DeepCopyCart");
        deepCopyOfObject.setItems(itemList);

        return deepCopyOfObject;
    }

}

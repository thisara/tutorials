package com.baeldung.object.copy;

import java.util.ArrayList;
import java.util.List;

public class ObjectCopyUtils {

    public ShoppingCart shallowCopy(ShoppingCart shoppingCart) {

        ShoppingCart shallowCopyOfObject = shoppingCart;

        return shallowCopyOfObject;
    }

    public ShoppingCart deepCopy(ShoppingCart shoppingCart) {

        ShoppingCart deepCopyOfObject = new ShoppingCart();

        List<String> itemList = new ArrayList<String>();

        shoppingCart.getItems()
            .stream()
            .forEach(t -> itemList.add(t));

        deepCopyOfObject.setItems(itemList);

        return deepCopyOfObject;
    }

    @SuppressWarnings("unchecked")
    public ShoppingCart deepCopyByClone(ShoppingCart shoppingCart) throws CloneNotSupportedException {

        ShoppingCart deepCopyOfObject = (ShoppingCart) shoppingCart.clone();
        
        ArrayList<String> itemsList = (ArrayList<String>) shoppingCart.getItems();

        deepCopyOfObject.setItems((ArrayList<String>)itemsList.clone());
        
        return deepCopyOfObject;
    }
}

package com.example.jpetstore.service;

import java.util.List;

import com.example.jpetstore.domain.Account;
import com.example.jpetstore.domain.Category;
import com.example.jpetstore.domain.Item;
import com.example.jpetstore.domain.Order;
import com.example.jpetstore.domain.Product;

/**
 * JPetStore's central business interface.
 *
 * @author Juergen Hoeller
 * @since 30.11.2003
 */
public interface PetStoreFacade {

	Account getAccount(String username);

	Account getAccount(String username, String password);

	void insertAccount(Account account);

	void updateAccount(Account account);

	List<String> getUsernameList();


	List<Category> getCategoryList();

	Category getCategory(String categoryId);
	

	List<Product> getProductListByCategory(String categoryId);

	List<Product> searchProductList(String keywords);

	Product getProduct(String productId);


	List<Item> getItemListByProduct(String productId);

	Item getItem(String itemId);

	boolean isItemInStock(String itemId);
	//Added method
	void insertItem(Item item);


	void insertOrder(Order order);

	Order getOrder(int orderId);

	List<Order> getOrdersByUsername(String username);
	
	
	/*좋아요와 인기리스트 기능 */
	void updateCountView(String itemId, String username);
	void updateCountLike(String itemId, String username);

	List<Category> selectBestCategoryList(String categoryId);
	List<Category> selectBestList();

	void updateCountView(String itemId);
	/*좋아요와 인기리스트 기능  */

}
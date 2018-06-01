package com.example.jpetstore.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.jpetstore.domain.Item;
import com.example.jpetstore.domain.Order;

public interface ItemDao {

  public void updateQuantity(Order order) throws DataAccessException;

  boolean isItemInStock(String itemId) throws DataAccessException;

  List<Item> getItemListByProduct(String productId) throws DataAccessException;

  Item getItem(String itemId) throws DataAccessException;

  void insertItem(Item item) throws DataAccessException;
  
  void updateQuantityForInsertItem(Item item) throws DataAccessException;
  
  /*조회수 좋아요 업로드*/
  public void updateCountView(String itemId) throws DataAccessException;
  public void insertCountActivity(String itemId, String username);

  public void updateCountLike(String itemId) throws DataAccessException;
  public void insertCountLikeActivity(String itemId, String username);
  /*조회수 좋아요 업로드*/
}

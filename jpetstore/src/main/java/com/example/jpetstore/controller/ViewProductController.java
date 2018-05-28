package com.example.jpetstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.jpetstore.domain.Item;
import com.example.jpetstore.domain.Product;
import com.example.jpetstore.service.PetStoreFacade;

/**
 * @author Juergen Hoeller
 * @since 30.11.2003
 * @modified-by Changsup Park
 */
@Controller
@SessionAttributes({"category", "productList"})
public class ViewProductController { 

	private PetStoreFacade petStore;

	@Autowired
	public void setPetStore(PetStoreFacade petStore) {
		this.petStore = petStore;
	}

	@RequestMapping("/shop/viewProduct.do")
	public String handleRequest(
			@RequestParam("productId") String productId,
			ModelMap model) throws Exception {
		PagedListHolder<Item> itemList = new PagedListHolder<Item>(
				this.petStore.getItemListByProduct(productId));
		itemList.setPageSize(4);
//		Product product = this.petStore.getProduct(productId); 
//		Product 자체에 대한 정보를 또 검색하는 코드. Item 정보만 가지고 있어도 Product 정보를 가져올수 있는데 왜 중복되게 함?
//		따라서 아랫줄 처럼 수정 
		Product product = itemList.getPageList().get(0).getProduct();
		model.put("itemList", itemList);
		model.put("product", product);
		return "Product";
	}
	
	@RequestMapping("/shop/viewProduct2.do")
	public String handleRequest2(
			@ModelAttribute("product") Product product,
			@ModelAttribute("itemList") PagedListHolder<Item> itemList,
			@RequestParam("pageName") String page, 
			ModelMap model) throws Exception {
		if ("next".equals(page)) {
			itemList.nextPage();
		}
		else if ("previous".equals(page)) {
			itemList.previousPage();
		}
		model.put("itemList", itemList);
		model.put("product", product);
		return "Product";
	}
}

package br.com.foursys.fourcamp.fourstore.service;

import java.util.List;

import br.com.foursys.fourcamp.fourstore.data.SaleData;
import br.com.foursys.fourcamp.fourstore.exception.ProductNotFoundException;
import br.com.foursys.fourcamp.fourstore.exception.StockInsufficientException;
import br.com.foursys.fourcamp.fourstore.model.Sale;



public class SaleService {

private SaleData saleData;
private ProductService productService;

    public SaleService() {
        this.saleData = new SaleData();
        this.productService = new ProductService();
    }

   
    public String storeSale(Sale sale) throws StockInsufficientException, ProductNotFoundException {
    	productService.validatePurchase(sale);
    	saleData.store(sale);
        return createMessageResponse(sale.getId(), " criado ");
    }
   
    public List<Sale> indexSale() {
        List<Sale> allTransactions = saleData.index();
        return allTransactions;
    }

    private String createMessageResponse(Integer id, String s) {
        return s + "Transação com a ID " + id;
    }
    

}
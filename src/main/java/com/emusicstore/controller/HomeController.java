package com.emusicstore.controller;

        import com.emusicstore.dao.ProductDao;
        import com.emusicstore.model.Product;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.RequestMapping;
        import java.util.List;

/**
 * Created by snow on 27/07/2016.
 */




@Controller
public class HomeController {

    ProductDao p=new ProductDao();


    @RequestMapping("/")
    public String home() {
        return "home";
    }


@RequestMapping("/productList")
    public String getProducts(Model model){
    List<Product> product= p.getProductList();
    model.addAttribute("product",product);
    return "productList";
}

@RequestMapping("/viewProducts")
    public String viewProducts(){

    return "viewProducts";

}


}



package org.wecancoeit.reviews;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class ReviewController {

    @Resource
    private ReviewRepository reviewRepo;

    @RequestMapping("/")
    public String homePage() { return "home.html"; }

    @RequestMapping("/reviews")
    public String findAllReviews(Model model){
        model.addAttribute("productModel", reviewRepo.findAll());
        return "reviewTemplate";
    }
    @RequestMapping("/review/{id}")
    public String findOneReview(@PathVariable Long id, Model model)  {
        model.addAttribute("productModel", reviewRepo.findOne(id));
        return "reviewTemplate";
    }

}

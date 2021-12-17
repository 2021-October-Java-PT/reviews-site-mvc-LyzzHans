package org.wecancoeit.reviews;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class ReviewController {

    @Resource
    private ReviewRepository reviewRepo;

    @RequestMapping("/")
    public String homePage() { return "home.html"; }

    @RequestMapping("/reviews")
    public String findAllReviews(Model model){
        model.addAttribute("reviewsModel", reviewRepo.findAll());
        return "reviewsTemplate";
    }
    @RequestMapping("/review")
    public String findOneReview(@RequestParam(value = "id") Long id)  {
        return "reviewTemplate";
    }

}

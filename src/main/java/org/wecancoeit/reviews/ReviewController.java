package org.wecancoeit.reviews;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class ReviewController {


    @RequestMapping("/reviews")
    public String findAllReviews() {
        return "reviewsTemplate";
    }

   @Resource
    private ReviewRepository reviewRepo;

   @RequestMapping("/")
   public String homePage() { return "home.html"; }

    @RequestMapping("/review")
   public String findOneReview(@RequestParam(value = "id") Long id)  {
       return "reviewTemplate";
   }

}

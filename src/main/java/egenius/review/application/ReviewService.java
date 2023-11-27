package egenius.review.application;

import egenius.review.dto.RequestDogIds;
import egenius.review.dto.ReviewRequest;
import egenius.review.response.ProductIdsDto;

public interface ReviewService {

    void createReview(ReviewRequest reviewRequest);
    ProductIdsDto getProductIds(RequestDogIds requestDogIds);


}

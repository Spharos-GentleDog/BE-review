package egenius.review.application;

import egenius.review.dto.ReviewRequest;

public interface ReviewService {

    void createReview(ReviewRequest reviewRequest);

}

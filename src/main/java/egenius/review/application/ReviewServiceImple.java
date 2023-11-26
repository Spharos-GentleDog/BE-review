package egenius.review.application;

import egenius.review.dto.ReviewRequest;
import egenius.review.entity.ReviewEntity;
import egenius.review.infrastructure.ReviewRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class ReviewServiceImple implements ReviewService {

    private final ReviewRepository reviewRepository;
    @Override
    public void createReview(ReviewRequest reviewRequest) {
        ReviewEntity reviewEntity =
                ReviewEntity.createReview(
                        reviewRequest.getProductId(),
                        reviewRequest.getUserId(),
                        reviewRequest.getContent(),
                        reviewRequest.getRating(),
                        reviewRequest.getDogId(),
                        reviewRequest.getProductDetailId()
                );

        reviewRepository.save(reviewEntity);

    }
}

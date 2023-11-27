package egenius.review.presentation;

import egenius.global.common.response.BaseResponse;
import egenius.review.application.ReviewService;
import egenius.review.dto.RequestDogIds;
import egenius.review.dto.ReviewRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/review")
@Slf4j
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

    @PostMapping("/create-review")
    public BaseResponse<?> createReview(@RequestBody ReviewRequest reviewRequest) {
        log.info("reviewRequest: {}", reviewRequest);
        reviewService.createReview(reviewRequest);

        return new BaseResponse<>();

    }

    @PostMapping("/find-review-dogId")
    public BaseResponse<?> findReview(@RequestBody RequestDogIds requestDogIds){
        log.info("findReview");
        return new BaseResponse<>(reviewService.getProductIds(requestDogIds));
    }
}

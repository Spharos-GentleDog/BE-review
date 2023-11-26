package egenius.review.dto;

import jakarta.persistence.Column;
import lombok.Getter;

@Getter
public class ReviewRequest {

    private Long productId;
    private Long userId;
    private String content;
    private Integer rating;
    private Long dogId;
    private Long productDetailId;

}

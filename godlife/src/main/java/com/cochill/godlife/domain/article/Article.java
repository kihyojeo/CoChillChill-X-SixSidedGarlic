package com.cochill.godlife.domain.article;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Article {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long board_no;
   @ManyToOne
    private long user_no;
   @OneToOne
    private long category_id;
    private String board_title;
    private String board_content;
    private LocalDateTime created_at;
    private LocalDateTime last_updated_at;
    private long hits;
    private long like_count;
    private boolean available_yn;
    private long comment_count;

}

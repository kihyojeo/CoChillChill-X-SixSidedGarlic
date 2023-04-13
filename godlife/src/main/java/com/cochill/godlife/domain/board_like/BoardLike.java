package com.cochill.godlife.domain.board_like;

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
public class BoardLike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long like_no;
    @ManyToOne
    private long user_no;
    @ManyToOne
    private long board_no;
    private LocalDateTime created_at;
    private LocalDateTime canceled_at;

}

package com.ssafy.db.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * 질문 모델 정의.
 */
@Entity
@Getter
@Setter
public class QuestionOption extends BaseEntity{
    @ManyToOne(fetch = FetchType.LAZY)
    private Question question;

    String optionContent;
    String optionContentIndex;
}
package com.ssafy.api.service;

import com.ssafy.api.request.QuestionPatcherPostReq;
import com.ssafy.api.request.UserRegisterPostReq;
import com.ssafy.db.entity.Question;

import java.util.List;

/**
 *	질문 관련 비즈니스 로직 처리를 위한 서비스 인터페이스 정의.
 */
public interface QuestionService {

	void createQuestion(String questionContent);

	List<Question> getQuestion();

	void patchQuestion(QuestionPatcherPostReq questionInfo);

	void deleteQuestion(List<Long> questionId);
}

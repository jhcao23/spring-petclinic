package org.springframework.samples.petclinic.model.mongo;

import org.springframework.data.mongodb.core.mapping.DBRef;

public class Answer extends AbstractDocument {

	@DBRef
	private Question question;	
	private int score;
	private String comment;

	public Question getQuestion() {
		return question;
	}

	public int getScore() {
		return score;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}

package org.springframework.samples.petclinic.model.mongo;

import java.util.List;

import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SurveyPaper extends AbstractDocument {

	@DBRef
	private SurveyExam surveyExam;
	private String surveyPaperName;	
	private String description;
	private int seqId;
	@DBRef
	private List<Question> questions;
	
	@PersistenceConstructor
	public SurveyPaper(SurveyExam exam, String paperName, String desc, int seqId){
		this.surveyExam = exam;
		this.surveyPaperName = paperName;
		this.description = desc;
		this.seqId = seqId;
	}
	
	public String getSurveyPaperName() {
		return surveyPaperName;
	}

	public int getSeqId() {
		return seqId;
	}

	public void setSurveyPaperName(String surveyPaperName) {
		this.surveyPaperName = surveyPaperName;
	}

	public void setSeqId(int seqId) {
		this.seqId = seqId;
	}

	public SurveyExam getSurveyExam() {
		return surveyExam;
	}

	public void setSurveyExam(SurveyExam surveyExam) {
		this.surveyExam = surveyExam;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}

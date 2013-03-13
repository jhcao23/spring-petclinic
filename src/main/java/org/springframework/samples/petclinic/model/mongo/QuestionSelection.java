package org.springframework.samples.petclinic.model.mongo;

public class QuestionSelection {
	
	private String label;
	private int score;
	private int seqId;
	
	public String getLabel() {
		return label;
	}
	public int getScore() {
		return score;
	}
	public int getSeqId() {
		return seqId;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setSeqId(int seqId) {
		this.seqId = seqId;
	}
	
}

package com.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ans {
	
	@Id
	@Column(name="ans_id")
	private int ansId;
	private String ans;
	
	@ManyToOne
	private Ques ques;

	public Ans(int ansId, String ans, Ques ques) {
		super();
		this.ansId = ansId;
		this.ans = ans;
		this.ques = ques;
	}

	public Ans() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAnsId() {
		return ansId;
	}

	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public Ques getQues() {
		return ques;
	}

	public void setQues(Ques ques) {
		this.ques = ques;
	}
	
	

}

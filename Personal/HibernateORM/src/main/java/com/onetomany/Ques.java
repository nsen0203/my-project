package com.onetomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ques {
	
	@Id
	@Column(name="ques_id")
	private int quesId;
	private String ques;
	
	@OneToMany(mappedBy="ques", fetch=FetchType.EAGER)
	private List<Ans> ans;

	public Ques() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ques(int quesId, String ques, List<Ans> ans) {
		super();
		this.quesId = quesId;
		this.ques = ques;
		this.ans = ans;
	}

	public int getQuesId() {
		return quesId;
	}

	public void setQuesId(int quesId) {
		this.quesId = quesId;
	}

	public String getQues() {
		return ques;
	}

	public void setQues(String ques) {
		this.ques = ques;
	}

	public List<Ans> getAns() {
		return ans;
	}

	public void setAns(List<Ans> ans) {
		this.ans = ans;
	}
	
	
	

}

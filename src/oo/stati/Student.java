package oo.stati;

import java.util.ArrayList;

public class Student {
	int english;
	int math;
	int chinese;
	static int pass = 60;
	
	public Student(){
	}
	
	public Student(int english, int math, int chinese) {
		super();
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
	
	public void print(){
		System.out.println(getScore(english)+"\t"
			+getScore(math)+"\t"+getScore(chinese));
	}
	
	protected String getScore(int score){
		if (score < pass){
			return String.valueOf(score)+"*";
		}else{
			return String.valueOf(score);
		}
	}
	
	@Override
	public String toString(){
		return 
				"eng:"+english +"\n" +
				"chinese:" + chinese +"\n" +
				"math:" + math;
	}
}

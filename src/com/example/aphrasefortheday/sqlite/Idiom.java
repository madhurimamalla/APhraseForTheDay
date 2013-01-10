package com.example.aphrasefortheday.sqlite;

public class Idiom {

	//private variables
	int _id;
	String _idiom;
	String _tag1;
	String _tag2;
	String _meaning;
	
	
	//Empty constructor
	public Idiom() {
		
	}
	
	//Constructor
	public Idiom(int id, String idiom, String tag1, String tag2, String meaning){
		this._id=id;
		this._idiom=idiom;
		this._meaning=meaning;
		this._tag1=tag1;
		this._tag2=tag2;
	}
	
	//Constructor
	public Idiom(String idiom, String meaning) {
		this._idiom=idiom;
		this._meaning=meaning;
	}
	
	//getting ID
	public int getID(){
		return this._id;
	}
	
	
	//Setting ID
	public void setID(int id){
		this._id=id;
	}
	
	
	//Getting idiom
	public String getIdiom(){
		return this._idiom;
	}
	
	//Setting idiom
	public void setIdiom(String idiom){
		this._idiom=idiom;
	}

	//Getting meaning
	public String getMeaning() {
		return this._meaning;
	}
	
	//Setting meaning
	public void setMeaning(String meaning) {
		this._meaning=meaning;
	}
	
	//getting tag1
	public String getTag1() {
		return this._tag1;		
	}
	
	//Setting tag1
	public void setTag1(String tag1) {
		this._tag1=tag1;
	}
	
	//Getting tag2
	public String getTag2() {
		return this._tag2;
	}
	
	//Setting tag2
	public void setTag2(String tag2) {
		this._tag2=tag2;
	}
	
	
}

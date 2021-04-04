package org.lang;

public class LanguageInfo extends StateDetails{
	public void tamilLanguage() {
		System.out.println("Tamil Language");

	}
	public void englishLanguage() {
		System.out.println("English Language");
	}
	
	public void hindiLanguage() {
		System.out.println("Hindi Language");
	}
	public static void main(String[] args) {
		
		LanguageInfo li=new LanguageInfo();
		li.tamilLanguage();
		li.englishLanguage();
		li.hindiLanguage();
		li.southIndia();
		li.northIndia();
		
		
	}
	

}

package day1.ResumeAnalyzer;
import java.util.Set;

public class ResumeData {
	private String email;
	private String phone;
	private Set<String> matchedKeywords;
	private int keywordCount;
	
	public ResumeData(String email, String phone, Set<String> matchedKeyword) {
		this.email = email;
		this.phone = phone;
		this.matchedKeywords = matchedKeyword;
		this.setKeywordCount(matchedKeyword.size());
	}
	
	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return "[Email: "+email+", Phone No.: "+phone+", Keywords: "+matchedKeywords+
				", Count: "+getKeywordCount();
	}

	public int getKeywordCount() {
		return keywordCount;
	}

	public void setKeywordCount(int keywordCount) {
		this.keywordCount = keywordCount;
	}
}
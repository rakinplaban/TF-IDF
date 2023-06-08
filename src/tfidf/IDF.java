package tfidf;
import java.lang.*;

public class IDF {
	private String d1;
	private String d2;
	private String word;
	
	public IDF(String d1,String d2, String word) {
		this.d1 = d1;
		this.d2 = d2;
		this.word = word;
	}
	
	public double inverse_document_frq() {
		String fd1 = d1.replaceAll("\\p{Punct}","");
        String[] words = fd1.toLowerCase().split("\\s+");
        String fd2 = d1.replaceAll("\\p{Punct}","");
        String[] words2 = fd2.toLowerCase().split("\\s+");
        
        int count = 0;
        boolean flag1 = false;
        boolean flag2 = false;
        
        for (String w : words) {
            if (w.equals(word)) {
                flag1 = true;
            }
        }
        
        for (String w : words2) {
            if (w.equals(word)) {
                flag2 = true;
            }
        }
        
        if(flag1 == true && flag2== true) {
        	count = 2;
        }else if(!flag1 && !flag2) {
        	count = 0;
        }else {
        	count = 1;
        }
        
        return (double) Math.log(count/2);
    }
}

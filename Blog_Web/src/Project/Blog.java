package Project;

public class Blog {
	public int post_id;
	public int author_id;
	public String title;
	public String content;
	
	public Blog() {
		
	}
	public Blog(int post_id, int author_id,String title,String content) {
		this.post_id=post_id;
		this.author_id=author_id;
		this.title=title;
		this.content=content;
	}
	
	public String toString() {
        return "";
    }
}

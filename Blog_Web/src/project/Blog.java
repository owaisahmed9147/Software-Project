package project;

public class Blog {
	public int postid,authorid;
	public String title,content;
	
	public Blog() {
		
	}
	public Blog(int postid,int authorid,String title,String content) {
		this.postid = postid;
		this.authorid = authorid;
		this.title = title;
		this.content = content;
	}
	
	public String toString() {
        return "Post ID: " + postid + " Author Id: " + authorid + " Title: " + title + " Content: " + content;
    }
}

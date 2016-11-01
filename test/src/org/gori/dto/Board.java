package org.gori.dto;

public class Board {
	int bno;
	String title;
	String content;
	String tags;
	String p_url;
	int likeCount;
	String boardDate;
	
	public Board() {
		this("","","","",0,"");
		
	}

	public Board(String title, String content, String tags, String p_url, int likeCount, String boardDate) {
		
		this.title=title;
		this.content=content;
		this.tags=tags;
		this.p_url=p_url;
		this.likeCount=likeCount;
		this.boardDate=boardDate;
	}
	public Board(String title, String content, String tags, String p_url, String likeCount, String boardDate) {
		
		this.title=title;
		this.content=content;
		this.tags=tags;
		this.p_url=p_url;
		this.likeCount=Integer.parseInt(likeCount);
		this.boardDate=boardDate;
	}

	public Board(int bno,String title, String content, String tags, String p_url, String likeCount, String boardDate) {
		this.bno=bno;
		this.title=title;
		this.content=content;
		this.tags=tags;
		this.p_url=p_url;
		this.likeCount=Integer.parseInt(likeCount);
		this.boardDate=boardDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getP_url() {
		return p_url;
	}

	public void setP_url(String p_url) {
		this.p_url = p_url;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public String getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}

	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + ", tags=" + tags + ", p_url=" + p_url + ", likeCount="
				+ likeCount + ", boardDate=" + boardDate + "]";
	}
	
	
	
}

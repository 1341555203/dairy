package cn.qdsoft.yzm.modules.dto;

/**
 * Created by mtf81 on 2016/10/25.
 */
public class ArticleDto {
	Integer cId;
	Integer uId;
	String title;
	String content;
	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
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
}

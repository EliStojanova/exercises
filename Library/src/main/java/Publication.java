import javax.persistence.Column;
import javax.persistence.Table;

@Table(name="publication")
public class Publication extends EntityId{
	@Column (name="dtype") private String dtype;
	@Column (name="title") private String title;
	
	public Publication(){
		
	}

	public String getDtype() {
		return dtype;
	}

	public void setDtype(String dtype) {
		this.dtype = dtype;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}

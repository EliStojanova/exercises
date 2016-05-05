import javax.persistence.Column;
import javax.persistence.Table;

@Table(name="magazine")
public class Magazine extends EntityId{
	@Column (name="issn") private String issn;

	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}
	
}

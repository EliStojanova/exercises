import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table (name="loan")
public class Loan extends EntityId{
	@OneToOne
	private Member member;
	
	@OneToOne
	private Publication publication;
	@Column (name="enddate") private Date endDate;
	@Column (name="startdate") private Date startDate;
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Publication getPublication() {
		return publication;
	}
	public void setPublication(Publication publication) {
		this.publication = publication;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	
}

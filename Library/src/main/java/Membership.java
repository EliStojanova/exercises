import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="membership")
public class Membership extends EntityId{
	@OneToOne
	private Member member;
	@Column (name="enddate") private Date endDate;
	@Column (name="membershiptype") private String membershiptype;
	@Column (name="startdate") private Date startDate;
	
	public Membership(){
		
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getMembershiptype() {
		return membershiptype;
	}

	public void setMembershiptype(String membershiptype) {
		this.membershiptype = membershiptype;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	
}

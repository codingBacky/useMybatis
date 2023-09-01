package kr.co.backy.vo;

public class MemberVO {
	String memId;   
	String memPwd;
	String memName;
	String email;
	String postCode;
	String detailAddress;
	String regiDate;
	public MemberVO() {
	}
	public MemberVO(String memId, String memPwd, String memName) {
		super();
		this.memId = memId;
		this.memPwd = memPwd;
		this.memName = memName;
	}
	public MemberVO(String memId, String memPwd, String memName, String email, String postCode, String detailAddress,
			String regiDate) {
		super();
		this.memId = memId;
		this.memPwd = memPwd;
		this.memName = memName;
		this.email = email;
		this.postCode = postCode;
		this.detailAddress = detailAddress;
		this.regiDate = regiDate;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPwd() {
		return memPwd;
	}
	public void setMemPwd(String memPwd) {
		this.memPwd = memPwd;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getDetailAddress() {
		return detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}
	public String getRegiDate() {
		return regiDate;
	}
	public void setRegiDate(String regiDate) {
		this.regiDate = regiDate;
	}
	@Override
	public String toString() {
		return "MemberVO [memId=" + memId + ", memPwd=" + memPwd + ", memName=" + memName + ", email=" + email
				+ ", postCode=" + postCode + ", detailAddress=" + detailAddress + ", regiDate=" + regiDate + "]";
	}  

	
}

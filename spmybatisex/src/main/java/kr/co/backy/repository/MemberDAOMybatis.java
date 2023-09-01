package kr.co.backy.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.backy.vo.MemberVO;

@Repository
public class MemberDAOMybatis implements MemberDAO{
	
	@Autowired
	SqlSession session;
	String namespace = "kr.co.backy.Member.";
	
	@Override
	public MemberVO getMember(String memId) {
		return session.selectOne(namespace+"getMember", memId);
	}
	
	@Override
	public int updateMember(MemberVO vo) {
		return session.update(namespace+"updateMember",vo);
	}

	@Override
	public List<MemberVO> getAllMember(){
		return session.selectList(namespace+"getAllMember");
	}

	@Override
	public List<MemberVO> getMemberForEach(List<String> list) {
		return session.selectList(namespace+"getMemberForEach", list);
	}
	
	/*
	public MemberVO getMember(String startNum, String endNum) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("startNum", startNum);
		map.put("endNum", endNum);
		return session.selectOne(namespace+".getMemberMap", map);
	}
	*/
}

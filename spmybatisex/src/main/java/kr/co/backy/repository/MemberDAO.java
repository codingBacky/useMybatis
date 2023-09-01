package kr.co.backy.repository;

import java.util.List;

import kr.co.backy.vo.MemberVO;


public interface MemberDAO {

	MemberVO getMember(String memId);

	int updateMember(MemberVO vo);

	List<MemberVO> getAllMember();

	List<MemberVO> getMemberForEach(List<String> list);

}

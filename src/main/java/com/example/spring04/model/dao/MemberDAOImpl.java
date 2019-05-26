package com.example.spring04.model.dao;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.example.spring04.model.dto.MemberDTO;

@Component("memberDao")
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	MongoTemplate mongoTemplate;
	static String COLLECTION_NAME = "member";
	@Override
	public MemberDTO loginCheck(String userid, String passwd) {
		// TODO Auto-generated method stub
		Query query = new Query(new Criteria("_id").is(userid).and("passwd").is(passwd));
		
		List<MemberDTO> items = mongoTemplate.find(query, MemberDTO.class, COLLECTION_NAME);
		
		System.out.println(items);
		if(items.size() > 0) {
			return items.get(0);
		}else
		{
			return null;
		}
		//	 return mongoTemplate.find(query, MemberDTO.class,COLLECTION_NAME).get(0); //첫번쨰 DOCUMENT
	}

	@Override
	public void join(MemberDTO member) {
		// TODO Auto-generated method stub
		mongoTemplate.insert(member, COLLECTION_NAME);
	}

}

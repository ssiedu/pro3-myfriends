package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class FriendDAO {

	SessionFactory sf;
	
	public FriendDAO(){
		sf=Data.getSF();
	}
	
	//adding a new friend
	public void addFriend(Friend friend) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(friend);
		tr.commit();
		session.close();
	}
	
	//searching friend by id
	public Friend searchById(String id){
		Session session=sf.openSession();
		Friend friend=session.get(Friend.class, id);
		session.close();
		return friend;
	}
	
	//searching friend by name
	public List<Friend> searchByName(String fname){
		Session session=sf.openSession();
		Criteria cr=session.createCriteria(Friend.class);
		Criterion crt=Restrictions.eq("fname", fname);
		cr.add(crt);
		List<Friend> flist=cr.list();
		session.close();
		return flist;
	}
	//fetching all friends
	public List<Friend> getAllFriends(){
		Session session=sf.openSession();
		Query query=session.createQuery("from Friend order by fcode");
		List<Friend> flist=query.list();
		
/*		Criteria cr=session.createCriteria(Friend.class);
		List<Friend> flist=cr.list();
*/		session.close();
		return flist;
		
	}
	//remove a friend
	public void removeById(String id){
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Friend friend=new Friend(); friend.setFcode(id);
		session.delete(friend);
		tr.commit();
		session.close();
	}
	
	//updating friend details
	public void updateFriend(Friend friend){
			Session session=sf.openSession();
			Transaction tr=session.beginTransaction();
			session.update(friend);
			tr.commit();
			session.close();
		}
	}
	

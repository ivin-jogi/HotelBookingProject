package com.ibs.litmusproject.HotelBooking.service;

import com.ibs.litmusproject.HotelBooking.model.Authority;
import com.ibs.litmusproject.HotelBooking.model.AuthorityType;
import com.ibs.litmusproject.HotelBooking.repository.AuthorityRepository;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class AuthorityRepositoryImpl implements AuthorityRepository {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Authority findByName(AuthorityType name) {
        Query<Authority> query = sessionFactory.getCurrentSession().createQuery("FROM Authority a where a.name=:name");
        query.setParameter("name", name);
        return query.uniqueResult();
    }
}

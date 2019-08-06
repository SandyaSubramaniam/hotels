package co.grandcircus.hotels.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.grandcircus.hotels.entity.Hotel;

@Repository
@Transactional
public class HotelDao {

	@PersistenceContext
	private EntityManager em;

	public List<Hotel> findByCity(String city, Integer maxprice) {

		// HQL queries can have named parameters, such as :category here.
		// HQL queries use Java class and property names, not SQL table & column names.
		return em.createQuery("FROM Hotel WHERE city = :city AND pricePerNight <= :maxprice ORDER BY pricePerNight",
				Hotel.class).setParameter("city", city).setParameter("maxprice", maxprice).getResultList();
	}

	public Hotel findById(Long id) {

		return em.find(Hotel.class, id);
	}

	public List<Hotel> findByName(String name) {

		return em.createQuery("FROM Hotel WHERE name = :name", Hotel.class).setParameter("name", name).getResultList();
	}
}

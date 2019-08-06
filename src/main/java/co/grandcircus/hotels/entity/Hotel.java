package co.grandcircus.hotels.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotel_listing")
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hotel_id")
	private Long id;

	@Column(name = "hotel_name")
	private String name;

	private String city;

	@Column(name = "price_per_night")
	private Integer pricePerNight;

	@Column(name = "map_src")
	private String map;

	public Long getId() {

		return id;
	}

	public void setId(Long id) {

		this.id = id;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String getCity() {

		return city;
	}

	public void setCity(String city) {

		this.city = city;
	}

	public Integer getPricePerNight() {

		return pricePerNight;
	}

	public String getMap() {

		return map;
	}

	public void setMap(String map) {

		this.map = map;
	}

	public void setPricePerNight(Integer pricePerNight) {

		this.pricePerNight = pricePerNight;
	}
}

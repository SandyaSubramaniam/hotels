package co.grandcircus.hotels;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.hotels.dao.HotelDao;
import co.grandcircus.hotels.entity.Hotel;

@Controller
public class HotelsController {

	@Autowired
	private HotelDao dao;

	@RequestMapping("/")
	public ModelAndView showHome() {

		return new ModelAndView("home");
	}

	@RequestMapping("/displayHotels")
	public ModelAndView displayHotels(@RequestParam("city") String city, @RequestParam("maxprice") Integer maxprice) {

		System.out.println(city);
		if (city.equals("Select")) {
			return new ModelAndView("home", "message", "Please select a city");
		} else {
			ModelAndView mav = new ModelAndView("display");
			List<Hotel> findByCity = dao.findByCity(city, maxprice);
			mav.addObject("cities", findByCity);
			mav.addObject("city", city);
			return mav;
		}
	}

	@RequestMapping("/display")
	public ModelAndView displayDetails(@RequestParam("id") Long id) {

		ModelAndView mav = new ModelAndView("details");
		Hotel hotel = new Hotel();
		hotel = dao.findById(id);
		mav.addObject("name", hotel.getName());
		mav.addObject("price", hotel.getPricePerNight());
		mav.addObject("map", hotel.getMap());
		return mav;
	}
}

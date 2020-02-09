package com.knoparast.landon.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.knoparast.landon.business.domain.RoomReservation;
import com.knoparast.landon.business.service.ReservationService;

@RestController
@RequestMapping(value="/api")
public class ReservationServiceController {
	
	@Autowired
    private ReservationService reservationService;

    @RequestMapping(method= RequestMethod.GET, value="/reservation/{date}")
    public List<RoomReservation> getAllReservationsForDate(@PathVariable(value="date")String dateString){
        return this.reservationService.getRoomReservationsForDate(dateString);
    }
	
}

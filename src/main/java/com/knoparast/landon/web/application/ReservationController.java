package com.knoparast.landon.web.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/reservation")
public class ReservationController {

    @RequestMapping(method= RequestMethod.GET)
    public void getReservations(){
       // return "reservation";
    }
}

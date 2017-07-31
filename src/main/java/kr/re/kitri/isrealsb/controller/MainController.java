/**
 * Created by danawacomputer on 2017-07-20.
 */

package kr.re.kitri.isrealsb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
public class MainController {

    //Logging
    Logger log = LoggerFactory.getLogger(MainController.class);

}
/**
 * Created by danawacomputer on 2017-07-31.
 */

package kr.re.kitri.isrealsb.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {


    //Logging
    Logger log = LoggerFactory.getLogger(LoggingAspect.class);

}

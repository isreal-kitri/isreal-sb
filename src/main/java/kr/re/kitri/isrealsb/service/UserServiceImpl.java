/**
 * Created by danawacomputer on 2017-08-04.
 */

package kr.re.kitri.isrealsb.service;

import kr.re.kitri.isrealsb.model.SampleUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SampleUser user =
    }
}

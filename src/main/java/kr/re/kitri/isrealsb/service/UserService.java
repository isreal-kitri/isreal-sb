/**
 * Created by danawacomputer on 2017-08-04.
 */

package kr.re.kitri.isrealsb.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Collection;

public interface UserService extends UserDetailsService {
    Collection<GrantedAuthority> getAuthorities(String Username);
}

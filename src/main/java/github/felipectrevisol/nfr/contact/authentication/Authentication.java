package github.felipectrevisol.nfr.contact.authentication;

import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Service
@SuppressWarnings("ALL")
public class Authentication implements UserDetailsService {

    private final User user = new User();

    @Override
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
        return this.user;
    }
}
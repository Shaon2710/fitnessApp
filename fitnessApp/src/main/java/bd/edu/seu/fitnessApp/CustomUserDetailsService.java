package bd.edu.seu.fitnessApp;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    private UserRepository repo ;

    public CustomUserDetailsService() {
        this.repo = repo;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = repo.findByEmail(email);
        if (user == null){
            throw new UsernameNotFoundException("User not found");
        }

        return new CustomUserDetails(user);
    }
}

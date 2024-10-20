package github.felipectrevisol.nfr.contact.authentication;

import com.auth0.jwt.JWT;
import java.time.ZoneOffset;
import java.time.LocalDateTime;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;

public final class Token {

    public String create(final User user) {
        try {

            Algorithm algorithm = Algorithm.HMAC256("app-security");
            return JWT.create()
                    .withIssuer("github.felipectrevisol")
                    .withSubject(user.email())
                    .withClaim("user", user.email())
                    .withClaim("identifier", user.identifier().toString())
                    .withExpiresAt(LocalDateTime.now().plusMinutes(15).toInstant(ZoneOffset.of("-03:00")))
                    .sign(algorithm);

        } catch (JWTCreationException exception) {
            throw new RuntimeException("It was not possible to create a token.");
        }
    }
}
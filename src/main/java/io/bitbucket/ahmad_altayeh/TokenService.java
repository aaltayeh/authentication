package io.bitbucket.ahmad_altayeh;

import java.util.Map;

public interface TokenService {

    String generateToken(Map<String, Object> claims, String subject);

}

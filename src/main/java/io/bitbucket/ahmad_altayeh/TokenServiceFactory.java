package io.bitbucket.ahmad_altayeh;

public final class TokenServiceFactory {

    public TokenServiceFactory() {
    }

    public static TokenService createTokenService(){
        return new TokenServiceImpl();
    }
}

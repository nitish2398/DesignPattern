package patterns.structural.proxy;

import patterns.structural.proxy.impl.GetLikesProxy;

/**
 * Provides an interface or placeholder for another object to control access over it.
 *
 * Proxy pattern is mostly related to controlling the access to a particular object.
 * Types on the basis of intent to use:
 *       1) remote proxy - proxy interacts with a remote resource and provides the response to the client
 *                         according to the access they might have.
 *       2) virtual proxy - virtual proxy controls access to an object that is expensive to create.
 *                          for example - "Cache", since the DB calls are expensive, we add a layer of proxy (cache)
 *                          and calls actual database only when its really required. (LAZY EVALUATION)
 *       3) protection proxy - It controls the access to an object based on the AUTH/AUTHZ, like password protection
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Proxy will call database only when cache does not have data.
         */
        GetLikesProxy proxy = new GetLikesProxy();
        System.out.println(proxy.getLikes("1"));
    }
}

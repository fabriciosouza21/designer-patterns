package middleware;

public abstract class Middleware {
    private Middleware next;

    /**
     * Builds chain of middleware objects.
     * */
    public static Middleware link(Middleware first, Middleware... chain){
        Middleware head = first;
        for (Middleware nextInChain: chain ){
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    /**
     * Subclasses will implement this method with concret checks.
    * */
    public abstract boolean check(String email, String password);

    /**
     * runs check on the next object in chain or ends traversing if we're in
     * last object in chain.
     * */

    protected boolean checkNext(String email, String password){
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }


}

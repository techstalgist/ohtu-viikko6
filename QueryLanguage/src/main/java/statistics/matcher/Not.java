
package statistics.matcher;

import statistics.Player;

public class Not implements Matcher {

    private And and;
    
    public Not(Matcher... matchers) {
        this.and = new And(matchers);
    }

    @Override
    public boolean matches(Player p) {
        return !and.matches(p);
    }

}

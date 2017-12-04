
package statistics.matcher;

import java.util.ArrayList;

public class QueryBuilder {
    ArrayList<Matcher> matchers;
    
    public QueryBuilder() {
        this.matchers = new ArrayList();
    }
    
    public Matcher build() {
        Matcher[] compatibleMatchers = matchers.toArray(new Matcher[matchers.size()]);
        Matcher and = new And(compatibleMatchers);
        this.matchers.clear();
        return and;          
    }
    
    public QueryBuilder oneOf(Matcher... matchers) {
       this.matchers.add(new Or(matchers));
       return this;
    }
    
    public QueryBuilder playsIn(String team) {
        this.matchers.add(new PlaysIn(team));
        return this;
    }
    
    public QueryBuilder hasAtLeast(int value, String category) {
        this.matchers.add(new HasAtLeast(value, category));
        return this;
    }
    
    public QueryBuilder hasFewerThan(int value, String category) {
        this.matchers.add(new HasFewerThan(value, category));
        return this;
    }
}

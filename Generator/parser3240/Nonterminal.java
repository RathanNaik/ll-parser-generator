/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package parser3240;

/**
 * The Nonterminal class is used to store non-terminal symbols. This class and
 * the Token class are both subclasses of Symbol, which allows us to do things
 * like create an ArrayList<Symbol>, which can hold the right-hand side of
 * production rules after they are read in from a grammar file.
 * 
 * 
 * @author mpn
 */
public class Nonterminal extends Symbol {
   private final String type= "Nonterminal";
    // NOTE: Pass nameIn in the form "<exp>" rather than "exp",
    // just as a matter of convention.
    public Nonterminal(String nameIn) { super(nameIn); }
    public String getType(){ return type;}
    
    @Override
    public boolean equals (Object otherObj) {
        try {
            Nonterminal T2 = (Nonterminal) otherObj;
            return (super.getName().equals(T2.getName()));
        } catch (ClassCastException e) {
            return false;
        }
    }
    
    @Override
    public int hashCode () {
        return super.hashCode();
    }
}

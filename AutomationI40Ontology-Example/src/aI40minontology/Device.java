package aI40minontology;

import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Device <br>
 * @version generated on Sun Feb 10 20:58:15 COT 2019 by Santiago
 */

public interface Device extends Actor {

    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#belongsToSequence
     */
     
    /**
     * Gets all property values for the belongsToSequence property.<p>
     * 
     * @returns a collection of values for the belongsToSequence property.
     */
    Collection<? extends Sequence> getBelongsToSequence();

    /**
     * Checks if the class has a belongsToSequence property value.<p>
     * 
     * @return true if there is a belongsToSequence property value.
     */
    boolean hasBelongsToSequence();

    /**
     * Adds a belongsToSequence property value.<p>
     * 
     * @param newBelongsToSequence the belongsToSequence property value to be added
     */
    void addBelongsToSequence(Sequence newBelongsToSequence);

    /**
     * Removes a belongsToSequence property value.<p>
     * 
     * @param oldBelongsToSequence the belongsToSequence property value to be removed.
     */
    void removeBelongsToSequence(Sequence oldBelongsToSequence);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#belongsToSubsequence
     */
     
    /**
     * Gets all property values for the belongsToSubsequence property.<p>
     * 
     * @returns a collection of values for the belongsToSubsequence property.
     */
    Collection<? extends Subsequence> getBelongsToSubsequence();

    /**
     * Checks if the class has a belongsToSubsequence property value.<p>
     * 
     * @return true if there is a belongsToSubsequence property value.
     */
    boolean hasBelongsToSubsequence();

    /**
     * Adds a belongsToSubsequence property value.<p>
     * 
     * @param newBelongsToSubsequence the belongsToSubsequence property value to be added
     */
    void addBelongsToSubsequence(Subsequence newBelongsToSubsequence);

    /**
     * Removes a belongsToSubsequence property value.<p>
     * 
     * @param oldBelongsToSubsequence the belongsToSubsequence property value to be removed.
     */
    void removeBelongsToSubsequence(Subsequence oldBelongsToSubsequence);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#executes
     */
     
    /**
     * Gets all property values for the executes property.<p>
     * 
     * @returns a collection of values for the executes property.
     */
    Collection<? extends Function> getExecutes();

    /**
     * Checks if the class has a executes property value.<p>
     * 
     * @return true if there is a executes property value.
     */
    boolean hasExecutes();

    /**
     * Adds a executes property value.<p>
     * 
     * @param newExecutes the executes property value to be added
     */
    void addExecutes(Function newExecutes);

    /**
     * Removes a executes property value.<p>
     * 
     * @param oldExecutes the executes property value to be removed.
     */
    void removeExecutes(Function oldExecutes);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#executesAServiceFunction
     */
     
    /**
     * Gets all property values for the executesAServiceFunction property.<p>
     * 
     * @returns a collection of values for the executesAServiceFunction property.
     */
    Collection<? extends As_a_ServiceFunction> getExecutesAServiceFunction();

    /**
     * Checks if the class has a executesAServiceFunction property value.<p>
     * 
     * @return true if there is a executesAServiceFunction property value.
     */
    boolean hasExecutesAServiceFunction();

    /**
     * Adds a executesAServiceFunction property value.<p>
     * 
     * @param newExecutesAServiceFunction the executesAServiceFunction property value to be added
     */
    void addExecutesAServiceFunction(As_a_ServiceFunction newExecutesAServiceFunction);

    /**
     * Removes a executesAServiceFunction property value.<p>
     * 
     * @param oldExecutesAServiceFunction the executesAServiceFunction property value to be removed.
     */
    void removeExecutesAServiceFunction(As_a_ServiceFunction oldExecutesAServiceFunction);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#generates
     */
     
    /**
     * Gets all property values for the generates property.<p>
     * 
     * @returns a collection of values for the generates property.
     */
    Collection<? extends Information> getGenerates();

    /**
     * Checks if the class has a generates property value.<p>
     * 
     * @return true if there is a generates property value.
     */
    boolean hasGenerates();

    /**
     * Adds a generates property value.<p>
     * 
     * @param newGenerates the generates property value to be added
     */
    void addGenerates(Information newGenerates);

    /**
     * Removes a generates property value.<p>
     * 
     * @param oldGenerates the generates property value to be removed.
     */
    void removeGenerates(Information oldGenerates);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#interacts
     */
     
    /**
     * Gets all property values for the interacts property.<p>
     * 
     * @returns a collection of values for the interacts property.
     */
    Collection<? extends Actor> getInteracts();

    /**
     * Checks if the class has a interacts property value.<p>
     * 
     * @return true if there is a interacts property value.
     */
    boolean hasInteracts();

    /**
     * Adds a interacts property value.<p>
     * 
     * @param newInteracts the interacts property value to be added
     */
    void addInteracts(Actor newInteracts);

    /**
     * Removes a interacts property value.<p>
     * 
     * @param oldInteracts the interacts property value to be removed.
     */
    void removeInteracts(Actor oldInteracts);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#isConnectedToArc
     */
     
    /**
     * Gets all property values for the isConnectedToArc property.<p>
     * 
     * @returns a collection of values for the isConnectedToArc property.
     */
    Collection<? extends Arc> getIsConnectedToArc();

    /**
     * Checks if the class has a isConnectedToArc property value.<p>
     * 
     * @return true if there is a isConnectedToArc property value.
     */
    boolean hasIsConnectedToArc();

    /**
     * Adds a isConnectedToArc property value.<p>
     * 
     * @param newIsConnectedToArc the isConnectedToArc property value to be added
     */
    void addIsConnectedToArc(Arc newIsConnectedToArc);

    /**
     * Removes a isConnectedToArc property value.<p>
     * 
     * @param oldIsConnectedToArc the isConnectedToArc property value to be removed.
     */
    void removeIsConnectedToArc(Arc oldIsConnectedToArc);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#offers
     */
     
    /**
     * Gets all property values for the offers property.<p>
     * 
     * @returns a collection of values for the offers property.
     */
    Collection<? extends Service> getOffers();

    /**
     * Checks if the class has a offers property value.<p>
     * 
     * @return true if there is a offers property value.
     */
    boolean hasOffers();

    /**
     * Adds a offers property value.<p>
     * 
     * @param newOffers the offers property value to be added
     */
    void addOffers(Service newOffers);

    /**
     * Removes a offers property value.<p>
     * 
     * @param oldOffers the offers property value to be removed.
     */
    void removeOffers(Service oldOffers);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#receives
     */
     
    /**
     * Gets all property values for the receives property.<p>
     * 
     * @returns a collection of values for the receives property.
     */
    Collection<? extends Information> getReceives();

    /**
     * Checks if the class has a receives property value.<p>
     * 
     * @return true if there is a receives property value.
     */
    boolean hasReceives();

    /**
     * Adds a receives property value.<p>
     * 
     * @param newReceives the receives property value to be added
     */
    void addReceives(Information newReceives);

    /**
     * Removes a receives property value.<p>
     * 
     * @param oldReceives the receives property value to be removed.
     */
    void removeReceives(Information oldReceives);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#understands
     */
     
    /**
     * Gets all property values for the understands property.<p>
     * 
     * @returns a collection of values for the understands property.
     */
    Collection<? extends WrappedIndividual> getUnderstands();

    /**
     * Checks if the class has a understands property value.<p>
     * 
     * @return true if there is a understands property value.
     */
    boolean hasUnderstands();

    /**
     * Adds a understands property value.<p>
     * 
     * @param newUnderstands the understands property value to be added
     */
    void addUnderstands(WrappedIndividual newUnderstands);

    /**
     * Removes a understands property value.<p>
     * 
     * @param oldUnderstands the understands property value to be removed.
     */
    void removeUnderstands(WrappedIndividual oldUnderstands);


    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#belongsToArchitectureLevel
     */
     
    /**
     * Gets all property values for the belongsToArchitectureLevel property.<p>
     * 
     * @returns a collection of values for the belongsToArchitectureLevel property.
     */
    Collection<? extends Integer> getBelongsToArchitectureLevel();

    /**
     * Checks if the class has a belongsToArchitectureLevel property value.<p>
     * 
     * @return true if there is a belongsToArchitectureLevel property value.
     */
    boolean hasBelongsToArchitectureLevel();

    /**
     * Adds a belongsToArchitectureLevel property value.<p>
     * 
     * @param newBelongsToArchitectureLevel the belongsToArchitectureLevel property value to be added
     */
    void addBelongsToArchitectureLevel(Integer newBelongsToArchitectureLevel);

    /**
     * Removes a belongsToArchitectureLevel property value.<p>
     * 
     * @param oldBelongsToArchitectureLevel the belongsToArchitectureLevel property value to be removed.
     */
    void removeBelongsToArchitectureLevel(Integer oldBelongsToArchitectureLevel);



    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasCharacteristic
     */
     
    /**
     * Gets all property values for the hasCharacteristic property.<p>
     * 
     * @returns a collection of values for the hasCharacteristic property.
     */
    Collection<? extends String> getHasCharacteristic();

    /**
     * Checks if the class has a hasCharacteristic property value.<p>
     * 
     * @return true if there is a hasCharacteristic property value.
     */
    boolean hasHasCharacteristic();

    /**
     * Adds a hasCharacteristic property value.<p>
     * 
     * @param newHasCharacteristic the hasCharacteristic property value to be added
     */
    void addHasCharacteristic(String newHasCharacteristic);

    /**
     * Removes a hasCharacteristic property value.<p>
     * 
     * @param oldHasCharacteristic the hasCharacteristic property value to be removed.
     */
    void removeHasCharacteristic(String oldHasCharacteristic);



    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasDescription
     */
     
    /**
     * Gets all property values for the hasDescription property.<p>
     * 
     * @returns a collection of values for the hasDescription property.
     */
    Collection<? extends String> getHasDescription();

    /**
     * Checks if the class has a hasDescription property value.<p>
     * 
     * @return true if there is a hasDescription property value.
     */
    boolean hasHasDescription();

    /**
     * Adds a hasDescription property value.<p>
     * 
     * @param newHasDescription the hasDescription property value to be added
     */
    void addHasDescription(String newHasDescription);

    /**
     * Removes a hasDescription property value.<p>
     * 
     * @param oldHasDescription the hasDescription property value to be removed.
     */
    void removeHasDescription(String oldHasDescription);



    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasIdentifier
     */
     
    /**
     * Gets all property values for the hasIdentifier property.<p>
     * 
     * @returns a collection of values for the hasIdentifier property.
     */
    Collection<? extends Integer> getHasIdentifier();

    /**
     * Checks if the class has a hasIdentifier property value.<p>
     * 
     * @return true if there is a hasIdentifier property value.
     */
    boolean hasHasIdentifier();

    /**
     * Adds a hasIdentifier property value.<p>
     * 
     * @param newHasIdentifier the hasIdentifier property value to be added
     */
    void addHasIdentifier(Integer newHasIdentifier);

    /**
     * Removes a hasIdentifier property value.<p>
     * 
     * @param oldHasIdentifier the hasIdentifier property value to be removed.
     */
    void removeHasIdentifier(Integer oldHasIdentifier);



    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasInteroperabilityDegree
     */
     
    /**
     * Gets all property values for the hasInteroperabilityDegree property.<p>
     * 
     * @returns a collection of values for the hasInteroperabilityDegree property.
     */
    Collection<? extends String> getHasInteroperabilityDegree();

    /**
     * Checks if the class has a hasInteroperabilityDegree property value.<p>
     * 
     * @return true if there is a hasInteroperabilityDegree property value.
     */
    boolean hasHasInteroperabilityDegree();

    /**
     * Adds a hasInteroperabilityDegree property value.<p>
     * 
     * @param newHasInteroperabilityDegree the hasInteroperabilityDegree property value to be added
     */
    void addHasInteroperabilityDegree(String newHasInteroperabilityDegree);

    /**
     * Removes a hasInteroperabilityDegree property value.<p>
     * 
     * @param oldHasInteroperabilityDegree the hasInteroperabilityDegree property value to be removed.
     */
    void removeHasInteroperabilityDegree(String oldHasInteroperabilityDegree);



    /* ***************************************************
     * Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasNumberOfTasks
     */
     
    /**
     * Gets all property values for the hasNumberOfTasks property.<p>
     * 
     * @returns a collection of values for the hasNumberOfTasks property.
     */
    Collection<? extends Integer> getHasNumberOfTasks();

    /**
     * Checks if the class has a hasNumberOfTasks property value.<p>
     * 
     * @return true if there is a hasNumberOfTasks property value.
     */
    boolean hasHasNumberOfTasks();

    /**
     * Adds a hasNumberOfTasks property value.<p>
     * 
     * @param newHasNumberOfTasks the hasNumberOfTasks property value to be added
     */
    void addHasNumberOfTasks(Integer newHasNumberOfTasks);

    /**
     * Removes a hasNumberOfTasks property value.<p>
     * 
     * @param oldHasNumberOfTasks the hasNumberOfTasks property value to be removed.
     */
    void removeHasNumberOfTasks(Integer oldHasNumberOfTasks);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}

package aI40minontology.impl;

import aI40minontology.*;


import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.protege.owl.codegeneration.inference.CodeGenerationInference;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultSequence <br>
 * @version generated on Sun Feb 10 20:58:15 COT 2019 by Santiago
 */
public class DefaultSequence extends WrappedIndividualImpl implements Sequence {

    public DefaultSequence(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#belongsToSequence
     */
     
    public Collection<? extends Sequence> getBelongsToSequence() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_BELONGSTOSEQUENCE,
                                               DefaultSequence.class);
    }

    public boolean hasBelongsToSequence() {
	   return !getBelongsToSequence().isEmpty();
    }

    public void addBelongsToSequence(Sequence newBelongsToSequence) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_BELONGSTOSEQUENCE,
                                       newBelongsToSequence);
    }

    public void removeBelongsToSequence(Sequence oldBelongsToSequence) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_BELONGSTOSEQUENCE,
                                          oldBelongsToSequence);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#belongsToSubsequence
     */
     
    public Collection<? extends Subsequence> getBelongsToSubsequence() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_BELONGSTOSUBSEQUENCE,
                                               DefaultSubsequence.class);
    }

    public boolean hasBelongsToSubsequence() {
	   return !getBelongsToSubsequence().isEmpty();
    }

    public void addBelongsToSubsequence(Subsequence newBelongsToSubsequence) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_BELONGSTOSUBSEQUENCE,
                                       newBelongsToSubsequence);
    }

    public void removeBelongsToSubsequence(Subsequence oldBelongsToSubsequence) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_BELONGSTOSUBSEQUENCE,
                                          oldBelongsToSubsequence);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#isConnectedToArc
     */
     
    public Collection<? extends Arc> getIsConnectedToArc() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ISCONNECTEDTOARC,
                                               DefaultArc.class);
    }

    public boolean hasIsConnectedToArc() {
	   return !getIsConnectedToArc().isEmpty();
    }

    public void addIsConnectedToArc(Arc newIsConnectedToArc) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ISCONNECTEDTOARC,
                                       newIsConnectedToArc);
    }

    public void removeIsConnectedToArc(Arc oldIsConnectedToArc) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ISCONNECTEDTOARC,
                                          oldIsConnectedToArc);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasDescription
     */
     
    public Collection<? extends String> getHasDescription() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASDESCRIPTION, String.class);
    }

    public boolean hasHasDescription() {
		return !getHasDescription().isEmpty();
    }

    public void addHasDescription(String newHasDescription) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASDESCRIPTION, newHasDescription);
    }

    public void removeHasDescription(String oldHasDescription) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASDESCRIPTION, oldHasDescription);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasIdentifier
     */
     
    public Collection<? extends Integer> getHasIdentifier() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASIDENTIFIER, Integer.class);
    }

    public boolean hasHasIdentifier() {
		return !getHasIdentifier().isEmpty();
    }

    public void addHasIdentifier(Integer newHasIdentifier) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASIDENTIFIER, newHasIdentifier);
    }

    public void removeHasIdentifier(Integer oldHasIdentifier) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASIDENTIFIER, oldHasIdentifier);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasNumberOfStates
     */
     
    public Collection<? extends Integer> getHasNumberOfStates() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNUMBEROFSTATES, Integer.class);
    }

    public boolean hasHasNumberOfStates() {
		return !getHasNumberOfStates().isEmpty();
    }

    public void addHasNumberOfStates(Integer newHasNumberOfStates) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNUMBEROFSTATES, newHasNumberOfStates);
    }

    public void removeHasNumberOfStates(Integer oldHasNumberOfStates) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNUMBEROFSTATES, oldHasNumberOfStates);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasNumberOfTasks
     */
     
    public Collection<? extends Integer> getHasNumberOfTasks() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNUMBEROFTASKS, Integer.class);
    }

    public boolean hasHasNumberOfTasks() {
		return !getHasNumberOfTasks().isEmpty();
    }

    public void addHasNumberOfTasks(Integer newHasNumberOfTasks) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNUMBEROFTASKS, newHasNumberOfTasks);
    }

    public void removeHasNumberOfTasks(Integer oldHasNumberOfTasks) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNUMBEROFTASKS, oldHasNumberOfTasks);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasNumberOfTransitions
     */
     
    public Collection<? extends Integer> getHasNumberOfTransitions() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNUMBEROFTRANSITIONS, Integer.class);
    }

    public boolean hasHasNumberOfTransitions() {
		return !getHasNumberOfTransitions().isEmpty();
    }

    public void addHasNumberOfTransitions(Integer newHasNumberOfTransitions) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNUMBEROFTRANSITIONS, newHasNumberOfTransitions);
    }

    public void removeHasNumberOfTransitions(Integer oldHasNumberOfTransitions) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNUMBEROFTRANSITIONS, oldHasNumberOfTransitions);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/Automation-I4.0-Ontology#isChildSetElement
     */
     
    public Collection<? extends Boolean> getIsChildSetElement() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ISCHILDSETELEMENT, Boolean.class);
    }

    public boolean hasIsChildSetElement() {
		return !getIsChildSetElement().isEmpty();
    }

    public void addIsChildSetElement(Boolean newIsChildSetElement) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ISCHILDSETELEMENT, newIsChildSetElement);
    }

    public void removeIsChildSetElement(Boolean oldIsChildSetElement) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ISCHILDSETELEMENT, oldIsChildSetElement);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/Automation-I4.0-Ontology#isParentSetElement
     */
     
    public Collection<? extends Boolean> getIsParentSetElement() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ISPARENTSETELEMENT, Boolean.class);
    }

    public boolean hasIsParentSetElement() {
		return !getIsParentSetElement().isEmpty();
    }

    public void addIsParentSetElement(Boolean newIsParentSetElement) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ISPARENTSETELEMENT, newIsParentSetElement);
    }

    public void removeIsParentSetElement(Boolean oldIsParentSetElement) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ISPARENTSETELEMENT, oldIsParentSetElement);
    }


}
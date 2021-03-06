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
 * Source Class: DefaultDiscreteDynamicsModel <br>
 * @version generated on Sun Feb 10 20:58:15 COT 2019 by Santiago
 */
public class DefaultDiscreteDynamicsModel extends WrappedIndividualImpl implements DiscreteDynamicsModel {

    public DefaultDiscreteDynamicsModel(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.semanticweb.org/Automation-I4.0-Ontology#hasModelElement
     */
     
    public Collection<? extends ModelElement> getHasModelElement() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASMODELELEMENT,
                                               DefaultModelElement.class);
    }

    public boolean hasHasModelElement() {
	   return !getHasModelElement().isEmpty();
    }

    public void addHasModelElement(ModelElement newHasModelElement) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASMODELELEMENT,
                                       newHasModelElement);
    }

    public void removeHasModelElement(ModelElement oldHasModelElement) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASMODELELEMENT,
                                          oldHasModelElement);
    }


}

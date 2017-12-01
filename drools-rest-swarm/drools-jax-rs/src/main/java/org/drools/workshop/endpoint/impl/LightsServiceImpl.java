package org.drools.workshop.endpoint.impl;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.drools.workshop.model.*;

import org.drools.workshop.endpoint.api.LightsService;
import org.kie.api.cdi.KReleaseId;
import org.kie.api.cdi.KSession;
import org.kie.api.runtime.KieSession;

@ApplicationScoped
public class LightsServiceImpl implements LightsService{

	 	@Inject
	    @KReleaseId(groupId = "org.drools.workshop", artifactId = "drools-user-kjar", version = "1.0-SNAPSHOT")
	    @KSession
	    private KieSession kSession;

	    public LightsServiceImpl() {
	    }

	    @Override
	    public Lightswitch create(Lightswitch lightswitch) {
	        System.out.println(">> kSession: " + kSession);
	        printKieSessionAllFacts(kSession);
	        System.out.println(">> Lightswitch: " + lightswitch);
	        kSession.insert(lightswitch);
	        int fired = kSession.fireAllRules();
	        System.out.println(">> Fired: " + fired);
	        return lightswitch;
	    }

	    @Override
	    public List<Lightswitch> getLightswitchs() {
	        List<Lightswitch> lightswitches = new ArrayList<Lightswitch>();
	        for (Object o : kSession.getObjects()) {
	            if (o instanceof Lightswitch) {
	                lightswitches.add((Lightswitch) o);
	            }
	        }
	        return lightswitches;
	    }


	    @Override
	    public AvailableLight create(AvailableLight availableLight) {
	        System.out.println(">> kSession: " + kSession);
	        printKieSessionAllFacts(kSession);
	        System.out.println(">> AvailableLight: " + availableLight);
	        kSession.insert(availableLight);
	        int fired = kSession.fireAllRules();
	        System.out.println(">> Fired: " + fired);
	        return availableLight;
	    }

	    @Override
	    public List<AvailableLight> getAvailableLights() {
	        List<AvailableLight> availableLights = new ArrayList<AvailableLight>();
	        for (Object o : kSession.getObjects()) {
	            if (o instanceof AvailableLight) {
	            	availableLights.add((AvailableLight) o);
	            }
	        }
	        return availableLights;
	    }

	    @Override
	    public AbsenceSensor create(AbsenceSensor absenceSensor) {
	        System.out.println(">> kSession: " + kSession);
	        printKieSessionAllFacts(kSession);
	        System.out.println(">> AbsenceSensor: " + absenceSensor);
	        kSession.insert(absenceSensor);
	        int fired = kSession.fireAllRules();
	        System.out.println(">> Fired: " + fired);
	        return absenceSensor;
	    }

	    @Override
	    public List<AbsenceSensor> getAbsenceSensors() {
	        List<AbsenceSensor> absenceSensors = new ArrayList<AbsenceSensor>();
	        for (Object o : kSession.getObjects()) {
	            if (o instanceof AbsenceSensor) {
	            	absenceSensors.add((AbsenceSensor) o);
	            }
	        }
	        return absenceSensors;
		}

		@Override
	    public Aula create(Aula aula) {
	        System.out.println(">> kSession: " + kSession);
	        printKieSessionAllFacts(kSession);
	        System.out.println(">> AbsenceSensor: " + aula);
	        kSession.insert(aula);
	        int fired = kSession.fireAllRules();
	        System.out.println(">> Fired: " + fired);
	        return aula;
	    }

	    @Override
	    public List<Aula> getAulas() {
	        List<Aula> aulas = new ArrayList<Aula>();
	        for (Object o : kSession.getObjects()) {
	            if (o instanceof Aula) {
	            	aulas.add((Aula) o);
	            }
	        }
	        return aulas;
	    }

	private void printKieSessionAllFacts(KieSession kSession) {
        System.out.println(" >> Start - Printing All Facts in the Kie Session");
        for (Object o : kSession.getObjects()) {
            System.out.println(">> Fact: " + o);
        }
        System.out.println(" >> End - Printing All Facts in the Kie Session");
    }

}

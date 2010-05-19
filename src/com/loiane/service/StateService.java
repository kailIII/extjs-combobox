package com.loiane.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.loiane.model.State;

/**
 * All the business logic goes here
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
@Service
public class StateService {

	/**
	 * Return list of all States of Brazil
	 * @return
	 */
	public List<State> getBrazilianStates(){
		
		List<State> states = new ArrayList<State>();
		
		states.add(new State("AC","Acre"));
		states.add(new State("AL","Alagoas"));
		states.add(new State("AP","Amap�"));
		states.add(new State("AM","Amazonas"));
		states.add(new State("BA","Bahia"));
		states.add(new State("CE","Cear�"));
		states.add(new State("DF","Distrito Federal"));
		states.add(new State("ES","Esp�rito Santo"));
		states.add(new State("GO","Goi�s"));
		states.add(new State("MA","Maranh�o"));
		states.add(new State("MT","Mato Grosso"));
		states.add(new State("MS","Mato Grosso do Sul"));
		states.add(new State("MG","Minas Gerais"));
		states.add(new State("PA","Par�"));
		states.add(new State("PB","Para�ba"));
		states.add(new State("PR","Paran�"));
		states.add(new State("PE","Pernambuco"));
		states.add(new State("PI","Piau�"));
		states.add(new State("RJ","Rio de Janeiro"));
		states.add(new State("RN","Rio Grande do Norte"));
		states.add(new State("RS","Rio Grande do Sul"));
		states.add(new State("RO","Rond�nia"));
		states.add(new State("RR","Roraima"));
		states.add(new State("SC","Santa Catarina"));
		states.add(new State("SP","S�o Paulo"));
		states.add(new State("SE","Sergipe"));
		states.add(new State("TO","Tocantins"));
		
		return states;
	}
}

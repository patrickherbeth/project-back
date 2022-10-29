package br.com.projeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.projeto.model.Document;

@Service
public class ApplicationService implements InterfaceApplicationService {

	@Override
	public void save(Document document) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Document> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Document> filterById(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}


}

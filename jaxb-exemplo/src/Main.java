import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;

import br.edu.cesufoz.entity.Proprietario;
import br.edu.cesufoz.entity.Roda;
import br.edu.cesufoz.entity.Veiculo;


public class Main {

	public static void main(String[] args) throws JAXBException {
		Veiculo veiculo = new Veiculo();
		veiculo.setChassis(3242341);
		veiculo.setMarca("Marca");
		veiculo.setModelo("Modelo");
		
		final Proprietario proprietario = new Proprietario();
		proprietario.setNome("Jorge Henrique Santos");
		proprietario.getTelefones().add("2313131-132312");
		proprietario.getTelefones().add("99123810-123123");
		veiculo.getProprietarios().add( proprietario );
		
		final Roda roda = new Roda();
		roda.setAro(16);
		roda.setMarca("Pirelli");
		veiculo.getRodas().add(roda);
		
		//Cria o contexto do JAXB
		final JAXBContext context = JAXBContext.newInstance(Veiculo.class);
	
		//Gera o Marshaller para fazer a conversao 
		final Marshaller marshaller = context.createMarshaller();
		final JAXBElement<Veiculo> element = new JAXBElement<Veiculo>(new QName("veiculo"), Veiculo.class, veiculo);
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		//Faz a conversao
		marshaller.marshal(element, System.out);
		marshaller.marshal(element, new File("veiculo.xml"));
		
		//Cria um Unmarshaller
		final Unmarshaller unmarshaller = context.createUnmarshaller();
		//Faz a conversao
		veiculo = (Veiculo) unmarshaller.unmarshal(new File("veiculo.xml"));
		System.out.println( veiculo );
	}
}

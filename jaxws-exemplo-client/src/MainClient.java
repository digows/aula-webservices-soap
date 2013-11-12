

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import br.edu.cesufoz.service.IOlaMundoService;

public class MainClient {
	public static void main(String[] args) throws MalformedURLException {
		Service service = Service.create(new URL("http://localhost:8080/jaxws-exemplo-server/OlaMundoService?WSDL"), 
				new QName("http://service.cesufoz.edu.br/", "OlaMundoService"));
		IOlaMundoService olaMundoService = service.getPort(IOlaMundoService.class);
		System.out.println( olaMundoService.showMessage("Rodrigo P. Fraga") );
	}
}

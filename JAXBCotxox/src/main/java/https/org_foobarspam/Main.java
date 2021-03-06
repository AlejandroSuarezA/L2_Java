package https.org_foobarspam;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Main {

	public static void main(String[] args) {
		try {
			final JAXBContext context = JAXBContext.newInstance(Carrera.class.getPackage().getName());
			final Unmarshaller unmarshaller = context.createUnmarshaller();
			InputStream input = new FileInputStream("src/main/resources/org/foobarspam/JAXBCotxox/schemas/cotxox.xml");
	        final JAXBElement<Carrera> menuElement = (JAXBElement<Carrera>)unmarshaller.unmarshal(input);
			
			Marshaller marshaller = context.createMarshaller(); 			
			marshaller.marshal(menuElement, System.out );
			
			
			File fichero = new File("src/main/resources/org/foobarspam/JAXBCotxox/schemas/cotxoxMarshal.xml");
			fichero.createNewFile();
			
			marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "https://org.foobarspam.cotxox cotxox.xsd");
			marshaller.marshal(menuElement, fichero );
		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
}

	}

}

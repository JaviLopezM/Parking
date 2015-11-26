package classes;


import java.io.File;
import static java.lang.Integer.toString;
import static java.util.Arrays.toString;
import static java.util.Arrays.toString;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class Xml {

	
public static void xml() {
	

	 try {

			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("Parking");
			doc.appendChild(rootElement);
			
			for (int i = 0; i < Array.arrayParking.size(); i++) {

			// vehicle elements
			Element vehicle = doc.createElement("Vehicle");
			rootElement.appendChild(vehicle);

			// set attribute to staff element
			Attr attr = doc.createAttribute("id");
			attr.setValue(Integer.toString(i+1));
			vehicle.setAttributeNode(attr);

			// manera curta
			// vehicle.setAttribute("id", "1");

			// nom elements
			Element nom = doc.createElement("Nom");
			nom.appendChild(doc.createTextNode(Array.arrayParking.get(i).getNom()));
			vehicle.appendChild(nom);

			// cogonom elements
			Element cognom = doc.createElement("Cognom");
			cognom.appendChild(doc.createTextNode(Array.arrayParking.get(i).getCognom()));
			vehicle.appendChild(cognom);

			// tipus elements
			Element tipus = doc.createElement("TipusVehicle");
			tipus.appendChild(doc.createTextNode(Array.arrayParking.get(i).getTipus()));
			vehicle.appendChild(tipus);

			// matricula elements
			Element matricula = doc.createElement("Matrícula");
			matricula.appendChild(doc.createTextNode(Array.arrayParking.get(i).getMatricula()));
			vehicle.appendChild(matricula);

			// marca elements
			Element marca = doc.createElement("Marca");
			marca.appendChild(doc.createTextNode(Array.arrayParking.get(i).getMarca()));
			vehicle.appendChild(marca);

			// model elements
			Element model = doc.createElement("Model");
			model.appendChild(doc.createTextNode(Array.arrayParking.get(i).getModel()));
			vehicle.appendChild(model);

			// color elements
			Element color = doc.createElement("Color");
			color.appendChild(doc.createTextNode(Array.arrayParking.get(i).getColor()));
			vehicle.appendChild(color);

			// plaça elements
			Element plasa = doc.createElement("Plaça");
			plasa.appendChild(doc.createTextNode(Integer.toString(Array.arrayParking.get(i).getPlasa())));
			vehicle.appendChild(plasa);

			}
			
			
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("seguretat.xml"));

			// Output to console for testing
			// StreamResult result = new StreamResult(System.out);

			transformer.transform(source, result);

        JOptionPane.showMessageDialog(null, "Copia de seguretat en format XML creada.");

		  } catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		  } catch (TransformerException tfe) {
			tfe.printStackTrace();
		  }
		}

}

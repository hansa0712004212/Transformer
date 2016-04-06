package com.sahassoft.transformer.xslt;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 * Main Class. Primary Executor.
 */
public class XSLTTransformer {

    /**
     * @param inXML   input xml file
     * @param inXSL   input xsl file
     * @param outHTML output html file
     * @throws TransformerException
     */
    public void transform(String inXML, String inXSL, String outHTML) throws TransformerException {
        TransformerFactory factory = TransformerFactory.newInstance();
        StreamSource xslStream = new StreamSource(inXSL);
        Transformer transformer = factory.newTransformer(xslStream);
        transformer.setErrorListener(new TransformErrorListener());
        StreamSource in = new StreamSource(inXML);
        StreamResult out = new StreamResult(outHTML);
        transformer.transform(in, out);
        System.out.println("Transformed HTML file generated at : " + outHTML);
    }
}


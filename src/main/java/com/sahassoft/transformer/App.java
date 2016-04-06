package com.sahassoft.transformer;

import com.sahassoft.transformer.xslt.XSLTTransformer;

import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

/**
 * Main Class. Primary Executor.
 */
public class App {

    /**
     * resources folder location and name.
     */
    private final static String folder = "resources/";

    /**
     * input xml file name.
     */
    private final static String inXML = folder + "hansa.xml";

    /**
     * input xsl file name.
     */
    private final static String inXSL = folder + "hansa.xsl";

    /**
     * output html file name.
     */
    private final static String outHTML = folder + "hansa.html";

    /**
     * main method.
     *
     * @param args String array
     */
    public static void main(String[] args) {
        XSLTTransformer st = new XSLTTransformer();
        try {
            System.out.println("transforming ... ...");
            st.transform(inXML, inXSL, outHTML);
        } catch (TransformerConfigurationException e) {
            System.err.println("Invalid factory configuration");
        } catch (TransformerException e) {
            System.err.println("Error during transformation");
        }
    }
}

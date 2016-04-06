package com.sahassoft.transformer.xslt;

import javax.xml.transform.ErrorListener;
import javax.xml.transform.TransformerException;

/**
 * Listening to transforming errors.
 */
public class TransformErrorListener implements ErrorListener {

    /**
     * Display warning message.
     *
     * @param e exception
     * @throws TransformerException
     */
    public void warning(TransformerException e) throws TransformerException {
        show("Warning", e);
        throw (e);
    }

    /**
     * Display error message.
     *
     * @param e exception
     * @throws TransformerException
     */
    public void error(TransformerException e) throws TransformerException {
        show("Error", e);
        throw (e);
    }

    /**
     * Display fatal error message.
     *
     * @param e exception
     * @throws TransformerException
     */
    public void fatalError(TransformerException e) throws TransformerException {
        show("Fatal Error", e);
        throw (e);
    }

    /**
     * Display message.
     *
     * @param type message tye
     * @param e    exception
     */
    private void show(String type, TransformerException e) {
        System.out.println(type + ": " + e.getMessage());
        if (e.getLocationAsString() != null) {
            System.out.println(e.getLocationAsString());
        }
    }
}

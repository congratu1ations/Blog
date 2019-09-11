package cn.wmyskxz.blog.common.utils;

public enum WsdlServices {
    R1_QUERY("wsdl://","select","123");


    private String wsdlUrl;
    private String wsdlMethod;
    private String wsdlNamespace;

    WsdlServices(String wsdlUrl, String wsdlMethod, String wsdlNamespace) {
        this.wsdlUrl = wsdlUrl;
        this.wsdlMethod = wsdlMethod;
        this.wsdlNamespace = wsdlNamespace;
    }

    public String getWsdlUrl() {
        return wsdlUrl;
    }

    public String getWsdlMethod() {
        return wsdlMethod;
    }

    public String getWsdlNamespace() {
        return wsdlNamespace;
    }
}

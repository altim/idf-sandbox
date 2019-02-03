package com.candorgrc.idfusion.sandbox.client.view.impl;

public class PersonViewImpl_PersonViewImplUiBinderImpl_TemplateImpl implements com.candorgrc.idfusion.sandbox.client.view.impl.PersonViewImpl_PersonViewImplUiBinderImpl.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml html1(java.lang.String arg0,java.lang.String arg1,java.lang.String arg2,java.lang.String arg3,java.lang.String arg4) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<header> <div class='filter-toolbar'> <div class='title field selectField'> <span class='label'>Title:</span> <select class='value'> <option value=''></option> <option value='Mr.'>Mr.</option> <option value='Mrs.'>Mrs.</option> <option value='Ms.'>Ms.</option> </select> </div> <div class='first-name field inputField'> <span class='label'>First Name:</span> <input class='value' required='required' type='text'> </div> <div class='last-name inputField'> <span class='label'>Last Name:</span> <input class='value' required='required' type='text'> </div> <div class='suffix field selectField'> <span class='label'>Suffix:</span> <select class='value'> <option value=''></option> <option value='PhD'>PhD.</option> <option value='Engineer'>Engineer</option> <option value='Doctor'>Doctor</option> </select> </div> <div class='gender field selectField'> <span class='label'>Gender:</span> <select class='value'> <option value=''></option> <option value='m'>Male</option> <option value='f'>Female</option> </select> </div> <div class='race field inputField'> <span class='label'>Race:</span> <input class='value' required='required' type='text'> </div> <div class='language field inputField'> <span class='label'>Language:</span> <input class='value' required='required' type='text'> </div> </div> <button class='btn btn-primary apply-filters' id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
    sb.append("'>Apply Filters</button> </header> <section> <header class='controls'> <button class='toggle-view-mode' id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1));
    sb.append("'>Switch View Mode</button> <button class='reset' id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg2));
    sb.append("'>Reset Data Collection</button> </header> <span id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg3));
    sb.append("'></span> </section> <footer> <button class='fetch' id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg4));
    sb.append("'>Fetch more...</button> </footer>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}

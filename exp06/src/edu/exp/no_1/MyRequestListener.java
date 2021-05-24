package edu.exp.no_1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public final class MyRequestListener implements ServletRequestListener{
    private int count = 0;
    public void requestInitialized(ServletRequestEvent re){
        HttpServletRequest request= (HttpServletRequest)re.getServletRequest();
        if(request.getRequestURI().equals("/helloapp/onlineCount.jsp")){
            count++;
            re.getServletContext().setAttribute("count",new Integer(count));
        }
    }

    public void requestDestroyed(ServletRequestEvent re){

    }

}


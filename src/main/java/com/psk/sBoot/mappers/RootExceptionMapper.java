package com.psk.sBoot.mappers;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class RootExceptionMapper implements ExceptionMapper<Exception> {
    @Override
    public Response toResponse(Exception exception) {

        Error e = new Error();

        e.setCode(exception.getMessage());
        e.setReason(exception.getMessage());
        return Response.serverError().entity(e).build();
    }
}


class Error {

    String reason;
    String code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
package NestedClasses;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Request {
  private String method;
  private String url;
  private String jsonBody;

  private Request() {
  }

  public static Request.Builder newRequest() {
    return new Request().new Builder();
  }

  public InputStream send() throws IOException {
    HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
    connection.setRequestMethod(method);
    return connection.getInputStream();
  }

  public class Builder {

    private Builder() {
    }

    public Request.Builder setMethod(String methodName) {
      Request.this.method = methodName;
      return this;
    }
    public Request.Builder setUrl(String url) {
      Request.this.url = url;
      return this;
    }
    public Request.Builder setJsonBody(String json) {
      Request.this.jsonBody = json;
      return this;
    }
    public Request build() {
      return Request.this;
    }
  }
}


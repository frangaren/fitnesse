// Copyright (C) 2003-2009 by Object Mentor, Inc. All rights reserved.
// Released under the terms of the CPL Common Public License version 1.0.
package fitnesse.fixtures;

import fitnesse.FitNesseContext.Builder;
import fitnesse.authentication.OneUserAuthenticator;

public class AuthenticatorSetup
{
  private String username;
  private String password;

  public String status() {
    Builder builder = new Builder(FitnesseFixtureContext.context);
    builder.authenticator = new OneUserAuthenticator(username, password);
    FitnesseFixtureContext.context.authenticator = new OneUserAuthenticator(username, password);
    return "ok";
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}

package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Long;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ServiceAccountTokenProjectionFluent<A extends io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjectionFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getAudience();
  public A withAudience(java.lang.String audience);
  public java.lang.Boolean hasAudience();
  
  /**
   * Method is deprecated. use withAudience instead.
   */
  @java.lang.Deprecated
  public A withNewAudience(java.lang.String arg0);
  public java.lang.Long getExpirationSeconds();
  public A withExpirationSeconds(java.lang.Long expirationSeconds);
  public java.lang.Boolean hasExpirationSeconds();
  public java.lang.String getPath();
  public A withPath(java.lang.String path);
  public java.lang.Boolean hasPath();
  
  /**
   * Method is deprecated. use withPath instead.
   */
  @java.lang.Deprecated
  public A withNewPath(java.lang.String arg0);
  
}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1CronJobSpecFluentImpl<A extends io.kubernetes.client.openapi.models.V1CronJobSpecFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1CronJobSpecFluent<A>{
  public V1CronJobSpecFluentImpl() {
  }
  public V1CronJobSpecFluentImpl(io.kubernetes.client.openapi.models.V1CronJobSpec instance) {
    this.withConcurrencyPolicy(instance.getConcurrencyPolicy());

    this.withFailedJobsHistoryLimit(instance.getFailedJobsHistoryLimit());

    this.withJobTemplate(instance.getJobTemplate());

    this.withSchedule(instance.getSchedule());

    this.withStartingDeadlineSeconds(instance.getStartingDeadlineSeconds());

    this.withSuccessfulJobsHistoryLimit(instance.getSuccessfulJobsHistoryLimit());

    this.withSuspend(instance.getSuspend());

  }
  private java.lang.String concurrencyPolicy;
  private java.lang.Integer failedJobsHistoryLimit;
  private io.kubernetes.client.openapi.models.V1JobTemplateSpecBuilder jobTemplate;
  private java.lang.String schedule;
  private java.lang.Long startingDeadlineSeconds;
  private java.lang.Integer successfulJobsHistoryLimit;
  private java.lang.Boolean suspend;
  public java.lang.String getConcurrencyPolicy() {
    return this.concurrencyPolicy;
  }
  public A withConcurrencyPolicy(java.lang.String concurrencyPolicy) {
    this.concurrencyPolicy=concurrencyPolicy; return (A) this;
  }
  public java.lang.Boolean hasConcurrencyPolicy() {
    return this.concurrencyPolicy != null;
  }
  
  /**
   * Method is deprecated. use withConcurrencyPolicy instead.
   */
  @java.lang.Deprecated
  public A withNewConcurrencyPolicy(java.lang.String arg0) {
    return (A)withConcurrencyPolicy(new String(arg0));
  }
  public java.lang.Integer getFailedJobsHistoryLimit() {
    return this.failedJobsHistoryLimit;
  }
  public A withFailedJobsHistoryLimit(java.lang.Integer failedJobsHistoryLimit) {
    this.failedJobsHistoryLimit=failedJobsHistoryLimit; return (A) this;
  }
  public java.lang.Boolean hasFailedJobsHistoryLimit() {
    return this.failedJobsHistoryLimit != null;
  }
  
  /**
   * This method has been deprecated, please use method buildJobTemplate instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1JobTemplateSpec getJobTemplate() {
    return this.jobTemplate!=null ?this.jobTemplate.build():null;
  }
  public io.kubernetes.client.openapi.models.V1JobTemplateSpec buildJobTemplate() {
    return this.jobTemplate!=null ?this.jobTemplate.build():null;
  }
  public A withJobTemplate(io.kubernetes.client.openapi.models.V1JobTemplateSpec jobTemplate) {
    _visitables.get("jobTemplate").remove(this.jobTemplate);
    if (jobTemplate!=null){ this.jobTemplate= new io.kubernetes.client.openapi.models.V1JobTemplateSpecBuilder(jobTemplate); _visitables.get("jobTemplate").add(this.jobTemplate);} return (A) this;
  }
  public java.lang.Boolean hasJobTemplate() {
    return this.jobTemplate != null;
  }
  public io.kubernetes.client.openapi.models.V1CronJobSpecFluent.JobTemplateNested<A> withNewJobTemplate() {
    return new io.kubernetes.client.openapi.models.V1CronJobSpecFluentImpl.JobTemplateNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V1CronJobSpecFluent.JobTemplateNested<A> withNewJobTemplateLike(io.kubernetes.client.openapi.models.V1JobTemplateSpec item) {
    return new io.kubernetes.client.openapi.models.V1CronJobSpecFluentImpl.JobTemplateNestedImpl(item);
  }
  public io.kubernetes.client.openapi.models.V1CronJobSpecFluent.JobTemplateNested<A> editJobTemplate() {
    return withNewJobTemplateLike(getJobTemplate());
  }
  public io.kubernetes.client.openapi.models.V1CronJobSpecFluent.JobTemplateNested<A> editOrNewJobTemplate() {
    return withNewJobTemplateLike(getJobTemplate() != null ? getJobTemplate(): new io.kubernetes.client.openapi.models.V1JobTemplateSpecBuilder().build());
  }
  public io.kubernetes.client.openapi.models.V1CronJobSpecFluent.JobTemplateNested<A> editOrNewJobTemplateLike(io.kubernetes.client.openapi.models.V1JobTemplateSpec item) {
    return withNewJobTemplateLike(getJobTemplate() != null ? getJobTemplate(): item);
  }
  public java.lang.String getSchedule() {
    return this.schedule;
  }
  public A withSchedule(java.lang.String schedule) {
    this.schedule=schedule; return (A) this;
  }
  public java.lang.Boolean hasSchedule() {
    return this.schedule != null;
  }
  
  /**
   * Method is deprecated. use withSchedule instead.
   */
  @java.lang.Deprecated
  public A withNewSchedule(java.lang.String arg0) {
    return (A)withSchedule(new String(arg0));
  }
  public java.lang.Long getStartingDeadlineSeconds() {
    return this.startingDeadlineSeconds;
  }
  public A withStartingDeadlineSeconds(java.lang.Long startingDeadlineSeconds) {
    this.startingDeadlineSeconds=startingDeadlineSeconds; return (A) this;
  }
  public java.lang.Boolean hasStartingDeadlineSeconds() {
    return this.startingDeadlineSeconds != null;
  }
  public java.lang.Integer getSuccessfulJobsHistoryLimit() {
    return this.successfulJobsHistoryLimit;
  }
  public A withSuccessfulJobsHistoryLimit(java.lang.Integer successfulJobsHistoryLimit) {
    this.successfulJobsHistoryLimit=successfulJobsHistoryLimit; return (A) this;
  }
  public java.lang.Boolean hasSuccessfulJobsHistoryLimit() {
    return this.successfulJobsHistoryLimit != null;
  }
  public java.lang.Boolean getSuspend() {
    return this.suspend;
  }
  public A withSuspend(java.lang.Boolean suspend) {
    this.suspend=suspend; return (A) this;
  }
  public java.lang.Boolean hasSuspend() {
    return this.suspend != null;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CronJobSpecFluentImpl that = (V1CronJobSpecFluentImpl) o;
    if (concurrencyPolicy != null ? !concurrencyPolicy.equals(that.concurrencyPolicy) :that.concurrencyPolicy != null) return false;
    if (failedJobsHistoryLimit != null ? !failedJobsHistoryLimit.equals(that.failedJobsHistoryLimit) :that.failedJobsHistoryLimit != null) return false;
    if (jobTemplate != null ? !jobTemplate.equals(that.jobTemplate) :that.jobTemplate != null) return false;
    if (schedule != null ? !schedule.equals(that.schedule) :that.schedule != null) return false;
    if (startingDeadlineSeconds != null ? !startingDeadlineSeconds.equals(that.startingDeadlineSeconds) :that.startingDeadlineSeconds != null) return false;
    if (successfulJobsHistoryLimit != null ? !successfulJobsHistoryLimit.equals(that.successfulJobsHistoryLimit) :that.successfulJobsHistoryLimit != null) return false;
    if (suspend != null ? !suspend.equals(that.suspend) :that.suspend != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(concurrencyPolicy,  failedJobsHistoryLimit,  jobTemplate,  schedule,  startingDeadlineSeconds,  successfulJobsHistoryLimit,  suspend,  super.hashCode());
  }
  public class JobTemplateNestedImpl<N> extends io.kubernetes.client.openapi.models.V1JobTemplateSpecFluentImpl<io.kubernetes.client.openapi.models.V1CronJobSpecFluent.JobTemplateNested<N>> implements io.kubernetes.client.openapi.models.V1CronJobSpecFluent.JobTemplateNested<N>,io.kubernetes.client.fluent.Nested<N>{
    JobTemplateNestedImpl(io.kubernetes.client.openapi.models.V1JobTemplateSpec item) {
      this.builder = new io.kubernetes.client.openapi.models.V1JobTemplateSpecBuilder(this, item);
    }
    JobTemplateNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1JobTemplateSpecBuilder(this);
    }
    io.kubernetes.client.openapi.models.V1JobTemplateSpecBuilder builder;
    public N and() {
      return (N) V1CronJobSpecFluentImpl.this.withJobTemplate(builder.build());
    }
    public N endJobTemplate() {
      return and();
    }
    
  }
  
}
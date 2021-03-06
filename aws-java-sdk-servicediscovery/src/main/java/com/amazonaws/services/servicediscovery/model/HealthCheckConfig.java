/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * <i>Public DNS namespaces only.</i> A complex type that contains settings for an optional health check. If you specify
 * settings for a health check, Amazon Route 53 associates the health check with all the resource record sets that you
 * specify in <code>DnsConfig</code>.
 * </p>
 * <note>
 * <p>
 * The health check uses 30 seconds as the request interval. This is the number of seconds between the time that each
 * Amazon Route 53 health checker gets a response from your endpoint and the time that it sends the next health check
 * request. A health checker in each data center around the world sends your endpoint a health check request every 30
 * seconds. On average, your endpoint receives a health check request about every two seconds. Health checkers in
 * different data centers don't coordinate with one another, so you'll sometimes see several requests per second
 * followed by a few seconds with no health checks at all.
 * </p>
 * </note>
 * <p>
 * For information about the charges for health checks, see <a href="http://aws.amazon.com/route53/pricing">Amazon Route
 * 53 Pricing</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/HealthCheckConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HealthCheckConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of health check that you want to create, which indicates how Amazon Route 53 determines whether an
     * endpoint is healthy.
     * </p>
     * <important>
     * <p>
     * You can't change the value of <code>Type</code> after you create a health check.
     * </p>
     * </important>
     * <p>
     * You can create the following types of health checks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>HTTP</b>: Amazon Route 53 tries to establish a TCP connection. If successful, Amazon Route 53 submits an HTTP
     * request and waits for an HTTP status code of 200 or greater and less than 400.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>HTTPS</b>: Amazon Route 53 tries to establish a TCP connection. If successful, Amazon Route 53 submits an
     * HTTPS request and waits for an HTTP status code of 200 or greater and less than 400.
     * </p>
     * <important>
     * <p>
     * If you specify HTTPS for the value of <code>Type</code>, the endpoint must support TLS v1.0 or later.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <b>TCP</b>: Amazon Route 53 tries to establish a TCP connection.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The path that you want Amazon Route 53 to request when performing health checks. The path can be any value for
     * which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, such as the file
     * <code>/docs/route53-health-check.html</code>. Amazon Route 53 automatically adds the DNS name for the service and
     * a leading forward slash (<code>/</code>) character.
     * </p>
     */
    private String resourcePath;
    /**
     * <p>
     * The number of consecutive health checks that an endpoint must pass or fail for Amazon Route 53 to change the
     * current status of the endpoint from unhealthy to healthy or vice versa. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     */
    private Integer failureThreshold;

    /**
     * <p>
     * The type of health check that you want to create, which indicates how Amazon Route 53 determines whether an
     * endpoint is healthy.
     * </p>
     * <important>
     * <p>
     * You can't change the value of <code>Type</code> after you create a health check.
     * </p>
     * </important>
     * <p>
     * You can create the following types of health checks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>HTTP</b>: Amazon Route 53 tries to establish a TCP connection. If successful, Amazon Route 53 submits an HTTP
     * request and waits for an HTTP status code of 200 or greater and less than 400.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>HTTPS</b>: Amazon Route 53 tries to establish a TCP connection. If successful, Amazon Route 53 submits an
     * HTTPS request and waits for an HTTP status code of 200 or greater and less than 400.
     * </p>
     * <important>
     * <p>
     * If you specify HTTPS for the value of <code>Type</code>, the endpoint must support TLS v1.0 or later.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <b>TCP</b>: Amazon Route 53 tries to establish a TCP connection.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of health check that you want to create, which indicates how Amazon Route 53 determines whether
     *        an endpoint is healthy.</p> <important>
     *        <p>
     *        You can't change the value of <code>Type</code> after you create a health check.
     *        </p>
     *        </important>
     *        <p>
     *        You can create the following types of health checks:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>HTTP</b>: Amazon Route 53 tries to establish a TCP connection. If successful, Amazon Route 53 submits
     *        an HTTP request and waits for an HTTP status code of 200 or greater and less than 400.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>HTTPS</b>: Amazon Route 53 tries to establish a TCP connection. If successful, Amazon Route 53 submits
     *        an HTTPS request and waits for an HTTP status code of 200 or greater and less than 400.
     *        </p>
     *        <important>
     *        <p>
     *        If you specify HTTPS for the value of <code>Type</code>, the endpoint must support TLS v1.0 or later.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <b>TCP</b>: Amazon Route 53 tries to establish a TCP connection.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *        >How Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer
     *        Guide</i>.
     * @see HealthCheckType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of health check that you want to create, which indicates how Amazon Route 53 determines whether an
     * endpoint is healthy.
     * </p>
     * <important>
     * <p>
     * You can't change the value of <code>Type</code> after you create a health check.
     * </p>
     * </important>
     * <p>
     * You can create the following types of health checks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>HTTP</b>: Amazon Route 53 tries to establish a TCP connection. If successful, Amazon Route 53 submits an HTTP
     * request and waits for an HTTP status code of 200 or greater and less than 400.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>HTTPS</b>: Amazon Route 53 tries to establish a TCP connection. If successful, Amazon Route 53 submits an
     * HTTPS request and waits for an HTTP status code of 200 or greater and less than 400.
     * </p>
     * <important>
     * <p>
     * If you specify HTTPS for the value of <code>Type</code>, the endpoint must support TLS v1.0 or later.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <b>TCP</b>: Amazon Route 53 tries to establish a TCP connection.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @return The type of health check that you want to create, which indicates how Amazon Route 53 determines whether
     *         an endpoint is healthy.</p> <important>
     *         <p>
     *         You can't change the value of <code>Type</code> after you create a health check.
     *         </p>
     *         </important>
     *         <p>
     *         You can create the following types of health checks:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>HTTP</b>: Amazon Route 53 tries to establish a TCP connection. If successful, Amazon Route 53 submits
     *         an HTTP request and waits for an HTTP status code of 200 or greater and less than 400.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>HTTPS</b>: Amazon Route 53 tries to establish a TCP connection. If successful, Amazon Route 53 submits
     *         an HTTPS request and waits for an HTTP status code of 200 or greater and less than 400.
     *         </p>
     *         <important>
     *         <p>
     *         If you specify HTTPS for the value of <code>Type</code>, the endpoint must support TLS v1.0 or later.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         <b>TCP</b>: Amazon Route 53 tries to establish a TCP connection.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *         >How Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer
     *         Guide</i>.
     * @see HealthCheckType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of health check that you want to create, which indicates how Amazon Route 53 determines whether an
     * endpoint is healthy.
     * </p>
     * <important>
     * <p>
     * You can't change the value of <code>Type</code> after you create a health check.
     * </p>
     * </important>
     * <p>
     * You can create the following types of health checks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>HTTP</b>: Amazon Route 53 tries to establish a TCP connection. If successful, Amazon Route 53 submits an HTTP
     * request and waits for an HTTP status code of 200 or greater and less than 400.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>HTTPS</b>: Amazon Route 53 tries to establish a TCP connection. If successful, Amazon Route 53 submits an
     * HTTPS request and waits for an HTTP status code of 200 or greater and less than 400.
     * </p>
     * <important>
     * <p>
     * If you specify HTTPS for the value of <code>Type</code>, the endpoint must support TLS v1.0 or later.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <b>TCP</b>: Amazon Route 53 tries to establish a TCP connection.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of health check that you want to create, which indicates how Amazon Route 53 determines whether
     *        an endpoint is healthy.</p> <important>
     *        <p>
     *        You can't change the value of <code>Type</code> after you create a health check.
     *        </p>
     *        </important>
     *        <p>
     *        You can create the following types of health checks:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>HTTP</b>: Amazon Route 53 tries to establish a TCP connection. If successful, Amazon Route 53 submits
     *        an HTTP request and waits for an HTTP status code of 200 or greater and less than 400.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>HTTPS</b>: Amazon Route 53 tries to establish a TCP connection. If successful, Amazon Route 53 submits
     *        an HTTPS request and waits for an HTTP status code of 200 or greater and less than 400.
     *        </p>
     *        <important>
     *        <p>
     *        If you specify HTTPS for the value of <code>Type</code>, the endpoint must support TLS v1.0 or later.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <b>TCP</b>: Amazon Route 53 tries to establish a TCP connection.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *        >How Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthCheckType
     */

    public HealthCheckConfig withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of health check that you want to create, which indicates how Amazon Route 53 determines whether an
     * endpoint is healthy.
     * </p>
     * <important>
     * <p>
     * You can't change the value of <code>Type</code> after you create a health check.
     * </p>
     * </important>
     * <p>
     * You can create the following types of health checks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>HTTP</b>: Amazon Route 53 tries to establish a TCP connection. If successful, Amazon Route 53 submits an HTTP
     * request and waits for an HTTP status code of 200 or greater and less than 400.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>HTTPS</b>: Amazon Route 53 tries to establish a TCP connection. If successful, Amazon Route 53 submits an
     * HTTPS request and waits for an HTTP status code of 200 or greater and less than 400.
     * </p>
     * <important>
     * <p>
     * If you specify HTTPS for the value of <code>Type</code>, the endpoint must support TLS v1.0 or later.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <b>TCP</b>: Amazon Route 53 tries to establish a TCP connection.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of health check that you want to create, which indicates how Amazon Route 53 determines whether
     *        an endpoint is healthy.</p> <important>
     *        <p>
     *        You can't change the value of <code>Type</code> after you create a health check.
     *        </p>
     *        </important>
     *        <p>
     *        You can create the following types of health checks:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>HTTP</b>: Amazon Route 53 tries to establish a TCP connection. If successful, Amazon Route 53 submits
     *        an HTTP request and waits for an HTTP status code of 200 or greater and less than 400.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>HTTPS</b>: Amazon Route 53 tries to establish a TCP connection. If successful, Amazon Route 53 submits
     *        an HTTPS request and waits for an HTTP status code of 200 or greater and less than 400.
     *        </p>
     *        <important>
     *        <p>
     *        If you specify HTTPS for the value of <code>Type</code>, the endpoint must support TLS v1.0 or later.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <b>TCP</b>: Amazon Route 53 tries to establish a TCP connection.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *        >How Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthCheckType
     */

    public HealthCheckConfig withType(HealthCheckType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The path that you want Amazon Route 53 to request when performing health checks. The path can be any value for
     * which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, such as the file
     * <code>/docs/route53-health-check.html</code>. Amazon Route 53 automatically adds the DNS name for the service and
     * a leading forward slash (<code>/</code>) character.
     * </p>
     * 
     * @param resourcePath
     *        The path that you want Amazon Route 53 to request when performing health checks. The path can be any value
     *        for which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, such
     *        as the file <code>/docs/route53-health-check.html</code>. Amazon Route 53 automatically adds the DNS name
     *        for the service and a leading forward slash (<code>/</code>) character.
     */

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    /**
     * <p>
     * The path that you want Amazon Route 53 to request when performing health checks. The path can be any value for
     * which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, such as the file
     * <code>/docs/route53-health-check.html</code>. Amazon Route 53 automatically adds the DNS name for the service and
     * a leading forward slash (<code>/</code>) character.
     * </p>
     * 
     * @return The path that you want Amazon Route 53 to request when performing health checks. The path can be any
     *         value for which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy,
     *         such as the file <code>/docs/route53-health-check.html</code>. Amazon Route 53 automatically adds the DNS
     *         name for the service and a leading forward slash (<code>/</code>) character.
     */

    public String getResourcePath() {
        return this.resourcePath;
    }

    /**
     * <p>
     * The path that you want Amazon Route 53 to request when performing health checks. The path can be any value for
     * which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, such as the file
     * <code>/docs/route53-health-check.html</code>. Amazon Route 53 automatically adds the DNS name for the service and
     * a leading forward slash (<code>/</code>) character.
     * </p>
     * 
     * @param resourcePath
     *        The path that you want Amazon Route 53 to request when performing health checks. The path can be any value
     *        for which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, such
     *        as the file <code>/docs/route53-health-check.html</code>. Amazon Route 53 automatically adds the DNS name
     *        for the service and a leading forward slash (<code>/</code>) character.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfig withResourcePath(String resourcePath) {
        setResourcePath(resourcePath);
        return this;
    }

    /**
     * <p>
     * The number of consecutive health checks that an endpoint must pass or fail for Amazon Route 53 to change the
     * current status of the endpoint from unhealthy to healthy or vice versa. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param failureThreshold
     *        The number of consecutive health checks that an endpoint must pass or fail for Amazon Route 53 to change
     *        the current status of the endpoint from unhealthy to healthy or vice versa. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *        >How Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer
     *        Guide</i>.
     */

    public void setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    /**
     * <p>
     * The number of consecutive health checks that an endpoint must pass or fail for Amazon Route 53 to change the
     * current status of the endpoint from unhealthy to healthy or vice versa. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @return The number of consecutive health checks that an endpoint must pass or fail for Amazon Route 53 to change
     *         the current status of the endpoint from unhealthy to healthy or vice versa. For more information, see <a
     *         href=
     *         "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *         >How Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer
     *         Guide</i>.
     */

    public Integer getFailureThreshold() {
        return this.failureThreshold;
    }

    /**
     * <p>
     * The number of consecutive health checks that an endpoint must pass or fail for Amazon Route 53 to change the
     * current status of the endpoint from unhealthy to healthy or vice versa. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param failureThreshold
     *        The number of consecutive health checks that an endpoint must pass or fail for Amazon Route 53 to change
     *        the current status of the endpoint from unhealthy to healthy or vice versa. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *        >How Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfig withFailureThreshold(Integer failureThreshold) {
        setFailureThreshold(failureThreshold);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getResourcePath() != null)
            sb.append("ResourcePath: ").append(getResourcePath()).append(",");
        if (getFailureThreshold() != null)
            sb.append("FailureThreshold: ").append(getFailureThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HealthCheckConfig == false)
            return false;
        HealthCheckConfig other = (HealthCheckConfig) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getResourcePath() == null ^ this.getResourcePath() == null)
            return false;
        if (other.getResourcePath() != null && other.getResourcePath().equals(this.getResourcePath()) == false)
            return false;
        if (other.getFailureThreshold() == null ^ this.getFailureThreshold() == null)
            return false;
        if (other.getFailureThreshold() != null && other.getFailureThreshold().equals(this.getFailureThreshold()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getResourcePath() == null) ? 0 : getResourcePath().hashCode());
        hashCode = prime * hashCode + ((getFailureThreshold() == null) ? 0 : getFailureThreshold().hashCode());
        return hashCode;
    }

    @Override
    public HealthCheckConfig clone() {
        try {
            return (HealthCheckConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicediscovery.model.transform.HealthCheckConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/RenewDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RenewDomainResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for tracking the progress of the request. To use this ID to query the operation status, use
     * <a>GetOperationDetail</a>.
     * </p>
     */
    private String operationId;

    /**
     * <p>
     * The identifier for tracking the progress of the request. To use this ID to query the operation status, use
     * <a>GetOperationDetail</a>.
     * </p>
     * 
     * @param operationId
     *        The identifier for tracking the progress of the request. To use this ID to query the operation status, use
     *        <a>GetOperationDetail</a>.
     */

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * The identifier for tracking the progress of the request. To use this ID to query the operation status, use
     * <a>GetOperationDetail</a>.
     * </p>
     * 
     * @return The identifier for tracking the progress of the request. To use this ID to query the operation status,
     *         use <a>GetOperationDetail</a>.
     */

    public String getOperationId() {
        return this.operationId;
    }

    /**
     * <p>
     * The identifier for tracking the progress of the request. To use this ID to query the operation status, use
     * <a>GetOperationDetail</a>.
     * </p>
     * 
     * @param operationId
     *        The identifier for tracking the progress of the request. To use this ID to query the operation status, use
     *        <a>GetOperationDetail</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenewDomainResult withOperationId(String operationId) {
        setOperationId(operationId);
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
        if (getOperationId() != null)
            sb.append("OperationId: ").append(getOperationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RenewDomainResult == false)
            return false;
        RenewDomainResult other = (RenewDomainResult) obj;
        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        return hashCode;
    }

    @Override
    public RenewDomainResult clone() {
        try {
            return (RenewDomainResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

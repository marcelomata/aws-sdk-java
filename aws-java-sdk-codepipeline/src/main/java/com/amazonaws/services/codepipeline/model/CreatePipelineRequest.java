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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a CreatePipeline action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/CreatePipeline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePipelineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Represents the structure of actions and stages to be performed in the pipeline.
     * </p>
     */
    private PipelineDeclaration pipeline;

    /**
     * <p>
     * Represents the structure of actions and stages to be performed in the pipeline.
     * </p>
     * 
     * @param pipeline
     *        Represents the structure of actions and stages to be performed in the pipeline.
     */

    public void setPipeline(PipelineDeclaration pipeline) {
        this.pipeline = pipeline;
    }

    /**
     * <p>
     * Represents the structure of actions and stages to be performed in the pipeline.
     * </p>
     * 
     * @return Represents the structure of actions and stages to be performed in the pipeline.
     */

    public PipelineDeclaration getPipeline() {
        return this.pipeline;
    }

    /**
     * <p>
     * Represents the structure of actions and stages to be performed in the pipeline.
     * </p>
     * 
     * @param pipeline
     *        Represents the structure of actions and stages to be performed in the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePipelineRequest withPipeline(PipelineDeclaration pipeline) {
        setPipeline(pipeline);
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
        if (getPipeline() != null)
            sb.append("Pipeline: ").append(getPipeline());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePipelineRequest == false)
            return false;
        CreatePipelineRequest other = (CreatePipelineRequest) obj;
        if (other.getPipeline() == null ^ this.getPipeline() == null)
            return false;
        if (other.getPipeline() != null && other.getPipeline().equals(this.getPipeline()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipeline() == null) ? 0 : getPipeline().hashCode());
        return hashCode;
    }

    @Override
    public CreatePipelineRequest clone() {
        return (CreatePipelineRequest) super.clone();
    }

}

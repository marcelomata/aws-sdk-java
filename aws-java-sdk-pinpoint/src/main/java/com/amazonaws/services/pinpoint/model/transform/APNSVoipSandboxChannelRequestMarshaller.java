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
package com.amazonaws.services.pinpoint.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * APNSVoipSandboxChannelRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class APNSVoipSandboxChannelRequestMarshaller {

    private static final MarshallingInfo<String> BUNDLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BundleId").build();
    private static final MarshallingInfo<String> CERTIFICATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Certificate").build();
    private static final MarshallingInfo<String> DEFAULTAUTHENTICATIONMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultAuthenticationMethod").build();
    private static final MarshallingInfo<Boolean> ENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Enabled").build();
    private static final MarshallingInfo<String> PRIVATEKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrivateKey").build();
    private static final MarshallingInfo<String> TEAMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TeamId").build();
    private static final MarshallingInfo<String> TOKENKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TokenKey").build();
    private static final MarshallingInfo<String> TOKENKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TokenKeyId").build();

    private static final APNSVoipSandboxChannelRequestMarshaller instance = new APNSVoipSandboxChannelRequestMarshaller();

    public static APNSVoipSandboxChannelRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(APNSVoipSandboxChannelRequest aPNSVoipSandboxChannelRequest, ProtocolMarshaller protocolMarshaller) {

        if (aPNSVoipSandboxChannelRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(aPNSVoipSandboxChannelRequest.getBundleId(), BUNDLEID_BINDING);
            protocolMarshaller.marshall(aPNSVoipSandboxChannelRequest.getCertificate(), CERTIFICATE_BINDING);
            protocolMarshaller.marshall(aPNSVoipSandboxChannelRequest.getDefaultAuthenticationMethod(), DEFAULTAUTHENTICATIONMETHOD_BINDING);
            protocolMarshaller.marshall(aPNSVoipSandboxChannelRequest.getEnabled(), ENABLED_BINDING);
            protocolMarshaller.marshall(aPNSVoipSandboxChannelRequest.getPrivateKey(), PRIVATEKEY_BINDING);
            protocolMarshaller.marshall(aPNSVoipSandboxChannelRequest.getTeamId(), TEAMID_BINDING);
            protocolMarshaller.marshall(aPNSVoipSandboxChannelRequest.getTokenKey(), TOKENKEY_BINDING);
            protocolMarshaller.marshall(aPNSVoipSandboxChannelRequest.getTokenKeyId(), TOKENKEYID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

/*
 * Headwind MDM: Open Source Android MDM Software
 * https://h-mdm.com
 *
 * Copyright (C) 2019 Headwind Solutions LLC (http://h-sms.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hmdm.launcher.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.json.JSONObject;

@JsonIgnoreProperties( ignoreUnknown = true )
public class PushMessage {
    private String messageType;
    private String payload;

    public static final String TYPE_CONFIG_UPDATED = "configUpdated";
    public static final String TYPE_RUN_APP = "runApp";

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType( String messageType ) {
        this.messageType = messageType;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public JSONObject getPayloadJSON() {
        if (payload != null) {
            try {
                return new JSONObject(payload);
            } catch (Exception e) {
                // Bad payload
            }
        }
        return null;
    }
}

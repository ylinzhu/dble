/*
 * Copyright (C) 2016-2021 ActionTech.
 * based on code by MyCATCopyrightHolder Copyright (c) 2013, OpenCloudDB/MyCAT.
 * License: http://www.gnu.org/licenses/gpl.html GPL version 2 or higher.
 */

package com.actiontech.dble.cluster.values;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * @author dcy
 * Create Date: 2021-05-21
 */
public class JsonObjectWriter {
    private JsonObject jsonObject = new JsonObject();

    public void add(String property, JsonElement value) {
        if (value == null || value.isJsonNull()) {
            //ignore null
            return;
        }
        jsonObject.add(property, value);
    }


    public void addProperty(String property, String value) {
        if (value == null) {
            //ignore null
            return;
        }
        jsonObject.addProperty(property, value);
    }

    public void addProperty(String property, Number value) {
        if (value == null) {
            //ignore null
            return;
        }
        jsonObject.addProperty(property, value);
    }

    public void addProperty(String property, Boolean value) {
        if (value == null) {
            //ignore null
            return;
        }
        jsonObject.addProperty(property, value);
    }

    public void addProperty(String property, Character value) {
        if (value == null) {
            //ignore null
            return;
        }
        jsonObject.addProperty(property, value);
    }


    public int size() {
        return jsonObject.size();
    }


    protected JsonObject toJsonObject() {
        return jsonObject;
    }
}
/*
* Copyright 2010 Research In Motion Limited.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package blackberry.web.widget.jse.blackberry.ui.menu.MenuItem;

import blackberry.web.widget.jse.base.FunctionSignature;
import blackberry.web.widget.jse.base.ScriptableConstructorBase;

import net.rim.device.api.script.*;


public class MenuItemConstructor extends ScriptableConstructorBase {
    public static final String NAME = "MenuItem";

    /* @Override */ protected Object createNewObj( Object[] args ) {       
        if (args.length == 4) {
            return new MenuItemObject((Boolean)args[0], (Integer)args[1], (String)args[2], (ScriptableFunction)args[3]);
        }
        if (args.length == 3) {
            return new MenuItemObject((Boolean)args[0], (Integer)args[1], (String)args[2], null);
        } else {
            return new MenuItemObject((Boolean)args[0], (Integer)args[1], "", null);
        }
    }
    
    protected FunctionSignature[] getFunctionSignatures() {
        FunctionSignature fs = new FunctionSignature(4);
        fs.addParam(Boolean.class, true);
        fs.addParam(Integer.class, true);
        fs.addNullableParam(String.class, false);
        fs.addParam(ScriptableFunction.class, false);
        return new FunctionSignature[] { fs };
    }    
}

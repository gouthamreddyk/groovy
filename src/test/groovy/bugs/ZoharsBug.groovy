/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package groovy.bugs

/**
 * @author Zohar Melamed
 * @version $Revision$
 */
class ZoharsBug extends GroovyTestCase {
    
    void testBug() {
        def values = [1,2,3,4]
        def result = bloo(values, {it > 1})
        assert result == [2, 3, 4]
    }
    
    def bloo(a,b){
        return a.findAll{b.call(it)}
    }    
}
/*
 * Copyright 2019 Web3 Labs LTD.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.web3j.corda.dapps

import org.web3j.corda.api.CorDapp
import org.web3j.corda.protocol.CordaService

interface LifeCycle<T : CorDapp> {

    /**
     * Loads a CorDapp of type [T] from a node.
     */
    fun load(service: CordaService): T
}

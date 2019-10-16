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
package org.web3j.corda.model.core.contracts

import javax.annotation.Generated

/**
 *
 * @param &#x60;data&#x60;
 * @param contract
 * @param notary
 * @param encumbrance
 * @param constraint
 */
@Generated(
    value = ["org.web3j.corda.codegen.CorDappClientGenerator"],
    date = "2019-09-25T12:12:09.607Z"
)
data class TransactionState_net_corda_core_contracts_ContractState(
    val contract: String,
    val `data`: org.web3j.corda.model.core.contracts.ContractState? = null,
    val notary: org.web3j.corda.model.core.identity.Party? = null,
    val encumbrance: Int? = null,
    val constraint: Any? = null
)

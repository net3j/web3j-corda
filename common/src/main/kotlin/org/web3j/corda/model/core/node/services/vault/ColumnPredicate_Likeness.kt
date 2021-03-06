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
package org.web3j.corda.model.core.node.services.vault

import javax.annotation.Generated

/**
 *
 * @param &#x60;operator&#x60;
 * @param rightLiteral
 */
@Generated(
    value = ["org.web3j.corda.codegen.CorDappClientGenerator"],
    date = "2019-09-25T12:12:09.609Z"
)
data class ColumnPredicate_Likeness(
    val `operator`: org.web3j.corda.model.core.node.services.vault.ColumnPredicate_Likeness.`Operator`,
    val rightLiteral: String
) {
    enum class `Operator` {
        LIKE,
        NOT_LIKE,
        LIKE_IGNORE_CASE,
        NOT_LIKE_IGNORE_CASE
    }
}

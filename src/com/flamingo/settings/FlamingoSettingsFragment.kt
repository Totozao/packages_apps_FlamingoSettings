/*
 * Copyright (C) 2022 FlamingoOS Project
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

package com.flamingo.settings

import com.android.settings.R
import com.android.settings.search.BaseSearchIndexProvider
import com.android.settingslib.search.SearchIndexable

@SearchIndexable
class FlamingoSettingsFragment : FlamingoDashboardFragment() {

    override protected fun getPreferenceScreenResId() = R.xml.flamingo_settings

    override protected fun getLogTag() = TAG

    override fun getCategoryKey(): String = CATEGORY_FLAMINGO

    companion object {
        private const val TAG = "FlamingoSettingsFragment"

        private const val CATEGORY_FLAMINGO = "com.android.settings.category.ia.flamingo"

        @JvmField
        val SEARCH_INDEX_DATA_PROVIDER = BaseSearchIndexProvider(R.xml.flamingo_settings)
    }
}
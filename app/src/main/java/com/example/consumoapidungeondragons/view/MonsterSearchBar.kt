package com.example.consumoapidungeondragons.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.DockedSearchBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.consumoapidungeondragons.viewmodel.MonstersViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MonsterSearchBar(
    viewModel: MonstersViewModel,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    val searchedText by viewModel.searchedText.observeAsState("")

    Box(modifier = modifier.fillMaxWidth()) {
        DockedSearchBar(
            query = searchedText,
            onQueryChange = { viewModel.onSearchTextChange(it) },
            onSearch = {},
            active = false,
            onActiveChange = {},
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Search, contentDescription = "Search")
            },
            trailingIcon = {
                if (searchedText.isNotBlank()) {
                    Icon(
                        imageVector = Icons.Filled.Clear,
                        contentDescription = "Clear",
                        modifier = Modifier.clickable { viewModel.clearSearch() }
                    )
                }
            },
            placeholder = { Text("Busca tu monstruo de DND...") },
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(horizontal = 16.dp, vertical = 24.dp)
        ) {
            // No pongo recomendaciones ya que la lista se modifica sola
        }
        Column(modifier = Modifier.padding(top = 80.dp)) {
            content()
        }
    }
}
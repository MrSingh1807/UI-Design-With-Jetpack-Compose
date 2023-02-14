package com.example.uidesign.Designs

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uidesign.Repository.PersonRepository
import com.example.uidesign.model.Person
import com.example.uidesign.ui.theme.Typography

@Composable
fun RecyclerView(items: List<Person>) {

    LazyColumn(
        contentPadding = PaddingValues(all = 12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
//        items(items = items){person ->
//            CustomItem(person = person)
//        }

        itemsIndexed(
            items = items,
            key = { index, person ->
                person.id
            }
        ) { index, person ->
            CustomItem(person = person)
        }
    }

}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun StickyHeaderInRecyclerView(items: List<Person>) {
    val section = arrayOf("A","B","C","D")

    LazyColumn(
        contentPadding = PaddingValues(all = 12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        section.forEach {section ->
            stickyHeader {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.LightGray)
                        .padding(12.dp),
                    fontWeight = FontWeight.Bold,
                    fontSize = Typography.h3.fontSize,
                    text = "Section $section")
            }
            items(items = items){ person ->
                CustomItem(person = person)
            }
        }


    }
}

@Composable
fun CustomItem(person: Person) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "${person.age}",
            color = Color.Black,
            fontSize = Typography.h4.fontSize,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = person.firstName,
            color = Color.Black,
            fontSize = Typography.h5.fontSize,
            fontWeight = FontWeight.Normal
        )
        Text(
            text = person.lastName,
            color = Color.Black,
            fontSize = Typography.h5.fontSize,
            fontWeight = FontWeight.Normal
        )
    }
}

@Preview
@Composable
fun PreviewRecyclerView() {
    StickyHeaderInRecyclerView(items = PersonRepository().getAllData())
}
package com.example.learntopic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learntopic.data.Topic
import com.example.learntopic.model.DataSource
import com.example.learntopic.ui.theme.LearnTopicTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContent {
			LearnTopicTheme {
				TopicList()
			}
		}
	}
}

@Composable
fun TopicCard(topic: Topic, modifier: Modifier = Modifier) {
	Card(
		colors = CardDefaults.cardColors(),
		modifier = modifier
			.fillMaxWidth()
			.height(75.dp)
	) {
		Row(
			horizontalArrangement = Arrangement.Start,
			verticalAlignment = Alignment.Top
		) {
			Image(
				contentScale = ContentScale.Crop,
				alignment = Alignment.Center,
				painter = painterResource(topic.imageResId),
				contentDescription = stringResource(topic.name),
				modifier = Modifier
					.fillMaxHeight()
					.weight(0.3f)
			)
			Text(
				stringResource(topic.name),
				modifier = Modifier
					.weight(0.7f)
					.padding(16.dp)
			)
		}
	}
}

@Composable
fun TopicList(modifier: Modifier = Modifier) {
	LazyVerticalGrid(
		columns = GridCells.Fixed(2),
		verticalArrangement = Arrangement.spacedBy(8.dp),
		horizontalArrangement = Arrangement.spacedBy(8.dp),
		contentPadding = PaddingValues(horizontal = 8.dp, vertical = 8.dp)
	) {
		items(DataSource.topics) { topic ->
			TopicCard(topic)
		}
	}
}

@Preview(showBackground = true)
@Composable
fun TopicCardPreview() {
	TopicList()
}
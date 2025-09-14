# Course Topics App

## Overview

The **Course Topics App** is a mobile application that presents various course topics in a clean, scrollable grid. Each topic includes an image, a title, and the number of associated courses. Users can quickly explore available topics and see at a glance how many courses are available in each category.

## Project Goal

The main goal of this project is to build a visually appealing and highly functional interface for showcasing educational content by topic. It demonstrates proficiency in **Jetpack Compose**, Android UI development, and working with dynamic data in a reusable, maintainable way.

## Technologies & Skills

* **Kotlin** — primary language for Android development.
* **Jetpack Compose** — for building a declarative, modern UI.
* **Data Classes** — to define the structure of course topics (`Topic`), including image, title, and course count.
* **Composable Functions** — for creating reusable UI components:

    * `TopicCard` — displays a single topic with its image, title, and course count.
    * `TopicList` — renders all topic items in a responsive grid.
* **Image & Resource Management** — handling visual assets efficiently in Android.
* **Responsive Layouts** — using `LazyVerticalGrid` to ensure the UI adapts well to different screen sizes.

## Project Structure

* **`Topic`** — data class representing a course topic.
* **`topics`** — list of Topic objects
* **`TopicCard`** — Composable for individual topic items.
* **`TopicList`** — Composable for displaying all topics in a grid layout.
* **Image resources** — visual assets for each topic.

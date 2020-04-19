package com.magicgoop.tagpshere.example.util

object LoremIpsum {
    val list =
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean rutrum mollis interdum. Donec imperdiet condimentum faucibus. Aliquam vel ex pulvinar, consectetur mi ac, scelerisque lorem. Suspendisse sit amet bibendum orci. In quis nisl dapibus, faucibus tellus sit amet, venenatis lorem. Donec luctus luctus ultrices. In tellus diam, gravida vitae pellentesque et, tristique eu nisl. Donec pretium erat sed augue lobortis consectetur. Quisque et eleifend tortor.Ut blandit fermentum cursus. Aliquam at rhoncus nisi, et consectetur est. Quisque malesuada est leo, in cursus magna consectetur at. Cras et volutpat justo. Vestibulum condimentum dictum molestie. Phasellus aliquam, diam sed interdum commodo, diam purus egestas massa, in dictum tortor erat quis dolor. Donec dapibus dolor quis mi commodo finibus. Vivamus fermentum tellus nulla, iaculis pharetra urna elementum in."
            .replace("[^a-zA-Z\\s]".toRegex(), "")
            .replace("\\s+".toRegex(), " ")
            .split(" ")
}
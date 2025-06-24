# TwoThirdsOfLinkedList

This Java project provides a utility to find the node located at approximately two-thirds of the way through a singly linked list. It includes a generic `Node<T>` class and a `TwoThirdsOfLinkedList` class with the core logic.

## Features

- Supports generic singly linked lists.
- Returns the node at index ⌊(2/3) × n⌋ - 1, where `n` is the length of the list.
- Efficient one-pass traversal approach.

## Project Structure

- `Node<T>`: A simple generic class representing a node in a singly linked list.
- `TwoThirdsOfLinkedList`: Contains the `getTwoThirdsNode` method.

## Method Overview

```java
public <T> Node<T> getTwoThirdsNode(Node<T> head)
```

- Input: Head of a singly linked list.
- Output: The node approximately at 2/3 of the total length (0-based index).
- Returns null if the list is empty or contains only one element.

## Requirements
- Java 8 or higher

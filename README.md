# Groovy Null Value Arithmetic Bug

This repository demonstrates a potential issue in Groovy related to handling null values in arithmetic expressions.  The `calculate` function is designed to add two numbers. However, it produces unexpected results when one or both input values are null.  The solution provides a more robust way of managing null input, ensuring the function always returns a sensible result.

## Bug Description

The original `calculate` function doesn't explicitly check for null values before performing the addition. When null is involved in addition, it leads to unexpected behavior.

## Solution

The improved version includes a null check at the beginning of the function.  If either input is null, the function returns 0.  This makes the function more robust and less prone to unexpected behavior.
# A0 Tests
# TESTS.md — ListADT

Use the table below to describe your test cases. Each row should describe one test.

| Test name | Setup (steps) | Operation | Expected result | Exception? |
| --- | --- | --- | --- | --- |
| Example: get on empty list | Create empty list | get(0) | n/a | IndexOutOfBoundsException |
| T01 | Create empty list L | L.size() | returns 0 |
| T02 | Create empty list L | L.isEmpty() | returns true |
| T03 | Create empty list L | L.get(0) | throws IndexOutOfBoundsException |
| T04 | Create empty list L | L.add(0, "A") | list now contains ["A"], size = 1 |
| T05 | Setup: L = ["A"] | L.get(0) | returns "A" |
| T06 | Setup: L = ["A"] | L.add(1, "B") | list becomes ["A","B"] |
| T07 | Setup: L = ["A","B"] | L.add(1, "X") | list becomes ["A","X","B"] |
| T08 | Setup: L = ["A","X","B"] | L.remove(1) | returns "X"; list becomes ["A","B"] |
| T09 | Setup: L = ["A","B"] | L.remove(0) | returns "A"; list becomes ["B"] |
| T10 | Setup: L = ["B"] | L.remove(1) | throws IndexOutOfBoundsException |
| T11 | Setup: L = ["B"] | L.set(0, "C") | list becomes ["C"] |
| T12 | Setup: L = ["C"] | L.set(1, "X") | throws IndexOutOfBoundsException |
| T13 | Create empty list L | L.add(1, "X") | throws IndexOutOfBoundsException |
| T14 | Create empty list L | L.add(-1, "X") | throws IndexOutOfBoundsException |
| T15 | Setup: L = ["A","B","C"] | L.get(2) | returns "C" |
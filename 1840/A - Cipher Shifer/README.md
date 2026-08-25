<h2><a href="https://codeforces.com/contest/1840/problem/A" target="_blank" rel="noopener noreferrer">1840A — Cipher Shifer</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 8 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1840A](https://codeforces.com/contest/1840/problem/A) |

## Topics
`implementation` `strings` `two pointers`

---

## Problem Statement

<div class="header"><div class="title">A. Cipher Shifer</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>There is a string $$$a$$$ (unknown to you), consisting of lowercase Latin letters, encrypted according to the following rule into string $$$s$$$:</p><ul> <li> after each character of string $$$a$$$, an arbitrary (possibly zero) number of any lowercase Latin letters, different from the character itself, is added; </li><li> after each such addition, the character that we supplemented is added. </li></ul><p>You are given string $$$s$$$, and you need to output the initial string $$$a$$$. In other words, you need to decrypt string $$$s$$$.</p><p>Note that each string encrypted in this way is decrypted <span class="tex-font-style-bf">uniquely</span>.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line of the input contains a single integer $$$t$$$ ($$$1 \le t \le 1000$$$) — the number of test cases.</p><p>The descriptions of the test cases follow.</p><p>The first line of each test case contains a single integer $$$n$$$ ($$$2 \le n \le 100$$$) — the length of the encrypted message.</p><p>The second line of each test case contains a string $$$s$$$ of length $$$n$$$ — the encrypted message obtained from some string $$$a$$$.</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case, output the decrypted message $$$a$$$ on a separate line.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id0023201568761097247" id="id0008493341920078967" class="input-output-copier">Copy</div></div><pre id="id0023201568761097247"><div class="test-example-line test-example-line-even test-example-line-0">3</div><div class="test-example-line test-example-line-odd test-example-line-1">8</div><div class="test-example-line test-example-line-odd test-example-line-1">abacabac</div><div class="test-example-line test-example-line-even test-example-line-2">5</div><div class="test-example-line test-example-line-even test-example-line-2">qzxcq</div><div class="test-example-line test-example-line-odd test-example-line-3">20</div><div class="test-example-line test-example-line-odd test-example-line-3">ccooddeeffoorrcceess</div></pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id00010303494999034934" id="id007723992670519793" class="input-output-copier">Copy</div></div><pre id="id00010303494999034934">ac
q
codeforces
</pre></div></div></div><div class="note"><div class="section-title">Note</div><p>In the first encrypted message, the letter $$$a$$$ is encrypted as $$$aba$$$, and the letter $$$c$$$ is encrypted as $$$cabac$$$.</p><p>In the second encrypted message, only one letter $$$q$$$ is encrypted as $$$qzxcq$$$.</p><p>In the third encrypted message, zero characters are added to each letter.</p></div>
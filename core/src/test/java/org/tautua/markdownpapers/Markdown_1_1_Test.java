/*
 * Copyright 2011, TAUTUA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tautua.markdownpapers;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import java.io.*;
import java.util.Arrays;
import java.util.List;

/**
 * @author Larry Ruiz
 */
@RunWith(LabelledParameterized.class)
public class Markdown_1_1_Test extends BaseTest {
    private static final File OUTPUT_DIR = new File("target/output/1.1/basics");
    private static final File INPUT_DIR = new File("target/test-classes/1.1/basics");

    public Markdown_1_1_Test(String fileName) {
        super(fileName, INPUT_DIR, OUTPUT_DIR, ".text", ".xhtml");
    }

    @Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Amps and angle encoding"},
                {"Auto links"},
                {"Backslash escapes"},
                {"Blockquotes with code blocks"},
                {"Code Blocks"},
                {"Code Spans"},
                {"Hard-wrapped paragraphs with list-like lines"},
                {"Horizontal rules"},
                {"Images"},
                {"Inline HTML (Advanced)"},
                {"Inline HTML (Simple)"},
                {"Inline HTML comments"},
                {"Links, inline style"},
                {"Links, reference style"},
                {"Links, shortcut references"},
                {"Literal quotes in titles"},
                {"Markdown Documentation - Basics"},
                {"Markdown Documentation - Syntax"},
                {"Nested blockquotes"},
                {"Ordered and unordered lists"},
                {"Strong and em together"},
                {"Tabs"},
                {"Tidyness"}
            });
    }

}

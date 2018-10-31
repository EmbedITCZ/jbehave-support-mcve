package org.jbehavesupport.mcve;

import static java.util.Collections.singletonList;

import java.util.List;

import org.jbehavesupport.core.AbstractSpringStories;

public class MinimalCompleteVerifiableStory extends AbstractSpringStories {

    @Override
    protected List<String> storyPaths() {
        return singletonList(
                "org/jbehavesupport/mcve/MinimalCompleteVerifiable.story"
        );
    }
}

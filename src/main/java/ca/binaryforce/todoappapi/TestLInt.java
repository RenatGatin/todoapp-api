package ca.binaryforce.todoappapi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TestLInt {

    /**
     * Test JavaDoc for goodName.
     */
    private String goodName;
    private boolean isActive;
}

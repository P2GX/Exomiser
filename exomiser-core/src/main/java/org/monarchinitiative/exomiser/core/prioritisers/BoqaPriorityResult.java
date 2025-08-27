package org.monarchinitiative.exomiser.core.prioritisers;

public record BoqaPriorityResult() implements PriorityResult{
    @Override
    public int geneId() {
        return 0;
    }

    @Override
    public String geneSymbol() {
        return "";
    }

    @Override
    public double score() {
        return 0;
    }

    @Override
    public PriorityType priorityType() {
        return null;
    }
}

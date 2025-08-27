package org.monarchinitiative.exomiser.core.prioritisers;

import com.github.p2gx.boqa.core.DiseaseData;
import org.monarchinitiative.exomiser.core.model.Gene;
import org.monarchinitiative.exomiser.core.prioritisers.service.PriorityService;

import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class BoqaPriority implements Prioritiser<BoqaPriorityResult> {

    public static class ExomiserDiseaseData implements DiseaseData {
        private final PriorityService priorityService;

        public ExomiserDiseaseData(PriorityService priorityService) {
            this.priorityService = priorityService;
        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public Set<String> getDiseaseIds() {
            return Set.of();
        }

        @Override
        public Set<String> getIncludedDiseaseFeatures(String diseaseTermId) {
            return new HashSet<>(this.priorityService.getHpoIdsForDiseaseId(diseaseTermId));
        }

        @Override
        public Set<String> getDiseaseGeneIds(String s) {
            return Set.of();
        }

        @Override
        public Set<String> getDiseaseGeneSymbols(String s) {
            return Set.of();
        }
    }




   public BoqaPriority(PriorityService priorityService, Path hpOboPath){
       DiseaseData diseaseData = new ExomiserDiseaseData(priorityService);
   }

    @Override
    public Stream<BoqaPriorityResult> prioritise(List<String> hpoIds, List<Gene> genes) {
        return Stream.empty();
    }

    @Override
    public PriorityType priorityType() {
        return PriorityType.BOQA_PRIORITY;
    }
}

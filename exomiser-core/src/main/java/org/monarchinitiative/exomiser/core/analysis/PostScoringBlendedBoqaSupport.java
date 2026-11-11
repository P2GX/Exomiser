package org.monarchinitiative.exomiser.core.analysis;

import org.monarchinitiative.exomiser.core.prioritisers.service.PriorityService;
import org.monarchinitiative.phenol.annotations.formats.hpo.HpoDiseases;
import org.monarchinitiative.phenol.ontology.data.Ontology;
import org.springframework.stereotype.Component;

@Component
record PostScoringBlendedBoqaSupport(
        PriorityService priorityService,
        Ontology hpo,
        HpoDiseases hpoDiseases
) {
}

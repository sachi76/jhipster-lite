package tech.jhipster.lite.generator.typescript.optional.infrastructure.primary;

import static tech.jhipster.lite.shared.slug.domain.JHLiteModuleSlug.OPTIONAL_TYPESCRIPT;
import static tech.jhipster.lite.shared.slug.domain.JHLiteModuleSlug.TYPESCRIPT;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.jhipster.lite.generator.typescript.optional.application.OptionalTypescriptApplicationService;
import tech.jhipster.lite.module.domain.resource.JHipsterModuleOrganization;
import tech.jhipster.lite.module.domain.resource.JHipsterModuleResource;

@Configuration
class OptionalTypescriptModuleConfiguration {

  @Bean
  JHipsterModuleResource optionalTypescriptModule(OptionalTypescriptApplicationService optionalTypescript) {
    return JHipsterModuleResource.builder()
      .slug(OPTIONAL_TYPESCRIPT)
      .withoutProperties()
      .apiDoc("Typescript", "Add Optional class domain to project")
      .organization(JHipsterModuleOrganization.builder().addDependency(TYPESCRIPT).build())
      .tags("typescript")
      .factory(optionalTypescript::buildModule);
  }
}

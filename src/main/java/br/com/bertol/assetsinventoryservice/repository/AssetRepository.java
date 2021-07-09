package br.com.bertol.assetsinventoryservice.repository;

import br.com.bertol.assetsinventoryservice.model.Asset;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
        collectionResourceRel = "asset",
        path = "asset"
)
public interface AssetRepository extends CrudRepository<Asset, Long> {
}

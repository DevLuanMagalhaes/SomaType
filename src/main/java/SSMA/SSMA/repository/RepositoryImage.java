package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryImage extends JpaRepository  <TwoImage, String> {

    @Query(
            value = "Select * " +
                    "from TwoImage " +
                    "where image_name = :imageName", nativeQuery = true
    )
    public TwoImage findImageByName (@Param("imageName")String imageName);
}

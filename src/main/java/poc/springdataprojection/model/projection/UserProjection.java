package poc.springdataprojection.model.projection;

import poc.springdataprojection.enums.UserProfile;

public interface UserProjection {

    String getLogin();
    UserProfile getProfile();
    Boolean getActive();
    String getPersonName();

}

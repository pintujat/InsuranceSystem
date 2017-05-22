package com.manipal.DAO;
import java.util.List;

import com.manipal.model.*;
public interface ClaimsDAO {
	public int insertClaim(ClaimsModel claim);
	int deleteClaim(ClaimsModel claim);
	int updateClaims(ClaimsModel claim);
	public List<ClaimsModel> getClaims();
}


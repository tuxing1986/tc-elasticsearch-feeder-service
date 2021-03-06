/*
 * Copyright (C) 2017 TopCoder Inc., All Rights Reserved.
 */
package com.appirio.service.challengefeeder.dao;


import com.appirio.service.challengefeeder.api.*;
import com.appirio.supply.dataaccess.ApiQueryInput;
import com.appirio.supply.dataaccess.DatasourceName;
import com.appirio.supply.dataaccess.SqlQueryFile;
import com.appirio.tech.core.api.v3.request.QueryParameter;

import java.util.List;
import java.util.Map;

/**
 * DAO to interact with challenge data
 *
 * 
 * @author TCCODER
 * @version 1.0
 */
@DatasourceName("oltp")
public interface ChallengeFeederDAO {
    /**
     * Get challenges
     *
     * @param queryParameter the queryParameter to use
     * @return the List<ChallengeData> result
     */
    @SqlQueryFile("sql/challenge-feeder/get_challenges.sql")
    List<ChallengeData> getChallenges(@ApiQueryInput QueryParameter queryParameter);
    
    /**
     * Get phases
     *
     * @param queryParameter the queryParameter to use
     * @return the List<PhaseData> result
     */
    @SqlQueryFile("sql/challenge-feeder/get_phases.sql")
    List<PhaseData> getPhases(@ApiQueryInput QueryParameter queryParameter);
    
    /**
     * Get resources
     *
     * @param queryParameter the queryParameter to use
     * @return the List<ResourceData> result
     */
    @SqlQueryFile("sql/challenge-feeder/get_resources.sql")
    List<ResourceData> getResources(@ApiQueryInput QueryParameter queryParameter);
    
    /**
     * Get events
     *
     * @param queryParameter the queryParameter to use
     * @return the List<EventData> result
     */
    @SqlQueryFile("sql/challenge-feeder/get_events.sql")
    List<EventData> getEvents(@ApiQueryInput QueryParameter queryParameter);
    
    /**
     * Get user ids 
     *
     * @param queryParameter the queryParameter to use
     * @return the result
     */
    @SqlQueryFile("sql/challenge-feeder/get_user_ids.sql")
    List<Map<String, Object>> getUserIds(@ApiQueryInput QueryParameter queryParameter);
    
    /**
     * Get group ids 
     *
     * @param queryParameter the queryParameter to use
     * @return the result
     */
    @SqlQueryFile("sql/challenge-feeder/get_group_ids.sql")
    List<Map<String, Object>> getGroupIds(@ApiQueryInput QueryParameter queryParameter);
    
    /**
     * Get prizes 
     *
     * @param queryParameter the queryParameter to use
     * @return the result
     */
    @SqlQueryFile("sql/challenge-feeder/get_prizes.sql")
    List<PrizeData> getPrizes(@ApiQueryInput QueryParameter queryParameter);
    
    /**
     * Get checkpoint prizes 
     *
     * @param queryParameter the queryParameter to use
     * @return the result
     */
    @SqlQueryFile("sql/challenge-feeder/get_checkpoint_prizes.sql")
    List<CheckpointPrizeData> getCheckpointPrizes(@ApiQueryInput QueryParameter queryParameter);
    
    /**
     * Get winners 
     *
     * @param queryParameter the queryParameter to use
     * @return the result
     */
    @SqlQueryFile("sql/challenge-feeder/get_winners.sql")
    List<WinnerData> getWinners(@ApiQueryInput QueryParameter queryParameter);
    
    /**
     * Get submissions 
     *
     * @param queryParameter the queryParameter to use
     * @return the result
     */
    @SqlQueryFile("sql/challenge-feeder/get_submissions.sql")
    List<SubmissionData> getSubmissions(@ApiQueryInput QueryParameter queryParameter);
    
    /**
     * Get properties 
     *
     * @param queryParameter the queryParameter to use
     * @return the result
     */
    @SqlQueryFile("sql/challenge-feeder/get_properties.sql")
    List<PropertyData> getProperties(@ApiQueryInput QueryParameter queryParameter);
    
    /**
     * Get reviews 
     *
     * @param queryParameter the queryParameter to use
     * @return the result
     */
    @SqlQueryFile("sql/challenge-feeder/get_reviews.sql")
    List<ReviewData> getReviews(@ApiQueryInput QueryParameter queryParameter);
    
    /**
     * Get terms 
     *
     * @param queryParameter the queryParameter to use
     * @return the result
     */
    @SqlQueryFile("sql/challenge-feeder/get_terms.sql")
    List<TermsOfUseData> getTerms(@ApiQueryInput QueryParameter queryParameter);
    
    /**
     * Get file types 
     *
     * @param queryParameter the queryParameter to use
     * @return the result
     */
    @SqlQueryFile("sql/challenge-feeder/get_file_types.sql")
    List<FileTypeData> getFileTypes(@ApiQueryInput QueryParameter queryParameter);
}

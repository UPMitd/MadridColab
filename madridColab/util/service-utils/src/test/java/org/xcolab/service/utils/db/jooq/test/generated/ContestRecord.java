package org.xcolab.service.utils.db.jooq.test.generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ContestRecord extends UpdatableRecordImpl<ContestRecord> {

    private static final long serialVersionUID = 1233968989;

    /**
     * Setter for <code>contest__contest.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>contest__contest.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>contest__contest.contest_type_id</code>.
     */
    public void setContestTypeId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>contest__contest.contest_type_id</code>.
     */
    public Long getContestTypeId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>contest__contest.question</code>.
     */
    public void setQuestion(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>contest__contest.question</code>.
     */
    public String getQuestion() {
        return (String) get(2);
    }

    /**
     * Setter for <code>contest__contest.title</code>.
     */
    public void setTitle(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>contest__contest.title</code>.
     */
    public String getTitle() {
        return (String) get(3);
    }

    /**
     * Setter for <code>contest__contest.contest_url_name</code>.
     */
    public void setContestUrlName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>contest__contest.contest_url_name</code>.
     */
    public String getContestUrlName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>contest__contest.contest_year</code>.
     */
    public void setContestYear(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>contest__contest.contest_year</code>.
     */
    public Long getContestYear() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>contest__contest.description</code>.
     */
    public void setDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>contest__contest.description</code>.
     */
    public String getDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>contest__contest.contest_model_description</code>.
     */
    public void setContestModelDescription(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>contest__contest.contest_model_description</code>.
     */
    public String getContestModelDescription() {
        return (String) get(7);
    }

    /**
     * Setter for <code>contest__contest.contest_positions_description</code>.
     */
    public void setContestPositionsDescription(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>contest__contest.contest_positions_description</code>.
     */
    public String getContestPositionsDescription() {
        return (String) get(8);
    }

    /**
     * Setter for <code>contest__contest.created_at</code>.
     */
    public void setCreatedAt(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>contest__contest.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>contest__contest.updated_at</code>.
     */
    public void setUpdatedAt(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>contest__contest.updated_at</code>.
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>contest__contest.author_user_id</code>.
     */
    public void setAuthorUserId(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>contest__contest.author_user_id</code>.
     */
    public Long getAuthorUserId() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>contest__contest.contest_active</code>.
     */
    public void setContestActive(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>contest__contest.contest_active</code>.
     */
    public Boolean getContestActive() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>contest__contest.proposal_template_id</code>.
     */
    public void setProposalTemplateId(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>contest__contest.proposal_template_id</code>.
     */
    public Long getProposalTemplateId() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>contest__contest.contest_schedule_id</code>.
     */
    public void setContestScheduleId(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>contest__contest.contest_schedule_id</code>.
     */
    public Long getContestScheduleId() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>contest__contest.proposal_creation_template_string</code>.
     */
    public void setProposalCreationTemplateString(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>contest__contest.proposal_creation_template_string</code>.
     */
    public String getProposalCreationTemplateString() {
        return (String) get(15);
    }

    /**
     * Setter for <code>contest__contest.vote_template_string</code>.
     */
    public void setVoteTemplateString(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>contest__contest.vote_template_string</code>.
     */
    public String getVoteTemplateString() {
        return (String) get(16);
    }

    /**
     * Setter for <code>contest__contest.proposal_vote_template_string</code>.
     */
    public void setProposalVoteTemplateString(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>contest__contest.proposal_vote_template_string</code>.
     */
    public String getProposalVoteTemplateString() {
        return (String) get(17);
    }

    /**
     * Setter for <code>contest__contest.proposal_vote_confirmation_template_string</code>.
     */
    public void setProposalVoteConfirmationTemplateString(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>contest__contest.proposal_vote_confirmation_template_string</code>.
     */
    public String getProposalVoteConfirmationTemplateString() {
        return (String) get(18);
    }

    /**
     * Setter for <code>contest__contest.vote_question_template_string</code>.
     */
    public void setVoteQuestionTemplateString(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>contest__contest.vote_question_template_string</code>.
     */
    public String getVoteQuestionTemplateString() {
        return (String) get(19);
    }

    /**
     * Setter for <code>contest__contest.focus_area_id</code>.
     */
    public void setFocusAreaId(Long value) {
        set(20, value);
    }

    /**
     * Getter for <code>contest__contest.focus_area_id</code>.
     */
    public Long getFocusAreaId() {
        return (Long) get(20);
    }

    /**
     * Setter for <code>contest__contest.contest_tier</code>.
     */
    public void setContestTier(Long value) {
        set(21, value);
    }

    /**
     * Getter for <code>contest__contest.contest_tier</code>.
     */
    public Long getContestTier() {
        return (Long) get(21);
    }

    /**
     * Setter for <code>contest__contest.contest_logo_id</code>.
     */
    public void setContestLogoId(Long value) {
        set(22, value);
    }

    /**
     * Getter for <code>contest__contest.contest_logo_id</code>.
     */
    public Long getContestLogoId() {
        return (Long) get(22);
    }

    /**
     * Setter for <code>contest__contest.featured</code>.
     */
    public void setFeatured(Boolean value) {
        set(23, value);
    }

    /**
     * Getter for <code>contest__contest.featured</code>.
     */
    public Boolean getFeatured() {
        return (Boolean) get(23);
    }

    /**
     * Setter for <code>contest__contest.plans_open_by_default</code>.
     */
    public void setPlansOpenByDefault(Boolean value) {
        set(24, value);
    }

    /**
     * Getter for <code>contest__contest.plans_open_by_default</code>.
     */
    public Boolean getPlansOpenByDefault() {
        return (Boolean) get(24);
    }

    /**
     * Setter for <code>contest__contest.sponsor_logo_id</code>.
     */
    public void setSponsorLogoId(Long value) {
        set(25, value);
    }

    /**
     * Getter for <code>contest__contest.sponsor_logo_id</code>.
     */
    public Long getSponsorLogoId() {
        return (Long) get(25);
    }

    /**
     * Setter for <code>contest__contest.default_proposal_logo_id</code>.
     */
    public void setDefaultProposalLogoId(Long value) {
        set(26, value);
    }

    /**
     * Getter for <code>contest__contest.default_proposal_logo_id</code>.
     */
    public Long getDefaultProposalLogoId() {
        return (Long) get(26);
    }

    /**
     * Setter for <code>contest__contest.sponsor_text</code>.
     */
    public void setSponsorText(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>contest__contest.sponsor_text</code>.
     */
    public String getSponsorText() {
        return (String) get(27);
    }

    /**
     * Setter for <code>contest__contest.sponsor_link</code>.
     */
    public void setSponsorLink(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>contest__contest.sponsor_link</code>.
     */
    public String getSponsorLink() {
        return (String) get(28);
    }

    /**
     * Setter for <code>contest__contest.flag</code>.
     */
    public void setFlag(Integer value) {
        set(29, value);
    }

    /**
     * Getter for <code>contest__contest.flag</code>.
     */
    public Integer getFlag() {
        return (Integer) get(29);
    }

    /**
     * Setter for <code>contest__contest.flag_text</code>.
     */
    public void setFlagText(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>contest__contest.flag_text</code>.
     */
    public String getFlagText() {
        return (String) get(30);
    }

    /**
     * Setter for <code>contest__contest.flag_tooltip</code>.
     */
    public void setFlagTooltip(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>contest__contest.flag_tooltip</code>.
     */
    public String getFlagTooltip() {
        return (String) get(31);
    }

    /**
     * Setter for <code>contest__contest.discussion_group_id</code>.
     */
    public void setDiscussionGroupId(Long value) {
        set(32, value);
    }

    /**
     * Getter for <code>contest__contest.discussion_group_id</code>.
     */
    public Long getDiscussionGroupId() {
        return (Long) get(32);
    }

    /**
     * Setter for <code>contest__contest.weight</code>.
     */
    public void setWeight(Integer value) {
        set(33, value);
    }

    /**
     * Getter for <code>contest__contest.weight</code>.
     */
    public Integer getWeight() {
        return (Integer) get(33);
    }

    /**
     * Setter for <code>contest__contest.resources_url</code>.
     */
    public void setResourcesUrl(String value) {
        set(34, value);
    }

    /**
     * Getter for <code>contest__contest.resources_url</code>.
     */
    public String getResourcesUrl() {
        return (String) get(34);
    }

    /**
     * Setter for <code>contest__contest.contest_private</code>.
     */
    public void setContestPrivate(Boolean value) {
        set(35, value);
    }

    /**
     * Getter for <code>contest__contest.contest_private</code>.
     */
    public Boolean getContestPrivate() {
        return (Boolean) get(35);
    }

    /**
     * Setter for <code>contest__contest.use_permissions</code>.
     */
    public void setUsePermissions(Boolean value) {
        set(36, value);
    }

    /**
     * Getter for <code>contest__contest.use_permissions</code>.
     */
    public Boolean getUsePermissions() {
        return (Boolean) get(36);
    }

    /**
     * Setter for <code>contest__contest.contest_creation_status</code>.
     */
    public void setContestCreationStatus(String value) {
        set(37, value);
    }

    /**
     * Getter for <code>contest__contest.contest_creation_status</code>.
     */
    public String getContestCreationStatus() {
        return (String) get(37);
    }

    /**
     * Setter for <code>contest__contest.default_model_id</code>.
     */
    public void setDefaultModelId(Long value) {
        set(38, value);
    }

    /**
     * Getter for <code>contest__contest.default_model_id</code>.
     */
    public Long getDefaultModelId() {
        return (Long) get(38);
    }

    /**
     * Setter for <code>contest__contest.other_models</code>.
     */
    public void setOtherModels(String value) {
        set(39, value);
    }

    /**
     * Getter for <code>contest__contest.other_models</code>.
     */
    public String getOtherModels() {
        return (String) get(39);
    }

    /**
     * Setter for <code>contest__contest.default_model_settings</code>.
     */
    public void setDefaultModelSettings(String value) {
        set(40, value);
    }

    /**
     * Getter for <code>contest__contest.default_model_settings</code>.
     */
    public String getDefaultModelSettings() {
        return (String) get(40);
    }

    /**
     * Setter for <code>contest__contest.points</code>.
     */
    public void setPoints(Double value) {
        set(41, value);
    }

    /**
     * Getter for <code>contest__contest.points</code>.
     */
    public Double getPoints() {
        return (Double) get(41);
    }

    /**
     * Setter for <code>contest__contest.default_parent_point_type</code>.
     */
    public void setDefaultParentPointType(Long value) {
        set(42, value);
    }

    /**
     * Getter for <code>contest__contest.default_parent_point_type</code>.
     */
    public Long getDefaultParentPointType() {
        return (Long) get(42);
    }

    /**
     * Setter for <code>contest__contest.point_distribution_strategy</code>.
     */
    public void setPointDistributionStrategy(String value) {
        set(43, value);
    }

    /**
     * Getter for <code>contest__contest.point_distribution_strategy</code>.
     */
    public String getPointDistributionStrategy() {
        return (String) get(43);
    }

    /**
     * Setter for <code>contest__contest.email_template_url</code>.
     */
    public void setEmailTemplateUrl(String value) {
        set(44, value);
    }

    /**
     * Getter for <code>contest__contest.email_template_url</code>.
     */
    public String getEmailTemplateUrl() {
        return (String) get(44);
    }

    /**
     * Setter for <code>contest__contest.show_in_tile_view</code>.
     */
    public void setShowInTileView(Boolean value) {
        set(45, value);
    }

    /**
     * Getter for <code>contest__contest.show_in_tile_view</code>.
     */
    public Boolean getShowInTileView() {
        return (Boolean) get(45);
    }

    /**
     * Setter for <code>contest__contest.show_in_list_view</code>.
     */
    public void setShowInListView(Boolean value) {
        set(46, value);
    }

    /**
     * Getter for <code>contest__contest.show_in_list_view</code>.
     */
    public Boolean getShowInListView() {
        return (Boolean) get(46);
    }

    /**
     * Setter for <code>contest__contest.show_in_outline_view</code>.
     */
    public void setShowInOutlineView(Boolean value) {
        set(47, value);
    }

    /**
     * Getter for <code>contest__contest.show_in_outline_view</code>.
     */
    public Boolean getShowInOutlineView() {
        return (Boolean) get(47);
    }

    /**
     * Setter for <code>contest__contest.hide_ribbons</code>.
     */
    public void setHideRibbons(Boolean value) {
        set(48, value);
    }

    /**
     * Getter for <code>contest__contest.hide_ribbons</code>.
     */
    public Boolean getHideRibbons() {
        return (Boolean) get(48);
    }

    /**
     * Setter for <code>contest__contest.resource_article_id</code>.
     */
    public void setResourceArticleId(Long value) {
        set(49, value);
    }

    /**
     * Getter for <code>contest__contest.resource_article_id</code>.
     */
    public Long getResourceArticleId() {
        return (Long) get(49);
    }

    /**
     * Setter for <code>contest__contest.read_only_comments</code>.
     */
    public void setReadOnlyComments(Boolean value) {
        set(50, value);
    }

    /**
     * Getter for <code>contest__contest.read_only_comments</code>.
     */
    public Boolean getReadOnlyComments() {
        return (Boolean) get(50);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ContestRecord
     */
    public ContestRecord() {
        super(ContestTable.CONTEST);
    }

    /**
     * Create a detached, initialised ContestRecord
     */
    public ContestRecord(Long id, Long contestTypeId, String question, String title, String contestUrlName, Long contestYear, String description, String contestModelDescription, String contestPositionsDescription, Timestamp createdAt, Timestamp updatedAt, Long authorUserId, Boolean contestActive, Long proposalTemplateId, Long contestScheduleId, String proposalCreationTemplateString, String voteTemplateString, String proposalVoteTemplateString, String proposalVoteConfirmationTemplateString, String voteQuestionTemplateString, Long focusAreaId, Long contestTier, Long contestLogoId, Boolean featured, Boolean plansOpenByDefault, Long sponsorLogoId, Long defaultProposalLogoId, String sponsorText, String sponsorLink, Integer flag, String flagText, String flagTooltip, Long discussionGroupId, Integer weight, String resourcesUrl, Boolean contestPrivate, Boolean usePermissions, String contestCreationStatus, Long defaultModelId, String otherModels, String defaultModelSettings, Double points, Long defaultParentPointType, String pointDistributionStrategy, String emailTemplateUrl, Boolean showInTileView, Boolean showInListView, Boolean showInOutlineView, Boolean hideRibbons, Long resourceArticleId, Boolean readOnlyComments) {
        super(ContestTable.CONTEST);

        set(0, id);
        set(1, contestTypeId);
        set(2, question);
        set(3, title);
        set(4, contestUrlName);
        set(5, contestYear);
        set(6, description);
        set(7, contestModelDescription);
        set(8, contestPositionsDescription);
        set(9, createdAt);
        set(10, updatedAt);
        set(11, authorUserId);
        set(12, contestActive);
        set(13, proposalTemplateId);
        set(14, contestScheduleId);
        set(15, proposalCreationTemplateString);
        set(16, voteTemplateString);
        set(17, proposalVoteTemplateString);
        set(18, proposalVoteConfirmationTemplateString);
        set(19, voteQuestionTemplateString);
        set(20, focusAreaId);
        set(21, contestTier);
        set(22, contestLogoId);
        set(23, featured);
        set(24, plansOpenByDefault);
        set(25, sponsorLogoId);
        set(26, defaultProposalLogoId);
        set(27, sponsorText);
        set(28, sponsorLink);
        set(29, flag);
        set(30, flagText);
        set(31, flagTooltip);
        set(32, discussionGroupId);
        set(33, weight);
        set(34, resourcesUrl);
        set(35, contestPrivate);
        set(36, usePermissions);
        set(37, contestCreationStatus);
        set(38, defaultModelId);
        set(39, otherModels);
        set(40, defaultModelSettings);
        set(41, points);
        set(42, defaultParentPointType);
        set(43, pointDistributionStrategy);
        set(44, emailTemplateUrl);
        set(45, showInTileView);
        set(46, showInListView);
        set(47, showInOutlineView);
        set(48, hideRibbons);
        set(49, resourceArticleId);
        set(50, readOnlyComments);
    }
}

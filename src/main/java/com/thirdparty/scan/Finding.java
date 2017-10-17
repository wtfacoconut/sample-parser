package com.thirdparty.scan;

/**
 * (c) Copyright [2017] EntIT Software LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import static com.thirdparty.ScanGenerator.GenPriority;
import static com.thirdparty.ScanGenerator.CustomStatus;
import java.util.Date;

@JsonSerialize
public class Finding {

    // mandatory attributes
    private String uniqueId;

    // builtin attributes
    private String category;
    private String fileName;
    private String vulnerabilityAbstract;
    private Integer lineNumber;
    private Float confidence;
    private Float impact;
    private GenPriority priority;

    // custom attributes
    private String categoryId;
    private String artifact;
    private String description;
    private String comment;
    private String buildNumber;
    private CustomStatus customStatus;
    private Date lastChangeDate;
    private Date artifactBuildDate;
    private String textBase64;

    public String getUniqueId() {
        return uniqueId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(final String category) {
        this.category = category;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(final String fileName) {
        this.fileName = fileName;
    }

    public String getVulnerabilityAbstract() {
        return vulnerabilityAbstract;
    }

    public void setVulnerabilityAbstract(final String vulnerabilityAbstract) {
        this.vulnerabilityAbstract = vulnerabilityAbstract;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(final Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public Float getConfidence() {
        return confidence;
    }

    public void setConfidence(final Float confidence) { this.confidence = confidence; }

    public Float getImpact() {
        return impact;
    }

    public void setImpact(final Float impact) { this.impact = impact; }

    public void setUniqueId(final String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public GenPriority getPriority() { return priority; }

    public void setPriority(final GenPriority priority) { this.priority = priority; }

    public String getCategoryId() { return categoryId; }

    public void setCategoryId(final String categoryId) { this.categoryId = categoryId; }

    public String getArtifact() {
        return artifact;
    }

    public void setArtifact(final String artifact) {
        this.artifact = artifact;
    }

    public String getDescription() { return description; }

    public void setDescription(final String description) { this.description = description; }

    public String getComment() { return comment; }

    public void setComment(final String comment) { this.comment = comment; }

    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(final String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public CustomStatus getCustomStatus() { return customStatus; }

    public void setCustomStatus(final CustomStatus customStatus) { this.customStatus = customStatus; }


    @JsonSerialize(converter = DateSerializer.class)
    public Date getLastChangeDate() {
        return lastChangeDate;
    }

    @JsonDeserialize(converter = DateDeserializer.class)
    public void setLastChangeDate(final Date lastChangeDate) {
        this.lastChangeDate = lastChangeDate;
    }

    @JsonSerialize(converter = DateSerializer.class)
    public Date getArtifactBuildDate() {
        return artifactBuildDate;
    }

    @JsonDeserialize(converter = DateDeserializer.class)
    public void setArtifactBuildDate(final Date artifactBuildDate) {
        this.artifactBuildDate = artifactBuildDate;
    }

    public String getTextBase64() {
        return textBase64;
    }

    public void setTextBase64(String textBase64) {
        this.textBase64 = textBase64;
    }
}

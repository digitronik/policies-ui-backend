package com.redhat.cloud.policies.app.model.history;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "policies_history")
public class PoliciesHistoryEntry {

    // The ID is generated by policies-engine.
    @Id
    private UUID id;

    @Column(name = "tenant_id")
    private String tenantId;

    @Column(name = "policy_id")
    private String policyId;

    private long ctime;

    @Column(name = "host_id")
    private String hostId;

    @Column(name = "host_name")
    private String hostName;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public long getCtime() {
        return ctime;
    }

    public void setCtime(long ctime) {
        this.ctime = ctime;
    }

    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof PoliciesHistoryEntry) {
            PoliciesHistoryEntry other = (PoliciesHistoryEntry) o;
            return Objects.equals(id, other.id);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "PoliciesHistoryEntry [id=" + id + ", tenantId=" + tenantId + ", policyId=" + policyId + ", ctime=" + ctime + ", hostId=" + hostId + ", hostName=" + hostName + "]";
    }
}
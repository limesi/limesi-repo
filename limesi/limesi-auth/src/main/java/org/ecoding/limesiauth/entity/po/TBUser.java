package org.ecoding.limesiauth.entity.po;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import lombok.Data;

@Data
public class TBUser {
    private Integer id;

    private String realname;

    private String nickname;

    private String loginname;

    private String password;

    private String phone;

    private Integer phonePrefix;

    private String address;

    private String domicileLocation;

    private Boolean sex;

    private Integer departmentId;

    private Boolean enable;

    private Date createTime;

    private Date updateTime;

    public enum Column {
        id("id", "id", "INTEGER", false),
        realname("realname", "realname", "VARCHAR", false),
        nickname("nickname", "nickname", "VARCHAR", false),
        loginname("loginname", "loginname", "VARCHAR", false),
        password("password", "password", "VARCHAR", false),
        phone("phone", "phone", "VARCHAR", false),
        phonePrefix("phone_prefix", "phonePrefix", "INTEGER", false),
        address("address", "address", "VARCHAR", false),
        domicileLocation("domicile _location", "domicileLocation", "VARCHAR", true),
        sex("sex", "sex", "BIT", false),
        departmentId("department_id", "departmentId", "INTEGER", false),
        enable("enable", "enable", "BIT", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false);

        private static final String BEGINNING_DELIMITER = "`";

        private static final String ENDING_DELIMITER = "`";

        private final String column;

        private final boolean isColumnNameDelimited;

        private final String javaProperty;

        private final String jdbcType;

        public String value() {
            return this.column;
        }

        public String getValue() {
            return this.column;
        }

        public String getJavaProperty() {
            return this.javaProperty;
        }

        public String getJdbcType() {
            return this.jdbcType;
        }

        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        public static Column[] all() {
            return Column.values();
        }

        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}
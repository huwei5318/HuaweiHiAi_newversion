package com.repository.huaweihiai.bean;

import java.util.List;

/**
 * Created by huwei on 2018/5/31.
 */

public class RepayNotice {


    /**
     * intentions : [{"name":"repayNotice","attributes":[{"bankCode":"CMB","actStartTime":{"normalTime":{"start":{"timestamp":1532653200000,"section":"D","standardTime":"2018年07月27日09时00分00秒"}},"oriText":"07月27日","origin":"1527757726620","charOffset":22},"bank":"招商银行","moneyInfo":[{"amount":"198.00","unit":0}],"accountType":0,"cardType":0,"deadline":{"normalTime":{"start":{"timestamp":1532653200000,"section":"D","standardTime":"2018年07月27日09时00分00秒"}},"oriText":"07月27日","origin":"1527757726620","charOffset":22},"party":0}],"confidence":1}]
     * code : 0
     * message : success
     */

    private int code;
    private String message;
    private List<IntentionsBean> intentions;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<IntentionsBean> getIntentions() {
        return intentions;
    }

    public void setIntentions(List<IntentionsBean> intentions) {
        this.intentions = intentions;
    }

    public static class IntentionsBean {
        /**
         * name : repayNotice
         * attributes : [{"bankCode":"CMB","actStartTime":{"normalTime":{"start":{"timestamp":1532653200000,"section":"D","standardTime":"2018年07月27日09时00分00秒"}},"oriText":"07月27日","origin":"1527757726620","charOffset":22},"bank":"招商银行","moneyInfo":[{"amount":"198.00","unit":0}],"accountType":0,"cardType":0,"deadline":{"normalTime":{"start":{"timestamp":1532653200000,"section":"D","standardTime":"2018年07月27日09时00分00秒"}},"oriText":"07月27日","origin":"1527757726620","charOffset":22},"party":0}]
         * confidence : 1
         */

        private String name;
        private int confidence;
        private List<AttributesBean> attributes;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getConfidence() {
            return confidence;
        }

        public void setConfidence(int confidence) {
            this.confidence = confidence;
        }

        public List<AttributesBean> getAttributes() {
            return attributes;
        }

        public void setAttributes(List<AttributesBean> attributes) {
            this.attributes = attributes;
        }

        public static class AttributesBean {
            /**
             * bankCode : CMB
             * actStartTime : {"normalTime":{"start":{"timestamp":1532653200000,"section":"D","standardTime":"2018年07月27日09时00分00秒"}},"oriText":"07月27日","origin":"1527757726620","charOffset":22}
             * bank : 招商银行
             * moneyInfo : [{"amount":"198.00","unit":0}]
             * accountType : 0
             * cardType : 0
             * deadline : {"normalTime":{"start":{"timestamp":1532653200000,"section":"D","standardTime":"2018年07月27日09时00分00秒"}},"oriText":"07月27日","origin":"1527757726620","charOffset":22}
             * party : 0
             */

            private String bankCode;
            private ActStartTimeBean actStartTime;
            private String bank;
            private int accountType;
            private int cardType;
            private DeadlineBean deadline;
            private int party;
            private List<MoneyInfoBean> moneyInfo;

            public String getBankCode() {
                return bankCode;
            }

            public void setBankCode(String bankCode) {
                this.bankCode = bankCode;
            }

            public ActStartTimeBean getActStartTime() {
                return actStartTime;
            }

            public void setActStartTime(ActStartTimeBean actStartTime) {
                this.actStartTime = actStartTime;
            }

            public String getBank() {
                return bank;
            }

            public void setBank(String bank) {
                this.bank = bank;
            }

            public int getAccountType() {
                return accountType;
            }

            public void setAccountType(int accountType) {
                this.accountType = accountType;
            }

            public int getCardType() {
                return cardType;
            }

            public void setCardType(int cardType) {
                this.cardType = cardType;
            }

            public DeadlineBean getDeadline() {
                return deadline;
            }

            public void setDeadline(DeadlineBean deadline) {
                this.deadline = deadline;
            }

            public int getParty() {
                return party;
            }

            public void setParty(int party) {
                this.party = party;
            }

            public List<MoneyInfoBean> getMoneyInfo() {
                return moneyInfo;
            }

            public void setMoneyInfo(List<MoneyInfoBean> moneyInfo) {
                this.moneyInfo = moneyInfo;
            }

            public static class ActStartTimeBean {
                /**
                 * normalTime : {"start":{"timestamp":1532653200000,"section":"D","standardTime":"2018年07月27日09时00分00秒"}}
                 * oriText : 07月27日
                 * origin : 1527757726620
                 * charOffset : 22
                 */

                private NormalTimeBean normalTime;
                private String oriText;
                private String origin;
                private int charOffset;

                public NormalTimeBean getNormalTime() {
                    return normalTime;
                }

                public void setNormalTime(NormalTimeBean normalTime) {
                    this.normalTime = normalTime;
                }

                public String getOriText() {
                    return oriText;
                }

                public void setOriText(String oriText) {
                    this.oriText = oriText;
                }

                public String getOrigin() {
                    return origin;
                }

                public void setOrigin(String origin) {
                    this.origin = origin;
                }

                public int getCharOffset() {
                    return charOffset;
                }

                public void setCharOffset(int charOffset) {
                    this.charOffset = charOffset;
                }

                public static class NormalTimeBean {
                    /**
                     * start : {"timestamp":1532653200000,"section":"D","standardTime":"2018年07月27日09时00分00秒"}
                     */

                    private StartBean start;

                    public StartBean getStart() {
                        return start;
                    }

                    public void setStart(StartBean start) {
                        this.start = start;
                    }

                    public static class StartBean {
                        /**
                         * timestamp : 1532653200000
                         * section : D
                         * standardTime : 2018年07月27日09时00分00秒
                         */

                        private long timestamp;
                        private String section;
                        private String standardTime;

                        public long getTimestamp() {
                            return timestamp;
                        }

                        public void setTimestamp(long timestamp) {
                            this.timestamp = timestamp;
                        }

                        public String getSection() {
                            return section;
                        }

                        public void setSection(String section) {
                            this.section = section;
                        }

                        public String getStandardTime() {
                            return standardTime;
                        }

                        public void setStandardTime(String standardTime) {
                            this.standardTime = standardTime;
                        }
                    }
                }
            }

            public static class DeadlineBean {
                /**
                 * normalTime : {"start":{"timestamp":1532653200000,"section":"D","standardTime":"2018年07月27日09时00分00秒"}}
                 * oriText : 07月27日
                 * origin : 1527757726620
                 * charOffset : 22
                 */

                private NormalTimeBeanX normalTime;
                private String oriText;
                private String origin;
                private int charOffset;

                public NormalTimeBeanX getNormalTime() {
                    return normalTime;
                }

                public void setNormalTime(NormalTimeBeanX normalTime) {
                    this.normalTime = normalTime;
                }

                public String getOriText() {
                    return oriText;
                }

                public void setOriText(String oriText) {
                    this.oriText = oriText;
                }

                public String getOrigin() {
                    return origin;
                }

                public void setOrigin(String origin) {
                    this.origin = origin;
                }

                public int getCharOffset() {
                    return charOffset;
                }

                public void setCharOffset(int charOffset) {
                    this.charOffset = charOffset;
                }

                public static class NormalTimeBeanX {
                    /**
                     * start : {"timestamp":1532653200000,"section":"D","standardTime":"2018年07月27日09时00分00秒"}
                     */

                    private StartBeanX start;

                    public StartBeanX getStart() {
                        return start;
                    }

                    public void setStart(StartBeanX start) {
                        this.start = start;
                    }

                    public static class StartBeanX {
                        /**
                         * timestamp : 1532653200000
                         * section : D
                         * standardTime : 2018年07月27日09时00分00秒
                         */

                        private long timestamp;
                        private String section;
                        private String standardTime;

                        public long getTimestamp() {
                            return timestamp;
                        }

                        public void setTimestamp(long timestamp) {
                            this.timestamp = timestamp;
                        }

                        public String getSection() {
                            return section;
                        }

                        public void setSection(String section) {
                            this.section = section;
                        }

                        public String getStandardTime() {
                            return standardTime;
                        }

                        public void setStandardTime(String standardTime) {
                            this.standardTime = standardTime;
                        }
                    }
                }
            }

            public static class MoneyInfoBean {
                /**
                 * amount : 198.00
                 * unit : 0
                 */

                private String amount;
                private int unit;

                public String getAmount() {
                    return amount;
                }

                public void setAmount(String amount) {
                    this.amount = amount;
                }

                public int getUnit() {
                    return unit;
                }

                public void setUnit(int unit) {
                    this.unit = unit;
                }
            }
        }
    }
}

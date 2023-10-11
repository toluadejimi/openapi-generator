/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 8.0.0-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * ObjectWithDeprecatedFields.h
 *
 * 
 */

#ifndef ObjectWithDeprecatedFields_H_
#define ObjectWithDeprecatedFields_H_



#include <string>
#include "DeprecatedObject.h"
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ObjectWithDeprecatedFields 
{
public:
    ObjectWithDeprecatedFields() = default;
    explicit ObjectWithDeprecatedFields(boost::property_tree::ptree const& pt);
    virtual ~ObjectWithDeprecatedFields() = default;

    ObjectWithDeprecatedFields(const ObjectWithDeprecatedFields& other) = default; // copy constructor
    ObjectWithDeprecatedFields(ObjectWithDeprecatedFields&& other) noexcept = default; // move constructor

    ObjectWithDeprecatedFields& operator=(const ObjectWithDeprecatedFields& other) = default; // copy assignment
    ObjectWithDeprecatedFields& operator=(ObjectWithDeprecatedFields&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// ObjectWithDeprecatedFields members

    /// <summary>
    /// 
    /// </summary>
    std::string getUuid() const;
    void setUuid(std::string value);

    /// <summary>
    /// 
    /// </summary>
    double getId() const;
    void setId(double value);

    /// <summary>
    /// 
    /// </summary>
    DeprecatedObject getDeprecatedRef() const;
    void setDeprecatedRef(DeprecatedObject value);

    /// <summary>
    /// 
    /// </summary>
    std::vector<std::string> getBars() const;
    void setBars(std::vector<std::string> value);

protected:
    std::string m_Uuid = "";
    double m_Id = 0.0;
    DeprecatedObject m_DeprecatedRef;
    std::vector<std::string> m_Bars;
};

std::vector<ObjectWithDeprecatedFields> createObjectWithDeprecatedFieldsVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ObjectWithDeprecatedFields>(const ObjectWithDeprecatedFields& val) {
    return val.toPropertyTree();
}

template<>
inline ObjectWithDeprecatedFields fromPt<ObjectWithDeprecatedFields>(const boost::property_tree::ptree& pt) {
    ObjectWithDeprecatedFields ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ObjectWithDeprecatedFields_H_ */

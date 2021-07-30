##1、查找json数组是否包含某个字符串

```
SELECT 
    A.ID,
    A.filters,
    item ->> 'fieldValues' 
FROM
    paas_mt_search_template AS A,
    jsonb_array_elements ( filters ) WITH ORDINALITY arr ( item, OPERATOR ) 
WHERE
    item ->> 'label' = '所在地'
    OR item ->> 'fieldValues' LIKE'%房产家居%' 
```

##2、更新Postgresql的Jsonb数组

```
update paas_mt_search_template_copy1 
set 
filters = (select jsonb_set(
'[{"label": "所属行业", "operator": "IN", "fieldName": "industry_v2", "valueType": 0, "fieldValues": ["房产家居", "地产建筑"], "subFieldName": "equivalentMoney"}]',
'{0, fieldValues}',
'["房地产", "地产建筑"]',
false))
where id = '60fe239d35ea116b8dcfa148'
```
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
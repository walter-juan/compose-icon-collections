package com.woowla.compose.icon.collections.remix.remix.food

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.FoodGroup

public val FoodGroup.BowlLine: ImageVector
    get() {
        if (_bowlLine != null) {
            return _bowlLine!!
        }
        _bowlLine = Builder(name = "BowlLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 1.5f)
                curveTo(8.0f, 0.948f, 7.552f, 0.5f, 7.0f, 0.5f)
                curveTo(6.448f, 0.5f, 6.0f, 0.948f, 6.0f, 1.5f)
                verticalLineTo(2.5f)
                curveTo(6.0f, 2.507f, 6.0f, 2.513f, 6.001f, 2.518f)
                curveTo(6.004f, 2.562f, 6.005f, 2.581f, 5.793f, 2.793f)
                lineTo(5.773f, 2.813f)
                curveTo(5.506f, 3.079f, 5.0f, 3.584f, 5.0f, 4.5f)
                verticalLineTo(5.5f)
                curveTo(5.0f, 6.052f, 5.448f, 6.5f, 6.0f, 6.5f)
                curveTo(6.552f, 6.5f, 7.0f, 6.052f, 7.0f, 5.5f)
                verticalLineTo(4.5f)
                curveTo(7.0f, 4.493f, 7.0f, 4.487f, 6.999f, 4.482f)
                curveTo(6.996f, 4.438f, 6.995f, 4.419f, 7.207f, 4.207f)
                lineTo(7.227f, 4.187f)
                curveTo(7.494f, 3.921f, 8.0f, 3.416f, 8.0f, 2.5f)
                verticalLineTo(1.5f)
                close()
                moveTo(19.0f, 1.5f)
                curveTo(19.0f, 0.948f, 18.552f, 0.5f, 18.0f, 0.5f)
                curveTo(17.448f, 0.5f, 17.0f, 0.948f, 17.0f, 1.5f)
                verticalLineTo(2.5f)
                curveTo(17.0f, 2.507f, 17.0f, 2.513f, 17.001f, 2.518f)
                curveTo(17.004f, 2.562f, 17.005f, 2.581f, 16.793f, 2.793f)
                lineTo(16.773f, 2.813f)
                curveTo(16.506f, 3.079f, 16.0f, 3.584f, 16.0f, 4.5f)
                verticalLineTo(5.5f)
                curveTo(16.0f, 6.052f, 16.448f, 6.5f, 17.0f, 6.5f)
                curveTo(17.552f, 6.5f, 18.0f, 6.052f, 18.0f, 5.5f)
                verticalLineTo(4.5f)
                curveTo(18.0f, 4.493f, 18.0f, 4.487f, 17.999f, 4.482f)
                curveTo(17.996f, 4.438f, 17.995f, 4.419f, 18.207f, 4.207f)
                lineTo(18.227f, 4.187f)
                curveTo(18.494f, 3.921f, 19.0f, 3.416f, 19.0f, 2.5f)
                verticalLineTo(1.5f)
                close()
                moveTo(12.5f, 0.5f)
                curveTo(13.052f, 0.5f, 13.5f, 0.948f, 13.5f, 1.5f)
                verticalLineTo(2.5f)
                curveTo(13.5f, 3.416f, 12.994f, 3.921f, 12.727f, 4.187f)
                lineTo(12.707f, 4.207f)
                curveTo(12.495f, 4.419f, 12.496f, 4.438f, 12.499f, 4.482f)
                curveTo(12.5f, 4.487f, 12.5f, 4.493f, 12.5f, 4.5f)
                verticalLineTo(5.5f)
                curveTo(12.5f, 6.052f, 12.052f, 6.5f, 11.5f, 6.5f)
                curveTo(10.948f, 6.5f, 10.5f, 6.052f, 10.5f, 5.5f)
                verticalLineTo(4.5f)
                curveTo(10.5f, 3.584f, 11.006f, 3.079f, 11.273f, 2.813f)
                lineTo(11.293f, 2.793f)
                curveTo(11.505f, 2.581f, 11.504f, 2.562f, 11.501f, 2.518f)
                curveTo(11.5f, 2.513f, 11.5f, 2.507f, 11.5f, 2.5f)
                verticalLineTo(1.5f)
                curveTo(11.5f, 0.948f, 11.948f, 0.5f, 12.5f, 0.5f)
                close()
                moveTo(4.0f, 10.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 14.418f, 16.418f, 18.0f, 12.0f, 18.0f)
                curveTo(7.582f, 18.0f, 4.0f, 14.418f, 4.0f, 10.0f)
                close()
                moveTo(3.0f, 8.0f)
                curveTo(2.448f, 8.0f, 2.0f, 8.448f, 2.0f, 9.0f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 14.101f, 4.468f, 17.625f, 8.0f, 19.168f)
                verticalLineTo(20.0f)
                curveTo(8.0f, 20.552f, 8.448f, 21.0f, 9.0f, 21.0f)
                horizontalLineTo(15.0f)
                curveTo(15.552f, 21.0f, 16.0f, 20.552f, 16.0f, 20.0f)
                verticalLineTo(19.168f)
                curveTo(19.532f, 17.625f, 22.0f, 14.101f, 22.0f, 10.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 8.448f, 21.552f, 8.0f, 21.0f, 8.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _bowlLine!!
    }

private var _bowlLine: ImageVector? = null

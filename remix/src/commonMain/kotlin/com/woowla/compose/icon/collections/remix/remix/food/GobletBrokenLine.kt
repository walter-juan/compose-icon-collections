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

public val FoodGroup.GobletBrokenLine: ImageVector
    get() {
        if (_gobletBrokenLine != null) {
            return _gobletBrokenLine!!
        }
        _gobletBrokenLine = Builder(name = "GobletBrokenLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.867f, 2.0f)
                lineTo(18.989f, 9.858f)
                curveTo(19.291f, 11.973f, 18.468f, 13.79f, 17.109f, 15.047f)
                curveTo(16.004f, 16.069f, 14.541f, 16.732f, 13.0f, 16.935f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.935f)
                curveTo(9.459f, 16.732f, 7.995f, 16.069f, 6.89f, 15.047f)
                curveTo(5.532f, 13.79f, 4.707f, 11.973f, 5.01f, 9.858f)
                lineTo(6.133f, 2.0f)
                horizontalLineTo(17.867f)
                close()
                moveTo(14.077f, 4.0f)
                lineTo(13.566f, 4.884f)
                lineTo(16.165f, 6.384f)
                lineTo(13.415f, 11.148f)
                lineTo(11.682f, 10.148f)
                lineTo(13.432f, 7.116f)
                lineTo(10.835f, 5.616f)
                lineTo(11.768f, 4.0f)
                horizontalLineTo(7.867f)
                lineTo(6.989f, 10.142f)
                curveTo(6.791f, 11.527f, 7.311f, 12.71f, 8.249f, 13.578f)
                curveTo(9.203f, 14.461f, 10.582f, 15.0f, 12.0f, 15.0f)
                curveTo(13.417f, 15.0f, 14.796f, 14.461f, 15.751f, 13.578f)
                curveTo(16.688f, 12.71f, 17.207f, 11.527f, 17.01f, 10.142f)
                lineTo(16.133f, 4.0f)
                horizontalLineTo(14.077f)
                close()
            }
        }
        .build()
        return _gobletBrokenLine!!
    }

private var _gobletBrokenLine: ImageVector? = null

package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.MedalLine: ImageVector
    get() {
        if (_medalLine != null) {
            return _medalLine!!
        }
        _medalLine = Builder(name = "MedalLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                curveTo(16.418f, 7.0f, 20.0f, 10.582f, 20.0f, 15.0f)
                curveTo(20.0f, 19.418f, 16.418f, 23.0f, 12.0f, 23.0f)
                curveTo(7.582f, 23.0f, 4.0f, 19.418f, 4.0f, 15.0f)
                curveTo(4.0f, 10.582f, 7.582f, 7.0f, 12.0f, 7.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveTo(8.686f, 9.0f, 6.0f, 11.686f, 6.0f, 15.0f)
                curveTo(6.0f, 18.314f, 8.686f, 21.0f, 12.0f, 21.0f)
                curveTo(15.314f, 21.0f, 18.0f, 18.314f, 18.0f, 15.0f)
                curveTo(18.0f, 11.686f, 15.314f, 9.0f, 12.0f, 9.0f)
                close()
                moveTo(12.0f, 10.5f)
                lineTo(13.323f, 13.18f)
                lineTo(16.28f, 13.609f)
                lineTo(14.14f, 15.695f)
                lineTo(14.645f, 18.641f)
                lineTo(12.0f, 17.25f)
                lineTo(9.355f, 18.641f)
                lineTo(9.86f, 15.695f)
                lineTo(7.72f, 13.609f)
                lineTo(10.677f, 13.18f)
                lineTo(12.0f, 10.5f)
                close()
                moveTo(18.0f, 2.0f)
                verticalLineTo(5.0f)
                lineTo(16.637f, 6.138f)
                curveTo(15.531f, 5.558f, 14.302f, 5.179f, 13.001f, 5.049f)
                lineTo(13.0f, 1.999f)
                lineTo(18.0f, 2.0f)
                close()
                moveTo(11.0f, 1.999f)
                lineTo(11.0f, 5.049f)
                curveTo(9.698f, 5.179f, 8.47f, 5.557f, 7.364f, 6.137f)
                lineTo(6.0f, 5.0f)
                verticalLineTo(2.0f)
                lineTo(11.0f, 1.999f)
                close()
            }
        }
        .build()
        return _medalLine!!
    }

private var _medalLine: ImageVector? = null

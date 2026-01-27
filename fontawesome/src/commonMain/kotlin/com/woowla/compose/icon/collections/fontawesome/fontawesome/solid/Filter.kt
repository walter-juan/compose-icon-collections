package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = Builder(name = "Filter", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 64.0f)
                curveTo(19.1f, 64.0f, 7.4f, 71.8f, 2.4f, 83.8f)
                reflectiveCurveTo(0.2f, 109.5f, 9.4f, 118.6f)
                lineTo(192.0f, 301.3f)
                lineTo(192.0f, 416.0f)
                curveToRelative(0.0f, 8.5f, 3.4f, 16.6f, 9.4f, 22.6f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(9.2f, 9.2f, 22.9f, 11.9f, 34.9f, 6.9f)
                reflectiveCurveTo(320.0f, 492.9f, 320.0f, 480.0f)
                lineToRelative(0.0f, -178.7f)
                lineToRelative(182.6f, -182.6f)
                curveToRelative(9.2f, -9.2f, 11.9f, -22.9f, 6.9f, -34.9f)
                reflectiveCurveTo(492.9f, 64.0f, 480.0f, 64.0f)
                lineTo(32.0f, 64.0f)
                close()
            }
        }
        .build()
        return _filter!!
    }

private var _filter: ImageVector? = null

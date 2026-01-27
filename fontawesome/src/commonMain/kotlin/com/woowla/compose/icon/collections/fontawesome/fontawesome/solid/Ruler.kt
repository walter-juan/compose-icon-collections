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

public val SolidGroup.Ruler: ImageVector
    get() {
        if (_ruler != null) {
            return _ruler!!
        }
        _ruler = Builder(name = "Ruler", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.1f, 516.2f)
                curveToRelative(-18.7f, 18.7f, -49.1f, 18.7f, -67.9f, 0.0f)
                lineTo(28.1f, 403.1f)
                curveToRelative(-18.7f, -18.7f, -18.7f, -49.1f, 0.0f, -67.9f)
                lineToRelative(17.0f, -17.0f)
                lineToRelative(73.5f, 73.5f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-73.5f, -73.5f)
                lineToRelative(33.9f, -33.9f)
                lineToRelative(50.9f, 50.9f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-50.9f, -50.9f)
                lineToRelative(33.9f, -33.9f)
                lineToRelative(73.5f, 73.5f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-73.5f, -73.5f)
                lineToRelative(33.9f, -33.9f)
                lineToRelative(50.9f, 50.9f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-50.9f, -50.9f)
                lineToRelative(33.9f, -33.9f)
                lineToRelative(73.5f, 73.5f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-73.5f, -73.5f)
                lineToRelative(17.0f, -17.0f)
                curveToRelative(18.7f, -18.7f, 49.1f, -18.7f, 67.9f, 0.0f)
                lineTo(548.5f, 108.9f)
                curveToRelative(18.7f, 18.7f, 18.7f, 49.1f, 0.0f, 67.9f)
                lineTo(209.1f, 516.2f)
                close()
            }
        }
        .build()
        return _ruler!!
    }

private var _ruler: ImageVector? = null

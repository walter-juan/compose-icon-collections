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

public val SolidGroup.RotateRight: ImageVector
    get() {
        if (_rotateRight != null) {
            return _rotateRight!!
        }
        _rotateRight = Builder(name = "RotateRight", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(463.5f, 224.0f)
                lineToRelative(8.5f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                lineToRelative(0.0f, -128.0f)
                curveToRelative(0.0f, -9.7f, -5.8f, -18.5f, -14.8f, -22.2f)
                reflectiveCurveToRelative(-19.3f, -1.7f, -26.2f, 5.2f)
                lineTo(413.4f, 96.6f)
                curveToRelative(-87.6f, -86.5f, -228.7f, -86.2f, -315.8f, 1.0f)
                curveToRelative(-87.5f, 87.5f, -87.5f, 229.3f, 0.0f, 316.8f)
                reflectiveCurveToRelative(229.3f, 87.5f, 316.8f, 0.0f)
                curveToRelative(12.5f, -12.5f, 12.5f, -32.8f, 0.0f, -45.3f)
                reflectiveCurveToRelative(-32.8f, -12.5f, -45.3f, 0.0f)
                curveToRelative(-62.5f, 62.5f, -163.8f, 62.5f, -226.3f, 0.0f)
                reflectiveCurveToRelative(-62.5f, -163.8f, 0.0f, -226.3f)
                curveToRelative(62.2f, -62.2f, 162.7f, -62.5f, 225.3f, -1.0f)
                lineTo(327.0f, 183.0f)
                curveToRelative(-6.9f, 6.9f, -8.9f, 17.2f, -5.2f, 26.2f)
                reflectiveCurveToRelative(12.5f, 14.8f, 22.2f, 14.8f)
                lineToRelative(119.5f, 0.0f)
                close()
            }
        }
        .build()
        return _rotateRight!!
    }

private var _rotateRight: ImageVector? = null

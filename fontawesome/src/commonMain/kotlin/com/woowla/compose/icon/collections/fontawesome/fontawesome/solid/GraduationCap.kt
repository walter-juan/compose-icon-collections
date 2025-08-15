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

public val SolidGroup.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) {
            return _graduationCap!!
        }
        _graduationCap = Builder(name = "GraduationCap", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 195.8f)
                lineToRelative(209.2f, 86.1f)
                curveToRelative(9.8f, 4.0f, 20.2f, 6.1f, 30.8f, 6.1f)
                reflectiveCurveToRelative(21.0f, -2.1f, 30.8f, -6.1f)
                lineToRelative(242.4f, -99.8f)
                curveToRelative(9.0f, -3.7f, 14.8f, -12.4f, 14.8f, -22.1f)
                reflectiveCurveToRelative(-5.8f, -18.4f, -14.8f, -22.1f)
                lineTo(318.8f, 38.1f)
                curveTo(309.0f, 34.1f, 298.6f, 32.0f, 288.0f, 32.0f)
                reflectiveCurveToRelative(-21.0f, 2.1f, -30.8f, 6.1f)
                lineTo(14.8f, 137.9f)
                curveTo(5.8f, 141.6f, 0.0f, 150.3f, 0.0f, 160.0f)
                lineTo(0.0f, 456.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineToRelative(0.0f, -260.2f)
                close()
                moveTo(96.0f, 267.5f)
                lineTo(96.0f, 384.0f)
                curveToRelative(0.0f, 53.0f, 86.0f, 96.0f, 192.0f, 96.0f)
                reflectiveCurveToRelative(192.0f, -43.0f, 192.0f, -96.0f)
                lineToRelative(0.0f, -116.6f)
                lineToRelative(-142.9f, 58.9f)
                curveToRelative(-15.6f, 6.4f, -32.2f, 9.7f, -49.1f, 9.7f)
                reflectiveCurveToRelative(-33.5f, -3.3f, -49.1f, -9.7f)
                lineTo(96.0f, 267.4f)
                close()
            }
        }
        .build()
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null

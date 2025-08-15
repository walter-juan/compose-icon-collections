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

public val SolidGroup.BackwardFast: ImageVector
    get() {
        if (_backwardFast != null) {
            return _backwardFast!!
        }
        _backwardFast = Builder(name = "BackwardFast", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(492.2f, 477.6f)
                curveToRelative(-12.0f, 5.0f, -25.7f, 2.2f, -34.9f, -6.9f)
                lineTo(288.0f, 301.3f)
                lineTo(288.0f, 448.0f)
                curveToRelative(0.0f, 12.9f, -7.8f, 24.6f, -19.8f, 29.6f)
                reflectiveCurveToRelative(-25.7f, 2.2f, -34.9f, -6.9f)
                lineTo(64.0f, 301.3f)
                lineTo(64.0f, 448.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveTo(0.0f, 465.7f, 0.0f, 448.0f)
                lineTo(0.0f, 64.0f)
                curveTo(0.0f, 46.3f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveTo(64.0f, 46.3f, 64.0f, 64.0f)
                lineTo(64.0f, 210.7f)
                lineTo(233.4f, 41.4f)
                curveToRelative(9.2f, -9.2f, 22.9f, -11.9f, 34.9f, -6.9f)
                reflectiveCurveTo(288.0f, 51.1f, 288.0f, 64.0f)
                lineToRelative(0.0f, 146.7f)
                lineToRelative(169.4f, -169.4f)
                curveToRelative(9.2f, -9.2f, 22.9f, -11.9f, 34.9f, -6.9f)
                reflectiveCurveTo(512.0f, 51.1f, 512.0f, 64.0f)
                lineToRelative(0.0f, 384.0f)
                curveToRelative(0.0f, 12.9f, -7.8f, 24.6f, -19.8f, 29.6f)
                close()
            }
        }
        .build()
        return _backwardFast!!
    }

private var _backwardFast: ImageVector? = null

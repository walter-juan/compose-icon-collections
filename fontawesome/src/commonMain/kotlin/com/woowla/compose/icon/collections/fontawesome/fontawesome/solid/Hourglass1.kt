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

public val SolidGroup.Hourglass1: ImageVector
    get() {
        if (_hourglass1 != null) {
            return _hourglass1!!
        }
        _hourglass1 = Builder(name = "Hourglass1", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 0.0f)
                curveTo(14.3f, 0.0f, 0.0f, 14.3f, 0.0f, 32.0f)
                reflectiveCurveTo(14.3f, 64.0f, 32.0f, 64.0f)
                lineToRelative(0.0f, 11.0f)
                curveToRelative(0.0f, 42.4f, 16.9f, 83.1f, 46.9f, 113.1f)
                lineToRelative(67.9f, 67.9f)
                lineToRelative(-67.9f, 67.9f)
                curveTo(48.9f, 353.9f, 32.0f, 394.6f, 32.0f, 437.0f)
                lineToRelative(0.0f, 11.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(320.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(0.0f, -11.0f)
                curveToRelative(0.0f, -42.4f, -16.9f, -83.1f, -46.9f, -113.1f)
                lineToRelative(-67.9f, -67.9f)
                lineToRelative(67.9f, -67.9f)
                curveToRelative(30.0f, -30.0f, 46.9f, -70.7f, 46.9f, -113.1f)
                lineToRelative(0.0f, -11.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveTo(369.7f, 0.0f, 352.0f, 0.0f)
                lineTo(32.0f, 0.0f)
                close()
                moveTo(288.0f, 437.0f)
                lineToRelative(0.0f, 11.0f)
                lineToRelative(-192.0f, 0.0f)
                lineToRelative(0.0f, -11.0f)
                curveToRelative(0.0f, -25.5f, 10.1f, -49.9f, 28.1f, -67.9f)
                lineToRelative(67.9f, -67.9f)
                lineToRelative(67.9f, 67.9f)
                curveToRelative(18.0f, 18.0f, 28.1f, 42.4f, 28.1f, 67.9f)
                close()
            }
        }
        .build()
        return _hourglass1!!
    }

private var _hourglass1: ImageVector? = null

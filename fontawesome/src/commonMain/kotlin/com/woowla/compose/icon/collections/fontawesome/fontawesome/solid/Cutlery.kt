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

public val SolidGroup.Cutlery: ImageVector
    get() {
        if (_cutlery != null) {
            return _cutlery!!
        }
        _cutlery = Builder(name = "Cutlery", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(63.9f, 14.4f)
                curveTo(63.1f, 6.2f, 56.2f, 0.0f, 48.0f, 0.0f)
                reflectiveCurveToRelative(-15.1f, 6.2f, -16.0f, 14.3f)
                lineTo(17.9f, 149.7f)
                curveToRelative(-1.3f, 6.0f, -1.9f, 12.1f, -1.9f, 18.2f)
                curveToRelative(0.0f, 45.9f, 35.1f, 83.6f, 80.0f, 87.7f)
                lineTo(96.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -224.4f)
                curveToRelative(44.9f, -4.1f, 80.0f, -41.8f, 80.0f, -87.7f)
                curveToRelative(0.0f, -6.1f, -0.6f, -12.2f, -1.9f, -18.2f)
                lineTo(223.9f, 14.3f)
                curveTo(223.1f, 6.2f, 216.2f, 0.0f, 208.0f, 0.0f)
                reflectiveCurveToRelative(-15.1f, 6.2f, -15.9f, 14.4f)
                lineTo(178.5f, 149.9f)
                curveToRelative(-0.6f, 5.7f, -5.4f, 10.1f, -11.1f, 10.1f)
                curveToRelative(-5.8f, 0.0f, -10.6f, -4.4f, -11.2f, -10.2f)
                lineTo(143.9f, 14.6f)
                curveTo(143.2f, 6.3f, 136.3f, 0.0f, 128.0f, 0.0f)
                reflectiveCurveToRelative(-15.2f, 6.3f, -15.9f, 14.6f)
                lineTo(99.8f, 149.8f)
                curveToRelative(-0.5f, 5.8f, -5.4f, 10.2f, -11.2f, 10.2f)
                curveToRelative(-5.8f, 0.0f, -10.6f, -4.4f, -11.1f, -10.1f)
                lineTo(63.9f, 14.4f)
                close()
                moveTo(448.0f, 0.0f)
                curveTo(432.0f, 0.0f, 320.0f, 32.0f, 320.0f, 176.0f)
                lineToRelative(0.0f, 112.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -448.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _cutlery!!
    }

private var _cutlery: ImageVector? = null

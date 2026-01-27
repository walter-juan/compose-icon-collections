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

public val SolidGroup.HandsPraying: ImageVector
    get() {
        if (_handsPraying != null) {
            return _handsPraying!!
        }
        _handsPraying = Builder(name = "HandsPraying", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 296.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -112.6f)
                lineToRelative(88.2f, -119.7f)
                curveToRelative(13.1f, -17.8f, 9.3f, -42.8f, -8.5f, -55.9f)
                reflectiveCurveToRelative(-42.8f, -9.3f, -55.9f, 8.5f)
                lineTo(106.5f, 142.9f)
                curveTo(89.3f, 166.2f, 80.0f, 194.5f, 80.0f, 223.6f)
                lineToRelative(0.0f, 110.7f)
                lineToRelative(-58.1f, 19.4f)
                curveTo(8.8f, 358.0f, 0.0f, 370.2f, 0.0f, 384.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 10.0f, 4.7f, 19.5f, 12.7f, 25.5f)
                reflectiveCurveToRelative(18.4f, 8.0f, 28.1f, 5.2f)
                lineToRelative(154.4f, -44.1f)
                curveToRelative(55.0f, -15.7f, 92.8f, -65.9f, 92.8f, -123.1f)
                lineTo(288.0f, 224.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 72.0f)
                close()
                moveTo(416.0f, 296.0f)
                lineToRelative(0.0f, -72.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 119.6f)
                curveToRelative(0.0f, 57.2f, 37.9f, 107.4f, 92.8f, 123.1f)
                lineToRelative(154.4f, 44.1f)
                curveToRelative(9.7f, 2.8f, 20.0f, 0.8f, 28.1f, -5.2f)
                reflectiveCurveTo(640.0f, 490.0f, 640.0f, 480.0f)
                lineToRelative(0.0f, -96.0f)
                curveToRelative(0.0f, -13.8f, -8.8f, -26.0f, -21.9f, -30.4f)
                lineToRelative(-58.1f, -19.4f)
                lineToRelative(0.0f, -110.7f)
                curveToRelative(0.0f, -29.0f, -9.3f, -57.3f, -26.5f, -80.7f)
                lineTo(440.2f, 16.3f)
                curveTo(427.1f, -1.5f, 402.1f, -5.3f, 384.3f, 7.8f)
                reflectiveCurveToRelative(-21.6f, 38.1f, -8.5f, 55.9f)
                lineTo(464.0f, 183.4f)
                lineTo(464.0f, 296.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _handsPraying!!
    }

private var _handsPraying: ImageVector? = null

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

public val SolidGroup.HandsBound: ImageVector
    get() {
        if (_handsBound != null) {
            return _handsBound!!
        }
        _handsBound = Builder(name = "HandsBound", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(64.0f, 14.3f, 49.7f, 0.0f, 32.0f, 0.0f)
                reflectiveCurveTo(0.0f, 14.3f, 0.0f, 32.0f)
                lineTo(0.0f, 213.9f)
                curveToRelative(0.0f, 14.2f, 5.1f, 27.9f, 14.3f, 38.7f)
                lineTo(99.6f, 352.0f)
                lineTo(96.0f, 352.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(384.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-3.6f, 0.0f)
                lineToRelative(85.3f, -99.5f)
                curveToRelative(9.2f, -10.8f, 14.3f, -24.5f, 14.3f, -38.7f)
                lineTo(576.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 112.8f)
                lineToRelative(-69.3f, 92.4f)
                curveToRelative(-5.7f, 7.6f, -16.1f, 9.6f, -24.2f, 4.8f)
                curveToRelative(-9.7f, -5.7f, -12.1f, -18.7f, -5.1f, -27.5f)
                lineTo(441.0f, 180.0f)
                curveToRelative(10.8f, -13.5f, 8.9f, -33.3f, -4.4f, -44.5f)
                reflectiveCurveToRelative(-33.0f, -9.8f, -44.5f, 3.2f)
                lineToRelative(-46.7f, 52.5f)
                curveTo(329.0f, 209.7f, 320.0f, 233.4f, 320.0f, 258.1f)
                lineToRelative(0.0f, 93.9f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -93.9f)
                curveToRelative(0.0f, -24.6f, -9.0f, -48.4f, -25.4f, -66.8f)
                lineToRelative(-46.7f, -52.5f)
                curveToRelative(-11.5f, -13.0f, -31.3f, -14.4f, -44.5f, -3.2f)
                reflectiveCurveTo(124.2f, 166.4f, 135.0f, 180.0f)
                lineToRelative(27.6f, 34.5f)
                curveToRelative(7.0f, 8.8f, 4.7f, 21.8f, -5.1f, 27.5f)
                curveToRelative(-8.1f, 4.8f, -18.6f, 2.7f, -24.2f, -4.8f)
                lineTo(64.0f, 144.8f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(128.0f, 480.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(128.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(128.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineTo(96.0f, 432.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(32.0f, 0.0f)
                close()
            }
        }
        .build()
        return _handsBound!!
    }

private var _handsBound: ImageVector? = null

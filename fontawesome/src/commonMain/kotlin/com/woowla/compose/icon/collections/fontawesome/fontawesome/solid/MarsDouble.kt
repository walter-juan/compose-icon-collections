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

public val SolidGroup.MarsDouble: ImageVector
    get() {
        if (_marsDouble != null) {
            return _marsDouble!!
        }
        _marsDouble = Builder(name = "MarsDouble", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineTo(448.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -50.7f)
                lineToRelative(-95.0f, 95.0f)
                curveToRelative(19.5f, 28.4f, 31.0f, 62.7f, 31.0f, 99.8f)
                curveToRelative(0.0f, 97.2f, -78.8f, 176.0f, -176.0f, 176.0f)
                reflectiveCurveTo(0.0f, 401.2f, 0.0f, 304.0f)
                reflectiveCurveTo(78.8f, 128.0f, 176.0f, 128.0f)
                curveToRelative(37.0f, 0.0f, 71.4f, 11.4f, 99.8f, 31.0f)
                lineToRelative(95.0f, -95.0f)
                lineToRelative(-50.7f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                close()
                moveTo(176.0f, 416.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, false, 0.0f, -224.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, false, 0.0f, 224.0f)
                close()
                moveTo(336.0f, 480.0f)
                curveToRelative(-6.8f, 0.0f, -13.4f, -0.4f, -20.0f, -1.1f)
                curveToRelative(23.6f, -18.9f, 43.3f, -42.5f, 57.6f, -69.4f)
                curveToRelative(43.3f, -15.5f, 74.4f, -56.9f, 74.4f, -105.5f)
                curveToRelative(0.0f, -25.2f, -8.3f, -48.5f, -22.4f, -67.2f)
                curveToRelative(7.1f, 2.1f, 14.6f, 3.2f, 22.4f, 3.2f)
                curveToRelative(17.0f, 0.0f, 32.7f, -5.3f, 45.7f, -14.3f)
                curveToRelative(11.7f, 23.6f, 18.3f, 50.2f, 18.3f, 78.3f)
                curveToRelative(0.0f, 97.2f, -78.8f, 176.0f, -176.0f, 176.0f)
                close()
                moveTo(528.0f, 157.3f)
                lineTo(528.0f, 32.0f)
                curveToRelative(0.0f, -11.4f, -2.4f, -22.2f, -6.7f, -32.0f)
                lineTo(608.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -50.7f)
                lineToRelative(-48.0f, 48.0f)
                close()
            }
        }
        .build()
        return _marsDouble!!
    }

private var _marsDouble: ImageVector? = null

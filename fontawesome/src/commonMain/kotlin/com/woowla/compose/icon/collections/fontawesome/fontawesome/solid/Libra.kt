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

public val SolidGroup.Libra: ImageVector
    get() {
        if (_libra != null) {
            return _libra!!
        }
        _libra = Builder(name = "Libra", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 384.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(32.0f, 448.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(448.0f, 0.0f)
                close()
                moveTo(256.0f, 32.0f)
                curveToRelative(97.2f, 0.0f, 176.0f, 78.8f, 176.0f, 176.0f)
                curveToRelative(0.0f, 16.6f, -2.4f, 32.7f, -6.7f, 48.0f)
                lineToRelative(54.7f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-104.2f, 0.0f)
                curveToRelative(-11.8f, 0.0f, -22.7f, -6.5f, -28.2f, -16.9f)
                reflectiveCurveToRelative(-4.9f, -23.1f, 1.6f, -32.9f)
                curveToRelative(11.9f, -17.8f, 18.8f, -39.1f, 18.8f, -62.2f)
                curveToRelative(0.0f, -61.9f, -50.1f, -112.0f, -112.0f, -112.0f)
                reflectiveCurveTo(144.0f, 146.1f, 144.0f, 208.0f)
                curveToRelative(0.0f, 23.1f, 6.9f, 44.4f, 18.8f, 62.2f)
                curveToRelative(6.6f, 9.8f, 7.2f, 22.5f, 1.6f, 32.9f)
                reflectiveCurveTo(148.1f, 320.0f, 136.2f, 320.0f)
                lineTo(32.0f, 320.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(54.8f, 0.0f)
                curveToRelative(-4.3f, -15.3f, -6.8f, -31.4f, -6.8f, -48.0f)
                curveToRelative(0.0f, -97.2f, 78.8f, -176.0f, 176.0f, -176.0f)
                close()
            }
        }
        .build()
        return _libra!!
    }

private var _libra: ImageVector? = null

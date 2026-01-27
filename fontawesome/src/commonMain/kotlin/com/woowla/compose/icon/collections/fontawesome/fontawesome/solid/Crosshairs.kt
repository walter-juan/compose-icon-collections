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

public val SolidGroup.Crosshairs: ImageVector
    get() {
        if (_crosshairs != null) {
            return _crosshairs!!
        }
        _crosshairs = Builder(name = "Crosshairs", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, -16.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 18.3f)
                curveToRelative(98.1f, 14.0f, 175.7f, 91.6f, 189.7f, 189.7f)
                lineToRelative(18.3f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-18.3f, 0.0f)
                curveToRelative(-14.0f, 98.1f, -91.6f, 175.7f, -189.7f, 189.7f)
                lineToRelative(0.0f, 18.3f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -18.3f)
                curveTo(157.9f, 463.7f, 80.3f, 386.1f, 66.3f, 288.0f)
                lineTo(48.0f, 288.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(18.3f, 0.0f)
                curveTo(80.3f, 125.9f, 157.9f, 48.3f, 256.0f, 34.3f)
                lineTo(256.0f, 16.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(131.2f, 288.0f)
                curveToRelative(12.7f, 62.7f, 62.1f, 112.1f, 124.8f, 124.8f)
                lineToRelative(0.0f, -12.8f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 12.8f)
                curveToRelative(62.7f, -12.7f, 112.1f, -62.1f, 124.8f, -124.8f)
                lineTo(432.0f, 288.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(12.8f, 0.0f)
                curveTo(432.1f, 161.3f, 382.7f, 111.9f, 320.0f, 99.2f)
                lineToRelative(0.0f, 12.8f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -12.8f)
                curveTo(193.3f, 111.9f, 143.9f, 161.3f, 131.2f, 224.0f)
                lineToRelative(12.8f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-12.8f, 0.0f)
                close()
                moveTo(288.0f, 208.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, -96.0f)
                close()
            }
        }
        .build()
        return _crosshairs!!
    }

private var _crosshairs: ImageVector? = null

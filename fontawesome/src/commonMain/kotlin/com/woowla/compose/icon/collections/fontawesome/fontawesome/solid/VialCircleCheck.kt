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

public val SolidGroup.VialCircleCheck: ImageVector
    get() {
        if (_vialCircleCheck != null) {
            return _vialCircleCheck!!
        }
        _vialCircleCheck = Builder(name = "VialCircleCheck", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 32.0f)
                curveTo(32.0f, 14.3f, 46.3f, 0.0f, 64.0f, 0.0f)
                lineTo(288.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(0.0f, 161.4f)
                curveToRelative(-66.1f, 30.3f, -112.0f, 97.1f, -112.0f, 174.6f)
                curveToRelative(0.0f, 39.7f, 12.0f, 76.6f, 32.7f, 107.2f)
                curveToRelative(-10.3f, 3.1f, -21.3f, 4.8f, -32.7f, 4.8f)
                curveToRelative(-61.9f, 0.0f, -112.0f, -50.1f, -112.0f, -112.0f)
                lineTo(64.0f, 64.0f)
                curveTo(46.3f, 64.0f, 32.0f, 49.7f, 32.0f, 32.0f)
                close()
                moveTo(128.0f, 64.0f)
                lineToRelative(0.0f, 128.0f)
                lineToRelative(96.0f, 0.0f)
                lineToRelative(0.0f, -128.0f)
                lineToRelative(-96.0f, 0.0f)
                close()
                moveTo(224.0f, 400.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, 288.0f, 0.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, -288.0f, 0.0f)
                close()
                moveTo(425.4f, 339.1f)
                curveToRelative(-7.1f, -5.2f, -17.2f, -3.6f, -22.4f, 3.5f)
                lineToRelative(-53.0f, 72.9f)
                lineToRelative(-26.8f, -26.8f)
                curveToRelative(-6.2f, -6.2f, -16.4f, -6.2f, -22.6f, 0.0f)
                reflectiveCurveToRelative(-6.2f, 16.4f, 0.0f, 22.6f)
                lineToRelative(40.0f, 40.0f)
                curveToRelative(3.3f, 3.3f, 7.9f, 5.0f, 12.6f, 4.6f)
                reflectiveCurveToRelative(8.9f, -2.8f, 11.7f, -6.5f)
                lineToRelative(64.0f, -88.0f)
                curveToRelative(5.2f, -7.1f, 3.6f, -17.2f, -3.5f, -22.3f)
                close()
            }
        }
        .build()
        return _vialCircleCheck!!
    }

private var _vialCircleCheck: ImageVector? = null

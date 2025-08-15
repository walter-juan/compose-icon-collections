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

public val SolidGroup.ThumbTack: ImageVector
    get() {
        if (_thumbTack != null) {
            return _thumbTack!!
        }
        _thumbTack = Builder(name = "ThumbTack", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 32.0f)
                curveTo(32.0f, 14.3f, 46.3f, 0.0f, 64.0f, 0.0f)
                lineTo(320.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-29.5f, 0.0f)
                lineToRelative(10.3f, 134.1f)
                curveToRelative(37.1f, 21.2f, 65.8f, 56.4f, 78.2f, 99.7f)
                lineToRelative(3.8f, 13.4f)
                curveToRelative(2.8f, 9.7f, 0.8f, 20.0f, -5.2f, 28.1f)
                reflectiveCurveTo(362.0f, 352.0f, 352.0f, 352.0f)
                lineTo(32.0f, 352.0f)
                curveToRelative(-10.0f, 0.0f, -19.5f, -4.7f, -25.5f, -12.7f)
                reflectiveCurveToRelative(-8.0f, -18.4f, -5.2f, -28.1f)
                lineTo(5.0f, 297.8f)
                curveToRelative(12.4f, -43.3f, 41.0f, -78.5f, 78.2f, -99.7f)
                lineTo(93.5f, 64.0f)
                lineTo(64.0f, 64.0f)
                curveTo(46.3f, 64.0f, 32.0f, 49.7f, 32.0f, 32.0f)
                close()
                moveTo(160.0f, 400.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, 112.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -112.0f)
                close()
            }
        }
        .build()
        return _thumbTack!!
    }

private var _thumbTack: ImageVector? = null

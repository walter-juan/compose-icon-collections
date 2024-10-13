package com.woowla.compose.icon.collections.devicons.devicons.thealgorithms

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.ThealgorithmsGroup

public val ThealgorithmsGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF00BCB4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(43.9f, 105.9f)
                lineTo(7.2f, 105.9f)
                lineToRelative(9.5f, -22.5f)
                horizontalLineToRelative(25.7f)
                lineTo(71.0f, 17.1f)
                lineTo(40.3f, 17.1f)
                lineTo(17.8f, 69.5f)
                horizontalLineToRelative(13.8f)
                curveToRelative(1.0f, 1.6f, 2.7f, 2.7f, 4.7f, 2.7f)
                curveToRelative(3.0f, 0.0f, 5.5f, -2.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.5f, -5.5f, -5.5f, -5.5f)
                curveToRelative(-2.2f, 0.0f, -4.1f, 1.3f, -5.0f, 3.2f)
                horizontalLineToRelative(-6.6f)
                lineToRelative(18.7f, -42.3f)
                horizontalLineToRelative(20.1f)
                lineTo(39.4f, 78.3f)
                lineToRelative(-25.4f, 0.2f)
                lineToRelative(-14.0f, 32.4f)
                horizontalLineToRelative(47.2f)
                lineToRelative(6.2f, -13.5f)
                horizontalLineToRelative(20.5f)
                lineToRelative(6.8f, 13.5f)
                lineTo(128.0f, 110.9f)
                lineTo(85.3f, 17.1f)
                lineToRelative(-41.4f, 88.8f)
                close()
                moveTo(56.0f, 92.1f)
                lineTo(63.4f, 76.0f)
                lineToRelative(8.0f, 16.1f)
                lineTo(56.0f, 92.1f)
                close()
                moveTo(83.8f, 106.5f)
                lineToRelative(-4.7f, -9.4f)
                horizontalLineToRelative(14.6f)
                curveToRelative(1.0f, 1.8f, 2.8f, 3.0f, 4.9f, 3.0f)
                curveToRelative(3.0f, 0.0f, 5.5f, -2.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.5f, -5.5f, -5.5f, -5.5f)
                curveToRelative(-2.2f, 0.0f, -4.2f, 1.4f, -5.1f, 3.3f)
                lineTo(76.9f, 92.4f)
                lineTo(65.8f, 70.6f)
                lineToRelative(8.2f, -18.0f)
                lineToRelative(9.2f, 18.8f)
                horizontalLineToRelative(4.3f)
                curveToRelative(0.9f, 1.8f, 2.8f, 3.2f, 5.0f, 3.2f)
                curveToRelative(3.0f, 0.0f, 5.5f, -2.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.5f, -5.5f, -5.5f, -5.5f)
                curveToRelative(-2.3f, 0.0f, -4.3f, 1.4f, -5.1f, 3.5f)
                horizontalLineToRelative(-1.6f)
                lineToRelative(-9.5f, -19.4f)
                lineToRelative(9.1f, -19.9f)
                lineToRelative(35.6f, 78.7f)
                lineTo(83.8f, 106.5f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null

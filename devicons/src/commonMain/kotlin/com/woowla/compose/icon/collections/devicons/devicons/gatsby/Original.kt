package com.woowla.compose.icon.collections.devicons.devicons.gatsby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.GatsbyGroup

public val GatsbyGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF64328B)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                curveTo(28.7f, 0.0f, 0.0f, 28.7f, 0.0f, 64.0f)
                reflectiveCurveToRelative(28.7f, 64.0f, 64.0f, 64.0f)
                reflectiveCurveToRelative(64.0f, -28.7f, 64.0f, -64.0f)
                reflectiveCurveTo(99.3f, 0.0f, 64.0f, 0.0f)
                close()
                moveTo(13.2f, 64.0f)
                lineTo(64.0f, 114.8f)
                curveToRelative(-28.1f, 0.0f, -50.8f, -22.7f, -50.8f, -50.8f)
                close()
                moveTo(75.4f, 113.5f)
                lineToRelative(-60.9f, -61.0f)
                curveTo(19.7f, 30.0f, 39.9f, 13.2f, 64.0f, 13.2f)
                curveToRelative(16.6f, 0.0f, 31.3f, 7.9f, 40.5f, 20.2f)
                lineTo(97.0f, 40.6f)
                curveToRelative(-7.3f, -10.4f, -19.3f, -17.1f, -33.0f, -17.1f)
                curveToRelative(-17.6f, 0.0f, -32.5f, 11.2f, -38.1f, 26.8f)
                curveTo(33.1f, 57.0f, 75.4f, 98.8f, 78.1f, 102.0f)
                curveToRelative(12.7f, -4.7f, 22.3f, -15.5f, 25.4f, -28.9f)
                lineTo(81.9f, 73.1f)
                verticalLineToRelative(-9.4f)
                lineToRelative(33.0f, 0.2f)
                curveToRelative(-0.1f, 24.3f, -16.9f, 44.5f, -39.5f, 49.6f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null

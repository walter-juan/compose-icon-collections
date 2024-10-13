package com.woowla.compose.icon.collections.devicons.devicons.ansible

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.AnsibleGroup

public val AnsibleGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF1A1918)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(126.0f, 64.0f)
                curveToRelative(0.0f, 34.2f, -27.8f, 62.0f, -62.0f, 62.0f)
                reflectiveCurveTo(2.0f, 98.2f, 2.0f, 64.0f)
                reflectiveCurveTo(29.8f, 2.0f, 64.0f, 2.0f)
                reflectiveCurveToRelative(62.0f, 27.8f, 62.0f, 62.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(65.0f, 39.9f)
                lineToRelative(16.0f, 39.6f)
                lineToRelative(-24.1f, -19.1f)
                lineTo(65.0f, 39.9f)
                close()
                moveTo(93.5f, 88.6f)
                lineTo(68.9f, 29.2f)
                curveToRelative(-0.7f, -1.7f, -2.1f, -2.6f, -3.8f, -2.6f)
                curveToRelative(-1.7f, 0.0f, -3.2f, 0.9f, -3.9f, 2.6f)
                lineTo(34.0f, 94.3f)
                horizontalLineToRelative(9.3f)
                lineTo(54.0f, 67.5f)
                lineToRelative(32.0f, 25.9f)
                curveToRelative(1.3f, 1.0f, 2.2f, 1.5f, 3.4f, 1.5f)
                curveToRelative(2.4f, 0.0f, 4.5f, -1.8f, 4.5f, -4.4f)
                curveToRelative(0.1f, -0.5f, -0.1f, -1.2f, -0.4f, -1.9f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null

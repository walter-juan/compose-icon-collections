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

public val AnsibleGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF1A1918)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 2.0f)
                curveTo(29.8f, 2.0f, 2.0f, 29.8f, 2.0f, 64.0f)
                reflectiveCurveToRelative(27.8f, 62.0f, 62.0f, 62.0f)
                reflectiveCurveToRelative(62.0f, -27.8f, 62.0f, -62.0f)
                reflectiveCurveTo(98.2f, 2.0f, 64.0f, 2.0f)
                close()
                moveTo(89.4f, 94.8f)
                curveToRelative(-1.2f, 0.0f, -2.1f, -0.5f, -3.4f, -1.5f)
                lineTo(54.0f, 67.5f)
                lineTo(43.3f, 94.3f)
                lineTo(34.0f, 94.3f)
                lineToRelative(27.1f, -65.1f)
                curveToRelative(0.7f, -1.7f, 2.2f, -2.6f, 3.9f, -2.6f)
                curveToRelative(1.7f, 0.0f, 3.1f, 0.9f, 3.8f, 2.6f)
                lineToRelative(24.7f, 59.4f)
                curveToRelative(0.3f, 0.7f, 0.4f, 1.4f, 0.4f, 1.8f)
                curveToRelative(0.1f, 2.6f, -2.0f, 4.4f, -4.5f, 4.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1A1918)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(65.0f, 39.9f)
                lineToRelative(16.1f, 39.6f)
                lineToRelative(-24.3f, -19.1f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null

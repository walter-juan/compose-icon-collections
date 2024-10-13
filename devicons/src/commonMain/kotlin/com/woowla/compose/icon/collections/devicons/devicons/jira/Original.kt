package com.woowla.compose.icon.collections.devicons.devicons.jira

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
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
import com.woowla.compose.icon.collections.devicons.devicons.JiraGroup

public val JiraGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF2684ff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(108.02f, 16.0f)
                lineTo(61.81f, 16.0f)
                curveToRelative(0.0f, 11.52f, 9.32f, 20.85f, 20.85f, 20.85f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(8.23f)
                curveToRelative(0.0f, 11.52f, 9.33f, 20.85f, 20.85f, 20.85f)
                lineTo(112.0f, 19.98f)
                arcTo(3.98f, 3.98f, 0.0f, false, false, 108.02f, 16.0f)
                close()
                moveTo(108.02f, 16.0f)
            }
            path(fill = linearGradient(0.18f to Color(0xFF0052CC), 1.0f to Color(0xFF2684FF), start
                    = Offset(88.14f,39.09f), end = Offset(68.47f,59.37f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(85.12f, 39.04f)
                lineTo(38.9f, 39.04f)
                curveToRelative(0.0f, 11.52f, 9.32f, 20.85f, 20.84f, 20.85f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(8.23f)
                curveToRelative(0.0f, 11.52f, 9.33f, 20.85f, 20.85f, 20.85f)
                lineTo(89.1f, 43.02f)
                arcToRelative(3.98f, 3.98f, 0.0f, false, false, -3.98f, -3.98f)
                close()
                moveTo(85.12f, 39.04f)
            }
            path(fill = linearGradient(0.18f to Color(0xFF0052CC), 1.0f to Color(0xFF2684FF), start
                    = Offset(66.56f,62.26f), end = Offset(43.83f,84.38f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(62.22f, 62.08f)
                lineTo(16.0f, 62.08f)
                curveToRelative(0.0f, 11.52f, 9.32f, 20.85f, 20.85f, 20.85f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(8.23f)
                curveToRelative(0.0f, 11.52f, 9.33f, 20.84f, 20.85f, 20.84f)
                lineTo(66.19f, 66.06f)
                arcToRelative(3.98f, 3.98f, 0.0f, false, false, -3.98f, -3.98f)
                close()
                moveTo(62.22f, 62.08f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null

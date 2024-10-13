package com.woowla.compose.icon.collections.devicons.devicons.keras

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
import com.woowla.compose.icon.collections.devicons.devicons.KerasGroup

public val KerasGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFd00000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 128.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(34.1f, 99.3f)
                curveToRelative(0.0f, 0.1f, 0.1f, 0.2f, 0.1f, 0.3f)
                lineToRelative(2.2f, 2.2f)
                curveToRelative(0.1f, 0.1f, 0.2f, 0.1f, 0.3f, 0.1f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.1f, 0.0f, 0.2f, -0.1f, 0.3f, -0.1f)
                lineToRelative(2.2f, -2.2f)
                curveToRelative(0.1f, -0.1f, 0.1f, -0.2f, 0.1f, -0.3f)
                verticalLineTo(75.5f)
                curveToRelative(0.0f, -0.1f, 0.1f, -0.2f, 0.1f, -0.3f)
                lineToRelative(9.5f, -9.1f)
                curveToRelative(0.1f, -0.1f, 0.2f, -0.1f, 0.2f, 0.0f)
                lineToRelative(24.1f, 35.6f)
                curveToRelative(0.1f, 0.1f, 0.2f, 0.1f, 0.3f, 0.1f)
                horizontalLineToRelative(10.6f)
                curveToRelative(0.1f, 0.0f, 0.2f, -0.1f, 0.3f, -0.2f)
                lineToRelative(1.9f, -3.7f)
                verticalLineToRelative(-0.3f)
                lineTo(65.7f, 56.9f)
                curveToRelative(-0.1f, -0.1f, 0.0f, -0.2f, 0.0f, -0.3f)
                lineToRelative(25.9f, -25.8f)
                curveToRelative(0.1f, -0.1f, 0.1f, -0.2f, 0.1f, -0.3f)
                verticalLineTo(30.0f)
                curveToRelative(0.0f, -0.1f, 0.0f, -0.2f, -0.1f, -0.3f)
                lineToRelative(-1.5f, -3.4f)
                curveToRelative(0.0f, -0.1f, -0.1f, -0.2f, -0.2f, -0.2f)
                horizontalLineTo(79.4f)
                curveToRelative(-0.1f, 0.0f, -0.2f, 0.1f, -0.3f, 0.1f)
                lineTo(47.0f, 58.5f)
                curveToRelative(-0.1f, 0.1f, -0.1f, 0.0f, -0.1f, -0.1f)
                verticalLineTo(28.9f)
                curveToRelative(0.0f, -0.1f, -0.1f, -0.2f, -0.1f, -0.3f)
                lineToRelative(-2.2f, -2.3f)
                curveToRelative(-0.1f, -0.1f, -0.2f, -0.1f, -0.3f, -0.1f)
                horizontalLineToRelative(-7.6f)
                curveToRelative(-0.1f, 0.0f, -0.2f, 0.1f, -0.3f, 0.1f)
                lineToRelative(-2.2f, 2.4f)
                curveToRelative(-0.1f, 0.1f, -0.1f, 0.2f, -0.1f, 0.3f)
                verticalLineToRelative(70.3f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null

package com.woowla.compose.icon.collections.devicons.devicons.codepen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.CodepenGroup

public val CodepenGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(125.57f, 39.93f)
                lineToRelative(-58.5f, -39.0f)
                curveToRelative(-2.0f, -1.23f, -4.13f, -1.24f, -6.14f, 0.0f)
                lineToRelative(-58.5f, 39.0f)
                curveTo(0.93f, 40.93f, 0.0f, 42.71f, 0.0f, 44.5f)
                verticalLineToRelative(39.0f)
                curveToRelative(0.0f, 1.79f, 0.93f, 3.57f, 2.43f, 4.57f)
                lineToRelative(58.5f, 39.01f)
                curveToRelative(2.0f, 1.23f, 4.13f, 1.24f, 6.14f, 0.0f)
                lineToRelative(58.5f, -39.01f)
                curveToRelative(1.5f, -1.0f, 2.43f, -2.79f, 2.43f, -4.57f)
                verticalLineToRelative(-39.0f)
                curveToRelative(0.0f, -1.79f, -0.93f, -3.57f, -2.43f, -4.57f)
                close()
                moveTo(69.5f, 15.78f)
                lineTo(112.57f, 44.5f)
                lineTo(93.36f, 57.36f)
                lineTo(69.5f, 41.42f)
                lineTo(69.5f, 15.78f)
                close()
                moveTo(58.5f, 15.78f)
                verticalLineToRelative(25.64f)
                lineTo(34.64f, 57.35f)
                lineTo(15.43f, 44.5f)
                lineTo(58.5f, 15.78f)
                close()
                moveTo(11.0f, 54.78f)
                lineTo(24.79f, 64.0f)
                lineTo(11.0f, 73.21f)
                verticalLineToRelative(-18.43f)
                close()
                moveTo(58.5f, 112.21f)
                lineTo(15.43f, 83.5f)
                lineTo(34.64f, 70.64f)
                lineTo(58.5f, 86.57f)
                verticalLineToRelative(25.64f)
                close()
                moveTo(64.0f, 77.0f)
                lineToRelative(-19.43f, -13.0f)
                lineToRelative(19.43f, -13.0f)
                lineToRelative(19.43f, 13.0f)
                lineToRelative(-19.43f, 13.0f)
                close()
                moveTo(69.5f, 112.21f)
                lineTo(69.5f, 86.57f)
                lineTo(93.36f, 70.64f)
                lineToRelative(19.21f, 12.86f)
                lineToRelative(-43.07f, 28.72f)
                close()
                moveTo(117.0f, 73.21f)
                lineTo(103.21f, 64.0f)
                lineTo(117.0f, 54.78f)
                verticalLineToRelative(18.43f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null

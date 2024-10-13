package com.woowla.compose.icon.collections.devicons.devicons.kaggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.KaggleGroup

public val KaggleGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF20beff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.4f, 127.24f)
                curveToRelative(-0.13f, 0.5f, -0.63f, 0.75f, -1.5f, 0.75f)
                horizontalLineTo(82.17f)
                curveToRelative(-1.01f, 0.0f, -1.88f, -0.44f, -2.63f, -1.32f)
                lineTo(51.91f, 91.53f)
                lineToRelative(-7.71f, 7.33f)
                verticalLineToRelative(27.26f)
                curveToRelative(0.0f, 1.25f, -0.63f, 1.88f, -1.88f, 1.88f)
                horizontalLineToRelative(-12.97f)
                curveToRelative(-1.25f, 0.0f, -1.88f, -0.63f, -1.88f, -1.88f)
                verticalLineTo(1.88f)
                curveToRelative(0.0f, -1.25f, 0.63f, -1.88f, 1.88f, -1.88f)
                horizontalLineToRelative(12.97f)
                curveToRelative(1.25f, 0.0f, 1.88f, 0.63f, 1.88f, 1.88f)
                verticalLineToRelative(76.5f)
                lineToRelative(33.08f, -33.46f)
                curveToRelative(0.88f, -0.88f, 1.75f, -1.32f, 2.63f, -1.32f)
                horizontalLineToRelative(17.3f)
                curveToRelative(0.75f, 0.0f, 1.25f, 0.31f, 1.5f, 0.94f)
                curveToRelative(0.25f, 0.75f, 0.19f, 1.32f, -0.19f, 1.69f)
                lineTo(63.56f, 80.06f)
                lineToRelative(36.47f, 45.3f)
                curveToRelative(0.5f, 0.5f, 0.63f, 1.13f, 0.38f, 1.88f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null

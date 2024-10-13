package com.woowla.compose.icon.collections.devicons.devicons.sanity

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
import com.woowla.compose.icon.collections.devicons.devicons.SanityGroup

public val SanityGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFF03E2F)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(-128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(39.42f, 33.16f)
                curveTo(39.42f, 44.16f, 46.34f, 50.71f, 60.18f, 54.16f)
                lineTo(74.84f, 57.5f)
                curveTo(87.94f, 60.45f, 95.92f, 67.79f, 95.92f, 79.76f)
                curveTo(96.02f, 84.97f, 94.3f, 90.05f, 91.03f, 94.16f)
                curveTo(91.03f, 82.23f, 84.75f, 75.78f, 69.6f, 71.91f)
                lineTo(55.19f, 68.69f)
                curveTo(43.66f, 66.1f, 34.76f, 60.07f, 34.76f, 47.08f)
                curveTo(34.7f, 42.06f, 36.34f, 37.16f, 39.42f, 33.16f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF9B1AB)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(82.02f, 76.83f)
                curveTo(88.28f, 80.76f, 91.02f, 86.26f, 91.02f, 94.15f)
                curveTo(85.84f, 100.67f, 76.75f, 104.32f, 66.05f, 104.32f)
                curveTo(48.06f, 104.32f, 35.46f, 95.62f, 32.66f, 80.5f)
                horizontalLineTo(49.95f)
                curveTo(52.17f, 87.44f, 58.06f, 90.66f, 65.93f, 90.66f)
                curveTo(75.53f, 90.66f, 81.91f, 85.63f, 82.04f, 76.8f)
            }
            path(fill = SolidColor(Color(0xFFF9B1AB)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.41f, 49.47f)
                curveTo(45.55f, 47.8f, 43.21f, 45.4f, 41.63f, 42.53f)
                curveTo(40.04f, 39.66f, 39.28f, 36.42f, 39.42f, 33.16f)
                curveTo(44.42f, 26.7f, 53.11f, 22.76f, 63.7f, 22.76f)
                curveTo(82.04f, 22.76f, 92.64f, 32.27f, 95.26f, 45.66f)
                horizontalLineTo(78.64f)
                curveTo(76.8f, 40.38f, 72.21f, 36.27f, 63.84f, 36.27f)
                curveTo(54.9f, 36.27f, 48.8f, 41.38f, 48.45f, 49.47f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null

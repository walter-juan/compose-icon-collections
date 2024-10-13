package com.woowla.compose.icon.collections.devicons.devicons.sanity

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.SanityGroup

public val SanityGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFF03E2F)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                lineTo(0.0f, 128.0f)
                lineTo(128.0f, 128.0f)
                lineTo(128.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(63.7f, 22.76f)
                curveTo(82.04f, 22.76f, 92.64f, 32.27f, 95.26f, 45.66f)
                lineTo(78.63f, 45.66f)
                curveTo(76.8f, 40.38f, 72.21f, 36.27f, 63.84f, 36.27f)
                curveTo(54.9f, 36.27f, 48.8f, 41.38f, 48.45f, 49.47f)
                lineTo(48.43f, 49.47f)
                curveTo(51.55f, 51.42f, 55.45f, 52.98f, 60.18f, 54.16f)
                lineTo(74.84f, 57.5f)
                curveTo(87.94f, 60.45f, 95.92f, 67.79f, 95.92f, 79.76f)
                curveTo(96.02f, 84.97f, 94.3f, 90.05f, 91.04f, 94.16f)
                curveTo(91.04f, 93.75f, 91.01f, 93.35f, 90.99f, 92.95f)
                curveTo(91.01f, 93.35f, 91.02f, 93.74f, 91.02f, 94.15f)
                curveTo(85.84f, 100.67f, 76.75f, 104.32f, 66.05f, 104.32f)
                curveTo(48.06f, 104.32f, 35.46f, 95.62f, 32.66f, 80.5f)
                lineTo(49.95f, 80.5f)
                curveTo(52.17f, 87.44f, 58.06f, 90.66f, 65.93f, 90.66f)
                curveTo(75.5f, 90.66f, 81.88f, 85.65f, 82.03f, 76.86f)
                curveTo(78.83f, 74.84f, 74.74f, 73.22f, 69.6f, 71.9f)
                lineTo(55.2f, 68.69f)
                curveTo(43.66f, 66.1f, 34.76f, 60.07f, 34.76f, 47.08f)
                curveTo(34.7f, 42.06f, 36.34f, 37.16f, 39.42f, 33.16f)
                curveTo(44.42f, 26.7f, 53.11f, 22.76f, 63.7f, 22.76f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null

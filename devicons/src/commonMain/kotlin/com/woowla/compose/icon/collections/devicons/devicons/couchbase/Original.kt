package com.woowla.compose.icon.collections.devicons.devicons.couchbase

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.CouchbaseGroup

public val CouchbaseGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFEA2328)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(107.26f, 75.22f)
                curveTo(107.43f, 79.17f, 104.6f, 82.62f, 100.67f, 83.24f)
                curveTo(93.09f, 84.54f, 77.29f, 85.36f, 64.0f, 85.36f)
                curveTo(50.73f, 85.36f, 34.92f, 84.56f, 27.33f, 83.24f)
                curveTo(22.99f, 82.49f, 20.74f, 79.04f, 20.74f, 75.22f)
                lineTo(20.74f, 50.22f)
                curveTo(20.79f, 46.35f, 23.52f, 43.02f, 27.33f, 42.2f)
                curveTo(31.14f, 41.69f, 34.98f, 41.44f, 38.83f, 41.45f)
                curveTo(40.4f, 41.49f, 41.64f, 42.79f, 41.62f, 44.35f)
                lineTo(41.62f, 61.96f)
                curveTo(49.42f, 61.96f, 56.16f, 61.5f, 64.02f, 61.5f)
                curveTo(71.88f, 61.5f, 78.57f, 61.96f, 86.4f, 61.96f)
                lineTo(86.4f, 44.49f)
                curveTo(86.29f, 42.93f, 87.46f, 41.57f, 89.04f, 41.46f)
                lineTo(89.18f, 41.46f)
                curveTo(93.02f, 41.45f, 96.87f, 41.7f, 100.68f, 42.2f)
                curveTo(104.48f, 43.03f, 107.21f, 46.36f, 107.26f, 50.22f)
                close()
                moveTo(64.0f, 0.0f)
                curveTo(28.66f, 0.0f, 0.0f, 28.66f, 0.0f, 64.0f)
                curveTo(0.0f, 99.35f, 28.66f, 128.0f, 64.0f, 128.0f)
                curveTo(99.35f, 128.0f, 128.0f, 99.35f, 128.0f, 64.0f)
                curveTo(128.0f, 28.66f, 99.34f, 0.0f, 64.0f, 0.0f)
                close()
                moveTo(64.0f, 0.0f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null

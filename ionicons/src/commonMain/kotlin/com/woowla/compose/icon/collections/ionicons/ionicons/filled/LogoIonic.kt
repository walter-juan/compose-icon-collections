package com.woowla.compose.icon.collections.ionicons.ionicons.filled

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
import com.woowla.compose.icon.collections.ionicons.ionicons.FilledGroup

public val FilledGroup.LogoIonic: ImageVector
    get() {
        if (_logoIonic != null) {
            return _logoIonic!!
        }
        _logoIonic = Builder(name = "LogoIonic", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(73.6f, 256.0f)
                curveTo(73.6f, 155.26f, 155.26f, 73.6f, 256.0f, 73.6f)
                curveTo(296.55f, 73.6f, 333.99f, 86.81f, 364.29f, 109.2f)
                curveTo(372.23f, 90.5f, 388.24f, 76.05f, 407.96f, 70.23f)
                curveTo(366.59f, 36.36f, 313.66f, 16.0f, 256.0f, 16.0f)
                curveTo(123.45f, 16.0f, 16.0f, 123.45f, 16.0f, 256.0f)
                curveTo(16.0f, 388.55f, 123.45f, 496.0f, 256.0f, 496.0f)
                curveTo(388.55f, 496.0f, 496.0f, 388.55f, 496.0f, 256.0f)
                curveTo(496.0f, 228.26f, 491.28f, 201.57f, 482.59f, 176.73f)
                curveTo(470.77f, 192.72f, 452.16f, 203.38f, 431.03f, 204.47f)
                curveTo(435.82f, 220.79f, 438.4f, 238.08f, 438.4f, 256.0f)
                curveTo(438.4f, 356.74f, 356.74f, 438.4f, 256.0f, 438.4f)
                curveTo(155.26f, 438.4f, 73.6f, 356.74f, 73.6f, 256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(491.07f, 207.37f)
                curveTo(488.91f, 196.9f, 486.07f, 186.67f, 482.59f, 176.73f)
                curveTo(470.77f, 192.71f, 452.16f, 203.38f, 431.03f, 204.47f)
                curveTo(434.42f, 216.02f, 436.7f, 228.04f, 437.75f, 240.44f)
                curveTo(460.01f, 237.7f, 479.25f, 225.21f, 491.07f, 207.37f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 361.0f)
                curveTo(313.85f, 361.0f, 361.0f, 313.94f, 361.0f, 256.0f)
                curveTo(361.0f, 198.15f, 313.94f, 151.0f, 256.0f, 151.0f)
                curveTo(198.06f, 151.0f, 151.0f, 198.15f, 151.0f, 256.0f)
                curveTo(151.0f, 313.85f, 198.15f, 361.0f, 256.0f, 361.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(413.5f, 166.0f)
                curveTo(442.49f, 166.0f, 466.0f, 142.49f, 466.0f, 113.5f)
                curveTo(466.0f, 84.51f, 442.49f, 61.0f, 413.5f, 61.0f)
                curveTo(384.51f, 61.0f, 361.0f, 84.51f, 361.0f, 113.5f)
                curveTo(361.0f, 142.49f, 384.51f, 166.0f, 413.5f, 166.0f)
                close()
            }
        }
        .build()
        return _logoIonic!!
    }

private var _logoIonic: ImageVector? = null

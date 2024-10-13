package com.woowla.compose.icon.collections.devicons.devicons.reach

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
import com.woowla.compose.icon.collections.devicons.devicons.ReachGroup

public val ReachGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(65.73f, 21.57f)
                curveTo(74.66f, 30.6f, 83.53f, 39.57f, 92.47f, 48.63f)
                curveTo(92.07f, 49.05f, 91.73f, 49.43f, 91.38f, 49.78f)
                curveTo(81.86f, 59.33f, 72.34f, 68.87f, 62.83f, 78.43f)
                curveTo(52.96f, 88.34f, 43.11f, 98.27f, 33.29f, 108.23f)
                curveTo(32.37f, 109.17f, 31.88f, 109.15f, 30.98f, 108.23f)
                curveTo(25.49f, 102.62f, 19.92f, 97.08f, 14.4f, 91.51f)
                curveTo(10.73f, 87.81f, 7.1f, 84.09f, 3.45f, 80.38f)
                curveTo(3.19f, 80.11f, 2.96f, 79.82f, 2.69f, 79.51f)
                curveTo(22.95f, 59.44f, 43.14f, 39.43f, 63.63f, 19.14f)
                curveTo(64.07f, 19.65f, 64.87f, 20.57f, 65.73f, 21.57f)
                close()
                moveTo(65.73f, 21.57f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(117.64f, 73.34f)
                curveTo(120.5f, 76.14f, 123.3f, 78.89f, 125.8f, 81.34f)
                curveTo(116.49f, 91.0f, 107.33f, 100.52f, 98.22f, 109.97f)
                curveTo(81.46f, 97.64f, 80.79f, 65.8f, 97.11f, 53.04f)
                curveTo(103.94f, 59.79f, 110.75f, 66.53f, 117.64f, 73.34f)
                close()
                moveTo(117.64f, 73.34f)
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null

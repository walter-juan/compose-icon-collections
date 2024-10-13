package com.woowla.compose.icon.collections.devicons.devicons.angularmaterial

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.AngularmaterialGroup

public val AngularmaterialGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(63.93f, 0.66f)
                lineTo(5.25f, 21.66f)
                lineToRelative(8.86f, 77.72f)
                lineToRelative(49.82f, 27.77f)
                lineToRelative(49.89f, -27.77f)
                lineToRelative(9.06f, -77.72f)
                lineTo(63.93f, 0.66f)
                close()
                moveTo(55.1f, 31.62f)
                lineTo(95.84f, 51.19f)
                lineTo(72.77f, 65.27f)
                lineTo(32.28f, 45.7f)
                lineToRelative(22.82f, -14.08f)
                close()
                moveTo(45.33f, 53.11f)
                lineTo(72.82f, 66.41f)
                lineTo(73.06f, 66.27f)
                lineTo(82.71f, 60.37f)
                lineTo(95.84f, 66.68f)
                lineTo(72.77f, 80.69f)
                lineTo(32.28f, 61.12f)
                lineTo(45.33f, 53.11f)
                close()
                moveTo(45.35f, 68.55f)
                lineTo(72.82f, 81.83f)
                lineTo(73.06f, 81.69f)
                lineTo(82.74f, 75.81f)
                lineTo(95.84f, 82.1f)
                lineTo(72.77f, 96.12f)
                lineTo(32.29f, 76.61f)
                lineTo(45.35f, 68.55f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null

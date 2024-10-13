package com.woowla.compose.icon.collections.devicons.devicons.angularmaterial

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
import com.woowla.compose.icon.collections.devicons.devicons.AngularmaterialGroup

public val AngularmaterialGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFffa726)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(63.93f, 0.66f)
                lineTo(5.25f, 21.66f)
                lineToRelative(8.86f, 77.72f)
                lineToRelative(49.82f, 27.77f)
                lineToRelative(49.89f, -27.77f)
                lineToRelative(9.06f, -77.72f)
                close()
                moveTo(63.93f, 0.66f)
            }
            path(fill = SolidColor(Color(0xFFfb8c00)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(63.93f, 0.66f)
                verticalLineToRelative(126.49f)
                lineToRelative(49.89f, -27.77f)
                lineToRelative(9.06f, -77.72f)
                close()
                moveTo(63.93f, 0.66f)
            }
            path(fill = SolidColor(Color(0xFFffe0b2)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(72.8f, 96.69f)
                lineToRelative(-41.55f, -20.02f)
                lineToRelative(23.83f, -14.7f)
                lineTo(96.89f, 82.05f)
                close()
                moveTo(72.8f, 96.69f)
            }
            path(fill = SolidColor(Color(0xFFfff3e0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(72.8f, 81.26f)
                lineToRelative(-41.55f, -20.09f)
                lineToRelative(23.83f, -14.64f)
                lineToRelative(41.81f, 20.09f)
                close()
                moveTo(72.8f, 81.26f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(72.8f, 65.84f)
                lineToRelative(-41.55f, -20.09f)
                lineToRelative(23.83f, -14.7f)
                lineToRelative(41.81f, 20.09f)
                close()
                moveTo(72.8f, 65.84f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null

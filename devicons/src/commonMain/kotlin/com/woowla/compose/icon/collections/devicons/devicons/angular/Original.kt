package com.woowla.compose.icon.collections.devicons.devicons.angular

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
import com.woowla.compose.icon.collections.devicons.devicons.AngularGroup

public val AngularGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFDD0031)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(64.0f, 15.36f)
                lineTo(16.33f, 32.36f)
                lineTo(23.6f, 95.39f)
                lineTo(64.0f, 117.76f)
                lineTo(104.4f, 95.39f)
                lineTo(111.67f, 32.36f)
                close()
                moveTo(64.0f, 15.36f)
            }
            path(fill = SolidColor(Color(0xFFC3002F)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(64.0f, 15.36f)
                lineTo(64.0f, 26.73f)
                lineTo(64.0f, 26.68f)
                lineTo(64.0f, 117.76f)
                lineTo(104.4f, 95.39f)
                lineTo(111.67f, 32.36f)
                close()
                moveTo(64.0f, 15.36f)
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(64.0f, 26.68f)
                lineTo(34.2f, 93.49f)
                lineTo(45.31f, 93.49f)
                lineTo(51.3f, 78.54f)
                lineTo(76.59f, 78.54f)
                lineTo(82.59f, 93.49f)
                lineTo(93.7f, 93.49f)
                close()
                moveTo(72.7f, 69.32f)
                lineTo(55.3f, 69.32f)
                lineTo(64.0f, 48.38f)
                close()
                moveTo(72.7f, 69.32f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null

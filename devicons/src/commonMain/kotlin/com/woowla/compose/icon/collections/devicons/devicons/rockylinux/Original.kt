package com.woowla.compose.icon.collections.devicons.devicons.rockylinux

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.RockylinuxGroup

public val RockylinuxGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF10b982)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.44f, 85.11f)
                curveTo(126.75f, 78.5f, 128.0f, 71.39f, 128.0f, 64.0f)
                curveTo(128.0f, 28.65f, 99.35f, 0.0f, 64.0f, 0.0f)
                curveTo(28.65f, 0.0f, 0.0f, 28.65f, 0.0f, 64.0f)
                curveTo(0.0f, 81.49f, 7.02f, 97.34f, 18.39f, 108.89f)
                lineTo(83.3f, 43.97f)
                close()
                moveTo(112.75f, 105.47f)
                lineTo(83.3f, 76.03f)
                lineTo(37.2f, 122.13f)
                curveTo(45.35f, 125.9f, 54.43f, 128.0f, 64.0f, 128.0f)
                curveTo(83.52f, 128.0f, 101.01f, 119.26f, 112.75f, 105.47f)
                close()
                moveTo(112.75f, 105.47f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null

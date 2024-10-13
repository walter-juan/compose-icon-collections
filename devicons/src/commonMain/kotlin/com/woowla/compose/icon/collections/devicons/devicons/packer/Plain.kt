package com.woowla.compose.icon.collections.devicons.devicons.packer

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.PackerGroup

public val PackerGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF1d94dd)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.8f, 0.0f)
                verticalLineToRelative(18.05f)
                lineTo(72.46f, 35.75f)
                verticalLineToRelative(54.12f)
                lineToRelative(14.43f, 8.27f)
                curveToRelative(8.93f, 5.16f, 16.24f, 2.07f, 16.24f, -6.86f)
                verticalLineTo(51.59f)
                curveToRelative(0.0f, -8.93f, -7.3f, -20.46f, -16.24f, -25.62f)
                lineTo(41.8f, 0.0f)
                close()
                moveTo(24.87f, 15.65f)
                verticalLineToRelative(88.39f)
                lineTo(66.35f, 128.0f)
                verticalLineTo(39.62f)
                lineTo(24.87f, 15.65f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null

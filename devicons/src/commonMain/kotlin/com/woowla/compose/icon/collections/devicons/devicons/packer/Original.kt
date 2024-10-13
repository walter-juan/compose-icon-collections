package com.woowla.compose.icon.collections.devicons.devicons.packer

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
import com.woowla.compose.icon.collections.devicons.devicons.PackerGroup

public val PackerGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF1daeff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(66.35f, 39.62f)
                lineTo(66.35f, 128.0f)
                lineToRelative(-41.48f, -23.96f)
                verticalLineToRelative(-88.39f)
                close()
                moveTo(66.35f, 39.62f)
            }
            path(fill = SolidColor(Color(0xFF1d94dd)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(86.89f, 25.98f)
                lineTo(41.8f, 0.0f)
                verticalLineToRelative(18.04f)
                lineTo(72.46f, 35.75f)
                verticalLineToRelative(54.12f)
                lineToRelative(14.43f, 8.27f)
                curveToRelative(8.93f, 5.16f, 16.24f, 2.07f, 16.24f, -6.86f)
                lineTo(103.13f, 51.59f)
                curveToRelative(0.0f, -8.93f, -7.3f, -20.46f, -16.24f, -25.62f)
                close()
                moveTo(86.89f, 25.98f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null

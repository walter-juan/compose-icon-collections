package com.woowla.compose.icon.collections.devicons.devicons.vault

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.VaultGroup

public val VaultGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFffd814)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 1.95f)
                lineToRelative(63.76f, 124.09f)
                lineTo(128.0f, 1.95f)
                close()
                moveTo(53.84f, 51.21f)
                lineTo(43.68f, 51.21f)
                lineTo(43.68f, 41.06f)
                lineTo(53.84f, 41.06f)
                close()
                moveTo(53.84f, 35.98f)
                lineTo(43.68f, 35.98f)
                lineTo(43.68f, 25.82f)
                lineTo(53.84f, 25.82f)
                close()
                moveTo(69.08f, 66.44f)
                lineTo(58.97f, 66.44f)
                lineTo(58.97f, 56.29f)
                horizontalLineToRelative(10.11f)
                close()
                moveTo(69.08f, 51.21f)
                lineTo(58.97f, 51.21f)
                lineTo(58.97f, 41.06f)
                horizontalLineToRelative(10.11f)
                close()
                moveTo(69.08f, 35.98f)
                lineTo(58.97f, 35.98f)
                lineTo(58.97f, 25.82f)
                horizontalLineToRelative(10.11f)
                close()
                moveTo(84.23f, 51.21f)
                lineTo(74.03f, 51.21f)
                lineTo(74.03f, 41.06f)
                horizontalLineToRelative(10.16f)
                close()
                moveTo(74.03f, 35.98f)
                lineTo(74.03f, 25.82f)
                horizontalLineToRelative(10.16f)
                lineTo(84.19f, 35.98f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null

package com.woowla.compose.icon.collections.devicons.devicons.purescript

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.PurescriptGroup

public val PurescriptGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF111419)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(47.4f, 90.26f)
                horizontalLineToRelative(43.21f)
                lineToRelative(-9.84f, -9.14f)
                horizontalLineToRelative(-43.21f)
                close()
                moveTo(90.61f, 58.23f)
                horizontalLineToRelative(-43.21f)
                lineToRelative(-9.84f, 9.14f)
                horizontalLineToRelative(43.21f)
                close()
                moveTo(47.4f, 44.46f)
                lineTo(90.6f, 44.46f)
                lineToRelative(-9.84f, -9.14f)
                lineTo(37.56f, 35.32f)
                close()
                moveTo(33.01f, 53.51f)
                lineTo(26.51f, 47.05f)
                lineTo(2.41f, 71.01f)
                arcToRelative(4.53f, 4.53f, 0.0f, false, false, -1.34f, 3.23f)
                curveToRelative(0.0f, 1.22f, 0.48f, 2.37f, 1.34f, 3.23f)
                lineToRelative(24.1f, 23.97f)
                lineToRelative(6.5f, -6.46f)
                lineToRelative(-20.85f, -20.74f)
                close()
                moveTo(125.76f, 48.12f)
                lineTo(101.66f, 24.14f)
                lineTo(95.17f, 30.6f)
                lineTo(116.01f, 51.34f)
                lineTo(95.17f, 72.08f)
                lineTo(101.66f, 78.54f)
                lineTo(125.76f, 54.58f)
                arcToRelative(4.56f, 4.56f, 0.0f, false, false, 1.35f, -3.24f)
                arcToRelative(4.56f, 4.56f, 0.0f, false, false, -1.35f, -3.23f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null

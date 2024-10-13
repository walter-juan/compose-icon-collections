package com.woowla.compose.icon.collections.devicons.devicons.modx

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.ModxGroup

public val ModxGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF00decc)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(123.9f, 13.9f)
                horizontalLineTo(64.6f)
                lineToRelative(-6.4f, 10.5f)
                lineTo(100.9f, 51.0f)
                close()
                moveTo(99.3f, 53.4f)
                lineTo(17.1f, 2.1f)
                verticalLineToRelative(59.3f)
                lineToRelative(12.8f, 8.0f)
                close()
                moveTo(74.0f, 102.7f)
                lineToRelative(36.9f, 23.2f)
                verticalLineTo(66.6f)
                lineToRelative(-10.3f, -6.5f)
                close()
                moveTo(28.7f, 74.6f)
                lineTo(4.1f, 114.1f)
                horizontalLineToRelative(59.3f)
                lineToRelative(34.7f, -55.5f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null

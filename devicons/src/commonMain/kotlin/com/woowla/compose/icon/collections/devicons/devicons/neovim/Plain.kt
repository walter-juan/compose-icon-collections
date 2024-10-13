package com.woowla.compose.icon.collections.devicons.devicons.neovim

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.NeovimGroup

public val NeovimGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.96f, 0.0f)
                verticalLineToRelative(70.44f)
                lineToRelative(22.91f, 34.44f)
                lineToRelative(4.66f, -5.06f)
                lineToRelative(-0.19f, -72.31f)
                close()
                moveTo(38.97f, 0.01f)
                lineTo(19.28f, 19.9f)
                lineToRelative(70.26f, 106.92f)
                lineToRelative(19.65f, -19.65f)
                close()
                moveTo(16.61f, 21.85f)
                lineToRelative(-5.14f, 5.19f)
                verticalLineToRelative(72.99f)
                lineTo(39.5f, 128.0f)
                lineTo(39.5f, 55.93f)
                close()
                moveTo(16.46f, 23.45f)
                lineTo(38.48f, 56.24f)
                verticalLineToRelative(69.32f)
                lineTo(12.49f, 99.62f)
                lineTo(12.49f, 27.46f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null

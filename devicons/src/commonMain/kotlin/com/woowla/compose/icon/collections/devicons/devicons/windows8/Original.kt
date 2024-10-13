package com.woowla.compose.icon.collections.devicons.devicons.windows8

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.Windows8Group

public val Windows8Group.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF00ADEF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(126.0f, 1.64f)
                lineToRelative(-67.0f, 9.83f)
                verticalLineToRelative(49.83f)
                lineToRelative(67.0f, -0.53f)
                close()
                moveTo(1.65f, 66.71f)
                lineToRelative(0.0f, 42.4f)
                lineToRelative(50.79f, 6.98f)
                lineToRelative(-0.04f, -49.06f)
                close()
                moveTo(58.47f, 67.39f)
                lineToRelative(0.09f, 49.47f)
                lineToRelative(67.38f, 9.51f)
                lineToRelative(0.02f, -58.86f)
                close()
                moveTo(1.61f, 19.3f)
                lineToRelative(0.05f, 42.38f)
                lineToRelative(50.79f, -0.29f)
                lineToRelative(-0.02f, -49.02f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null

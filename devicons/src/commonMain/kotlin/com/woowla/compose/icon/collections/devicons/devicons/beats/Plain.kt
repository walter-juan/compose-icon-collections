package com.woowla.compose.icon.collections.devicons.devicons.beats

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.BeatsGroup

public val BeatsGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                verticalLineToRelative(80.0f)
                horizontalLineToRelative(44.0f)
                curveToRelative(17.08f, 0.0f, 31.61f, -10.72f, 37.35f, -25.78f)
                arcTo(39.85f, 39.85f, 0.0f, false, false, 96.0f, 40.0f)
                curveTo(96.0f, 17.91f, 78.09f, 0.0f, 56.0f, 0.0f)
                close()
                moveTo(72.0f, 48.0f)
                curveToRelative(2.97f, 0.0f, 5.93f, 0.34f, 8.83f, 1.0f)
                arcTo(39.94f, 39.94f, 0.0f, false, false, 72.0f, 48.0f)
                close()
                moveTo(81.09f, 49.06f)
                close()
                moveTo(85.59f, 50.41f)
                close()
                moveTo(102.81f, 62.49f)
                curveTo(94.4f, 79.91f, 76.61f, 92.0f, 56.0f, 92.0f)
                lineTo(12.0f, 92.0f)
                verticalLineToRelative(36.0f)
                horizontalLineToRelative(60.0f)
                curveToRelative(22.09f, 0.0f, 40.0f, -17.91f, 40.0f, -40.0f)
                arcToRelative(39.83f, 39.83f, 0.0f, false, false, -9.19f, -25.51f)
                close()
                moveTo(102.81f, 62.49f)
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null

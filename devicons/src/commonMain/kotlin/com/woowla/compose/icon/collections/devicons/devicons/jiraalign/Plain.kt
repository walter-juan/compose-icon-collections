package com.woowla.compose.icon.collections.devicons.devicons.jiraalign

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.JiraalignGroup

public val JiraalignGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.62f, 0.5f)
                curveToRelative(0.0f, 23.91f, 19.47f, 43.42f, 43.34f, 43.42f)
                horizontalLineToRelative(40.09f)
                verticalLineToRelative(40.4f)
                horizontalLineToRelative(43.34f)
                lineTo(127.38f, 7.7f)
                curveToRelative(0.0f, -3.72f, -3.01f, -6.97f, -6.72f, -6.97f)
                close()
                moveTo(43.95f, 43.91f)
                lineTo(0.61f, 43.91f)
                verticalLineToRelative(76.63f)
                curveToRelative(0.0f, 3.71f, 3.02f, 6.97f, 6.72f, 6.97f)
                horizontalLineToRelative(119.82f)
                curveToRelative(0.0f, -23.91f, -19.47f, -43.19f, -43.34f, -43.19f)
                lineTo(43.95f, 84.32f)
                close()
                moveTo(43.95f, 43.91f)
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null

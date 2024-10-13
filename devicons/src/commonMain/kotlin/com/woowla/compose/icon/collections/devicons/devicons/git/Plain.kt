package com.woowla.compose.icon.collections.devicons.devicons.git

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.GitGroup

public val GitGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFF34F29)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.74f, 58.38f)
                lineTo(69.63f, 3.26f)
                curveToRelative(-3.17f, -3.17f, -8.32f, -3.17f, -11.5f, 0.0f)
                lineTo(46.69f, 14.71f)
                lineToRelative(14.52f, 14.52f)
                curveToRelative(3.38f, -1.14f, 7.24f, -0.38f, 9.93f, 2.31f)
                arcToRelative(9.66f, 9.66f, 0.0f, false, true, 2.29f, 9.99f)
                lineTo(87.42f, 55.53f)
                curveToRelative(3.38f, -1.17f, 7.29f, -0.41f, 9.99f, 2.3f)
                curveToRelative(3.78f, 3.78f, 3.78f, 9.9f, 0.0f, 13.68f)
                arcToRelative(9.67f, 9.67f, 0.0f, false, true, -13.68f, 0.0f)
                arcToRelative(9.68f, 9.68f, 0.0f, false, true, -2.11f, -10.52f)
                lineTo(68.58f, 47.93f)
                lineToRelative(-0.0f, 34.34f)
                arcToRelative(9.71f, 9.71f, 0.0f, false, true, 2.56f, 1.83f)
                curveToRelative(3.78f, 3.78f, 3.78f, 9.9f, 0.0f, 13.68f)
                curveToRelative(-3.78f, 3.78f, -9.9f, 3.78f, -13.68f, 0.0f)
                curveToRelative(-3.78f, -3.78f, -4.09f, -9.9f, -0.31f, -13.68f)
                curveToRelative(0.93f, -0.93f, 1.86f, -1.64f, 2.86f, -2.11f)
                verticalLineTo(47.33f)
                curveToRelative(-1.0f, -0.47f, -1.92f, -1.17f, -2.86f, -2.11f)
                curveToRelative(-2.86f, -2.86f, -3.4f, -7.06f, -1.93f, -10.58f)
                lineTo(40.98f, 20.33f)
                lineTo(3.23f, 58.12f)
                curveToRelative(-3.17f, 3.18f, -3.15f, 8.32f, 0.02f, 11.5f)
                lineToRelative(55.13f, 55.11f)
                curveToRelative(3.17f, 3.17f, 8.32f, 3.17f, 11.5f, 0.0f)
                lineToRelative(54.86f, -54.86f)
                curveToRelative(3.17f, -3.18f, 3.18f, -8.33f, 0.0f, -11.5f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null

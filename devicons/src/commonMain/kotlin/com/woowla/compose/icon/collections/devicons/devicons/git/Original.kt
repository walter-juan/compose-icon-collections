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

public val GitGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFF34F29)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.74f, 58.38f)
                lineTo(69.62f, 3.26f)
                curveToRelative(-3.17f, -3.17f, -8.32f, -3.17f, -11.5f, 0.0f)
                lineTo(46.68f, 14.71f)
                lineToRelative(14.52f, 14.52f)
                curveToRelative(3.38f, -1.14f, 7.24f, -0.38f, 9.93f, 2.31f)
                curveToRelative(2.7f, 2.71f, 3.46f, 6.61f, 2.29f, 9.99f)
                lineToRelative(13.99f, 13.99f)
                curveToRelative(3.38f, -1.17f, 7.29f, -0.41f, 9.99f, 2.3f)
                curveToRelative(3.78f, 3.78f, 3.78f, 9.9f, 0.0f, 13.68f)
                arcToRelative(9.67f, 9.67f, 0.0f, false, true, -13.68f, 0.0f)
                arcToRelative(9.68f, 9.68f, 0.0f, false, true, -2.11f, -10.52f)
                lineTo(68.57f, 47.93f)
                lineToRelative(-0.0f, 34.34f)
                arcToRelative(9.71f, 9.71f, 0.0f, false, true, 2.56f, 1.83f)
                curveToRelative(3.78f, 3.78f, 3.78f, 9.9f, 0.0f, 13.68f)
                curveToRelative(-3.78f, 3.78f, -9.9f, 3.78f, -13.68f, 0.0f)
                curveToRelative(-3.78f, -3.78f, -3.78f, -9.9f, 0.0f, -13.68f)
                arcToRelative(9.65f, 9.65f, 0.0f, false, true, 3.17f, -2.11f)
                verticalLineTo(47.33f)
                arcToRelative(9.58f, 9.58f, 0.0f, false, true, -3.17f, -2.11f)
                curveToRelative(-2.86f, -2.86f, -3.55f, -7.06f, -2.08f, -10.58f)
                lineTo(41.06f, 20.33f)
                lineTo(3.26f, 58.12f)
                arcToRelative(8.13f, 8.13f, 0.0f, false, false, 0.0f, 11.5f)
                lineToRelative(55.12f, 55.11f)
                curveToRelative(3.17f, 3.17f, 8.32f, 3.17f, 11.5f, 0.0f)
                lineToRelative(54.86f, -54.86f)
                arcToRelative(8.14f, 8.14f, 0.0f, false, false, -0.0f, -11.5f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null

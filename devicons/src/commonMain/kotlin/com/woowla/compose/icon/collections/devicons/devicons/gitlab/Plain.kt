package com.woowla.compose.icon.collections.devicons.devicons.gitlab

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.GitlabGroup

public val GitlabGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFE24329)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(124.76f, 51.4f)
                lineToRelative(-0.18f, -0.45f)
                lineToRelative(-17.11f, -44.65f)
                arcToRelative(4.46f, 4.46f, 0.0f, false, false, -1.76f, -2.12f)
                arcToRelative(4.58f, 4.58f, 0.0f, false, false, -5.24f, 0.28f)
                arcToRelative(4.58f, 4.58f, 0.0f, false, false, -1.52f, 2.3f)
                lineTo(87.41f, 42.1f)
                horizontalLineTo(40.63f)
                lineTo(29.08f, 6.76f)
                arcToRelative(4.49f, 4.49f, 0.0f, false, false, -1.52f, -2.31f)
                arcToRelative(4.58f, 4.58f, 0.0f, false, false, -5.24f, -0.28f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -1.76f, 2.12f)
                lineTo(3.42f, 50.92f)
                lineToRelative(-0.17f, 0.45f)
                curveToRelative(-5.06f, 13.22f, -0.76f, 28.19f, 10.54f, 36.72f)
                lineToRelative(0.06f, 0.05f)
                lineToRelative(0.16f, 0.11f)
                lineToRelative(26.06f, 19.52f)
                lineToRelative(12.89f, 9.76f)
                lineToRelative(7.85f, 5.93f)
                arcToRelative(5.28f, 5.28f, 0.0f, false, false, 6.39f, 0.0f)
                lineToRelative(7.85f, -5.93f)
                lineToRelative(12.89f, -9.76f)
                lineToRelative(26.22f, -19.63f)
                lineToRelative(0.06f, -0.05f)
                curveToRelative(11.27f, -8.53f, 15.56f, -23.47f, 10.52f, -36.68f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null

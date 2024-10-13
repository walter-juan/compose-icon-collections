package com.woowla.compose.icon.collections.devicons.devicons.nuxtjs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.NuxtjsGroup

public val NuxtjsGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(39.27f, 108.97f)
                lineToRelative(-0.28f, -0.57f)
                curveToRelative(-0.57f, -1.13f, -0.57f, -2.27f, -0.28f, -3.69f)
                lineTo(8.06f, 104.71f)
                lineToRelative(45.4f, -80.58f)
                lineToRelative(19.01f, 34.33f)
                lineToRelative(6.24f, -4.54f)
                lineToRelative(-19.01f, -34.33f)
                curveToRelative(-0.28f, -0.57f, -2.55f, -3.97f, -6.24f, -3.97f)
                curveToRelative(-1.7f, 0.0f, -4.26f, 0.57f, -6.24f, 4.26f)
                lineTo(1.25f, 101.31f)
                curveToRelative(-0.28f, 0.85f, -2.27f, 4.54f, -0.57f, 7.66f)
                curveToRelative(1.13f, 1.7f, 2.84f, 3.4f, 6.81f, 3.4f)
                horizontalLineToRelative(38.59f)
                curveToRelative(-3.97f, 0.0f, -5.96f, -1.7f, -6.81f, -3.4f)
                close()
                moveTo(126.65f, 101.59f)
                lineToRelative(-36.88f, -66.39f)
                curveToRelative(-0.57f, -0.57f, -2.55f, -4.26f, -6.24f, -4.26f)
                curveToRelative(-1.7f, 0.0f, -4.26f, 0.85f, -6.24f, 4.26f)
                lineToRelative(-4.82f, 7.94f)
                verticalLineToRelative(15.32f)
                lineToRelative(11.06f, -19.01f)
                lineToRelative(36.6f, 65.26f)
                horizontalLineToRelative(-13.9f)
                arcToRelative(6.53f, 6.53f, 0.0f, false, true, -0.57f, 3.97f)
                lineToRelative(-0.28f, 0.28f)
                curveToRelative(-1.7f, 3.12f, -5.96f, 3.4f, -6.53f, 3.4f)
                horizontalLineToRelative(21.56f)
                curveToRelative(0.85f, 0.0f, 4.82f, -0.28f, 6.81f, -3.4f)
                curveToRelative(0.85f, -1.42f, 1.42f, -3.97f, -0.57f, -7.38f)
                close()
                moveTo(106.51f, 108.97f)
                verticalLineToRelative(-0.28f)
                lineToRelative(0.28f, -0.57f)
                curveToRelative(0.28f, -1.13f, 0.57f, -2.27f, 0.28f, -3.4f)
                lineToRelative(-1.13f, -3.4f)
                lineTo(77.0f, 50.81f)
                lineToRelative(-4.26f, -7.66f)
                horizontalLineToRelative(-0.28f)
                lineToRelative(-4.26f, 7.66f)
                lineToRelative(-28.94f, 50.5f)
                lineToRelative(-1.13f, 3.4f)
                arcToRelative(6.81f, 6.81f, 0.0f, false, false, 0.57f, 4.26f)
                curveToRelative(1.13f, 1.7f, 2.84f, 3.4f, 6.81f, 3.4f)
                horizontalLineToRelative(53.91f)
                curveToRelative(0.85f, 0.0f, 5.11f, -0.28f, 7.09f, -3.4f)
                close()
                moveTo(72.46f, 58.47f)
                lineToRelative(26.39f, 46.25f)
                lineTo(46.08f, 104.71f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null

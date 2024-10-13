package com.woowla.compose.icon.collections.devicons.devicons.chrome

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.ChromeGroup

public val ChromeGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFCE4E4E)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(63.62f, 64.47f)
                moveToRelative(-22.63f, 0.0f)
                arcToRelative(22.63f, 22.63f, 0.0f, true, true, 45.27f, 0.0f)
                arcToRelative(22.63f, 22.63f, 0.0f, true, true, -45.27f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFFCE4E4E)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 37.0f)
                horizontalLineToRelative(54.19f)
                curveToRelative(-9.94f, -20.0f, -30.64f, -33.63f, -54.56f, -33.63f)
                curveToRelative(-19.37f, 0.0f, -36.62f, 9.17f, -47.76f, 23.27f)
                lineToRelative(21.12f, 35.75f)
                curveTo(38.01f, 48.48f, 48.0f, 37.07f, 64.0f, 37.0f)
                close()
                moveTo(120.13f, 41.0f)
                lineTo(78.29f, 41.0f)
                curveToRelative(7.4f, 6.0f, 12.3f, 13.88f, 12.3f, 23.37f)
                curveToRelative(0.0f, 4.66f, -1.18f, 8.63f, -3.27f, 13.63f)
                horizontalLineToRelative(0.01f)
                lineToRelative(-27.76f, 47.51f)
                curveToRelative(1.34f, 0.09f, 2.68f, -0.02f, 4.04f, -0.02f)
                curveToRelative(33.61f, 0.0f, 60.85f, -27.75f, 60.85f, -61.35f)
                curveToRelative(0.0f, -8.0f, -1.55f, -15.13f, -4.35f, -23.13f)
                close()
                moveTo(63.62f, 91.44f)
                curveToRelative(-11.67f, 0.0f, -21.61f, -7.41f, -25.37f, -17.79f)
                lineTo(13.07f, 30.58f)
                curveTo(6.57f, 40.27f, 2.77f, 51.93f, 2.77f, 64.47f)
                curveToRelative(0.0f, 30.63f, 22.63f, 55.97f, 52.09f, 60.22f)
                lineToRelative(21.0f, -36.18f)
                arcToRelative(26.85f, 26.85f, 0.0f, false, true, -12.23f, 2.93f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null

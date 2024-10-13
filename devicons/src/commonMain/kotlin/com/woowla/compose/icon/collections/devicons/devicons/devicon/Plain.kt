package com.woowla.compose.icon.collections.devicons.devicons.devicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.DeviconGroup

public val DeviconGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF60be86)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 7.83f)
                lineTo(4.77f, 7.83f)
                lineToRelative(10.18f, 87.3f)
                lineToRelative(49.0f, 25.0f)
                horizontalLineToRelative(0.06f)
                lineToRelative(49.07f, -25.0f)
                lineToRelative(10.15f, -87.3f)
                close()
                moveTo(106.77f, 62.69f)
                curveToRelative(0.0f, 0.88f, 0.0f, 1.67f, -0.77f, 2.0f)
                lineTo(73.25f, 80.44f)
                lineToRelative(-2.42f, 1.13f)
                lineToRelative(-0.27f, -3.15f)
                verticalLineToRelative(-6.19f)
                lineToRelative(0.24f, -1.57f)
                lineToRelative(1.09f, -0.47f)
                lineToRelative(23.18f, -10.38f)
                lineToRelative(-21.54f, -9.6f)
                lineToRelative(-9.18f, 18.13f)
                lineToRelative(-5.45f, 10.53f)
                lineToRelative(-1.22f, 2.27f)
                lineToRelative(-2.05f, -0.9f)
                lineTo(22.0f, 64.71f)
                arcToRelative(2.42f, 2.42f, 0.0f, false, true, -1.45f, -2.0f)
                verticalLineToRelative(-5.8f)
                arcToRelative(2.39f, 2.39f, 0.0f, false, true, 1.42f, -2.0f)
                lineToRelative(34.0f, -15.73f)
                lineToRelative(3.21f, -1.44f)
                verticalLineToRelative(9.66f)
                lineToRelative(0.24f, 1.34f)
                lineToRelative(-1.56f, 0.7f)
                lineToRelative(-23.41f, 10.35f)
                lineToRelative(21.85f, 9.63f)
                lineToRelative(8.05f, -16.0f)
                lineToRelative(6.21f, -12.65f)
                lineToRelative(1.13f, -2.28f)
                lineToRelative(1.81f, 0.91f)
                lineTo(106.0f, 54.89f)
                curveToRelative(0.73f, 0.35f, 0.76f, 1.14f, 0.76f, 2.0f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null

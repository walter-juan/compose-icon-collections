package com.woowla.compose.icon.collections.devicons.devicons.django

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
import com.woowla.compose.icon.collections.devicons.devicons.DjangoGroup

public val DjangoGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF092e20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(59.45f, 0.0f)
                horizontalLineToRelative(20.93f)
                verticalLineToRelative(96.88f)
                curveToRelative(-10.74f, 2.04f, -18.62f, 2.86f, -27.18f, 2.86f)
                curveToRelative(-25.55f, -0.0f, -38.87f, -11.55f, -38.87f, -33.71f)
                curveToRelative(0.0f, -21.34f, 14.14f, -35.2f, 36.01f, -35.2f)
                curveToRelative(3.4f, 0.0f, 5.98f, 0.27f, 9.11f, 1.09f)
                close()
                moveTo(59.45f, 48.76f)
                curveToRelative(-2.45f, -0.81f, -4.49f, -1.09f, -7.07f, -1.09f)
                curveToRelative(-10.6f, 0.0f, -16.72f, 6.52f, -16.72f, 17.94f)
                curveToRelative(0.0f, 11.15f, 5.84f, 17.26f, 16.58f, 17.26f)
                curveToRelative(2.31f, 0.0f, 4.21f, -0.14f, 7.2f, -0.54f)
                close()
            }
            path(fill = SolidColor(Color(0xFF092e20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(113.67f, 32.32f)
                verticalLineTo(80.84f)
                curveToRelative(0.0f, 16.72f, -1.22f, 24.74f, -4.89f, 31.67f)
                curveToRelative(-3.4f, 6.66f, -7.88f, 10.87f, -17.12f, 15.49f)
                lineToRelative(-19.43f, -9.24f)
                curveToRelative(9.24f, -4.35f, 13.73f, -8.15f, 16.58f, -14.0f)
                curveToRelative(2.99f, -5.98f, 3.94f, -12.91f, 3.94f, -31.12f)
                verticalLineTo(32.32f)
                close()
                moveTo(92.74f, 0.11f)
                horizontalLineToRelative(20.93f)
                verticalLineToRelative(21.47f)
                horizontalLineToRelative(-20.93f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null

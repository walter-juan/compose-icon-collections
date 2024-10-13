package com.woowla.compose.icon.collections.devicons.devicons.scala

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.ScalaGroup

public val ScalaGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF390d09)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.41f, 110.57f)
                verticalLineTo(95.08f)
                lineToRelative(11.84f, -0.47f)
                curveToRelative(12.31f, -0.47f, 21.45f, -1.49f, 34.85f, -3.79f)
                curveToRelative(15.23f, -2.64f, 30.25f, -7.38f, 31.8f, -10.08f)
                curveToRelative(0.41f, -0.68f, 0.68f, 4.53f, 0.68f, 14.62f)
                verticalLineToRelative(15.7f)
                lineToRelative(-1.76f, 1.35f)
                curveToRelative(-1.89f, 1.49f, -9.2f, 3.99f, -17.52f, 6.09f)
                curveTo(72.3f, 121.74f, 40.57f, 126.0f, 29.74f, 126.0f)
                horizontalLineToRelative(-4.33f)
                close()
                moveTo(25.41f, 71.33f)
                verticalLineTo(55.83f)
                lineToRelative(11.84f, -0.41f)
                curveToRelative(13.13f, -0.54f, 23.34f, -1.69f, 36.88f, -4.2f)
                curveToRelative(15.16f, -2.84f, 28.96f, -7.44f, 29.98f, -9.95f)
                curveToRelative(0.2f, -0.47f, 0.41f, 6.09f, 0.41f, 14.62f)
                curveToRelative(0.07f, 13.53f, -0.07f, 15.7f, -1.08f, 16.78f)
                curveToRelative(-2.37f, 2.64f, -20.64f, 7.38f, -39.45f, 10.29f)
                curveToRelative(-11.44f, 1.76f, -30.38f, 3.79f, -35.66f, 3.79f)
                horizontalLineToRelative(-2.91f)
                close()
                moveTo(25.41f, 32.35f)
                verticalLineTo(17.19f)
                lineToRelative(2.1f, -0.41f)
                curveToRelative(1.15f, -0.2f, 3.99f, -0.41f, 6.29f, -0.41f)
                curveToRelative(11.37f, 0.0f, 38.37f, -3.72f, 51.63f, -7.11f)
                curveToRelative(9.27f, -2.44f, 15.7f, -4.87f, 17.93f, -6.9f)
                curveToRelative(1.15f, -1.01f, 1.22f, -0.41f, 1.22f, 14.48f)
                curveToRelative(0.0f, 14.55f, -0.07f, 15.63f, -1.28f, 16.71f)
                curveToRelative(-1.83f, 1.69f, -14.35f, 5.55f, -24.09f, 7.51f)
                curveToRelative(-15.77f, 3.11f, -41.95f, 6.43f, -50.88f, 6.43f)
                horizontalLineToRelative(-2.91f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null

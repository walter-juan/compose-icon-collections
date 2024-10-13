package com.woowla.compose.icon.collections.devicons.devicons.lodash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.LodashGroup

public val LodashGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 6.21f)
                verticalLineToRelative(88.83f)
                horizontalLineToRelative(59.03f)
                verticalLineToRelative(-9.75f)
                lineTo(11.91f, 85.28f)
                lineTo(11.91f, 6.21f)
                close()
                moveTo(96.19f, 27.55f)
                verticalLineToRelative(0.1f)
                curveToRelative(-12.19f, -0.16f, -24.38f, 7.58f, -28.17f, 19.34f)
                curveToRelative(-5.41f, 13.54f, -2.93f, 30.55f, 7.69f, 40.89f)
                curveToRelative(10.29f, 8.56f, 25.78f, 9.21f, 37.37f, 3.14f)
                curveToRelative(7.97f, -4.23f, 13.0f, -12.62f, 14.09f, -21.45f)
                curveToRelative(1.41f, -9.21f, 0.71f, -19.28f, -3.79f, -27.62f)
                curveToRelative(-5.31f, -8.88f, -15.71f, -14.62f, -26.0f, -14.25f)
                close()
                moveTo(97.27f, 37.08f)
                curveToRelative(8.94f, 0.0f, 16.95f, 6.82f, 18.41f, 15.6f)
                curveToRelative(2.71f, 9.91f, 1.09f, 22.04f, -7.04f, 29.03f)
                curveToRelative(-7.58f, 6.17f, -19.77f, 5.31f, -26.0f, -2.33f)
                curveToRelative(-7.58f, -8.13f, -7.58f, -20.58f, -3.68f, -30.33f)
                curveToRelative(2.71f, -7.04f, 9.91f, -12.08f, 17.49f, -11.92f)
                horizontalLineToRelative(0.98f)
                close()
                moveTo(0.0f, 107.65f)
                verticalLineToRelative(13.54f)
                horizontalLineToRelative(127.82f)
                verticalLineToRelative(-13.54f)
                close()
                moveTo(0.0f, 107.65f)
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null

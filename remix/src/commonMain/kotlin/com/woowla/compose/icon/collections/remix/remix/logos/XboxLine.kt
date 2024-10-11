package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.XboxLine: ImageVector
    get() {
        if (_xboxLine != null) {
            return _xboxLine!!
        }
        _xboxLine = Builder(name = "XboxLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.798f, 15.485f)
                curveTo(5.922f, 12.965f, 7.998f, 10.046f, 9.285f, 8.523f)
                curveTo(8.037f, 7.277f, 7.123f, 6.592f, 6.467f, 6.223f)
                curveTo(4.947f, 7.679f, 4.001f, 9.729f, 4.001f, 12.0f)
                curveTo(4.001f, 13.249f, 4.287f, 14.432f, 4.798f, 15.485f)
                close()
                moveTo(8.849f, 4.645f)
                curveTo(10.449f, 5.051f, 12.001f, 5.959f, 12.001f, 5.959f)
                verticalLineTo(5.954f)
                curveTo(12.001f, 5.954f, 13.553f, 5.05f, 15.152f, 4.645f)
                curveTo(14.185f, 4.23f, 13.12f, 4.0f, 12.001f, 4.0f)
                curveTo(10.882f, 4.0f, 9.816f, 4.23f, 8.849f, 4.645f)
                close()
                moveTo(17.535f, 6.223f)
                curveTo(16.88f, 6.592f, 15.967f, 7.278f, 14.719f, 8.523f)
                curveTo(16.006f, 10.046f, 18.081f, 12.964f, 19.205f, 15.484f)
                curveTo(19.715f, 14.431f, 20.001f, 13.249f, 20.001f, 12.0f)
                curveTo(20.001f, 9.729f, 19.055f, 7.679f, 17.535f, 6.223f)
                close()
                moveTo(17.943f, 17.357f)
                curveTo(16.54f, 15.12f, 13.853f, 12.412f, 12.001f, 11.013f)
                curveTo(10.15f, 12.412f, 7.462f, 15.121f, 6.06f, 17.358f)
                curveTo(7.524f, 18.98f, 9.643f, 20.0f, 12.001f, 20.0f)
                curveTo(14.359f, 20.0f, 16.479f, 18.98f, 17.943f, 17.357f)
                close()
                moveTo(12.001f, 22.0f)
                curveTo(6.478f, 22.0f, 2.001f, 17.523f, 2.001f, 12.0f)
                curveTo(2.001f, 6.477f, 6.478f, 2.0f, 12.001f, 2.0f)
                curveTo(17.524f, 2.0f, 22.001f, 6.477f, 22.001f, 12.0f)
                curveTo(22.001f, 17.523f, 17.524f, 22.0f, 12.001f, 22.0f)
                close()
            }
        }
        .build()
        return _xboxLine!!
    }

private var _xboxLine: ImageVector? = null

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

public val LogosGroup.XboxFill: ImageVector
    get() {
        if (_xboxFill != null) {
            return _xboxFill!!
        }
        _xboxFill = Builder(name = "XboxFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.419f, 19.528f)
                curveTo(7.177f, 21.067f, 9.482f, 22.0f, 12.001f, 22.0f)
                curveTo(14.523f, 22.0f, 16.825f, 21.067f, 18.586f, 19.528f)
                curveTo(20.15f, 17.934f, 14.989f, 12.27f, 12.001f, 10.013f)
                curveTo(9.016f, 12.27f, 3.852f, 17.934f, 5.419f, 19.528f)
                close()
                moveTo(14.719f, 7.523f)
                curveTo(16.803f, 9.99f, 20.956f, 16.117f, 19.783f, 18.282f)
                curveTo(21.169f, 16.567f, 22.001f, 14.384f, 22.001f, 12.003f)
                curveTo(22.001f, 9.22f, 20.864f, 6.702f, 19.026f, 4.89f)
                curveTo(19.026f, 4.89f, 19.003f, 4.872f, 18.958f, 4.855f)
                curveTo(18.905f, 4.837f, 18.831f, 4.818f, 18.723f, 4.818f)
                curveTo(18.23f, 4.818f, 17.069f, 5.179f, 14.719f, 7.523f)
                close()
                moveTo(5.046f, 4.855f)
                curveTo(4.998f, 4.872f, 4.978f, 4.889f, 4.974f, 4.89f)
                curveTo(3.138f, 6.702f, 2.001f, 9.22f, 2.001f, 12.003f)
                curveTo(2.001f, 14.382f, 2.833f, 16.564f, 4.218f, 18.281f)
                curveTo(3.051f, 16.11f, 7.201f, 9.988f, 9.285f, 7.523f)
                curveTo(6.935f, 5.178f, 5.772f, 4.818f, 5.28f, 4.818f)
                curveTo(5.171f, 4.818f, 5.094f, 4.836f, 5.046f, 4.857f)
                verticalLineTo(4.855f)
                close()
                moveTo(12.001f, 4.959f)
                curveTo(12.001f, 4.959f, 9.547f, 3.523f, 7.63f, 3.455f)
                curveTo(6.878f, 3.428f, 6.418f, 3.701f, 6.363f, 3.737f)
                curveTo(8.15f, 2.538f, 10.05f, 2.0f, 11.988f, 2.0f)
                horizontalLineTo(12.001f)
                curveTo(13.946f, 2.0f, 15.839f, 2.538f, 17.639f, 3.737f)
                curveTo(17.583f, 3.699f, 17.127f, 3.428f, 16.373f, 3.455f)
                curveTo(14.456f, 3.523f, 12.001f, 4.954f, 12.001f, 4.954f)
                verticalLineTo(4.959f)
                close()
            }
        }
        .build()
        return _xboxFill!!
    }

private var _xboxFill: ImageVector? = null

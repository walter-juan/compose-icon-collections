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

public val LogosGroup.LinkedinFill: ImageVector
    get() {
        if (_linkedinFill != null) {
            return _linkedinFill!!
        }
        _linkedinFill = Builder(name = "LinkedinFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.94f, 5.0f)
                curveTo(6.94f, 5.814f, 6.446f, 6.547f, 5.691f, 6.853f)
                curveTo(4.937f, 7.158f, 4.072f, 6.976f, 3.505f, 6.392f)
                curveTo(2.938f, 5.807f, 2.782f, 4.937f, 3.111f, 4.192f)
                curveTo(3.439f, 3.447f, 4.187f, 2.976f, 5.0f, 3.0f)
                curveTo(6.082f, 3.032f, 6.941f, 3.918f, 6.94f, 5.0f)
                close()
                moveTo(7.0f, 8.48f)
                horizontalLineTo(3.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.48f)
                close()
                moveTo(13.321f, 8.48f)
                horizontalLineTo(9.34f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.281f)
                verticalLineTo(14.43f)
                curveTo(13.281f, 10.77f, 18.051f, 10.43f, 18.051f, 14.43f)
                verticalLineTo(21.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.07f)
                curveTo(22.0f, 6.9f, 14.941f, 7.13f, 13.281f, 10.16f)
                lineTo(13.321f, 8.48f)
                close()
            }
        }
        .build()
        return _linkedinFill!!
    }

private var _linkedinFill: ImageVector? = null

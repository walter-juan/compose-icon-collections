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

public val LogosGroup.GatsbyLine: ImageVector
    get() {
        if (_gatsbyLine != null) {
            return _gatsbyLine!!
        }
        _gatsbyLine = Builder(name = "GatsbyLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.752f, 21.997f)
                curveTo(6.531f, 21.869f, 2.302f, 17.74f, 2.016f, 12.559f)
                lineTo(2.004f, 12.246f)
                lineTo(11.752f, 21.997f)
                close()
                moveTo(12.001f, 2.0f)
                curveTo(15.39f, 2.0f, 18.385f, 3.686f, 20.194f, 6.265f)
                lineTo(18.556f, 7.413f)
                curveTo(17.109f, 5.349f, 14.713f, 4.0f, 12.001f, 4.0f)
                curveTo(8.598f, 4.0f, 5.691f, 6.125f, 4.535f, 9.12f)
                lineTo(14.881f, 19.466f)
                curveTo(17.268f, 18.545f, 19.103f, 16.511f, 19.749f, 14.0f)
                lineTo(15.501f, 14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(22.001f)
                curveTo(22.001f, 16.726f, 18.722f, 20.687f, 14.316f, 21.731f)
                lineTo(2.27f, 9.685f)
                curveTo(3.314f, 5.279f, 7.275f, 2.0f, 12.001f, 2.0f)
                close()
            }
        }
        .build()
        return _gatsbyLine!!
    }

private var _gatsbyLine: ImageVector? = null

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

public val LogosGroup.ProductHuntFill: ImageVector
    get() {
        if (_productHuntFill != null) {
            return _productHuntFill!!
        }
        _productHuntFill = Builder(name = "ProductHuntFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 22.0f)
                curveTo(6.478f, 22.0f, 2.001f, 17.523f, 2.001f, 12.0f)
                curveTo(2.001f, 6.477f, 6.478f, 2.0f, 12.001f, 2.0f)
                curveTo(17.524f, 2.0f, 22.001f, 6.477f, 22.001f, 12.0f)
                curveTo(22.001f, 17.523f, 17.524f, 22.0f, 12.001f, 22.0f)
                close()
                moveTo(13.335f, 12.0f)
                horizontalLineTo(10.501f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.335f)
                curveTo(14.163f, 9.0f, 14.835f, 9.672f, 14.835f, 10.5f)
                curveTo(14.835f, 11.328f, 14.163f, 12.0f, 13.335f, 12.0f)
                close()
                moveTo(13.335f, 7.0f)
                horizontalLineTo(8.501f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.501f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.335f)
                curveTo(15.267f, 14.0f, 16.834f, 12.433f, 16.834f, 10.5f)
                curveTo(16.834f, 8.567f, 15.267f, 7.0f, 13.335f, 7.0f)
                close()
            }
        }
        .build()
        return _productHuntFill!!
    }

private var _productHuntFill: ImageVector? = null

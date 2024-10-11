package com.woowla.compose.icon.collections.remix.remix.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BuildingsGroup

public val BuildingsGroup.HomeSmileFill: ImageVector
    get() {
        if (_homeSmileFill != null) {
            return _homeSmileFill!!
        }
        _homeSmileFill = Builder(name = "HomeSmileFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 20.0f)
                curveTo(20.0f, 20.552f, 19.552f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 21.0f, 4.0f, 20.552f, 4.0f, 20.0f)
                verticalLineTo(11.0f)
                lineTo(1.0f, 11.0f)
                lineTo(11.327f, 1.612f)
                curveTo(11.709f, 1.265f, 12.291f, 1.265f, 12.673f, 1.612f)
                lineTo(23.0f, 11.0f)
                lineTo(20.0f, 11.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(7.5f, 13.0f)
                curveTo(7.5f, 15.485f, 9.515f, 17.5f, 12.0f, 17.5f)
                curveTo(14.485f, 17.5f, 16.5f, 15.485f, 16.5f, 13.0f)
                horizontalLineTo(14.5f)
                curveTo(14.5f, 14.381f, 13.381f, 15.5f, 12.0f, 15.5f)
                curveTo(10.619f, 15.5f, 9.5f, 14.381f, 9.5f, 13.0f)
                horizontalLineTo(7.5f)
                close()
            }
        }
        .build()
        return _homeSmileFill!!
    }

private var _homeSmileFill: ImageVector? = null

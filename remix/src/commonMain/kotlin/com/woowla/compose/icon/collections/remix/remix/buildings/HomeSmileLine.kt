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

public val BuildingsGroup.HomeSmileLine: ImageVector
    get() {
        if (_homeSmileLine != null) {
            return _homeSmileLine!!
        }
        _homeSmileLine = Builder(name = "HomeSmileLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 19.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.157f)
                lineTo(12.0f, 3.703f)
                lineTo(6.0f, 9.157f)
                verticalLineTo(19.0f)
                close()
                moveTo(19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 21.0f, 4.0f, 20.552f, 4.0f, 20.0f)
                verticalLineTo(11.0f)
                lineTo(1.0f, 11.0f)
                lineTo(11.327f, 1.612f)
                curveTo(11.709f, 1.265f, 12.291f, 1.265f, 12.673f, 1.612f)
                lineTo(23.0f, 11.0f)
                lineTo(20.0f, 11.0f)
                verticalLineTo(20.0f)
                curveTo(20.0f, 20.552f, 19.552f, 21.0f, 19.0f, 21.0f)
                close()
                moveTo(7.5f, 13.0f)
                horizontalLineTo(9.5f)
                curveTo(9.5f, 14.381f, 10.619f, 15.5f, 12.0f, 15.5f)
                curveTo(13.381f, 15.5f, 14.5f, 14.381f, 14.5f, 13.0f)
                horizontalLineTo(16.5f)
                curveTo(16.5f, 15.485f, 14.485f, 17.5f, 12.0f, 17.5f)
                curveTo(9.515f, 17.5f, 7.5f, 15.485f, 7.5f, 13.0f)
                close()
            }
        }
        .build()
        return _homeSmileLine!!
    }

private var _homeSmileLine: ImageVector? = null

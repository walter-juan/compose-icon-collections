package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.AnchorLine: ImageVector
    get() {
        if (_anchorLine != null) {
            return _anchorLine!!
        }
        _anchorLine = Builder(name = "AnchorLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.049f, 11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.062f)
                curveTo(4.513f, 16.619f, 7.381f, 19.487f, 11.0f, 19.938f)
                verticalLineTo(9.874f)
                curveTo(9.275f, 9.43f, 8.0f, 7.864f, 8.0f, 6.0f)
                curveTo(8.0f, 3.791f, 9.791f, 2.0f, 12.0f, 2.0f)
                curveTo(14.209f, 2.0f, 16.0f, 3.791f, 16.0f, 6.0f)
                curveTo(16.0f, 7.864f, 14.725f, 9.43f, 13.0f, 9.874f)
                verticalLineTo(19.938f)
                curveTo(16.619f, 19.487f, 19.487f, 16.619f, 19.938f, 13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(21.951f)
                curveTo(21.983f, 11.329f, 22.0f, 11.663f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 11.663f, 2.017f, 11.329f, 2.049f, 11.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(13.105f, 8.0f, 14.0f, 7.105f, 14.0f, 6.0f)
                curveTo(14.0f, 4.895f, 13.105f, 4.0f, 12.0f, 4.0f)
                curveTo(10.895f, 4.0f, 10.0f, 4.895f, 10.0f, 6.0f)
                curveTo(10.0f, 7.105f, 10.895f, 8.0f, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _anchorLine!!
    }

private var _anchorLine: ImageVector? = null

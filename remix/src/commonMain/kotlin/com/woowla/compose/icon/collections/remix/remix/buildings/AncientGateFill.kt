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

public val BuildingsGroup.AncientGateFill: ImageVector
    get() {
        if (_ancientGateFill != null) {
            return _ancientGateFill!!
        }
        _ancientGateFill = Builder(name = "AncientGateFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.964f, 3.0f)
                horizontalLineTo(17.036f)
                curveTo(17.284f, 4.722f, 18.76f, 6.0f, 20.5f, 6.0f)
                curveTo(20.832f, 6.0f, 21.163f, 5.953f, 21.482f, 5.86f)
                curveTo(21.297f, 7.644f, 19.794f, 9.0f, 18.0f, 9.0f)
                horizontalLineTo(6.0f)
                curveTo(4.206f, 9.0f, 2.703f, 7.644f, 2.519f, 5.86f)
                curveTo(2.837f, 5.953f, 3.168f, 6.0f, 3.5f, 6.0f)
                curveTo(5.24f, 6.0f, 6.716f, 4.722f, 6.964f, 3.0f)
                close()
                moveTo(22.979f, 11.111f)
                curveTo(22.542f, 11.359f, 22.038f, 11.5f, 21.5f, 11.5f)
                curveTo(20.39f, 11.5f, 19.42f, 10.897f, 18.901f, 10.0f)
                horizontalLineTo(5.099f)
                curveTo(4.58f, 10.897f, 3.61f, 11.5f, 2.5f, 11.5f)
                curveTo(1.962f, 11.5f, 1.458f, 11.359f, 1.021f, 11.111f)
                curveTo(1.007f, 11.239f, 1.0f, 11.369f, 1.0f, 11.5f)
                curveTo(1.0f, 12.897f, 1.818f, 14.102f, 3.0f, 14.664f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                curveTo(9.0f, 17.343f, 10.343f, 16.0f, 12.0f, 16.0f)
                curveTo(13.657f, 16.0f, 15.0f, 17.343f, 15.0f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.664f)
                curveTo(22.183f, 14.102f, 23.0f, 12.897f, 23.0f, 11.5f)
                curveTo(23.0f, 11.369f, 22.993f, 11.239f, 22.979f, 11.111f)
                close()
            }
        }
        .build()
        return _ancientGateFill!!
    }

private var _ancientGateFill: ImageVector? = null

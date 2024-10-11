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

public val MapGroup.RidingFill: ImageVector
    get() {
        if (_ridingFill != null) {
            return _ridingFill!!
        }
        _ridingFill = Builder(name = "RidingFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 21.0f)
                curveTo(3.015f, 21.0f, 1.0f, 18.985f, 1.0f, 16.5f)
                curveTo(1.0f, 14.015f, 3.015f, 12.0f, 5.5f, 12.0f)
                curveTo(7.985f, 12.0f, 10.0f, 14.015f, 10.0f, 16.5f)
                curveTo(10.0f, 18.985f, 7.985f, 21.0f, 5.5f, 21.0f)
                close()
                moveTo(5.5f, 18.0f)
                curveTo(6.328f, 18.0f, 7.0f, 17.328f, 7.0f, 16.5f)
                curveTo(7.0f, 15.672f, 6.328f, 15.0f, 5.5f, 15.0f)
                curveTo(4.672f, 15.0f, 4.0f, 15.672f, 4.0f, 16.5f)
                curveTo(4.0f, 17.328f, 4.672f, 18.0f, 5.5f, 18.0f)
                close()
                moveTo(18.5f, 21.0f)
                curveTo(16.015f, 21.0f, 14.0f, 18.985f, 14.0f, 16.5f)
                curveTo(14.0f, 14.015f, 16.015f, 12.0f, 18.5f, 12.0f)
                curveTo(20.985f, 12.0f, 23.0f, 14.015f, 23.0f, 16.5f)
                curveTo(23.0f, 18.985f, 20.985f, 21.0f, 18.5f, 21.0f)
                close()
                moveTo(18.5f, 18.0f)
                curveTo(19.328f, 18.0f, 20.0f, 17.328f, 20.0f, 16.5f)
                curveTo(20.0f, 15.672f, 19.328f, 15.0f, 18.5f, 15.0f)
                curveTo(17.672f, 15.0f, 17.0f, 15.672f, 17.0f, 16.5f)
                curveTo(17.0f, 17.328f, 17.672f, 18.0f, 18.5f, 18.0f)
                close()
                moveTo(11.531f, 9.797f)
                lineTo(13.0f, 12.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                lineTo(8.281f, 10.734f)
                curveTo(8.182f, 10.666f, 8.088f, 10.588f, 8.0f, 10.5f)
                curveTo(7.219f, 9.719f, 7.219f, 8.453f, 8.0f, 7.672f)
                lineTo(10.828f, 4.843f)
                curveTo(11.609f, 4.062f, 12.876f, 4.062f, 13.657f, 4.843f)
                lineTo(15.071f, 6.257f)
                curveTo(16.175f, 7.361f, 17.555f, 8.019f, 18.988f, 8.232f)
                lineTo(18.978f, 10.247f)
                curveTo(17.034f, 10.022f, 15.149f, 9.163f, 13.657f, 7.672f)
                lineTo(11.531f, 9.797f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(14.895f, 5.0f, 14.0f, 4.105f, 14.0f, 3.0f)
                curveTo(14.0f, 1.895f, 14.895f, 1.0f, 16.0f, 1.0f)
                curveTo(17.105f, 1.0f, 18.0f, 1.895f, 18.0f, 3.0f)
                curveTo(18.0f, 4.105f, 17.105f, 5.0f, 16.0f, 5.0f)
                close()
            }
        }
        .build()
        return _ridingFill!!
    }

private var _ridingFill: ImageVector? = null

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

public val MapGroup.RidingLine: ImageVector
    get() {
        if (_ridingLine != null) {
            return _ridingLine!!
        }
        _ridingLine = Builder(name = "RidingLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(5.5f, 19.0f)
                curveTo(6.881f, 19.0f, 8.0f, 17.881f, 8.0f, 16.5f)
                curveTo(8.0f, 15.119f, 6.881f, 14.0f, 5.5f, 14.0f)
                curveTo(4.119f, 14.0f, 3.0f, 15.119f, 3.0f, 16.5f)
                curveTo(3.0f, 17.881f, 4.119f, 19.0f, 5.5f, 19.0f)
                close()
                moveTo(18.5f, 21.0f)
                curveTo(16.015f, 21.0f, 14.0f, 18.985f, 14.0f, 16.5f)
                curveTo(14.0f, 14.015f, 16.015f, 12.0f, 18.5f, 12.0f)
                curveTo(20.985f, 12.0f, 23.0f, 14.015f, 23.0f, 16.5f)
                curveTo(23.0f, 18.985f, 20.985f, 21.0f, 18.5f, 21.0f)
                close()
                moveTo(18.5f, 19.0f)
                curveTo(19.881f, 19.0f, 21.0f, 17.881f, 21.0f, 16.5f)
                curveTo(21.0f, 15.119f, 19.881f, 14.0f, 18.5f, 14.0f)
                curveTo(17.119f, 14.0f, 16.0f, 15.119f, 16.0f, 16.5f)
                curveTo(16.0f, 17.881f, 17.119f, 19.0f, 18.5f, 19.0f)
                close()
                moveTo(11.023f, 10.305f)
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
                lineTo(11.023f, 10.305f)
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
        return _ridingLine!!
    }

private var _ridingLine: ImageVector? = null

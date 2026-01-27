package com.woowla.compose.icon.collections.remix.remix.food

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.FoodGroup

public val FoodGroup.CookieFill: ImageVector
    get() {
        if (_cookieFill != null) {
            return _cookieFill!!
        }
        _cookieFill = Builder(name = "CookieFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.929f, 4.929f)
                curveTo(7.037f, 2.821f, 9.852f, 1.85f, 12.611f, 2.018f)
                curveTo(12.991f, 2.041f, 13.178f, 2.486f, 13.027f, 2.835f)
                curveTo(12.477f, 4.113f, 12.724f, 5.653f, 13.768f, 6.697f)
                curveTo(14.331f, 7.26f, 15.038f, 7.59f, 15.77f, 7.689f)
                curveTo(16.048f, 7.726f, 16.274f, 7.952f, 16.311f, 8.229f)
                curveTo(16.41f, 8.962f, 16.74f, 9.669f, 17.303f, 10.232f)
                curveTo(18.347f, 11.276f, 19.885f, 11.522f, 21.163f, 10.971f)
                curveTo(21.513f, 10.821f, 21.958f, 11.007f, 21.981f, 11.388f)
                curveTo(22.149f, 14.147f, 21.179f, 16.962f, 19.07f, 19.071f)
                curveTo(15.165f, 22.976f, 8.834f, 22.976f, 4.929f, 19.071f)
                curveTo(1.024f, 15.165f, 1.024f, 8.834f, 4.929f, 4.929f)
                close()
                moveTo(9.878f, 14.121f)
                curveTo(9.292f, 13.536f, 8.343f, 13.536f, 7.757f, 14.121f)
                curveTo(7.172f, 14.707f, 7.171f, 15.657f, 7.757f, 16.243f)
                curveTo(8.343f, 16.828f, 9.292f, 16.828f, 9.878f, 16.243f)
                curveTo(10.464f, 15.657f, 10.464f, 14.707f, 9.878f, 14.121f)
                close()
                moveTo(15.889f, 13.768f)
                curveTo(15.303f, 13.182f, 14.354f, 13.182f, 13.768f, 13.768f)
                curveTo(13.182f, 14.354f, 13.182f, 15.303f, 13.768f, 15.889f)
                curveTo(14.354f, 16.475f, 15.303f, 16.475f, 15.889f, 15.889f)
                curveTo(16.474f, 15.303f, 16.475f, 14.354f, 15.889f, 13.768f)
                close()
                moveTo(10.232f, 8.111f)
                curveTo(9.646f, 7.525f, 8.696f, 7.525f, 8.111f, 8.111f)
                curveTo(7.525f, 8.696f, 7.525f, 9.646f, 8.111f, 10.232f)
                curveTo(8.696f, 10.818f, 9.646f, 10.818f, 10.232f, 10.232f)
                curveTo(10.817f, 9.646f, 10.817f, 8.696f, 10.232f, 8.111f)
                close()
            }
        }
        .build()
        return _cookieFill!!
    }

private var _cookieFill: ImageVector? = null

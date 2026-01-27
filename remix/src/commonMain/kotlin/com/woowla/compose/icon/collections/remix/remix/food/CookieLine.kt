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

public val FoodGroup.CookieLine: ImageVector
    get() {
        if (_cookieLine != null) {
            return _cookieLine!!
        }
        _cookieLine = Builder(name = "CookieLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.163f, 10.971f)
                curveTo(21.513f, 10.82f, 21.958f, 11.007f, 21.981f, 11.387f)
                curveTo(22.149f, 14.147f, 21.179f, 16.962f, 19.071f, 19.071f)
                curveTo(15.166f, 22.976f, 8.834f, 22.976f, 4.929f, 19.071f)
                curveTo(1.024f, 15.166f, 1.024f, 8.834f, 4.929f, 4.929f)
                curveTo(7.037f, 2.821f, 9.852f, 1.85f, 12.611f, 2.018f)
                curveTo(12.992f, 2.041f, 13.179f, 2.486f, 13.028f, 2.836f)
                curveTo(12.477f, 4.114f, 12.724f, 5.653f, 13.768f, 6.697f)
                curveTo(14.331f, 7.26f, 15.038f, 7.59f, 15.771f, 7.688f)
                curveTo(16.048f, 7.726f, 16.274f, 7.951f, 16.311f, 8.229f)
                curveTo(16.41f, 8.962f, 16.74f, 9.669f, 17.303f, 10.232f)
                curveTo(18.347f, 11.276f, 19.886f, 11.522f, 21.163f, 10.971f)
                close()
                moveTo(19.785f, 13.84f)
                curveTo(19.856f, 13.536f, 19.612f, 13.26f, 19.302f, 13.234f)
                curveTo(18.057f, 13.127f, 16.842f, 12.599f, 15.889f, 11.646f)
                curveTo(15.317f, 11.074f, 14.898f, 10.406f, 14.631f, 9.695f)
                curveTo(14.574f, 9.544f, 14.456f, 9.425f, 14.305f, 9.369f)
                curveTo(13.594f, 9.102f, 12.926f, 8.683f, 12.354f, 8.111f)
                curveTo(11.401f, 7.158f, 10.872f, 5.942f, 10.765f, 4.697f)
                curveTo(10.738f, 4.386f, 10.462f, 4.143f, 10.159f, 4.214f)
                curveTo(8.76f, 4.543f, 7.433f, 5.253f, 6.343f, 6.343f)
                curveTo(3.219f, 9.467f, 3.219f, 14.533f, 6.343f, 17.657f)
                curveTo(9.467f, 20.781f, 14.533f, 20.781f, 17.657f, 17.657f)
                curveTo(18.747f, 16.566f, 19.456f, 15.238f, 19.785f, 13.84f)
                close()
                moveTo(9.879f, 14.121f)
                curveTo(10.464f, 14.707f, 10.464f, 15.657f, 9.879f, 16.243f)
                curveTo(9.293f, 16.828f, 8.343f, 16.828f, 7.757f, 16.243f)
                curveTo(7.171f, 15.657f, 7.171f, 14.707f, 7.757f, 14.121f)
                curveTo(8.343f, 13.535f, 9.293f, 13.535f, 9.879f, 14.121f)
                close()
                moveTo(10.232f, 8.111f)
                curveTo(10.818f, 8.697f, 10.818f, 9.646f, 10.232f, 10.232f)
                curveTo(9.646f, 10.818f, 8.697f, 10.818f, 8.111f, 10.232f)
                curveTo(7.525f, 9.646f, 7.525f, 8.697f, 8.111f, 8.111f)
                curveTo(8.697f, 7.525f, 9.646f, 7.525f, 10.232f, 8.111f)
                close()
                moveTo(15.889f, 13.768f)
                curveTo(16.475f, 14.353f, 16.475f, 15.303f, 15.889f, 15.889f)
                curveTo(15.303f, 16.475f, 14.354f, 16.475f, 13.768f, 15.889f)
                curveTo(13.182f, 15.303f, 13.182f, 14.353f, 13.768f, 13.768f)
                curveTo(14.354f, 13.182f, 15.303f, 13.182f, 15.889f, 13.768f)
                close()
            }
        }
        .build()
        return _cookieLine!!
    }

private var _cookieLine: ImageVector? = null

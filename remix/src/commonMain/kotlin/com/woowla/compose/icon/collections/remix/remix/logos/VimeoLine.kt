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

public val LogosGroup.VimeoLine: ImageVector
    get() {
        if (_vimeoLine != null) {
            return _vimeoLine!!
        }
        _vimeoLine = Builder(name = "VimeoLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.994f, 3.004f)
                curveTo(20.427f, 3.004f, 21.999f, 4.516f, 21.999f, 7.5f)
                curveTo(21.999f, 9.22f, 21.001f, 11.44f, 20.167f, 12.735f)
                curveTo(17.378f, 17.068f, 13.934f, 21.475f, 10.524f, 21.475f)
                curveTo(6.818f, 21.475f, 5.855f, 14.644f, 5.432f, 13.043f)
                curveTo(5.01f, 11.442f, 4.899f, 10.834f, 4.262f, 9.81f)
                curveTo(3.945f, 10.029f, 3.501f, 10.339f, 2.932f, 10.739f)
                curveTo(2.708f, 10.897f, 2.4f, 10.845f, 2.239f, 10.623f)
                lineTo(0.926f, 8.807f)
                curveTo(0.79f, 8.62f, 0.801f, 8.363f, 0.953f, 8.188f)
                curveTo(3.78f, 4.914f, 6.129f, 3.278f, 8.001f, 3.278f)
                curveTo(10.393f, 3.278f, 11.125f, 6.093f, 11.325f, 7.5f)
                curveTo(11.625f, 9.617f, 12.016f, 12.238f, 12.57f, 13.372f)
                curveTo(13.126f, 12.58f, 14.75f, 10.484f, 14.536f, 9.381f)
                curveTo(14.442f, 8.895f, 13.219f, 9.565f, 12.649f, 9.46f)
                curveTo(12.224f, 9.381f, 11.844f, 9.058f, 11.844f, 8.434f)
                curveTo(11.844f, 7.124f, 13.695f, 3.004f, 17.994f, 3.004f)
                close()
                moveTo(18.001f, 5.004f)
                curveTo(15.807f, 5.004f, 14.75f, 6.537f, 14.348f, 7.212f)
                curveTo(15.598f, 7.258f, 16.317f, 8.03f, 16.482f, 9.015f)
                curveTo(16.87f, 11.344f, 14.565f, 13.936f, 14.142f, 14.58f)
                curveTo(13.747f, 15.183f, 11.081f, 17.908f, 9.892f, 11.22f)
                curveTo(9.78f, 10.591f, 9.525f, 9.057f, 9.227f, 7.034f)
                curveTo(9.057f, 5.883f, 8.355f, 5.271f, 7.998f, 5.271f)
                curveTo(7.155f, 5.271f, 6.077f, 5.92f, 4.142f, 7.786f)
                curveTo(6.047f, 7.671f, 6.687f, 10.062f, 7.059f, 11.419f)
                curveTo(7.874f, 14.403f, 8.629f, 19.475f, 10.679f, 19.475f)
                curveTo(12.405f, 19.475f, 15.117f, 16.829f, 18.048f, 12.436f)
                curveTo(18.257f, 12.123f, 20.014f, 9.411f, 20.014f, 7.399f)
                curveTo(20.014f, 5.004f, 18.545f, 5.004f, 18.001f, 5.004f)
                close()
            }
        }
        .build()
        return _vimeoLine!!
    }

private var _vimeoLine: ImageVector? = null

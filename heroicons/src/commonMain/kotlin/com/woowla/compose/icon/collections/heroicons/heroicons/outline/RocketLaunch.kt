package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.RocketLaunch: ImageVector
    get() {
        if (_rocketLaunch != null) {
            return _rocketLaunch!!
        }
        _rocketLaunch = Builder(name = "RocketLaunch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.59f, 14.37f)
                curveTo(15.695f, 14.813f, 15.75f, 15.275f, 15.75f, 15.75f)
                curveTo(15.75f, 19.064f, 13.064f, 21.75f, 9.75f, 21.75f)
                verticalLineTo(16.95f)
                moveTo(15.59f, 14.37f)
                curveTo(19.324f, 11.641f, 21.75f, 7.229f, 21.75f, 2.25f)
                curveTo(16.771f, 2.25f, 12.359f, 4.676f, 9.631f, 8.41f)
                moveTo(15.59f, 14.37f)
                curveTo(13.882f, 15.618f, 11.899f, 16.514f, 9.75f, 16.95f)
                moveTo(9.631f, 8.41f)
                curveTo(9.188f, 8.305f, 8.725f, 8.25f, 8.25f, 8.25f)
                curveTo(4.936f, 8.25f, 2.25f, 10.936f, 2.25f, 14.25f)
                horizontalLineTo(7.051f)
                moveTo(9.631f, 8.41f)
                curveTo(8.383f, 10.118f, 7.487f, 12.101f, 7.051f, 14.25f)
                moveTo(9.75f, 16.95f)
                curveTo(9.647f, 16.971f, 9.543f, 16.991f, 9.439f, 17.01f)
                curveTo(8.532f, 16.291f, 7.71f, 15.469f, 6.991f, 14.562f)
                curveTo(7.01f, 14.458f, 7.03f, 14.354f, 7.051f, 14.25f)
                moveTo(4.812f, 16.641f)
                curveTo(3.712f, 17.461f, 3.0f, 18.772f, 3.0f, 20.25f)
                curveTo(3.0f, 20.487f, 3.018f, 20.719f, 3.054f, 20.946f)
                curveTo(3.281f, 20.982f, 3.513f, 21.0f, 3.75f, 21.0f)
                curveTo(5.228f, 21.0f, 6.539f, 20.288f, 7.359f, 19.188f)
                moveTo(16.5f, 9.0f)
                curveTo(16.5f, 9.828f, 15.828f, 10.5f, 15.0f, 10.5f)
                curveTo(14.172f, 10.5f, 13.5f, 9.828f, 13.5f, 9.0f)
                curveTo(13.5f, 8.172f, 14.172f, 7.5f, 15.0f, 7.5f)
                curveTo(15.828f, 7.5f, 16.5f, 8.172f, 16.5f, 9.0f)
                close()
            }
        }
        .build()
        return _rocketLaunch!!
    }

private var _rocketLaunch: ImageVector? = null

package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.MarkGithub16: ImageVector
    get() {
        if (_markGithub16 != null) {
            return _markGithub16!!
        }
        _markGithub16 = Builder(name = "MarkGithub16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.766f, 11.695f)
                curveTo(4.703f, 11.437f, 3.25f, 9.904f, 3.25f, 7.92f)
                curveToRelative(0.0f, -0.806f, 0.281f, -1.677f, 0.75f, -2.258f)
                curveToRelative(-0.203f, -0.532f, -0.172f, -1.662f, 0.062f, -2.129f)
                curveToRelative(0.626f, -0.081f, 1.469f, 0.258f, 1.969f, 0.726f)
                curveToRelative(0.594f, -0.194f, 1.219f, -0.291f, 1.985f, -0.291f)
                curveToRelative(0.765f, 0.0f, 1.39f, 0.097f, 1.953f, 0.274f)
                curveToRelative(0.484f, -0.451f, 1.343f, -0.79f, 1.969f, -0.709f)
                curveToRelative(0.218f, 0.435f, 0.25f, 1.564f, 0.046f, 2.113f)
                curveToRelative(0.5f, 0.613f, 0.766f, 1.436f, 0.766f, 2.274f)
                curveToRelative(0.0f, 1.984f, -1.453f, 3.485f, -3.547f, 3.759f)
                curveToRelative(0.531f, 0.355f, 0.891f, 1.129f, 0.891f, 2.016f)
                verticalLineToRelative(1.678f)
                curveToRelative(0.0f, 0.484f, 0.39f, 0.758f, 0.859f, 0.564f)
                curveTo(13.781f, 14.824f, 16.0f, 11.905f, 16.0f, 8.291f)
                curveTo(16.0f, 3.726f, 12.406f, 0.0f, 7.984f, 0.0f)
                curveTo(3.562f, 0.0f, 0.0f, 3.726f, 0.0f, 8.291f)
                curveToRelative(0.0f, 3.581f, 2.203f, 6.55f, 5.172f, 7.663f)
                arcTo(0.595f, 0.595f, 0.0f, false, false, 6.0f, 15.389f)
                verticalLineToRelative(-1.291f)
                curveToRelative(-0.219f, 0.097f, -0.5f, 0.162f, -0.75f, 0.162f)
                curveToRelative(-1.031f, 0.0f, -1.641f, -0.581f, -2.078f, -1.662f)
                curveToRelative(-0.172f, -0.435f, -0.36f, -0.693f, -0.719f, -0.742f)
                curveToRelative(-0.187f, -0.016f, -0.25f, -0.097f, -0.25f, -0.193f)
                curveToRelative(0.0f, -0.194f, 0.313f, -0.339f, 0.625f, -0.339f)
                curveToRelative(0.453f, 0.0f, 0.844f, 0.29f, 1.25f, 0.887f)
                curveToRelative(0.313f, 0.468f, 0.641f, 0.678f, 1.031f, 0.678f)
                curveToRelative(0.391f, 0.0f, 0.641f, -0.146f, 1.0f, -0.516f)
                curveToRelative(0.266f, -0.275f, 0.469f, -0.517f, 0.657f, -0.678f)
                close()
            }
        }
        .build()
        return _markGithub16!!
    }

private var _markGithub16: ImageVector? = null

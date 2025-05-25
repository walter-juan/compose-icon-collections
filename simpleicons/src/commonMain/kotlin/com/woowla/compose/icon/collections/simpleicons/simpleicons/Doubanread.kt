package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Doubanread: ImageVector
    get() {
        if (_doubanread != null) {
            return _doubanread!!
        }
        _doubanread = Builder(name = "Doubanread", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.056f, 3.0f)
                curveToRelative(-4.128f, 0.0f, -5.432f, 3.97f, -7.994f, 5.966f)
                lineToRelative(-0.152f, 0.115f)
                curveToRelative(-0.828f, 0.607f, -1.787f, 1.005f, -3.012f, 1.005f)
                curveTo(2.009f, 10.083f, 0.38f, 7.855f, 0.0f, 6.435f)
                curveToRelative(0.0f, 1.098f, 0.177f, 2.248f, 0.499f, 3.397f)
                curveTo(2.049f, 15.403f, 6.96f, 21.0f, 11.41f, 21.0f)
                curveToRelative(5.206f, 0.0f, 8.985f, -5.428f, 10.127f, -9.556f)
                curveToRelative(0.369f, -1.332f, 1.204f, -2.478f, 2.368f, -3.178f)
                lineToRelative(0.095f, -0.06f)
                lineToRelative(-0.14f, -0.054f)
                lineToRelative(-0.001f, 0.004f)
                curveToRelative(-1.144f, -0.453f, -2.082f, -1.308f, -2.72f, -2.384f)
                curveToRelative(-0.983f, -1.65f, -2.984f, -2.77f, -5.083f, -2.77f)
                moveToRelative(2.705f, 3.75f)
                curveToRelative(0.379f, 0.008f, 0.702f, 0.358f, 0.736f, 0.822f)
                curveToRelative(0.037f, 0.496f, -0.269f, 0.933f, -0.683f, 0.976f)
                curveToRelative(-0.412f, 0.041f, -0.775f, -0.325f, -0.811f, -0.82f)
                reflectiveCurveToRelative(0.267f, -0.93f, 0.68f, -0.976f)
                close()
                moveTo(14.152f, 9.004f)
                arcToRelative(2.46f, 2.46f, 0.0f, false, true, 1.048f, 0.714f)
                curveToRelative(1.487f, 1.825f, 0.403f, 4.62f, -1.368f, 5.858f)
                curveToRelative(-2.196f, 1.616f, -5.202f, 0.876f, -7.382f, -0.379f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, true, -2.775f, -2.433f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -0.672f, -1.021f)
                curveToRelative(-0.011f, -0.018f, 0.015f, -0.035f, 0.027f, -0.019f)
                curveToRelative(1.391f, 1.977f, 3.554f, 3.302f, 5.904f, 3.715f)
                curveToRelative(0.947f, 0.144f, 1.903f, 0.24f, 2.794f, -0.036f)
                curveToRelative(1.532f, -0.524f, 2.903f, -1.736f, 3.334f, -3.329f)
                curveToRelative(0.321f, -1.088f, 0.026f, -2.33f, -0.938f, -3.019f)
                curveToRelative(-0.028f, -0.017f, 0.0f, -0.064f, 0.028f, -0.052f)
            }
        }
        .build()
        return _doubanread!!
    }

private var _doubanread: ImageVector? = null

package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Chat: ImageVector
    get() {
        if (_chat != null) {
            return _chat!!
        }
        _chat = Builder(name = "Chat", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.678f, 11.894f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.287f, 0.801f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, -0.398f, 2.0f)
                curveToRelative(1.395f, -0.323f, 2.247f, -0.697f, 2.634f, -0.893f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.71f, -0.074f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 14.0f)
                curveToRelative(3.996f, 0.0f, 7.0f, -2.807f, 7.0f, -6.0f)
                reflectiveCurveToRelative(-3.004f, -6.0f, -7.0f, -6.0f)
                reflectiveCurveToRelative(-7.0f, 2.808f, -7.0f, 6.0f)
                curveToRelative(0.0f, 1.468f, 0.617f, 2.83f, 1.678f, 3.894f)
                moveToRelative(-0.493f, 3.905f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -0.713f, 0.129f)
                curveToRelative(-0.2f, 0.032f, -0.352f, -0.176f, -0.273f, -0.362f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.244f, -0.637f)
                lineToRelative(0.003f, -0.01f)
                curveToRelative(0.248f, -0.72f, 0.45f, -1.548f, 0.524f, -2.319f)
                curveTo(0.743f, 11.37f, 0.0f, 9.76f, 0.0f, 8.0f)
                curveToRelative(0.0f, -3.866f, 3.582f, -7.0f, 8.0f, -7.0f)
                reflectiveCurveToRelative(8.0f, 3.134f, 8.0f, 7.0f)
                reflectiveCurveToRelative(-3.582f, 7.0f, -8.0f, 7.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -2.347f, -0.306f)
                curveToRelative(-0.52f, 0.263f, -1.639f, 0.742f, -3.468f, 1.105f)
            }
        }
        .build()
        return _chat!!
    }

private var _chat: ImageVector? = null

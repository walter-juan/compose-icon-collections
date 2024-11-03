package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.ChatQuote: ImageVector
    get() {
        if (_chatQuote != null) {
            return _chatQuote!!
        }
        _chatQuote = Builder(name = "ChatQuote", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.066f, 6.76f)
                arcTo(1.665f, 1.665f, 0.0f, false, false, 4.0f, 7.668f)
                arcToRelative(1.667f, 1.667f, 0.0f, false, false, 2.561f, 1.406f)
                curveToRelative(-0.131f, 0.389f, -0.375f, 0.804f, -0.777f, 1.22f)
                arcToRelative(0.417f, 0.417f, 0.0f, false, false, 0.6f, 0.58f)
                curveToRelative(1.486f, -1.54f, 1.293f, -3.214f, 0.682f, -4.112f)
                close()
                moveTo(11.066f, 6.76f)
                arcTo(1.665f, 1.665f, 0.0f, false, false, 8.0f, 7.668f)
                arcToRelative(1.667f, 1.667f, 0.0f, false, false, 2.561f, 1.406f)
                curveToRelative(-0.131f, 0.389f, -0.375f, 0.804f, -0.777f, 1.22f)
                arcToRelative(0.417f, 0.417f, 0.0f, false, false, 0.6f, 0.58f)
                curveToRelative(1.486f, -1.54f, 1.293f, -3.214f, 0.682f, -4.112f)
                close()
            }
        }
        .build()
        return _chatQuote!!
    }

private var _chatQuote: ImageVector? = null

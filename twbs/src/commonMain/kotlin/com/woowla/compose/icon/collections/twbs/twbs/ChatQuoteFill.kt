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

public val Twbs.ChatQuoteFill: ImageVector
    get() {
        if (_chatQuoteFill != null) {
            return _chatQuoteFill!!
        }
        _chatQuoteFill = Builder(name = "ChatQuoteFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                curveToRelative(0.0f, 3.866f, -3.582f, 7.0f, -8.0f, 7.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -2.347f, -0.306f)
                curveToRelative(-0.584f, 0.296f, -1.925f, 0.864f, -4.181f, 1.234f)
                curveToRelative(-0.2f, 0.032f, -0.352f, -0.176f, -0.273f, -0.362f)
                curveToRelative(0.354f, -0.836f, 0.674f, -1.95f, 0.77f, -2.966f)
                curveTo(0.744f, 11.37f, 0.0f, 9.76f, 0.0f, 8.0f)
                curveToRelative(0.0f, -3.866f, 3.582f, -7.0f, 8.0f, -7.0f)
                reflectiveCurveToRelative(8.0f, 3.134f, 8.0f, 7.0f)
                moveTo(7.194f, 6.766f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, -0.227f, -0.272f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.469f, -0.324f)
                lineToRelative(-0.008f, -0.004f)
                arcTo(1.8f, 1.8f, 0.0f, false, false, 5.734f, 6.0f)
                curveTo(4.776f, 6.0f, 4.0f, 6.746f, 4.0f, 7.667f)
                curveToRelative(0.0f, 0.92f, 0.776f, 1.666f, 1.734f, 1.666f)
                curveToRelative(0.343f, 0.0f, 0.662f, -0.095f, 0.931f, -0.26f)
                curveToRelative(-0.137f, 0.389f, -0.39f, 0.804f, -0.81f, 1.22f)
                arcToRelative(0.405f, 0.405f, 0.0f, false, false, 0.011f, 0.59f)
                curveToRelative(0.173f, 0.16f, 0.447f, 0.155f, 0.614f, -0.01f)
                curveToRelative(1.334f, -1.329f, 1.37f, -2.758f, 0.941f, -3.706f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -0.227f, -0.4f)
                close()
                moveTo(11.0f, 9.073f)
                curveToRelative(-0.136f, 0.389f, -0.39f, 0.804f, -0.81f, 1.22f)
                arcToRelative(0.405f, 0.405f, 0.0f, false, false, 0.012f, 0.59f)
                curveToRelative(0.172f, 0.16f, 0.446f, 0.155f, 0.613f, -0.01f)
                curveToRelative(1.334f, -1.329f, 1.37f, -2.758f, 0.942f, -3.706f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -0.228f, -0.4f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, -0.227f, -0.273f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.469f, -0.324f)
                lineToRelative(-0.008f, -0.004f)
                arcTo(1.8f, 1.8f, 0.0f, false, false, 10.07f, 6.0f)
                curveToRelative(-0.957f, 0.0f, -1.734f, 0.746f, -1.734f, 1.667f)
                curveToRelative(0.0f, 0.92f, 0.777f, 1.666f, 1.734f, 1.666f)
                curveToRelative(0.343f, 0.0f, 0.662f, -0.095f, 0.931f, -0.26f)
                close()
            }
        }
        .build()
        return _chatQuoteFill!!
    }

private var _chatQuoteFill: ImageVector? = null

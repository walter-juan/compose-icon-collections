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

public val Twbs.Youtube: ImageVector
    get() {
        if (_youtube != null) {
            return _youtube!!
        }
        _youtube = Builder(name = "Youtube", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.051f, 1.999f)
                horizontalLineToRelative(0.089f)
                curveToRelative(0.822f, 0.003f, 4.987f, 0.033f, 6.11f, 0.335f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, true, 1.415f, 1.42f)
                curveToRelative(0.101f, 0.38f, 0.172f, 0.883f, 0.22f, 1.402f)
                lineToRelative(0.01f, 0.104f)
                lineToRelative(0.022f, 0.26f)
                lineToRelative(0.008f, 0.104f)
                curveToRelative(0.065f, 0.914f, 0.073f, 1.77f, 0.074f, 1.957f)
                verticalLineToRelative(0.075f)
                curveToRelative(-0.001f, 0.194f, -0.01f, 1.108f, -0.082f, 2.06f)
                lineToRelative(-0.008f, 0.105f)
                lineToRelative(-0.009f, 0.104f)
                curveToRelative(-0.05f, 0.572f, -0.124f, 1.14f, -0.235f, 1.558f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, true, -1.415f, 1.42f)
                curveToRelative(-1.16f, 0.312f, -5.569f, 0.334f, -6.18f, 0.335f)
                horizontalLineToRelative(-0.142f)
                curveToRelative(-0.309f, 0.0f, -1.587f, -0.006f, -2.927f, -0.052f)
                lineToRelative(-0.17f, -0.006f)
                lineToRelative(-0.087f, -0.004f)
                lineToRelative(-0.171f, -0.007f)
                lineToRelative(-0.171f, -0.007f)
                curveToRelative(-1.11f, -0.049f, -2.167f, -0.128f, -2.654f, -0.26f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, true, -1.415f, -1.419f)
                curveToRelative(-0.111f, -0.417f, -0.185f, -0.986f, -0.235f, -1.558f)
                lineTo(0.09f, 9.82f)
                lineToRelative(-0.008f, -0.104f)
                arcTo(31.0f, 31.0f, 0.0f, false, true, 0.0f, 7.68f)
                verticalLineToRelative(-0.123f)
                curveToRelative(0.002f, -0.215f, 0.01f, -0.958f, 0.064f, -1.778f)
                lineToRelative(0.007f, -0.103f)
                lineToRelative(0.003f, -0.052f)
                lineToRelative(0.008f, -0.104f)
                lineToRelative(0.022f, -0.26f)
                lineToRelative(0.01f, -0.104f)
                curveToRelative(0.048f, -0.519f, 0.119f, -1.023f, 0.22f, -1.402f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, true, 1.415f, -1.42f)
                curveToRelative(0.487f, -0.13f, 1.544f, -0.21f, 2.654f, -0.26f)
                lineToRelative(0.17f, -0.007f)
                lineToRelative(0.172f, -0.006f)
                lineToRelative(0.086f, -0.003f)
                lineToRelative(0.171f, -0.007f)
                arcTo(100.0f, 100.0f, 0.0f, false, true, 7.858f, 2.0f)
                close()
                moveTo(6.4f, 5.209f)
                verticalLineToRelative(4.818f)
                lineToRelative(4.157f, -2.408f)
                close()
            }
        }
        .build()
        return _youtube!!
    }

private var _youtube: ImageVector? = null

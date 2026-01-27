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

public val Simpleicons.Mailbox: ImageVector
    get() {
        if (_mailbox != null) {
            return _mailbox!!
        }
        _mailbox = Builder(name = "Mailbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.196f, 20.014f)
                lineToRelative(-7.711f, -5.836f)
                curveToRelative(-0.48f, -0.31f, -0.733f, -0.268f, -1.121f, 0.155f)
                arcToRelative(71.39f, 71.39f, 0.0f, false, false, -0.26f, 0.303f)
                curveToRelative(-0.226f, 0.275f, -0.353f, 0.451f, -0.262f, 0.775f)
                curveToRelative(0.007f, 0.043f, 2.397f, 7.352f, 2.397f, 7.352f)
                curveToRelative(0.225f, 0.782f, 0.782f, 1.212f, 1.642f, 1.226f)
                horizontalLineToRelative(3.545f)
                curveToRelative(0.543f, 0.0f, 0.825f, -0.112f, 1.142f, -0.479f)
                lineToRelative(0.966f, -1.283f)
                curveToRelative(0.67f, -0.951f, 0.592f, -1.459f, -0.338f, -2.22f)
                moveToRelative(-10.22f, -5.8f)
                lineTo(9.81f, 6.494f)
                curveToRelative(0.31f, -0.48f, 0.268f, -0.733f, -0.155f, -1.12f)
                curveToRelative(-0.105f, -0.092f, -0.204f, -0.177f, -0.303f, -0.261f)
                curveToRelative(-0.275f, -0.226f, -0.45f, -0.353f, -0.775f, -0.261f)
                curveToRelative(-0.042f, 0.007f, -7.352f, 2.396f, -7.352f, 2.396f)
                curveTo(0.444f, 7.475f, 0.014f, 8.032f, 0.0f, 8.892f)
                verticalLineToRelative(3.545f)
                curveToRelative(0.0f, 0.543f, 0.113f, 0.825f, 0.48f, 1.142f)
                lineToRelative(1.282f, 0.965f)
                curveToRelative(0.952f, 0.67f, 1.46f, 0.593f, 2.22f, -0.338f)
                moveToRelative(16.043f, -4.412f)
                lineToRelative(-5.836f, 7.71f)
                curveToRelative(-0.31f, 0.48f, -0.268f, 0.734f, 0.155f, 1.122f)
                lineToRelative(0.303f, 0.26f)
                curveToRelative(0.275f, 0.226f, 0.45f, 0.353f, 0.775f, 0.261f)
                curveToRelative(0.042f, -0.007f, 7.352f, -2.396f, 7.352f, -2.396f)
                curveToRelative(0.782f, -0.226f, 1.212f, -0.783f, 1.226f, -1.643f)
                verticalLineToRelative(-3.545f)
                curveToRelative(0.0f, -0.543f, -0.113f, -0.825f, -0.48f, -1.142f)
                lineToRelative(-1.282f, -0.965f)
                curveToRelative(-0.952f, -0.67f, -1.46f, -0.593f, -2.22f, 0.338f)
                moveTo(9.79f, 3.986f)
                lineToRelative(7.711f, 5.836f)
                curveToRelative(0.48f, 0.31f, 0.733f, 0.268f, 1.121f, -0.155f)
                lineToRelative(0.26f, -0.303f)
                curveToRelative(0.226f, -0.275f, 0.353f, -0.451f, 0.262f, -0.775f)
                curveToRelative(-0.007f, -0.043f, -2.397f, -7.352f, -2.397f, -7.352f)
                curveToRelative(-0.225f, -0.782f, -0.782f, -1.212f, -1.642f, -1.226f)
                horizontalLineToRelative(-3.546f)
                curveToRelative(-0.542f, 0.0f, -0.824f, 0.112f, -1.141f, 0.479f)
                lineToRelative(-0.966f, 1.283f)
                curveToRelative(-0.67f, 0.951f, -0.592f, 1.459f, 0.338f, 2.22f)
            }
        }
        .build()
        return _mailbox!!
    }

private var _mailbox: ImageVector? = null

package com.woowla.compose.icon.collections.devicons.devicons.hardhat

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.HardhatGroup

public val HardhatGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.15f, 19.64f)
                arcToRelative(59.4f, 59.4f, 0.0f, false, false, -16.58f, 2.36f)
                curveToRelative(-0.81f, 0.24f, -1.54f, 0.7f, -2.1f, 1.33f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, -1.05f, 2.24f)
                lineToRelative(-0.24f, 1.44f)
                arcToRelative(58.59f, 58.59f, 0.0f, false, false, -28.13f, 21.26f)
                arcToRelative(57.74f, 57.74f, 0.0f, false, false, -10.67f, 33.42f)
                verticalLineToRelative(7.77f)
                curveToRelative(-3.44f, 0.99f, -5.36f, 2.08f, -5.36f, 3.22f)
                lineTo(0.02f, 98.9f)
                curveToRelative(-0.06f, 0.37f, 0.02f, 0.74f, 0.22f, 1.05f)
                curveToRelative(0.01f, -0.01f, 0.03f, -0.01f, 0.04f, -0.02f)
                curveToRelative(2.82f, 4.12f, 30.28f, 8.43f, 63.74f, 8.43f)
                curveToRelative(33.53f, 0.0f, 61.03f, -4.34f, 63.75f, -8.45f)
                lineToRelative(-0.01f, -0.01f)
                curveToRelative(0.19f, -0.3f, 0.28f, -0.65f, 0.23f, -1.0f)
                lineTo(127.99f, 92.68f)
                curveToRelative(0.0f, -1.15f, -1.94f, -2.26f, -5.43f, -3.25f)
                lineToRelative(0.09f, -7.73f)
                arcToRelative(57.71f, 57.71f, 0.0f, false, false, -10.59f, -33.29f)
                arcTo(58.58f, 58.58f, 0.0f, false, false, 84.12f, 27.13f)
                lineToRelative(-0.25f, -1.55f)
                arcToRelative(4.42f, 4.42f, 0.0f, false, false, -1.05f, -2.24f)
                arcToRelative(4.48f, 4.48f, 0.0f, false, false, -2.09f, -1.34f)
                arcToRelative(59.4f, 59.4f, 0.0f, false, false, -16.58f, -2.36f)
                close()
                moveTo(64.0f, 37.88f)
                verticalLineToRelative(31.59f)
                lineToRelative(-13.72f, -8.44f)
                lineTo(64.0f, 37.88f)
                close()
                moveTo(64.0f, 37.89f)
                lineTo(77.72f, 61.04f)
                lineToRelative(-13.72f, 8.43f)
                lineTo(64.0f, 37.89f)
                close()
                moveTo(77.72f, 65.61f)
                curveToRelative(0.0f, 0.01f, -13.46f, 19.09f, -13.72f, 19.46f)
                verticalLineToRelative(0.01f)
                lineTo(50.28f, 65.62f)
                lineToRelative(13.72f, 8.44f)
                verticalLineToRelative(-0.0f)
                lineToRelative(13.72f, -8.45f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null

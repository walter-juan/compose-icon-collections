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

public val Simpleicons.Aegisauthenticator: ImageVector
    get() {
        if (_aegisauthenticator != null) {
            return _aegisauthenticator!!
        }
        _aegisauthenticator = Builder(name = "Aegisauthenticator", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.949f, 19.873f)
                lineToRelative(-0.007f, 0.013f)
                arcToRelative(1.483f, 1.483f, 0.0f, false, false, -0.001f, 1.469f)
                lineToRelative(0.317f, 0.557f)
                curveToRelative(0.264f, 0.464f, 0.756f, 0.75f, 1.29f, 0.75f)
                horizontalLineToRelative(0.016f)
                curveToRelative(1.139f, 0.0f, 1.853f, -1.23f, 1.288f, -2.219f)
                lineToRelative(-0.325f, -0.57f)
                curveToRelative(-0.569f, -0.997f, -2.007f, -0.997f, -2.577f, -0.0f)
                moveToRelative(3.49f, -6.107f)
                arcToRelative(1.483f, 1.483f, 0.0f, false, false, -0.001f, 1.469f)
                lineToRelative(3.796f, 6.677f)
                curveToRelative(0.264f, 0.464f, 0.756f, 0.75f, 1.29f, 0.75f)
                horizontalLineToRelative(0.016f)
                curveToRelative(1.139f, 0.0f, 1.853f, -1.23f, 1.288f, -2.219f)
                lineToRelative(-3.812f, -6.677f)
                curveToRelative(-0.569f, -0.997f, -2.008f, -0.997f, -2.577f, 0.0f)
                moveToRelative(0.327f, -11.692f)
                lineTo(0.197f, 20.465f)
                curveToRelative(-0.562f, 0.978f, 0.144f, 2.197f, 1.271f, 2.197f)
                arcToRelative(1.467f, 1.467f, 0.0f, false, false, 1.273f, -0.739f)
                lineToRelative(7.951f, -13.929f)
                curveToRelative(0.563f, -0.987f, 1.986f, -0.985f, 2.548f, 0.003f)
                lineToRelative(7.918f, 13.924f)
                arcToRelative(1.466f, 1.466f, 0.0f, false, false, 1.275f, 0.742f)
                horizontalLineToRelative(0.098f)
                curveToRelative(1.125f, 0.0f, 1.831f, -1.215f, 1.274f, -2.193f)
                lineTo(13.312f, 2.078f)
                curveToRelative(-0.562f, -0.984f, -1.98f, -0.987f, -2.545f, -0.004f)
            }
        }
        .build()
        return _aegisauthenticator!!
    }

private var _aegisauthenticator: ImageVector? = null

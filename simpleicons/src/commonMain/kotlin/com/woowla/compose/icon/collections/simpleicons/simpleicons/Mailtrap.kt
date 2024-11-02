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

public val Simpleicons.Mailtrap: ImageVector
    get() {
        if (_mailtrap != null) {
            return _mailtrap!!
        }
        _mailtrap = Builder(name = "Mailtrap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.371f, 17.607f)
                lineTo(3.335f, 18.815f)
                curveToRelative(-0.276f, 0.182f, -0.15f, 0.494f, 0.0f, 0.557f)
                lineToRelative(7.91f, 4.432f)
                curveToRelative(0.467f, 0.262f, 1.043f, 0.262f, 1.51f, 0.0f)
                lineToRelative(8.015f, -4.491f)
                curveToRelative(0.243f, -0.144f, 0.203f, -0.436f, 0.0f, -0.535f)
                lineToRelative(-2.153f, -1.164f)
                curveToRelative(-0.182f, -0.12f, -0.587f, -0.08f, -0.731f, 0.018f)
                lineToRelative(-5.13f, 2.875f)
                curveToRelative(-0.467f, 0.262f, -1.043f, 0.262f, -1.51f, 0.0f)
                lineToRelative(-5.176f, -2.9f)
                curveToRelative(-0.193f, -0.119f, -0.499f, -0.112f, -0.697f, 0.0f)
                close()
                moveTo(11.245f, 0.196f)
                curveToRelative(0.467f, -0.262f, 1.043f, -0.262f, 1.51f, 0.0f)
                lineToRelative(6.37f, 3.569f)
                curveToRelative(0.254f, 0.129f, 0.277f, 0.474f, 0.0f, 0.63f)
                curveToRelative(-0.42f, 0.234f, -0.983f, 0.549f, -1.45f, 0.809f)
                curveToRelative(-0.546f, 0.304f, -1.211f, 0.304f, -1.756f, -0.002f)
                lineToRelative(-3.163f, -1.772f)
                curveToRelative(-0.467f, -0.262f, -1.043f, -0.262f, -1.51f, 0.0f)
                lineToRelative(-3.167f, 1.775f)
                curveToRelative(-0.546f, 0.306f, -1.211f, 0.306f, -1.757f, 0.002f)
                curveToRelative(-0.486f, -0.271f, -1.075f, -0.6f, -1.5f, -0.836f)
                curveToRelative(-0.236f, -0.101f, -0.285f, -0.401f, 0.0f, -0.574f)
                lineTo(11.245f, 0.196f)
                close()
                moveTo(21.969f, 5.568f)
                curveToRelative(0.467f, 0.262f, 0.755f, 0.746f, 0.755f, 1.269f)
                verticalLineToRelative(10.325f)
                curveToRelative(0.0f, 0.511f, -0.32f, 0.606f, -0.661f, 0.428f)
                lineToRelative(-2.359f, -1.273f)
                lineTo(19.704f, 9.376f)
                lineToRelative(-6.949f, 3.894f)
                curveToRelative(-0.467f, 0.262f, -1.043f, 0.262f, -1.51f, 0.0f)
                lineToRelative(-6.949f, -3.894f)
                verticalLineToRelative(6.941f)
                lineTo(2.153f, 17.589f)
                curveToRelative(-0.255f, 0.162f, -0.877f, 0.214f, -0.877f, -0.426f)
                lineTo(1.276f, 6.838f)
                curveToRelative(0.0f, -0.524f, 0.288f, -1.007f, 0.755f, -1.269f)
                curveToRelative(0.752f, -0.394f, 1.528f, 0.0f, 1.528f, 0.0f)
                lineToRelative(8.44f, 4.74f)
                lineToRelative(8.427f, -4.74f)
                reflectiveCurveToRelative(0.748f, -0.451f, 1.542f, 0.0f)
                close()
            }
        }
        .build()
        return _mailtrap!!
    }

private var _mailtrap: ImageVector? = null

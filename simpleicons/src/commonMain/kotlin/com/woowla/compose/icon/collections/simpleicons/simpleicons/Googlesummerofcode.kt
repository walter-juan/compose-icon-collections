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

public val Simpleicons.Googlesummerofcode: ImageVector
    get() {
        if (_googlesummerofcode != null) {
            return _googlesummerofcode!!
        }
        _googlesummerofcode = Builder(name = "Googlesummerofcode", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.995f, 0.0f)
                lineToRelative(-0.954f, 0.954f)
                lineTo(9.24f, 2.758f)
                lineToRelative(-0.755f, 0.725f)
                horizontalLineToRelative(-4.97f)
                verticalLineToRelative(5.001f)
                lineTo(0.0f, 12.004f)
                lineToRelative(2.758f, 2.76f)
                lineToRelative(0.755f, 0.752f)
                verticalLineToRelative(4.973f)
                horizontalLineToRelative(4.971f)
                lineTo(11.995f, 24.0f)
                lineToRelative(3.523f, -3.511f)
                horizontalLineToRelative(4.961f)
                verticalLineToRelative(-4.973f)
                lineTo(24.0f, 12.005f)
                lineToRelative(-3.52f, -3.521f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.01f)
                close()
                moveTo(11.995f, 5.068f)
                arcToRelative(6.928f, 6.928f, 0.0f, false, true, 6.94f, 6.918f)
                verticalLineToRelative(0.019f)
                arcToRelative(6.937f, 6.937f, 0.0f, true, true, -6.94f, -6.937f)
                close()
                moveTo(12.431f, 8.525f)
                lineTo(10.722f, 14.864f)
                lineTo(11.662f, 15.117f)
                lineTo(13.371f, 8.778f)
                close()
                moveTo(14.401f, 9.572f)
                lineTo(13.686f, 10.221f)
                lineTo(15.117f, 11.815f)
                lineTo(13.686f, 13.408f)
                lineTo(14.411f, 14.057f)
                lineTo(16.424f, 11.815f)
                close()
                moveTo(9.601f, 9.582f)
                lineTo(7.587f, 11.824f)
                lineTo(9.6f, 14.075f)
                lineToRelative(0.725f, -0.648f)
                lineToRelative(-1.431f, -1.594f)
                lineToRelative(1.431f, -1.603f)
                close()
            }
        }
        .build()
        return _googlesummerofcode!!
    }

private var _googlesummerofcode: ImageVector? = null

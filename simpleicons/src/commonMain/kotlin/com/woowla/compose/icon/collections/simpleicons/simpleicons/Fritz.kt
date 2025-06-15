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

public val Simpleicons.Fritz: ImageVector
    get() {
        if (_fritz != null) {
            return _fritz!!
        }
        _fritz = Builder(name = "Fritz", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.495f, 19.183f)
                lineTo(17.37f, 24.0f)
                lineToRelative(4.817f, -3.903f)
                lineToRelative(-3.875f, -4.817f)
                close()
                moveTo(23.571f, 0.692f)
                lineTo(16.097f, 0.111f)
                lineToRelative(-0.914f, 15.003f)
                lineToRelative(6.118f, 0.221f)
                close()
                moveTo(6.962f, 5.564f)
                verticalLineToRelative(4.097f)
                lineToRelative(5.62f, -0.055f)
                verticalLineToRelative(5.37f)
                horizontalLineTo(7.016f)
                verticalLineToRelative(8.055f)
                horizontalLineTo(0.43f)
                verticalLineTo(0.277f)
                lineTo(13.024f, 0.0f)
                verticalLineTo(5.51f)
                close()
            }
        }
        .build()
        return _fritz!!
    }

private var _fritz: ImageVector? = null

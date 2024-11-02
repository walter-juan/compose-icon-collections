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

public val Simpleicons.Linktree: ImageVector
    get() {
        if (_linktree != null) {
            return _linktree!!
        }
        _linktree = Builder(name = "Linktree", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.736f, 5.853f)
                lineToRelative(4.005f, -4.117f)
                lineToRelative(2.325f, 2.381f)
                lineToRelative(-4.201f, 4.005f)
                horizontalLineToRelative(5.909f)
                verticalLineToRelative(3.305f)
                horizontalLineToRelative(-5.937f)
                lineToRelative(4.229f, 4.108f)
                lineToRelative(-2.325f, 2.334f)
                lineTo(12.0f, 12.099f)
                lineToRelative(-5.741f, 5.769f)
                lineToRelative(-2.325f, -2.325f)
                lineToRelative(4.229f, -4.108f)
                horizontalLineToRelative(-5.938f)
                lineTo(2.226f, 8.121f)
                horizontalLineToRelative(5.909f)
                lineTo(3.934f, 4.117f)
                lineToRelative(2.325f, -2.381f)
                lineToRelative(4.005f, 4.117f)
                lineTo(10.264f, 0.0f)
                horizontalLineToRelative(3.473f)
                close()
                moveTo(10.264f, 16.159f)
                horizontalLineToRelative(3.473f)
                lineTo(13.736f, 24.0f)
                horizontalLineToRelative(-3.473f)
                close()
            }
        }
        .build()
        return _linktree!!
    }

private var _linktree: ImageVector? = null
